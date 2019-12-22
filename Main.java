import java.util.*;

public class Main{
    public static void main(String[] args) {

        int correctMathQuestions = 0;
        int questionsAnswered = 0;
        int correctProgrammingQuestions = 0;
        float percent;
        int quit = 0;

        
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

                    do{
                        Math mathQuest = new Math();
                        int randomQuestion = mathQuest.randomNum();
                        System.out.print("\n[Enter 00 to quit]\n");
                        System.out.print("\n" + mathQuest.mathQuestions(randomQuestion)); // print out question
                        int answer = console.nextInt();
                        if (mathQuest.checkAnswer(randomQuestion, answer)){
                            if (correctMathQuestions >= 5){ 
                                System.out.printf("\nNice Job! You got 5 right!");
                                break;
                            }
                            correctMathQuestions++;
                            questionsAnswered++;
                            if(correctMathQuestions < 5){
                                System.out.printf("\n---------------------------------------------\nCorrect! You have %d right! Only %d more to go!\n---------------------------------------------\n", correctMathQuestions, 5 -   correctMathQuestions);
                            }
                            else { System.out.print("\n\nCorrect!\n\n"); }

                        }
                        else if (answer == 00){
                            System.out.print("\n[ENTER 'q' to exit out of the program]\n\n");
                            break;
                        } 
                        else {
                            questionsAnswered++;
                            System.out.println("\n------------------------\nDarn, thats not quite it\n------------------------\n");
                        }
                    } while (correctMathQuestions != 5);

                    break;

                case 'p':

                    do { 

                        Programming programQuest = new Programming();
                        int randomProgrammingQuestion = programQuest.programRandomNum();
                        System.out.print("\n[Enter 1 for True or 2 for False and 3 to quit]\n" + programQuest.programmingQuestions(randomProgrammingQuestion));
                        int programAnswer = console.nextInt();
                        if (programAnswer == 3){
                            quit++;
                        }
                        if(programQuest.checkProgrammingAnswer(randomProgrammingQuestion, programAnswer)){
                            if (randomProgrammingQuestion == 2){
                                System.out.print("\n\nThis is a great story! And a true one! The person who led to the creation of Python was a great fan of Monty Python and got his naming inspiration from it. The show was more specifically named Monty Python's Flying Circus, a comedy series from the seventies.\n\n");
                            }
                            if (correctProgrammingQuestions == 5){
                                System.out.print("\nNice job! You got 5 right!");
                                break;
                            }
                            correctProgrammingQuestions++;
                            questionsAnswered++;
                            if(correctProgrammingQuestions < 5){
                                System.out.printf("\n---------------------------------------------\nCorrect! You have %d right! Only %d more to go!\n---------------------------------------------\n", correctProgrammingQuestions, 5 - correctProgrammingQuestions);
                            }

                            else { System.out.print("\n\nCorrect!\n\n"); }

                        }
                        else {
                            if (programAnswer != 3 && randomProgrammingQuestion != 3 && randomProgrammingQuestion != 8 && randomProgrammingQuestion != 10){
                                questionsAnswered++;
                                System.out.println("\nDarn, that's not quite it");
                            } 
                            else if (programAnswer == 3){
                                System.out.println("\nQuitting Programming Questions\n---------------------------------\n\n[Press q to quit]\n");
                            }
                            else if (randomProgrammingQuestion == 3){
                                questionsAnswered++;
                                System.out.print("\n\nThat was close, however, in Python the correct use of this statement is 'elif'\n\n");
                            }
                            else if (randomProgrammingQuestion == 8){
                                questionsAnswered++;
                                System.out.print("\n\nIn order to prevent confusion, some rules are applied to the naming of identifiers. For example, identifiers are not allowed to have blanks such as \"Total Cost.\" Identifiers cannot be named after reserved words such as int, float, const, enum, etc. Special symbols such as \"$\" and \"@\" are not allowed.\n\n");
                            }
                            else if (randomProgrammingQuestion == 10){
                                questionsAnswered++;
                                System.out.print("\n\nUnless you enjoy having your system security open to everyone, involuntarily e-mailing things to friends and business associates, losing personal data and have your disk formatted when you least expect it.\n\n");
                            }

                        }


                    } while (correctProgrammingQuestions != 5 && quit != 1);

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
            percent = (correctMathQuestions * 100.0f) / questionsAnswered;
            System.out.printf("\nCongratulations! You got %d questions right out of %d!\n\n", correctMathQuestions, questionsAnswered, percent);
        }
        else if (correctProgrammingQuestions == 5){
            percent = (correctProgrammingQuestions * 100.0f) / questionsAnswered;
            System.out.printf("\nCongratulations! You got %d questions right out of %d!\n\n", correctProgrammingQuestions, questionsAnswered);
        }
        else { System.out.printf("\nGame over...\n "); }


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