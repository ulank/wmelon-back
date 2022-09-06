package iitu.edu.wmelonback.repository;

import iitu.edu.wmelonback.model.Melon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ulan
 * @date 9/6/2022
 */

@Repository
public interface MelonRepository extends JpaRepository<Melon, Long> {

}
