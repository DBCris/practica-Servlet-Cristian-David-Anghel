package edu.practica;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/tablas")
public class TablaMultiplicar extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            for (int i = 0 ; i <= 10 ; i++ ) {
                for ( int j = 0 ; j <= 10 ; j++ ) {
                    out.println("<p>" + i + "*" + j + "=" + i*j + "</p><br>");
                }
            }
        }
    }
}