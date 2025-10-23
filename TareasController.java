package com.ingesoft.tareas.control;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.ingesoft.tareas.modelo.Tarea;
import com.ingesoft.tareas.repositorio.TareasRepository;

@RestController
@RequestMapping("/tareas")
public class TareasController {

    private final TareasRepository tareasRepository;

    public TareasController(TareasRepository tareasRepository) {
        this.tareasRepository = tareasRepository;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarea crearTarea(@RequestBody Tarea tarea) {
        return tareasRepository.save(tarea);
    }

    @GetMapping("/")
    public Iterable<Tarea> getTareas() {
        return tareasRepository.findAll();
    }
}
