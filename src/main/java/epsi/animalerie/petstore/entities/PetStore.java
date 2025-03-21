package epsi.animalerie.petstore.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class PetStore {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String managerName;

    @OneToMany(mappedBy = "petStore")
    private List<Product> products;

    @OneToMany(mappedBy = "petStore")
    private List<Animal> animals;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public PetStore() {}

    public PetStore(String name, String managerName, Address address) {
        this.name = name;
        this.managerName = managerName;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManagerName() {
        return managerName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    // Redéfinition de la méthode toString pour afficher les informations de l'objet PetStore
    @Override
    public String toString() {
        return "PetStore : " +
                "[id - " + id +
                ", name - '" + name + '\'' +
                ", managerName - " + managerName + '\'' +
                ", address - " + address +
                ']';
    }
}