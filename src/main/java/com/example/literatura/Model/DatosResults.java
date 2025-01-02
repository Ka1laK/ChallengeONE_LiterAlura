package com.example.literatura.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosResults(
        @JsonAlias("results")
        List<DatosLibro> datosLibros

) {
}
