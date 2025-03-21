package epsi.animalerie.petstore.entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "animal_type")
public abstract class Animal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String birth;
    private String couleur;

    @ManyToOne
    private PetStore petStore;

    public Animal() {}

    public Animal(String birth, String couleur, PetStore petStore) {
        this.birth = birth;
        this.couleur = couleur;
        this.petStore = petStore;
    }

    public Long getId() {
        return id;
    }

    public String getBirth() {
        return birth;
    }

    public String getCouleur() {
        return couleur;
    }

    public PetStore getPetStore() {
        return petStore;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }

    @Override
    public String toString() {
        return "Animal : " +
                "[id - " + id +
                ", birth - '" + birth + '\'' +
                ", couleur - '" + couleur + '\'' +
                ']';
    }
}