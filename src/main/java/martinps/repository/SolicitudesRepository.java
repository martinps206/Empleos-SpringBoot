package martinps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import martinps.model.Solicitud;

public interface SolicitudesRepository extends JpaRepository<Solicitud, Integer> {

}
