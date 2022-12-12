package com.salesianostriana.ejercicio02Asociaciones.repository;

import com.salesianostriana.ejercicio02Asociaciones.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
