package Ques2.MultpleInhAndInterface;

class NewAnimal implements AnimalEat, AnimalTravel {
    public void eat() {
        System.out.println("Animal is eating");
    }
    public void travel() {
        System.out.println("Animal is travelling");
    }
}
public class Test {
    public static void main(String[] args) {
        NewAnimal a = new NewAnimal();
        a.eat();
        a.travel();
    }
}
