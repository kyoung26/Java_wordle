import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        char placeHolder = '1';
        //boolean game = true;
        char currentletter;
        char wordleLetter;
        char underScore = '_';
        String wordle = Wordle().toUpperCase();
        char[] wordleCopy = wordle.toCharArray();
        while (attempts != 5) {
            System.out.println(" ");
            System.out.println("Guess the wordle: ");
            String attempt = scanner.nextLine().toUpperCase();
            System.out.println(" ");
            attempts += 1;
            // if you guess the correct wordle print out the wordle
            if (Objects.equals(attempt, wordle)) {
                System.out.println("You've guessed the wordle!!");
                System.out.println(wordle);
                return;
            }
            // if the char in attempt matches the location of the char in the wordle then print the char at the wordle location.
            for(int i = 0; i < wordle.length(); i++){
                currentletter = attempt.charAt(i);
                if(currentletter == wordle.charAt(i)){
                    System.out.print(wordle.charAt(i));
                    continue;
                }
                // if current letter is found in the wordle but not at the location of currentletter index then print y
                // indexOf checks if the currentletter occurs in the string
                if(wordle.indexOf(currentletter) > -1){
                    System.out.print("y");
                    continue;
                }
                System.out.print("_");
            }
            System.out.println();
        }
        System.out.println("The Wordle was: " + wordle);
    }

    public static String Wordle(){
        ArrayList<String> words = new ArrayList<String>();
        words.add("Fully");
        Random random = new Random();
        //int randomWord = random.nextInt(words.size());
        //String wordle = words.get(randomWord);
        return words.get(0);
    }

}