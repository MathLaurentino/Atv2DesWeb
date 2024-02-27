package br.edu.ifpr.foz.primeiraaplicacao;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cabecalhos")
public class CabecalhoServilet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        res.getWriter().println("HOST: " + req.getHeader("HOST"));
        res.getWriter().println("USER-AGENT: " + req.getHeader("USER-AGENT"));
        res.getWriter().println("ACCEPT-encoding: " + req.getHeader("ACCEPT-ENCODING"));
        res.getWriter().println("ACCEPTS-LANGUAGE: " + req.getHeader("ACCEPT-LANGUAGE"));

    }

}
