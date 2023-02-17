package com.example.test_eurikaclient;

import com.example.test_eurikaclient.DTO.VoitureRequestDTO;
import com.example.test_eurikaclient.Enums.Categorie;
import com.example.test_eurikaclient.Enums.Energie;
import com.example.test_eurikaclient.Enums.Etat;
import com.example.test_eurikaclient.Services.Service_voiture;
import com.example.test_eurikaclient.entities.Papier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.sql.Date;

@SpringBootApplication
@EnableDiscoveryClient
public class TestEurikaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestEurikaClientApplication.class, args);
    }
    @Bean
    CommandLineRunner start(Service_voiture service_voiture){
        return args -> {
            service_voiture.savePapier(
                    new Papier("c01", Date.valueOf("2000-12-12"), Date.valueOf("2000-12-12"), Date.valueOf("2000-12-12")));
            service_voiture.savePapier(
                    new Papier("c02", Date.valueOf("2020-12-12"), Date.valueOf("2021-12-12"), Date.valueOf("2000-12-12")));

            service_voiture.saveVoiture(new VoitureRequestDTO("Serie 2","BMW", Categorie.coupès,
                    Energie.Essence, Etat.Bonne_Occasion,1200.02,9000,"c01"));
            service_voiture.saveVoiture(new VoitureRequestDTO("Claase E","Mercedes", Categorie.Familiate,
                    Energie.Hibride, Etat.Neuf,1400.02,10000,"c02"));
        };
    }
}
