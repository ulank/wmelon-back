package iitu.edu.wmelonback.service;

import iitu.edu.wmelonback.model.Melon;

import java.util.List;
import java.util.Optional;

/**
 * @author Ulan
 * @date 9/6/2022
 */

public interface MelonService {

    List<Melon> findAll();

    Melon save(Melon melon);

    void deleteById(Long melonId);

    Optional<Melon> findById(Long melonId);

}
