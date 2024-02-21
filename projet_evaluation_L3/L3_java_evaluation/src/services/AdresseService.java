package services;

import java.util.List;

import entities.Adresse;
import repositories.AdresseRepository;




public interface AdresseService {

    Adresse create(Adresse Adresse);
    List<Adresse> findAll();
    Adresse findById(Long id);
    Adresse update(Adresse Adresse);
    void delete(Long id);
}


public class AdresseServiceImpl implements AdresseService {

    private AdresseRepository AdresseRepository;

    public Adresse create(Adresse adresse) {
        return AdresseRepository.save(adresse);
    }

    public List<Adresse> findAll() {
        return AdresseRepository.findAll();
    }

    public Adresse findById(Long id) {
        return AdresseRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Adresse introuvable"));
    }

    public Adresse update(Adresse adresse) {
        return AdresseRepository.save(adresse);
    }

    public void delete(Long id) {
        AdresseRepository.deleteById(id);
    }
}