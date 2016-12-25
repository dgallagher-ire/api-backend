package api.datademo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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

    private static final ObjectMapper mapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.addHeader("Access-Control-Allow-Origin", "*");
        resp.addHeader("Access-Control-Allow-Methods", "GET,POST");
        resp.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");

        final String method = req.getMethod();
        if ("POST".equals(method)) {
            final String call = req.getParameter("call");
            final APICall callAction = APIFactory.getCall(call);
            callAction.setInput(this.getBody(req));
            callAction.process();
            resp.setContentType("application/json;charset=UTF-8");
            try (final PrintWriter out = resp.getWriter()) {
                out.print(callAction.getOutput());
            }
        }
    }

    private String getBody(final HttpServletRequest req) throws UnsupportedEncodingException, IOException {
        final BufferedReader br = req.getReader();
        final StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line).append("\r\n");
        }
        return sb.toString();
    }
}
