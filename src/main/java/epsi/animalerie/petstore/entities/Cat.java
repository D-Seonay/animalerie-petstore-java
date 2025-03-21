package epsi.animalerie.petstore.entities;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Cat")
public class Cat extends Animal {
    private String chipId;

    public Cat() {}

    public Cat(String birth, String couleur, PetStore petStore, String chipId) {
        super(birth, couleur, petStore);
        this.chipId = chipId;
    }

    public String getChipId() { return chipId; }

    public void setChipId(String chipId) { this.chipId = chipId; }

    // Redéfinition de la méthode toString pour afficher les informations de l'objet Cat
    @Override
    public String toString() {
        return "Cat : " +
                "[chipId - '" + chipId + '\'' +
                "] " + super.toString();
    }
}