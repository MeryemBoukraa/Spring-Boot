package com.example.sprintboot1.service;


import com.example.sprintboot1.entities.Chambre;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IChambreService {

    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
}
