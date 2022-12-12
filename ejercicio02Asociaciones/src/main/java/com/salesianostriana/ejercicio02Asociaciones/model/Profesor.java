package com.salesianostriana.ejercicio02Asociaciones.model;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
public class Profesor {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    @Column(unique = true)
    private String email;

    @Builder.Default
    @OneToMany(mappedBy = "profesor")
    private List<CursoOnline> cursoOnlineList = new ArrayList<>();




}
