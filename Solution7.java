class Animal {
    String AnimalName;
    int weight;
    
    public void setAnimalName(String name) {
        this.AnimalName = name;
    }
    
    public String getAnimalName() {
        return AnimalName;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public int getWeight() {
        return weight;
    }
}

public class Solution7 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAnimalName("Cow");
        animal.setWeight(24);
        System.out.println("Name: " + animal.getAnimalName());
        System.out.println("Weight: " + animal.getWeight());
    }
}
