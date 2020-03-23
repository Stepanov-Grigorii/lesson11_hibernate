package ru.grandstep.hibernate.servlet;

import org.hibernate.Session;
import ru.grandstep.hibernate.HibernateSessionFactory;
import ru.grandstep.hibernate.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = HibernateSessionFactory.getSession();
        List<User> users = List.of(
            new User("User","qwerty"),
            new User("Admin", "12345")
        );
        req.setAttribute("users", users);
        req.getRequestDispatcher("user.jsp").forward(req, resp);
    }
}
