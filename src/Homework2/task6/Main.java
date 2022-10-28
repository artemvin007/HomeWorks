import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static boolean checkBalance(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        if (sum % 2 == 1){
            return false;
        }
        int temp_sum = 0;
        for (int i = 0; i < a.length; i++){
            temp_sum += a[i];
            if (temp_sum * 2 == sum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(checkBalance(a));
    }
}
