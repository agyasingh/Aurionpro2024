<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <header class="sticky top-0 bg-white shadow">
        <div class="container flex flex-col sm:flex-row justify-between items-center mx-auto py-4 px-8">
            <div class="flex items-center text-2xl">
                <div class="w-12 mr-3">
                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 48 48">
                        <path fill="#BEE3F8" d="M44,7L4,23l40,16l-7-16L44,7z M36,23H17l18-7l1,6V23z"></path>
                        <path fill="#3182CE"
                            d="M40.212,10.669l-5.044,11.529L34.817,23l0.351,0.802l5.044,11.529L9.385,23L40.212,10.669 M44,7L4,23 l40,16l-7-16L44,7L44,7z">
                        </path>
                        <path fill="#3182CE"
                            d="M36,22l-1-6l-18,7l17,7l-2-5l-8-2h12V22z M27.661,21l5.771-2.244L33.806,21H27.661z">
                        </path>
                    </svg>
                </div>Bankify
            </div>
           <div class="flex mt-4 sm:mt-0">
             <a class="px-4" href="AdminController?action=addBankAccounts">Add bank accounts</a>
             <a class="px-4" href="AdminController?action=addCustomer">Add customers</a>
             <a class="px-4" href="AdminController?action=viewAccounts">View accounts</a>
             <a class="px-4" href="AdminController?action=viewCustomers">View customers</a>
            </div>

            <div class="hidden md:block">
                <button type="button"
                    class=" py-3 px-8 text-sm bg-teal-500 hover:bg-teal-600 rounded text-white ">Logout
                   
                </button>
            </div>
        </div>
    </header>

</body>
</html>