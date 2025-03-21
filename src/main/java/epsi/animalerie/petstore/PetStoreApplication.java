package epsi.animalerie.petstore;

import epsi.animalerie.petstore.entities.*;
import epsi.animalerie.petstore.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

@SpringBootApplication
public class PetStoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(PetStoreApplication.class, args);
    }

    @Bean
    CommandLineRunner initData(PetStoreRepository petStoreRepo,
                               AddressRepository addressRepo,
                               ProductRepository productRepo,
                               AnimalRepository animalRepo) {
        return args -> {
            // Création des adresses
            Address address1 = new Address("6 bis", "Rue des Animaux", "75001", "Paris");
            Address address2 = new Address("20", "Avenue des Bêtes", "69002", "Lyon");
            Address address3 = new Address("15", "Rue des Poils", "13003", "Nantes");
            addressRepo.saveAll(List.of(address1, address2, address3));

            // Création des animaleries
            PetStore store1 = new PetStore("Animalia", "Mathéo", address1);
            PetStore store2 = new PetStore("ZooMarket", "Théo", address2);
            PetStore store3 = new PetStore("PetLand", "Sasha", address3);
            petStoreRepo.saveAll(List.of(store1, store2, store3));

            // Création des produits
            Product prod1 = new Product("P001", "Croquettes", ProdType.FOOD, 10.99, store1);
            Product prod2 = new Product("P002", "Laisse", ProdType.ACCESSORY, 15.50, store2);
            Product prod3 = new Product("P003", "Shampooing", ProdType.CLEANING, 8.99, store3);
            Product prod4 = new Product("P001", "Croquettes Premium", ProdType.FOOD, 20.99, store1);
            productRepo.saveAll(List.of(prod1, prod2, prod3, prod4));

            // Création des animaux
            Fish fish1 = new Fish("2023-01-10", "Rouge", store1, FishLivEnv.FRESH_WATER);
            Fish fish2 = new Fish("2022-05-15", "Bleu", store2, FishLivEnv.SEA_WATER);
            Cat cat1 = new Cat("2021-08-20", "Noir", store3, "CHIP123");
            Cat cat2 = new Cat("2020-11-12", "Blanc", store1, "CHIP456");
            animalRepo.saveAll(List.of(fish1, fish2, cat1, cat2));

            // Affichage des données en base
            // Affichage des produits avec le code P001
            System.out.println("----- Liste des produits avec code P001 -----");
            List<Product> productsByCode = productRepo.findProductsByCode("P001");
            productsByCode.forEach(System.out::println);

            // Affichage des produits de type FOOD
            System.out.println("----- Liste des produits de type FOOD -----");
            List<Product> productsByType = productRepo.findProductsByType(ProdType.FOOD);
            productsByType.forEach(System.out::println);

            // Affichage des animaux de l'animalerie 1
            System.out.println("----- Liste des animaux de l'animalerie 1 -----");
            List<Animal> animalsByStore = animalRepo.findAnimalsByPetStore(store1.getId());
            animalsByStore.forEach(System.out::println);

            // Utilisation de la méthode toString de réimplémentée dans les classes Cat et Fish
            System.out.println("----- Utilisation de la méthode toString -----");
            System.out.println(cat1.toString());
            System.out.println(fish1.toString());
            System.out.println(prod1.toString());




        };

    }
}