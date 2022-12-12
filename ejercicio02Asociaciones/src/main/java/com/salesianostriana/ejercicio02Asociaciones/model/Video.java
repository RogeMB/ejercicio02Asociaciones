package com.salesianostriana.ejercicio02Asociaciones.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Video {

    @Id
    @GeneratedValue
    private Long id;

    private int orden;
    private String titulo, descripcion, url;


    @ManyToOne
    @JoinColumn(name="curso_id", foreignKey = @ForeignKey(name = "FK_VIDEO_CURSOONLINE"))
    private CursoOnline cursoOnline;


    public void AddCurso(CursoOnline c) {
        this.cursoOnline=c;
        c.getVideoList().add(this);
    }

    public void removeCurso(CursoOnline c) {
        this.cursoOnline=null;
        c.getVideoList().remove(this);
    }

}
