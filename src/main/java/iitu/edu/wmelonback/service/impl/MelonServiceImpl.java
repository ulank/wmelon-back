package iitu.edu.wmelonback.service.impl;

import iitu.edu.wmelonback.model.Melon;
import iitu.edu.wmelonback.repository.MelonRepository;
import iitu.edu.wmelonback.service.MelonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ulan
 * @date 9/6/2022
 */

@Service
public class MelonServiceImpl implements MelonService {

    private final MelonRepository melonRepository;

    @Autowired
    public MelonServiceImpl(MelonRepository melonRepository) {
        this.melonRepository = melonRepository;
    }

    @Override
    public List<Melon> findAll() {
        return melonRepository.findAll();
    }

    @Override
    public Melon save(Melon melon) {
        return melonRepository.save(melon);
    }
}
