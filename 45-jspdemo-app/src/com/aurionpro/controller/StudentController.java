//package com.aurionpro.controller;
//
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//
//import com.aurionpro.entity.Student;
//import com.aurionpro.model.DbUtil;
//
//@WebServlet("/student")
//public class StudentController extends HttpServlet {
// private static final long serialVersionUID = 1L;
//       
// private DbUtil dbUtil = null;
// private RequestDispatcher dispatcher = null;
// 
//    public StudentController() {
//        super();
//    }
//
// protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//  dbUtil=new DbUtil();
//  dbUtil.connectToDb();
//  
//  
//  List<Student> students = dbUtil.getAllStudent();
//  
//  // Set students as a request attribute
//  request.setAttribute("students", students);
//  
//  // Forward to JSP
//  dispatcher = request.getRequestDispatcher("StudentView.jsp");
//  dispatcher.forward(request, response);
// }
//
// protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//  doGet(request, response);
// }
//}