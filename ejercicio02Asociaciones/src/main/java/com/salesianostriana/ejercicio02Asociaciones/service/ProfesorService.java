package com.salesianostriana.ejercicio02Asociaciones.service;

import com.salesianostriana.ejercicio02Asociaciones.model.Profesor;
import com.salesianostriana.ejercicio02Asociaciones.repository.ProfesorRepository;
import com.salesianostriana.ejercicio02Asociaciones.service.baseService.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService extends BaseService<Profesor, Long, ProfesorRepository> {
}
