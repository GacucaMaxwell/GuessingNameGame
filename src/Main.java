import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the game.\nEnter 5 names");
        Scanner scanner=new Scanner(System.in);
        String[]name=new String[5];
        String guess;
        for (int x = 0; x <= 4; x++) {
            name[x]= scanner.next().toUpperCase();
        }
        System.out.println("Give the device to the guesser\nEnter your guesses:");
        int attempts=0;
            guess= scanner.next().toUpperCase();
            while((guess.toUpperCase().equals(name[0])||guess.toUpperCase().equals(name[1])||guess.toUpperCase().equals(name[2])||guess.toUpperCase().equals(name[3])||guess.toUpperCase().equals(name[4]))==false) {
                attempts++;
                System.out.println("WRONG!! " +attempts+" attempts used");
                guess=scanner.next().toUpperCase();

            }
            attempts++;
            System.out.println("You did it after "+attempts+" attempt(s).Your correct guess was "+guess);
        }
    }
