package cat;

public class Cat {
    private String name;

    private String breeds;

    double weight;

    void claw(){
        System.out.println("할퀴기");
    }

    void meow(){
        System.out.println("야옹 !!!");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

