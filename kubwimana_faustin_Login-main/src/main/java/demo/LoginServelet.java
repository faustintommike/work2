package demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoginServelet
 */
@WebServlet
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 private static final String VALID_EMAIL = "user@example.com";
	 private static final String VALID_PASSWORD = "password123";
	    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   // Retrieve user input from the form
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Check if the provided email and password match the valid credentials
        if (email != null && email.equals(VALID_EMAIL) && password != null && password.equals(VALID_PASSWORD)) {
            // Authentication successful, you can redirect to a success page
            response.sendRedirect("admission.html");
        } else {
            // Authentication failed, you can redirect to an error page or show an error message.
            response.sendRedirect("error.html");
        }
	}

}
