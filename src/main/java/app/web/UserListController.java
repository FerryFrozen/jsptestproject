package app.web;

import app.repository.UserRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserRepository userRepository = UserRepository.getInstance();
        List<String> names = userRepository.list();
        req.setAttribute("userNames", names);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("jsp/list.jsp");
        requestDispatcher.forward(req,resp);
    }

}
