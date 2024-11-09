package com.example.sprintboot1.service.imp;

import com.example.sprintboot1.entities.Chambre;
import com.example.sprintboot1.repository.TypeChambreRepositry;
import com.example.sprintboot1.service.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {

    TypeChambreRepositry chambreRepository;
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }
    public Chambre retrieveChambre(Long chambreId) {
        return chambreRepository.findById(chambreId).get();
    }
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }
    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);
    }
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }


}


