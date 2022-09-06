package iitu.edu.wmelonback.service;

import iitu.edu.wmelonback.model.Melon;

import java.util.List;

/**
 * @author Ulan
 * @date 9/6/2022
 */

public interface MelonService {

    List<Melon> findAll();

    Melon save(Melon melon);
}
