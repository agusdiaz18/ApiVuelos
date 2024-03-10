package codoacodo.vuelosapi.repository;

import codoacodo.vuelosapi.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //nuestro objeto de acceso datos
public interface VueloRepository extends JpaRepository<Flight, Long>{

}
