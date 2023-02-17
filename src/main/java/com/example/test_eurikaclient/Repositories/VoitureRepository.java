package com.example.test_eurikaclient.Repositories;


import com.example.test_eurikaclient.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture,Long> {

    Voiture findByIdv(String id);
}
