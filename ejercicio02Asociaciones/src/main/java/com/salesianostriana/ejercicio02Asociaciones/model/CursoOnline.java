package com.salesianostriana.ejercicio02Asociaciones.model;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CursoOnline {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private double puntuacion;

    @ManyToOne
    @JoinColumn(name = "profesor_id", foreignKey = @ForeignKey(name = "FK_CURSOONLINE_PROFESOR"))
    private Profesor profesor;

    @Builder.Default
    @OneToMany(mappedBy = "cursoOnline")
    private List<Video> videoList = new ArrayList<>();


    public void addProfesor(Profesor p) {
        this.profesor = p;
        p.getCursoOnlineList().add(this);
    }

    public void removeProfesor(Profesor p) {
        this.profesor=null;
        p.getCursoOnlineList().remove(this);
    }

}
