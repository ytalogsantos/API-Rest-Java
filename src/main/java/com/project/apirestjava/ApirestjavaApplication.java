package com.project.apirestjava;

import com.project.apirestjava.entity.Animes;
import com.project.apirestjava.service.AnimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ApirestjavaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApirestjavaApplication.class, args);
	}

	@Autowired
	AnimesService animesService;

	@Override
	public void run(String... args) throws Exception {
		Animes anime = new Animes(1, "Little Witch Academia", 24);
		animesService.saveAnime(anime);
	}
}
