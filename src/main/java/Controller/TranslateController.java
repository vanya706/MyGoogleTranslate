package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static Controller.BusinessLogic.translate;

@WebServlet("/translate")
public class TranslateController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/translate.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String srcLanguage = req.getParameter("srcLanguage");
        String destLanguage = req.getParameter("destLanguage");
        String text = req.getParameter("originText");

        String translatedText = translate(srcLanguage, destLanguage, text);
        String translatedTextDest = translate(destLanguage, srcLanguage, translatedText);

        HttpSession session = req.getSession();
        session.setAttribute("translatedText", translatedText);
        session.setAttribute("translatedTextDest", translatedTextDest);
        session.setAttribute("originText", text);

        doGet(req,resp);
    }
}
