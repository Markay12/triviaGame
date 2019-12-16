import java.util.*;

public class Main{
    public static void main(String[] args) {

        int correctMathQuestions = 0;

        
        // to set and create names for the player
        
        System.out.printf("\n\nWelcome! Let's Play Some Trivia!\n\n What is your name?: "); //normal text

        Scanner console = new Scanner(System.in); // Scanner to take information from users

        information player = new information(); // contruct object to take name

        String inputName = console.next(); // assigns the values

        player.setName(inputName); // method to set name

        System.out.printf("\nThank you " + player.getName() + "!\n\n\n");

        // start of trivia questions

        System.out.printf("Choose a subject?: ");

        // switch statement 

        String choice;
        char command;

        printMenu(); // prints menu before the program begins

        do{
            // asks the user to choose a command
            System.out.print("\n[Please enter command or type: ? for the Menu]: ");
            choice = console.next().toLowerCase();
            command = choice.charAt(0);
            System.out.print("\n");

            switch (command){

                case 'm':
                    // start of math questions!
                    
                    System.out.printf("\nNice choice! %s, I'm a big fan of math!\n\n", player.getName());
                    Math mathQuest = new Math();
                    int randomQuestion = mathQuest.randomNum();
                    System.out.print("\n" + mathQuest.questions(randomQuestion)); // print out question
                    int answer = console.nextInt();
                    if (mathQuest.checkAnswer(randomQuestion, answer)){
                        if (correctMathQuestions >= 5){ 
                            System.out.printf("\nNice Job! You got 5 right!");
                            break;
                        }
                        correctMathQuestions++;
                        System.out.printf("\nCorrect! You have %d right! %d more to go!\n", correctMathQuestions, 5 - correctMathQuestions);
                        
                    }
                    else { 
                        System.out.println("\nDarn, thats not quite it");
                    }

                    break;
                    

                case '?': 
                    // prints the trivia menu for the user
                    printMenu();
                    break;

                case 'q': // statement to end the program
                    break;

                default:
                    System.out.printf("\nSorry %s, %s is not a valid command\n", player.getName(), command);
                    break;


            }


        } while (command != 'q' && correctMathQuestions != 5);

        if (correctMathQuestions == 5){
            System.out.printf("\nCongratulations! You got 5 math questions right\n\n");
        }
        else { System.out.printf("\nGame over..."); }


        console.close(); // used to close console input


    } // end of main method

    

    // start of print menu method
    public static void printMenu(){

        System.out.print(
          "\n-----------------------------------\n"
          +"m: Math\n"
          +"g: Grammar\n"
          +"p: Programming\n"
          +"u: Music\n"
          +"?: Display the menu again\n"
          +"q: quit this program\n\n");

    }

} // end of class