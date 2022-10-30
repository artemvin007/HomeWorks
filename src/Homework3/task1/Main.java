import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int scanned_number = 1;
        while (scanned_number == 1){
            int hidden_number = random.nextInt(0, 9);
            for (int i = 0; i < 3; i++){
                System.out.println("Введите число");
                scanned_number = sc.nextInt();
                if (scanned_number == hidden_number) {
                    System.out.println("Вы угадали!");
                    i = 3;
                } else if (scanned_number < hidden_number) {
                    System.out.println("Ваше число меньше");
                }else {
                    System.out.println("Ваше число больше");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            scanned_number = sc.nextInt();
        }
    }
}
