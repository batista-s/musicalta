package com.backend.musicalta.model.services.evento;

import com.backend.musicalta.exceptions.LocalNotFoundException;
import com.backend.musicalta.model.entities.evento.Local;
import com.backend.musicalta.model.repositories.evento.LocalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalService {
    private final LocalRepository localRepository;

    public LocalService(LocalRepository localRepository) {
        this.localRepository = localRepository;
    }

    public Local create(Local local) {
        return localRepository.save(local);
    }

    public List<Local> get() {
        return localRepository.findAll();
    }

    public Local get(int id) {
        Optional<Local> local = localRepository.findById(id);
        if (!local.isPresent()) {
            throw new LocalNotFoundException(id);
        }
        return local.get();
    }

    public Local update(int id, Local local) {
        Local localCad = get(id);
        localCad.setLogradouro(local.getLogradouro());
        localCad.setTipoLogradouro(local.getTipoLogradouro());
        localCad.setNumero(local.getNumero());
        localCad.setComplemento(local.getComplemento());
        localCad.setBairro(local.getBairro());
        localCad.setCidade(local.getCidade());
        localCad.setUf(local.getUf());
        localCad.setCep(local.getCep());
        localCad.setAssentos(local.getAssentos());
        localRepository.save(localCad);
        return localCad;
    }

    public void delete(int id) {
        if (!localRepository.existsById(id)) {
            throw new LocalNotFoundException(id);
        }
        localRepository.deleteById(id);
    }
}

