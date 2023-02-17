package com.example.test_eurikaclient.Repositories;


import com.example.test_eurikaclient.entities.Papier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PapierRepository extends JpaRepository<Papier,String> {
    Papier findPapierById(String id);
}
