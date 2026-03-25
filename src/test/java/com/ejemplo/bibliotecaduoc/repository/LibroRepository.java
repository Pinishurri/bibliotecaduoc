package com.ejemplo.bibliotecaduoc.repository;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.ejemplo.bibliotecaduoc.model.Libro;

@Repository
public class LibroRepository {
    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros (){
        return listaLibros;
    }

    public Libro agregar(Libro libro) {
        listaLibros.add(libro);
        return libro;
    }
}
