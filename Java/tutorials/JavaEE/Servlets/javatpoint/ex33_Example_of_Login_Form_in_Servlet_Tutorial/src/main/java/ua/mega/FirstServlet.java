package ua.mega;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String n = req.getParameter("username");
        String p = req.getParameter("userpass");

        if (LoginDao.validate(n, p)) {
            RequestDispatcher rd = req.getRequestDispatcher("servlet2");
            rd.forward(req, resp);
        } else {
            out.print("Sorry username or password error");
            RequestDispatcher rd=req.getRequestDispatcher("index.html");
            rd.include(req, resp);
        }
        out.close();
    }
}
