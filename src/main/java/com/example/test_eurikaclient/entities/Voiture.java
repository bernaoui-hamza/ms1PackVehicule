package com.example.test_eurikaclient.entities;

import com.example.test_eurikaclient.Enums.Categorie;
import com.example.test_eurikaclient.Enums.Energie;
import com.example.test_eurikaclient.Enums.Etat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Voiture {
    @Id
    private String idv;
    private  String marque;
    private String modele;
    @Enumerated(EnumType.STRING)
    private Categorie categorie;
    @Enumerated(EnumType.STRING)
    private Energie energie;
    @Enumerated(EnumType.STRING)
    private Etat etat;
    private double prixJour;
    private Date dateCirculation;
    private int kilometrage;
    @OneToMany(mappedBy = "voiture")
    private List<Panne_Voiture> panne_voitures;
    @Transient @OneToOne
    private Papier papier;
    private String papier_id;




}

