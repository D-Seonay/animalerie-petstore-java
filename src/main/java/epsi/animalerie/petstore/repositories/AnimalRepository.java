package epsi.animalerie.petstore.repositories;


import epsi.animalerie.petstore.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    @Query("SELECT a FROM Animal a WHERE a.petStore.id = :petStoreId")
    List<Animal> findAnimalsByPetStore(@Param("petStoreId") Long petStoreId);
}