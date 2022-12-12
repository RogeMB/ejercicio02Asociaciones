package com.salesianostriana.ejercicio02Asociaciones;

import com.salesianostriana.ejercicio02Asociaciones.model.CursoOnline;
import com.salesianostriana.ejercicio02Asociaciones.model.Profesor;
import com.salesianostriana.ejercicio02Asociaciones.model.Video;
import com.salesianostriana.ejercicio02Asociaciones.service.CursoOnlineService;
import com.salesianostriana.ejercicio02Asociaciones.service.ProfesorService;
import com.salesianostriana.ejercicio02Asociaciones.service.VideoService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
@RequiredArgsConstructor
public class MainDeMentira {

    private final CursoOnlineService cursoOnlineService;

    private final ProfesorService profesorService;

    private final VideoService videoService;

    @PostConstruct
    public void test() {

        Profesor p1 = Profesor.builder()
                .nombre("José Domingo")
                .email("jose@domingo.com")
                .build();

        profesorService.save(p1);

        Profesor p2 = Profesor.builder()
                .nombre("Luismi López")
                .email("luismi@lopez.com")
                .build();

        profesorService.save(p2);


        CursoOnline c1 = CursoOnline.builder()
                .nombre("Curso de Python")
                .profesor(p1)
                .puntuacion(8.2)
                .build();

        cursoOnlineService.save(c1);

        CursoOnline c2 = CursoOnline.builder()
                .nombre("Curso de JPA-Hibernate")
                .profesor(p2)
                .puntuacion(9.5)
                .build();

        cursoOnlineService.save(c2);

        Video v1 = Video.builder()
                .titulo("JPA-HIBERNATE introducción")
                .url("www.curseame.com/hibernate")
                .orden(1)
                .descripcion("Curso de introducción sobre hibernate")
                .cursoOnline(c2)
                .build();

        videoService.save(v1);

        Video v2 = Video.builder()
                .titulo("Python 3 desde 0")
                .url("www.curseame.com/python3")
                .orden(1)
                .descripcion("Curso de python desde 0 para principiantes")
                .cursoOnline(c1)
                .build();

        videoService.save(v2);


        Video v3 = Video.builder()
                .titulo("Python 3 intermedio")
                .url("www.curseame.com/python3")
                .orden(2)
                .descripcion("Curso de python intermedio")
                .cursoOnline(c1)
                .build();

        videoService.save(v3);

        Video v4 = Video.builder()
                .titulo("Asociaciones avanzadas")
                .url("www.curseame.com/hibernate")
                .orden(1)
                .descripcion("Explicamos las asociaciones")
                .cursoOnline(c2)
                .build();

        videoService.save(v1);


        p1.getCursoOnlineList().add(c1);
        p2.getCursoOnlineList().add(c2);

    }

}
