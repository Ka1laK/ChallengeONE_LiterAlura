package com.example.literatura.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nombre;

    private Integer fechaNacimiento;

    private Integer fechaMuerte;

    @OneToMany(mappedBy = "autor",fetch = FetchType.EAGER)
    List<Libro> libros ;
public Autor(){}
    public Autor(DatosAutor datosAutor){
        this.fechaNacimiento=datosAutor.fechaNacimiento();
        this.fechaMuerte=datosAutor.fechaMuerte();
        this.nombre=datosAutor.nombre();


    }
    @Override
    public String toString() {
        return "Autor{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaMuerte=" + fechaMuerte ;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Integer fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(Integer fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
