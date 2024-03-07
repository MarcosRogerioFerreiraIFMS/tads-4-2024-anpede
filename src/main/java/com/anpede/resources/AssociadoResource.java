package com.anpede.resources;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anpede.entities.Associado;

@RestController
@RequestMapping(value = "/associados")
public class AssociadoResource {
	
	@GetMapping
	public ResponseEntity<List<Associado>> findAll(){
		List<Associado> list = new ArrayList<>();
		list.add(new Associado(1L, "Claudia Andrade", "123.456.789-12", 
				LocalDate.parse("2002-02-25", DateTimeFormatter.ofPattern("yyyy-MM-dd")), 
				"(67) 98888-1234", "claudia@gmail.com", 
				"Av. Campo Grande, 123, Centro"));
		
		list.add(new Associado(1L, "Claudia Andrade", "123.456.789-12", 
				LocalDate.parse("2002-02-25", DateTimeFormatter.ofPattern("yyyy-MM-dd")), 
				"(67) 98888-1234", "claudia@gmail.com", 
				"Av. Campo Grande, 123, Centro"));
		
		
		return ResponseEntity.ok().body(list);
	}

}




