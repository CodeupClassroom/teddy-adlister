package controllers;

import models.GhRepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/github/new")
public class RepoCreateServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        int sum = 2 + 5;
        request.setAttribute("username", "Fer");
        request.setAttribute("total", sum);

        //  This is a simulation of what the model will return
        List<GhRepo> repos = new ArrayList<>();

        GhRepo repo1 = new GhRepo();
        repo1.setId(1);
        repo1.setName("java-exercises");
        repo1.setDescription("Codeup java exercises");

        GhRepo repo2 = new GhRepo();
        repo2.setId(2);
        repo2.setName("web-exercises");
        repo2.setDescription("Codeup web exercises");

        repos.add(repo1);
        repos.add(repo2);

        request.setAttribute("repositories", repos);

        // Set the rule to decide which file to open when i visit /github/create
        request.getRequestDispatcher("/WEB-INF/github/create.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println(request.getParameter("description"));
        // Here you put a valid URL to redirect, always executes a get request
        response.sendRedirect("/github/new");
    }
}
