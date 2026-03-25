package com.ejemplo.bibliotecaduoc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.bibliotecaduoc.model.Libro;
import com.ejemplo.bibliotecaduoc.repository.LibroRepository;

@Service
public class libroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> readAll(){
        return libroRepository.obtenerLibros();
    }

    public Libro create(Libro libro) {
        return libroRepository.agregar(libro);
    }   
}
