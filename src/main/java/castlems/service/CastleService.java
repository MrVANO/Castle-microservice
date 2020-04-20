package castlems.service;

import castlems.entity.Castle;
import castlems.repository.CastleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CastleService {

    @Autowired
    private final CastleRepository castleRepository;

    public CastleService(CastleRepository castleRepository) {
        this.castleRepository = castleRepository;
    }

    public List<Castle> findAll() {
        return castleRepository.findAll();
    }

    public Castle getCastleById(Long id) {
        return castleRepository.findById(id).get();
    }

    public Long createCastle(Castle castle) {
        castle = castleRepository.saveAndFlush(castle);
        return castle.getId();
    }

    public void deleteCastle(Long id) {
        Castle castle = castleRepository.findById(id).get();
        castle.setState("D");
        castleRepository.saveAndFlush(castle);
    }
}