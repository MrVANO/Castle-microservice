package castlems.repository;

import castlems.entity.Castle;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CastleCrudRepository extends CrudRepository<Castle, Long> {

    Optional<Castle> findByUser(String user);
}