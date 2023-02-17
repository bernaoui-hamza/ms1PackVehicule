package com.example.test_eurikaclient.DTO;



import com.example.test_eurikaclient.Enums.Categorie;
import com.example.test_eurikaclient.Enums.Energie;
import com.example.test_eurikaclient.Enums.Etat;
import com.example.test_eurikaclient.entities.Papier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @AllArgsConstructor
@NoArgsConstructor
public class VoitureResponseDTO {
    private String idv;
    private  String marque;
    private String modele;
    private Categorie categorie;
    private Energie energie;
    private Etat etat;
    private double prixJour;
    private Date dateCirculation;
    private int kilometrage;
    private String papier_id;
    private Papier papier;


}
