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
    private static final String URI_CREATE = "WEB-INF/pages/agregarAnimal.jsp";
    private static final String URI_DELETE = "WEB-INF/pages/borrarAnimal.jsp";
    private static final String URI_WATCH = "WEB-INF/pages/verAnimal.jsp";

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
            case "create":
                req.getRequestDispatcher(URI_CREATE).forward(req, res);
                break;
            case "remove":
                Animal animalAux = model.getAnimal(id);
                req.setAttribute("animalABorrar", animalAux);
                req.getRequestDispatcher(URI_DELETE).forward(req, res);
                break;
            case "watch":
                Animal animalAux2 = model.getAnimal(id);
                req.setAttribute("animalAVer", animalAux2);
                req.getRequestDispatcher(URI_WATCH).forward(req, res);
                break;
            default:
                try {
                    req.setAttribute("listaAnimales", model.getAnimales());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
                req.getRequestDispatcher(URI_LIST).forward(req, res);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res) throws ServletException, IOException {
        String action = req.getParameter("action");
        String idReq = req.getParameter("id");
        int id = (idReq == null ? -1 : Integer.parseInt(idReq));
        action = (action == null ? "" : action);

        switch (action) {
            case "update":
                Animal animal = model.getAnimal(id);
                cargarAnimalSegunParams(animal, req);
                model.updateAnimal(animal);
                break;
            case "add":
                Animal animalAux = new Animal();
                cargarAnimalSegunParams(animalAux, req);
                model.addAnimal(animalAux);
                break;
            case "delete":
                model.deleteAnimal(id);
                break;
        }
        try {
            req.setAttribute("listaAnimales", model.getAnimales());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        req.getRequestDispatcher(URI_LIST).forward(req, res);
    }

    private void cargarAnimalSegunParams(Animal animal,
                                         HttpServletRequest request) {
        animal.setEspecie(request.getParameter("especie"));
        animal.setNombre(request.getParameter("nombre"));
        animal.setRaza(request.getParameter("raza"));
        animal.setNacimiento(request.getParameter("nacimiento"));
        animal.setFoto(request.getParameter("fotoBase64"));
    }
}

