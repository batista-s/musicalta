package com.backend.musicalta.controller.evento;

import com.backend.musicalta.model.entities.evento.Data;
import com.backend.musicalta.model.services.evento.DataService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datas")
public class DataController {
    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @PostMapping
    public ResponseEntity<Data> create(@RequestBody @Valid Data data) {
        data = dataService.create(data);
        return new ResponseEntity<>(data, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Data> update(@PathVariable int id, @RequestBody @Valid Data data) {
        Data dataNew = dataService.update(id, data);
        return new ResponseEntity<>(dataNew, HttpStatus.OK);
    }


    @GetMapping
    public List<Data> list(){
        return dataService.get();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Data> get(@PathVariable int id){
        Data data = dataService.get(id);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        dataService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
