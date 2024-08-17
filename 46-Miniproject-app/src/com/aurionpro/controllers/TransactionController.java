package com.aurionpro.controllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.database.TransactionDb;
import com.aurionpro.entity.Transactions;

/**
 * Servlet implementation class TransactionController
 */
@WebServlet("/TransactionController")
public class TransactionController extends HttpServlet {
    private TransactionDb transactionDb = new TransactionDb();
    private static final long serialVersionUID = 1L;

    public TransactionController() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String senderAccountNo = request.getParameter("senderAccountNo");
        String receiverAccountNo = request.getParameter("receiverAccountNo");
        String transactionType = request.getParameter("transactionType");
        String amountStr = request.getParameter("amount");
        BigDecimal amount = null;

        if (senderAccountNo == null || senderAccountNo.isEmpty()) {
            request.setAttribute("message", "Sender account number is required.");
            request.getRequestDispatcher("MakeTransactions.jsp").forward(request, response);
            return;
        }

        if (transactionType == null || transactionType.isEmpty()) {
            request.setAttribute("message", "Transaction type is required.");
            request.getRequestDispatcher("MakeTransactions.jsp").forward(request, response);
            return;
        }

        try {
            amount = new BigDecimal(amountStr);
            if (amount.compareTo(BigDecimal.ZERO) <= 0) {
                throw new NumberFormatException("Amount must be positive.");
            }
        } catch (NumberFormatException e) {
            request.setAttribute("message", "Invalid amount entered.");
            request.getRequestDispatcher("MakeTransactions.jsp").forward(request, response);
            return;
        }

        // Check if the sender account exists
        if (!transactionDb.doesAccountExist(senderAccountNo)) {
            request.setAttribute("message", "Sender account does not exist.");
            request.getRequestDispatcher("MakeTransactions.jsp").forward(request, response);
            return;
        }

        // Check if the receiver account exists for transfer and credit transactions
        if ((transactionType.equalsIgnoreCase("transfer") || transactionType.equalsIgnoreCase("credit")) &&
            (receiverAccountNo == null || receiverAccountNo.isEmpty() || !transactionDb.doesAccountExist(receiverAccountNo))) {
            request.setAttribute("message", "Receiver account does not exist.");
            request.getRequestDispatcher("MakeTransactions.jsp").forward(request, response);
            return;
        }

        // Create a transaction object
        Transactions transaction = new Transactions(senderAccountNo,
                receiverAccountNo,
                transactionType,
                amount);
        transaction.setTransactionDate(new Timestamp(System.currentTimeMillis()));

        boolean transactionSuccess = false;

        // Perform the transaction based on the transaction type
        switch (transactionType.toLowerCase()) {
            case "credit":
                transactionSuccess = transactionDb.creditAmount(senderAccountNo, amount);
                break;

            case "debit":
                transactionSuccess = transactionDb.debitAmount(senderAccountNo, amount);
                break;

            case "transfer":
                transactionSuccess = transactionDb.transferAmount(senderAccountNo, receiverAccountNo, amount);
                break;

            default:
                request.setAttribute("message", "Invalid transaction type.");
                request.getRequestDispatcher("MakeTransactions.jsp").forward(request, response);
                return;
        }

        // Check if the transaction was successful
        if (transactionSuccess) {
            if (transactionDb.createTransaction(transaction)) {
                request.setAttribute("message", "Transaction completed successfully.");
            } else {
                request.setAttribute("message", "Transaction failed. Please try again.");
            }
        } else {
            request.setAttribute("message", "Transaction could not be completed. Please check the details and try again.");
        }

        // Forward to the JSP page with the result message
        request.getRequestDispatcher("MakeTransactions.jsp").forward(request, response);
    }
}
