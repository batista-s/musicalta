package com.backend.musicalta.model.services.evento;

import com.backend.musicalta.exceptions.DataNotFoundException;
import com.backend.musicalta.model.entities.evento.Data;
import com.backend.musicalta.model.repositories.evento.DataRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataService {
    private DataRepository dataRepository;

    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public Data create(Data data) {
        return dataRepository.save(data);
    }

    public List<Data> get(){
        return dataRepository.findAll();
    }

    public Data get(int id){
        Optional<Data> data = dataRepository.findById(id);
        if(!data.isPresent()){
            throw new DataNotFoundException(id);
        }
        return data.get();
    }

    public Data update(int id, Data data){
        Data dataCad = get(id);
        dataCad.setData(data.getData());
        dataCad.setHoraAbertura(data.getHoraAbertura());
        dataCad.setHoraEncerramento(data.getHoraEncerramento());
        dataCad.setAtracao(data.getAtracao());
        dataRepository.save(dataCad);
        return dataCad;
    }

    public void delete(int id){
        if(!dataRepository.existsById(id)){
            throw new DataNotFoundException(id);
        }
        dataRepository.deleteById(id);
    }
}
