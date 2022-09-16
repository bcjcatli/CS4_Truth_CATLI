import java.util.Scanner; //import

class Main {

  //modifieable variables that are declared as global variables 
  static int min = 1;
  static int max = 10;
  static int guessNumber = 3;
  
  //starting interface
  
  static void start() {
    Scanner myAction = new Scanner(System.in);
    
    System.out.println("Welcome to higher or lower! ");
    System.out.println("- Start Game");
    System.out.println("- Change Settings");
    System.out.println("- End Application");

    String choice = myAction.nextLine();
    verify(choice);
  }
  //verifies the input
  static void verify(String input) {
    if(input.equalsIgnoreCase("Start Game")){
      startGame();
    } else if(input.equalsIgnoreCase("Change Settings")) {
      changeSettings();
    } else if(input.equalsIgnoreCase("End Application")) {
      //ends
    } else {
      System.out.println("");
      System.out.println("Please enter your choice properly!");
      System.out.println("");
      start();
    }
  }
  
  //randomize number
  static int randomize(int min, int max) {
    int random = (int)Math.floor(Math.random()*(max-min+1)+min);
    //cheat: System.out.println(random);
    return random;
  }
  
  
  //game proper
  static void startGame() {
    int secret = randomize(min, max);
    int i = guessNumber;
    //loop that continues depending on the number of guesses allowed and also displays the adjustable values
    do {      
      System.out.printf("You have %d guess(es) left. What is your guess? (%d-%d)%n ", i, min, max);
      i--;
      Scanner input = new Scanner(System.in);
      int guess = input.nextInt();
      //checks if you win
      if(guess == secret) {
        System.out.println("GG! You won.");
        System.out.printf("Play again? (y/n) ");
        Scanner answer = new Scanner(System.in);
        char yn = answer.next().charAt(0);
        if(yn == 'y') {
          startGame();
        } else if(yn == 'n') {
          start();
        } else {
        }        
        break;
        //gives hint
      } else if(guess > secret && i > 0) {
        System.out.printf("Guess lower! ");
      } else if(guess < secret && i > 0) {
        System.out.printf("Guess higher! ");
        //checks if you lose
      } else {
        System.out.println("You lost.");
        System.out.printf("Play again? (y/n) ");
        Scanner answer = new Scanner(System.in);
        char yn = answer.next().charAt(0);
        if(yn == 'y') {
          startGame();
        } else if(yn == 'n') {
          start();
        } else {
        }        
      }
    } while (i > 0);
  }
  //allows you to adjust the values of min, max and the number of guesses allowed
  static void changeSettings() {
    Scanner myAction = new Scanner(System.in);

    //min
    System.out.println("What is the lower limit of the random number?");
    int newMin = myAction.nextInt();
    min = newMin;

    //max
    System.out.println("What is the upper limit of the random number?");
    int newMax = myAction.nextInt();
    max = newMax;

    //guess
    System.out.println("How many guesses are allowed?");
    int newGuess = myAction.nextInt();
    guessNumber = newGuess;

    System.out.println();
    //restarts the program with the new values
    start();
  }
  
  
  public static void main(String[] args) {
    //calls the starting function that leads to one another
    start();
  }
}