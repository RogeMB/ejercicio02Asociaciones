package com.salesianostriana.ejercicio02Asociaciones.repository;

import com.salesianostriana.ejercicio02Asociaciones.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
