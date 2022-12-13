package com.confaa.cacjavafsintegradorcrud.controller;

import com.confaa.cacjavafsintegradorcrud.model.Animal;
import com.confaa.cacjavafsintegradorcrud.model.Model;
import com.confaa.cacjavafsintegradorcrud.model.ModelHC;
import com.confaa.cacjavafsintegradorcrud.model.ModelMariaDB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Date;

@WebServlet(name = "AppServlet", urlPatterns = {"/app"})
public class AppServlet extends HttpServlet {
    private Model model;

    private static final String URI_LIST = "WEB-INF/pages/listaAnimales.jsp";
    private static final String URI_EDIT = "WEB-INF/pages/editarAnimal.jsp";

    @Override
    public void init() throws ServletException {
        this.model = new ModelMariaDB();
    }

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res) throws ServletException, IOException {
        String action = req.getParameter("action");
        String idReq = req.getParameter("id");

        int id = (idReq == null ? -1 : Integer.parseInt(idReq));
        action = (action == null ? "" : action);

        switch (action) {
            case "edit":
                Animal animal = model.getAnimal(id);
                req.setAttribute("animalAEditar", animal);
                req.getRequestDispatcher(URI_EDIT).forward(req, res);
                break;
        }

        try {
            req.setAttribute("listaAnimales", model.getAnimales());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        req.getRequestDispatcher(URI_LIST).forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        String idReq = req.getParameter("id");
        int id = (idReq == null ? -1 : Integer.parseInt(idReq));
        action = (action == null ? "" : action);

        switch (action) {
            case "update":
                Animal animal = model.getAnimal(id);
                cargarAnimalSegunParams(animal, req);
                model.updateAnimal(animal);
        }

    }

    private void cargarAnimalSegunParams(Animal animal,
                                         HttpServletRequest request) {
        animal.setEspecie(request.getParameter("especie"));
        animal.setNombre(request.getParameter("nombre"));
        animal.setRaza(request.getParameter("raza"));
        animal.setNacimiento(request.getParameter("nacimiento"));
    }
}

