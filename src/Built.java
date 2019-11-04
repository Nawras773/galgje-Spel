
import java.util.Scanner;
import java.util.Random;

public class Built {

    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String guesses[] = {"hallo","lucht","worden","huis","achter","voor","bedrijf","school",
                            "stage","tafel","klass","computer","opdracht","huiswerk","eten",
                            "hond","werken","nederland","scherm","vrouw","daar","familie",
                            "waar","woenen","vader","moder","broer","ogen","oren","mooi"};
        
        boolean weArePlaying = true;
        while(weArePlaying){
            System.out.println("Laten we galgje ver 0.1 beginnen te spelen");
            int randomNumber = random.nextInt(guesses.length); //random.nextInt(10);
            char randomWordToGuess[] = guesses[randomNumber].toCharArray(); // java -> j,a,v,a
            int ammountOfGuesses = randomWordToGuess.length; //total tries to guess a word.
            char playerGuess[] = new char[ammountOfGuesses]; // "_ _ _ _ _ _ _ _"
            
            for(int i=0; i<playerGuess.length; i++){ // Assign empty dashes at start "_ _ _ _ _ _ _ _"
                playerGuess[i] =  '_';
            } 
    }
}}


    

