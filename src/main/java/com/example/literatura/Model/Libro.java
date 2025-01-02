package com.example.literatura.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    @ManyToOne( cascade = CascadeType.ALL)
    Autor autor;

    String idiomas;
    Long NumDescarga;

    public Libro (){}
    public Libro(DatosLibro libro){
        this.autor=new Autor(libro.autor().get(0));

        this.idiomas=libro.idiomas().get(0);
        this.titulo=libro.titulo();
        this.NumDescarga=libro.NumDescarga();
    }
    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", idiomas=" + idiomas +
                ", NumDescarga=" + NumDescarga +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public Long getNumDescarga() {
        return NumDescarga;
    }

    public void setNumDescarga(Long numDescarga) {
        NumDescarga = numDescarga;
    }
}
