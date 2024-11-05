package com.project.apirestjava.service;

import com.project.apirestjava.entity.Animes;
import com.project.apirestjava.repository.AnimesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimesService {
    @Autowired
    AnimesRepository animesRepository;

    public List<Animes> getAll() {
        return animesRepository.findAll();
    }

    public Animes getById(Integer id) {
        return animesRepository.findById(id).orElse(null);
    }

    public Animes saveAnime(Animes anime) {
        return animesRepository.save(anime);
    }

    public Boolean deleteAnime(Integer id) {
        Animes anime = animesRepository.findById(id).orElse(null);
        if(anime != null) {
            animesRepository.delete(anime);
            return true;
        }else {
            return false;
        }
    }
}
