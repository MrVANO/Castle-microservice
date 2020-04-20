package castlems.repository;

import castlems.entity.Castle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CastleRepository extends JpaRepository<Castle, Long> {
}