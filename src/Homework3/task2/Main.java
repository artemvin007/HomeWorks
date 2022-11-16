import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String makePrompt(String hiddenWord, String userWord){
        String prompt = "";
        for (int i = 0; i < hiddenWord.length() && i < userWord.length(); i++){
            if (hiddenWord.charAt(i) == userWord.charAt(i)) {
                prompt += userWord.charAt(i);
            }else {
                prompt += "#";
            }
        }
        for (int i = prompt.length(); i < 15; i++){
            prompt += "#";
        }
        return prompt;
    }
    public static boolean winCheck(String hiddenWord, String userWord){
        boolean res = true && (hiddenWord.length() == userWord.length());
        for (int i = 0; i < hiddenWord.length() && i < userWord.length() && res; i++){
            res &= userWord.charAt(i) == hiddenWord.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rn = new Random();
        String hiddenWord = words[rn.nextInt(words.length)];
        while(true){
            String userWord = sc.next();
            if (winCheck(hiddenWord, userWord)) {
                System.out.println("!!!ВЫ УГАДАЛИ!!!");
                break;
            }else{
                System.out.println(makePrompt(hiddenWord, userWord));
            }
        }
    }
}
