import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");

        if (name == null) {
            name = "World";
        }

        res.getWriter().println("<h1 style=\"font-family: fantasy;\">Hello " + name + "!</h1>");
        res.getWriter().println("<p>Enter your name:</p>");
        res.getWriter().println("<form action=\"/hello\">");
        res.getWriter().println("<input name=\"name\" />");
        res.getWriter().println("</form>");
    }
}
