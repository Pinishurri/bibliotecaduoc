package com.ejemplo.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Libro {
    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechapublicacion;
    private String autor;
    
}
