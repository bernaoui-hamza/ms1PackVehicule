package com.example.test_eurikaclient.DTO;


import com.example.test_eurikaclient.Enums.Categorie;
import com.example.test_eurikaclient.Enums.Energie;
import com.example.test_eurikaclient.Enums.Etat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor
public class VoitureRequestDTO {
    private  String marque;
    private String modele;
    private Categorie categorie;
    private Energie energie;
    private Etat etat;
    private double prixJour;
    private int kilometrage;
    private String papier_id;


}
