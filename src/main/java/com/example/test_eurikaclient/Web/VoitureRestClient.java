package com.example.test_eurikaclient.Web;


import com.example.test_eurikaclient.DTO.VoitureResponseDTO;
import com.example.test_eurikaclient.Services.Service_voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api")
public class VoitureRestClient {
    @Autowired
    Service_voiture service_voiture;
    @GetMapping(path = "/voitures")
    public List<VoitureResponseDTO>voitureResponseDTOList(){
        return service_voiture.listeVoitures();
    }

    @GetMapping(path = "/voiture/{id}")
    public VoitureResponseDTO getVoiture(@PathVariable(name = "id") String id){
        return service_voiture.getVoiture(id);
    }

}
