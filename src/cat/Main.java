package cat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("Aicat");
        cat.setBreeds("Persian");
        cat.setWeight(3.156783);

        System.out.printf("고양이 이름: %s\n",cat.getName());

        System.out.printf("고양이 품종: %s\n",cat.getBreeds());

        System.out.printf("고양이 몸무게: %.2fkg\n",cat.getWeight());

        System.out.println(cat.getName()+"이 ");
        cat.claw();

        System.out.println(cat.getName()+"이 ");
        cat.meow();

    }
}

