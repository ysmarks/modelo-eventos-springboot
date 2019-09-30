package br.com.internet.eventos.modeloeventosspringboot;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.internet.eventos.modeloeventosspringboot.eventos.EventProcessor;

@SpringBootApplication
public class ModeloEventosSpringbootApplication implements CommandLineRunner {
	
	@Autowired
	private EventProcessor eventProcessor;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ModeloEventosSpringbootApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
	
		System.out.println("Inicio: "+ new Date());
		eventProcessor.process();
		System.out.println("Fim: "+ new Date());
		
	}

}
