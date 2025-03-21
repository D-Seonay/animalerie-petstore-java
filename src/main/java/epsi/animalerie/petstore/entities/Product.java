package epsi.animalerie.petstore.entities;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String label;

    @Enumerated(EnumType.STRING)
    private ProdType type;

    private double price;

    @ManyToOne
    private PetStore petStore;

    public Product() {}

    public Product(String code, String label, ProdType type, double price, PetStore petStore) {
        this.code = code;
        this.label = label;
        this.type = type;
        this.price = price;
        this.petStore = petStore;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public ProdType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public PetStore getPetStore() {
        return petStore;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setType(ProdType type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }

    // Redéfinition de la méthode toString pour afficher les informations de l'objet Product
    @Override
    public String toString() {
        return "Product : " +
                "[id - " + id +
                ", code - '" + code + '\'' +
                ", label - '" + label + '\'' +
                ", type - " + type +
                ", price - " + price +
                ']';
    }
}