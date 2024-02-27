package br.edu.ifpr.foz.primeiraaplicacao;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/requisicao")
public class ReqServilet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        res.getWriter().println("Metodo: " + req.getMethod());
        res.getWriter().println("Url do Pedido: " + req.getRequestURI());
        res.getWriter().println("Protocolo: " + req.getProtocol());
        res.getWriter().println("Endereco Remoto: " + req.getRemoteAddr());

    }

}
