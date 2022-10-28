import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int min_a = a[0];
        int max_a = a[0];
        for (int i = 1; i < n; i++){
            if (min_a > a[i]) {
                min_a = a[i];
            }else if(max_a < a[i]){
                max_a = a[i];
            }
        }
        System.out.println(min_a);
        System.out.println(max_a);
    }
}
