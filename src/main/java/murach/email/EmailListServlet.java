package murach.email;

import murach.business.User;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.List;

public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {

        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "submit";  // default action
        }

        if (action.equals("submit")) {
            url = "/index.html";    // the "join" page
        } else if (action.equals("add")) {
            // Get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String date = request.getParameter("date");

            // Get radio input
            String preference = request.getParameter("preference");

            // Get all selected checkbox values as a List
            String[] selectedCheckboxes = request.getParameterValues("myCheckbox");
            List<String> receiveAnnouncements = new ArrayList<>();
            if (selectedCheckboxes != null) {
                for (String checkboxValue : selectedCheckboxes) {
                    receiveAnnouncements.add(checkboxValue);  // Add each value to the List
                }
            }

            // Get combobox input
            String contactMethod = request.getParameter("myCombobox");

            // Store data in User object
            User user = new User(firstName, lastName, email, date, preference, receiveAnnouncements, contactMethod);

            // Set User object in request object and set URL
            request.setAttribute("user", user);
            url = "/thanks.jsp";   // the "thanks" page
        }

        // Forward to the URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }
}
