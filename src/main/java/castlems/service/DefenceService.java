package castlems.service;

import castlems.repository.DefenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefenceService {

    @Autowired
    private DefenceRepository defenceRepository;

    public DefenceService(DefenceRepository defenceRepository) {
        this.defenceRepository = defenceRepository;
    }
}