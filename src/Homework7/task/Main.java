import java.util.Random;
class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (food < n)
            return false;
        food -= n;
        return true;
    }
    public void increaseFood(int n){
        food += n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
class Cat {
    private String name;
    private int appetite;
    private boolean full;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }
    public void eat(Plate p) {
        full = p.decreaseFood(appetite);
    }

    public boolean isFull() {
        return full;
    }
    public void printInfo(){
        System.out.println("Кличка :" + name);
        System.out.println(appetite);
        if (full){
            System.out.println("Котик сыт");
        }else{
            System.out.println("Котик голоден");
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] catsNames = {
            "Gaston",
            "Hardy",
            "Perry",
            "Quincy",
            "Rider",
            "Hart",
            "Harley",
            "Jasper",
            "Silver",
            "Max",
            "Afina",
            "Agnes",
            "Jasmine",
            "Melissa",
            "Daisy",
            "Ember",
            "Katie",
            "Pixie",
            "Sheila",
            "Silva"
        };
        Cat[] cats = {
                new Cat("Barsik", 10),
                new Cat(catsNames[rand.nextInt(catsNames.length)], rand.nextInt(25)),
                new Cat(catsNames[rand.nextInt(catsNames.length)], rand.nextInt(25)),
                new Cat(catsNames[rand.nextInt(catsNames.length)], rand.nextInt(25)),
                new Cat(catsNames[rand.nextInt(catsNames.length)], rand.nextInt(25)),
                new Cat(catsNames[rand.nextInt(catsNames.length)], rand.nextInt(25)),
        };
        Plate plate = new Plate(100);
        feedCats(cats, plate);
    }

    public static void feedCats(Cat[] cats, Plate plate){
        int firstHungryCatNum = firstHungryCat(cats);
        int count = 0;
        while(firstHungryCatNum != cats.length){
            System.out.println("Не все котикики сыты");
            count++;
            for (int i = firstHungryCatNum; i < cats.length; i++){
                cats[i].eat(plate);
            }
            plate.increaseFood(100);
            firstHungryCatNum = firstHungryCat(cats);
        }
        System.out.println("Все котики сыты, тарелку наполняли " + count + " раз");
        for (int i = 0; i < cats.length; i++){
            cats[i].printInfo();
        }
    }
    static public int firstHungryCat(Cat[] cats){
        boolean flag = false;
        int i = cats.length;
        for (; i > 0 && !flag; i--){
            flag |= cats[i - 1].isFull();
        }
        return i + 1;
    }
}
