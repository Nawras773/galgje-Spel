//gal
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
            boolean wordIsGuessed = false;
            int tries = 0;

            while(!wordIsGuessed && tries != ammountOfGuesses){
                System.out.println("Huidige raden: ");
                print(playerGuess);
                System.out.printf("Je hebt %d aantal pogingen over.\n", ammountOfGuesses-tries);
                System.out.println("Voer een enkel teken in: ");
                char input = scanner.nextLine().charAt(0);
                tries++;

                if(input == '-'){
                    wordIsGuessed = true;
                    weArePlaying = false;
                } else{
                    for(int i=0; i<randomWordToGuess.length; i++){
                        if(randomWordToGuess[i] == input){
                            playerGuess[i] = input;
                        }
                    }

                    if(isTheWordGuessed(playerGuess)){
                        wordIsGuessed = true;
                        System.out.println("Gefeliciteerd");
                    }
                }
            } /* End of wordIsGuessed */
            if(!wordIsGuessed){
                System.out.println("Je had geen gissingen meer.");
            }

            System.out.println("Wil je nog een keer spelen? (ja / nee) ");
            String choice = scanner.nextLine();
            if(choice.equals("nee")){
                weArePlaying = false;
            }

        }/*End of We Are Playing*/

        System.out.println("Game Over!");
    }

    public static void print(char array[]){
        for(int i=0; i<array.length; i++){ // Assign empty dashes at start "_ _ _ _ _ _ _ _"
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean isTheWordGuessed(char[] array){
        boolean condition = true;
        for(int i=0; i<array.length; i++){
            if(array[i] == '_'){
                condition = false;
            }
        }
        return condition;
    }
    }
}}


    

