package com.example.test_eurikaclient.Repositories;


import com.example.test_eurikaclient.entities.Panne_Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanneRepository extends JpaRepository<Panne_Voiture,Long> {
}
