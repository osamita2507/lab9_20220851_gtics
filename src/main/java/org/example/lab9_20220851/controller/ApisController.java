package org.example.lab9_20220851.controller;

import org.antlr.v4.runtime.misc.EqualityComparator;
import org.example.lab9_20220851.entity.*;
import jakarta.servlet.http.HttpServletRequest;
import org.example.lab9_20220851.repository.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApisController {

    final ApisRepository apisRepository;
    final EndpointsRepository endpointsRepository;
    final EquiposRepository equiposRepository;

    public ApisController(ApisRepository apisRepository, EndpointsRepository endpointsRepository, EquiposRepository equiposRepository) {
        this.apisRepository = apisRepository;
        this.endpointsRepository = endpointsRepository;
        this.equiposRepository = equiposRepository;
    }

    //LISTAR ENDPOINTS
    @GetMapping(value = {"/endpoint", ""})
    public List<Endpoints> listaEndpoints() {
        return endpointsRepository.findAll();
    }

    //LISTAR APIS
    @GetMapping(value = {"/api", ""})
    public List<Apis> listaApis() {
        return apisRepository.findAll();
    }

    //LISTAR EQUIPOS
    @GetMapping(value = {"/equipo", ""})
    public List<Equipos> listaEquipos() {
        return equiposRepository.findAll();
    }

}