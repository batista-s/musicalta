package com.backend.musicalta.model.services.evento;

import com.backend.musicalta.exceptions.AtracaoNotFoundException;
import com.backend.musicalta.model.entities.evento.Atracao;
import com.backend.musicalta.model.repositories.evento.AtracaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AtracaoService {
    private AtracaoRepository atracaoRepository;

    public AtracaoService(AtracaoRepository atracaoRepository) {
        this.atracaoRepository = atracaoRepository;
    }

    public Atracao create(Atracao atracao) {
        return atracaoRepository.save(atracao);
    }

    public List<Atracao> get(){
        return atracaoRepository.findAll();
    }

    public Atracao get(int id){
        Optional<Atracao> atracao = atracaoRepository.findById(id);
        if(!atracao.isPresent()){
            throw new AtracaoNotFoundException(id);
        }
        return atracao.get();
    }

    public Atracao update(int id, Atracao atracao){
        Atracao atracaoCad = get(id);
        atracaoCad.setNome(atracao.getNome());
        atracaoCad.setWebsite(atracao.getWebsite());
        atracaoCad.setIntegrantes(atracao.getIntegrantes());
        atracaoRepository.save(atracaoCad);
        return atracaoCad;
    }

    public void delete(int id){
        if(!atracaoRepository.existsById(id)){
            throw new AtracaoNotFoundException(id);
        }
        atracaoRepository.deleteById(id);
    }
}
