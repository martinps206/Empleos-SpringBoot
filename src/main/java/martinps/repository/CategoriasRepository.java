package martinps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import martinps.model.Categoria;

public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {

}
