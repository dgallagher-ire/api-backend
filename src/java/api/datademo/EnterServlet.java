package api.datademo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dgallagher
 */
@WebServlet(name = "EnterServlet", urlPatterns = {"/api"})
public class EnterServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.addHeader("Access-Control-Allow-Origin", "*");
        resp.addHeader("Access-Control-Allow-Methods", "GET,POST");
        resp.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        
        final String call = req.getParameter("call");
        final String method = req.getMethod();
        if ("POST".equals(method)) {
            resp.setContentType("application/json;charset=UTF-8");
        }
        req.getRequestDispatcher("/"+call).forward(req, resp);
    }
}
