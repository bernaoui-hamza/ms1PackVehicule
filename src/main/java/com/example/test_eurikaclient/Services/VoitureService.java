package com.example.test_eurikaclient.Services;



import com.example.test_eurikaclient.DTO.VoitureRequestDTO;
import com.example.test_eurikaclient.DTO.VoitureResponseDTO;
import com.example.test_eurikaclient.Repositories.PapierRepository;
import com.example.test_eurikaclient.Repositories.VoitureRepository;
import com.example.test_eurikaclient.entities.Papier;
import com.example.test_eurikaclient.entities.Voiture;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional @AllArgsConstructor

public class VoitureService implements Service_voiture {

VoitureRepository voitureRepository;

PapierRepository papierRepository;



    @Override
    public List<VoitureResponseDTO> listeVoitures() {
        List<Voiture>ListV=voitureRepository.findAll();

        List<VoitureResponseDTO> voitures=ListV.stream()
                .map(voiture -> fromVoiture(voiture)).collect(Collectors.toList());
//voitures.stream().filter(voiture1->voiture1.setPapier(papierRepository.findPapierById(voiture1.getPapier_id()));
  voitures.forEach(f->f.setPapier(papierRepository.findPapierById(f.getPapier_id())));
        return  voitures;
    }

    @Override
    public VoitureResponseDTO getVoiture(String id) {
        Voiture v=voitureRepository.findByIdv(id);
        Papier p1=papierRepository.findPapierById(v.getPapier_id());
        System.out.println("papier Voiture"+p1.getDate_assurance()+"--"+p1.getDate_vignette());
        VoitureResponseDTO v2=fromVoiture(v);
        v2.setPapier(p1);
        return v2;
    }
    @Override
    public Voiture fromVoitureRequestDTO(VoitureRequestDTO voitureRequestDTO) {


        Voiture v1=new Voiture();
        v1.setCategorie(voitureRequestDTO.getCategorie());
        v1.setEtat(voitureRequestDTO.getEtat());
        v1.setEnergie(voitureRequestDTO.getEnergie());
        v1.setMarque(voitureRequestDTO.getMarque());
        v1.setModele(voitureRequestDTO.getModele());
        v1.setPrixJour(voitureRequestDTO.getPrixJour());
        v1.setPapier_id(voitureRequestDTO.getPapier_id());
        v1.setKilometrage(voitureRequestDTO.getKilometrage());

        return v1;
    }
    @Override
    public VoitureResponseDTO fromVoiture(Voiture voiture) {
        VoitureResponseDTO v1=new VoitureResponseDTO();
        v1.setIdv(voiture.getIdv());
        v1.setCategorie(voiture.getCategorie());
        v1.setEtat(voiture.getEtat());
        v1.setEnergie(voiture.getEnergie());
        v1.setMarque(voiture.getMarque());
        v1.setModele(voiture.getModele());
        v1.setPrixJour(voiture.getPrixJour());
        v1.setPapier_id(voiture.getPapier_id());
        v1.setKilometrage(voiture.getKilometrage());
        v1.setDateCirculation(voiture.getDateCirculation());
        v1.setPapier(voiture.getPapier());


        return v1;
    }

    @Override
    public Papier savePapier(Papier papier) {
    Papier p1=papierRepository.save(papier);
        return p1;
    }
    static int i=1;
    @Override
    public VoitureResponseDTO saveVoiture(VoitureRequestDTO voiture) {
    Voiture v1=new Voiture();

            v1=fromVoitureRequestDTO(voiture);
            v1.setIdv("v"+i);
            i++;
            v1.setDateCirculation(new Date());
            voitureRepository.save(v1);
            VoitureResponseDTO voitureResponseDTO=fromVoiture(v1);
            // voitureResponseDTO.setId(v1.getId());
            return voitureResponseDTO;
    }

    @Override
    public Voiture updateVoiture(Long id) {
        return null;
    }
}
