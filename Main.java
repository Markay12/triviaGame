import java.util.*;

public class Main{
    public static void main(String[] args) {

        int correctMathQuestions = 0;
        int questionsAnswered = 0;
        int correctProgrammingQuestions = 0;
        double percent = 0;

        
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

                    while(correctMathQuestions != 5){
                        Math mathQuest = new Math();
                        int randomQuestion = mathQuest.randomNum();
                        System.out.print("\n" + mathQuest.mathQuestions(randomQuestion)); // print out question
                        String answer = console.next();
                        if (mathQuest.checkAnswer(randomQuestion, answer)){
                            if (correctMathQuestions >= 5){ 
                                System.out.printf("\nNice Job! You got 5 right!");
                                break;
                            }
                            correctMathQuestions++;
                            questionsAnswered++;
                            if(correctMathQuestions < 5){
                                System.out.printf("\nCorrect! You have %d right! %d more to go!\n", correctMathQuestions, 5 -   correctMathQuestions);
                            }
                            else { System.out.print("\n\nCorrect!\n\n"); }

                        }
                        else { 
                            questionsAnswered++;
                            System.out.println("\nDarn, thats not quite it");
                        }
                    }

                    break;

                case 'p':

                    while (correctProgrammingQuestions != 5){ 

                        Programming programQuest = new Programming();
                        int randomProgrammingQuestion = programQuest.programRandomNum();
                        System.out.print("\n[Enter 1 for True or 2 for False]\n" + programQuest.programmingQuestions(randomProgrammingQuestion));
                        int programAnswer = console.nextInt();
                        if(programQuest.checkProgrammingAnswer(randomProgrammingQuestion, programAnswer)){
                            if (correctProgrammingQuestions == 5){
                                System.out.print("\nNice job! You got 5 right!");
                                break;
                            }
                            correctProgrammingQuestions++;
                            questionsAnswered++;
                            if(correctProgrammingQuestions < 5){
                                System.out.printf("\nCorrect! You have %d right! Only %d more to go!\n", correctProgrammingQuestions, 5 - correctProgrammingQuestions);
                            }

                            else { System.out.print("\n\nCorrect!\n\n"); }

                        }
                        else {
                            questionsAnswered++;
                            System.out.println("\nDarn, that's not quite it");

                        }


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


        } while (command != 'q' && correctMathQuestions != 5 && correctProgrammingQuestions != 5);

        if (correctMathQuestions == 5){
            percent = correctMathQuestions/questionsAnswered;
            System.out.printf("\nCongratulations! You got %d questions right out of %d! For a percentage of %.2f%\n\n", correctMathQuestions, questionsAnswered, percent);
        }
        else if (correctProgrammingQuestions == 5){
            percent = (correctProgrammingQuestions/questionsAnswered);
            System.out.printf("\nCongratulations! You got %d questions right out of %d! For a percentage of %f %\n\n", correctProgrammingQuestions, questionsAnswered, percent);
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