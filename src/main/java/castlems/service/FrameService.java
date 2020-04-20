package castlems.service;

import castlems.entity.Frame;
import castlems.repository.FrameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FrameService {
    @Autowired
    private final FrameRepository frameRepository;

    public FrameService(FrameRepository frameRepository) {
        this.frameRepository = frameRepository;
    }

    public List<Frame> findAll() {
        return frameRepository.findAll();
    }
}