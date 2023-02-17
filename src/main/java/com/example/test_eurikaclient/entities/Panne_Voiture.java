package com.example.test_eurikaclient.entities;

import com.example.test_eurikaclient.Enums.TypePanne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity @NoArgsConstructor @AllArgsConstructor
@Data
public class Panne_Voiture {
    @Id
    private long id;
    private TypePanne typePanne;
    private boolean resolu;
    private String description;
    @ManyToOne
    private Voiture voiture;
}
