import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {

    private int computerGuess = 5;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int userGuess = Integer.parseInt(request.getParameter("userGuess"));

        String message;

        if (userGuess == computerGuess) {
            message = "You WON!";
        } else if (userGuess >  computerGuess) {
            message = "lower";
        } else {
            message = "higher";
        }

        System.out.println(message);

//        request.setAttribute("userGuess", userGuess);
        request.setAttribute("message", message);

        request.getRequestDispatcher("guessResults.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("guessForm.jsp").forward(request, response);

    }
}
