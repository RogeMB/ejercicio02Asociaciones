package com.salesianostriana.ejercicio02Asociaciones.service;

import com.salesianostriana.ejercicio02Asociaciones.model.Video;
import com.salesianostriana.ejercicio02Asociaciones.repository.VideoRepository;
import com.salesianostriana.ejercicio02Asociaciones.service.baseService.BaseService;
import org.springframework.stereotype.Service;

@Service
public class VideoService extends BaseService<Video, Long, VideoRepository> {
}
