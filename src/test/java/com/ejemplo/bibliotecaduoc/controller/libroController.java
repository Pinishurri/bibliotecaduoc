package com.ejemplo.bibliotecaduoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.bibliotecaduoc.model.Libro;
import com.ejemplo.bibliotecaduoc.services.libroService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/libros")
public class libroController {
    @Autowired

    private libroService libroService;
    @GetMapping
    public List<Libro> getLibros(){
        return libroService.readAll();

    }
    @PostMapping
    public Libro postLibro(@RequestBody Libro libro) {                
        return libroService.create(libro);
    }
    
}
