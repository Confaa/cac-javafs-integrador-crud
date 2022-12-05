package com.confaa.cacjavafsintegradorcrud.controller;

import com.confaa.cacjavafsintegradorcrud.model.Model;
import com.confaa.cacjavafsintegradorcrud.model.ModelHC;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "AppServlet", urlPatterns = "/app")
public class AppServlet extends HttpServlet {
    private Model model;

    private static final String URI_LIST = "WEB-INF/pages/layout/listaMotores";

    @Override
    public void init() throws ServletException {
        this.model = new ModelHC();
    }

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("motores", model.getMotores());
        req.getRequestDispatcher(URI_LIST).forward(req, res);
    }
}
