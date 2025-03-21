package epsi.animalerie.petstore.entities;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Fish")
public class Fish extends Animal {
    @Enumerated(EnumType.STRING)
    private FishLivEnv livingEnv;

    public Fish() {}

    public Fish(String birth, String couleur, PetStore petStore, FishLivEnv livingEnv) {
        super(birth, couleur, petStore);
        this.livingEnv = livingEnv;
    }

    public FishLivEnv getLivingEnv() { return livingEnv; }
    public void setLivingEnv(FishLivEnv livingEnv) { this.livingEnv = livingEnv; }


    // Redéfinition de la méthode toString pour afficher les informations de l'objet Fish
    @Override
    public String toString() {
        return "Fish : " +
                "[livingEnv - " + livingEnv +
                "] " + super.toString();
    }
}
