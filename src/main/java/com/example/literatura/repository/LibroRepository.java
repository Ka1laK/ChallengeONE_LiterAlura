package com.example.literatura.repository;

import com.example.literatura.Model.Autor;
import com.example.literatura.Model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro, Long >  {

    @Query("Select e from Autor e")
    List<Autor> obtenerAutores();
    @Query("Select e from Autor e where :anio >= e.fechaNacimiento and :anio <= e.fechaMuerte")
    List<Autor> obtenerAutoresVivos(int anio);

    @Query("Select e from Libro e where e.idiomas=:idioma")
    List<Libro> obtenerLibrosXIdioma(String idioma);

    @Query("Select e from Libro e where e.titulo=:titulo")
    Optional<Libro> buscarLibro(String titulo);
}
