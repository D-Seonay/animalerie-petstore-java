package epsi.animalerie.petstore.repositories;


import epsi.animalerie.petstore.entities.ProdType;
import epsi.animalerie.petstore.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCode(String code);

    List<Product> findProductsByCode(String code);

    List<Product> findProductsByType(ProdType type);
}