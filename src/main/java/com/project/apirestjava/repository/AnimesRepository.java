package com.project.apirestjava.repository;

import com.project.apirestjava.entity.Animes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimesRepository extends JpaRepository<Animes, Integer> {
}
