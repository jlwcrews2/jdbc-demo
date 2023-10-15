package no.jlwcrews.jdbcdemo.service;

import no.jlwcrews.jdbcdemo.model.Part;
import no.jlwcrews.jdbcdemo.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartsService {

    private final PartRepository partRepository;

    @Autowired
    public PartsService(PartRepository partRepository) {
        this.partRepository = partRepository;
    }

    public List<Part> getParts(){
        return partRepository.findAll();
    }

    public Part addPart(Part part) {
        return partRepository.save(part);
    }

    public void deletePart(Part part) {
        partRepository.delete(part);
    }

    public Part updatePart(Part part) {
        return partRepository.save(part);
    }
}
