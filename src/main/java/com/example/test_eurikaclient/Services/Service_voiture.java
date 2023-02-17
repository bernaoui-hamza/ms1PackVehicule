package com.example.test_eurikaclient.Services;





import com.example.test_eurikaclient.DTO.VoitureRequestDTO;
import com.example.test_eurikaclient.DTO.VoitureResponseDTO;
import com.example.test_eurikaclient.entities.Papier;
import com.example.test_eurikaclient.entities.Voiture;

import java.util.List;

public interface Service_voiture {
     public List<VoitureResponseDTO> listeVoitures();
     public VoitureResponseDTO getVoiture(String id);
     public VoitureResponseDTO saveVoiture(VoitureRequestDTO voiture);
     public Voiture updateVoiture(Long id);
     public Voiture fromVoitureRequestDTO(VoitureRequestDTO voitureRequestDTO);
     public VoitureResponseDTO fromVoiture(Voiture voiture);
     public Papier savePapier(Papier papier);
}
