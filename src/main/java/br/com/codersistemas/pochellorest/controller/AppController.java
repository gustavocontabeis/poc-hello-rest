package br.com.codersistemas.pochellorest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class AppController{

	@GetMapping
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("hello!");
	}	
	
}

