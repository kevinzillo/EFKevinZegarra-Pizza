package EFKevinZegarraPizza.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFKevinZegarraPizza.Model.PizzaDetalle;
@Repository
public interface PizzaClienteRepository extends JpaRepository<PizzaDetalle, Integer> {

}
