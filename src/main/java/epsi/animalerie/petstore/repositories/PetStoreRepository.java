package epsi.animalerie.petstore.repositories;


import epsi.animalerie.petstore.entities.PetStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetStoreRepository extends JpaRepository<PetStore, Long> {
}
