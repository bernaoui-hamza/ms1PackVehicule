package com.example.test_eurikaclient.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity @AllArgsConstructor @NoArgsConstructor
@Data
public class Papier {
    @Id
    private String id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_assurance;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_vignette;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_visiteTechnique;
}
