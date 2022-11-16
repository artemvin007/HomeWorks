import java.util.Random;

class Animal {
    Random rn = new Random();
    protected String name;
    protected double jumpLimit;
    protected double runLimit;
    protected double swimLimit;
    public Animal() {
        this.name = "aboba";
        this.jumpLimit = 1;
        this.runLimit = 500;
        this.swimLimit = 20;
    }
    public Animal(String name, double jumpLimit, double runLimit, double swimLimit) {
        this.name = name;
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }
    public void animalInfo() {
        System.out.println("Animal: " + this.name);
        System.out.println("Jump Limit: " + this.jumpLimit);
        System.out.println("Run Limit: " + this.runLimit);
        System.out.println("Swim Limit: " + this.swimLimit);
    }
    public boolean jump(double jumpH){
        return jumpH <= this.jumpLimit;
    }
    public boolean run(double runLen){
        return runLen <= this.runLimit;
    }
    public boolean swim(double swimLen){
        return swimLen <= this.swimLimit;
    }
}

class Dog extends Animal{
    public Dog(){
        super();
        this.jumpLimit = this.rn.nextDouble(0.3, 0.7);
        this.runLimit = this.rn.nextDouble(450.0, 550.0);
        this.swimLimit = this.rn.nextDouble(7.0, 13.0);
    }
    public Dog(String name, double jumpLimit, double runLimit, double swimLimit){
        super(name, jumpLimit, runLimit, swimLimit);
    }
}

class Cat extends Animal{
    public Cat(){
        super();
        this.jumpLimit = this.rn.nextDouble(1.5, 3.0);
        this.runLimit = this.rn.nextDouble(150.0, 250.0);
        this.swimLimit = 0;
    }
    public Cat(String name, double jumpLimit, double runLimit, double swimLimit){
        super(name, jumpLimit, runLimit, swimLimit);
    }
}

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        Dog[] dogs = new Dog[5];
        for (int i = 0; i < 5; i++){
            cats[i] = new Cat();
            dogs[i] = new Dog();
        }
        for (int i = 0; i < 5; i++){
            cats[i].animalInfo();
            System.out.println(cats[i].jump(2.5));
        }
        for (int i = 0; i < 5; i++){
            dogs[i].animalInfo();
            System.out.println(dogs[i].run(500.0));
        }
    }
}
