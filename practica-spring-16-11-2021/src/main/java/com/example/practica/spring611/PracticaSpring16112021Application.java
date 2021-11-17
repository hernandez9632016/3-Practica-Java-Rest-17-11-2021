package com.example.practica.spring611;

import com.example.practica.spring611.dtos.ComentarioDTO;
import com.example.practica.spring611.entity.Cliente;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PracticaSpring16112021Application {

    public static void main(String[] args) {
        SpringApplication.run(PracticaSpring16112021Application.class, args);
    }
/*
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            ComentarioDTO awwwaaa = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", ComentarioDTO.class);
            System.out.println(awwwaaa.toString());
        };
    }

 */

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            ComentarioDTO awwwaaa = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", ComentarioDTO.class);
            System.out.println(awwwaaa.toString());

            Cliente cliente1 = new Cliente();
            cliente1.setDni("10101000001111000000");
            cliente1.setNombre("alberto 111111111111");
            ResponseEntity<Cliente> clienteResponse = restTemplate.postForEntity("http://localhost:8080/clientes",cliente1, Cliente.class);

            System.out.println("repusta"+ clienteResponse.getBody().toString());
        };
    }
}
