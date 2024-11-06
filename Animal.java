public class Animal {
    protected String species;

    public Animal(String species){
        this.species = species;
    }

    public void showDetails(){
        System.out.println("Especie: " + species);
    }
}

class Fish extends Animal{
    private String waterType;

    Fish(String species, String waterType){
        super(species);
        this.waterType = waterType;
    }

    @Override
    public void showDetails(){
        System.out.println("Información del pez");
        super.showDetails();
        System.out.println("Tipo de agua: " + waterType);
    }

    
}

class Test {
    public static void main(String[] args) {
        Fish fish = new Fish("Globo", "Agua Salada");
        fish.showDetails();
    }
}
