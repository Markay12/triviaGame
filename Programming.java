import java.util.*;

public class Programming{

    private char answer;
    private char choice;

    public Programming(){
		
		// instance variables that are never used

        answer = this.answer;
        choice = this.choice;
		
    }

    public int programRandomNum(){

        int questionsSize = 10;

        Random rand = new Random();

        int randomNum = rand.nextInt((questionsSize - 1)+1) + 1;

        return randomNum;

    }

    public String programmingQuestions(int questionNum){

        // if statements to choose random questions

        if (questionNum == 1){
            return "Is a class and method in Java the same thing?: ";
        }
        else if (questionNum == 2){
            return "Was the Programming language Python influenced by the Monty Python series?: ";
        }
        else if (questionNum == 3){
            return "In the programming language Python. Is 'elseif' the correct syntax use for an else if statement?: ";
        }
        else if (questionNum == 4){
            return "Does the 'q' in QBasic stand for 'Quick'?: ";
        }
        else if (questionNum == 5){
            return "Is a standard cd 10 cm in length?: ";
        }
        else if (questionNum == 6){
            return "Does the programming language Python use Arrays?: ";
        }
        else if (questionNum == 7){
            return "When doing data analysis would using the language SQL be a good fit?: ";
        }
        else if (questionNum == 8){
            return "Would 'total_in_$' be an INVALID identifier?: ";
        }
        else if (questionNum == 9){
            return "If I wanted to add a new row into an SQL database would 'INSERT' be the correct syntax?: ";
        }
        else if (questionNum == 10){
            return "Viruses, trojans and worms are bad, Yes or No?: ";
        }
        else { return "[Invalid Number - Check method programRandomNum in Programming.java]"; }

    }

    public boolean checkProgrammingAnswer(int questionNum, int answer){

        if (questionNum == 1){
            if (answer == 2){
                return true;
            }
            else { return false; }
        }
        if (questionNum == 2){
            if (answer == 1){
                return true;
            }
            else { return false; }
        }
        if (questionNum == 3){
            if (answer == 2){
                return true;
            }
            else { return false; }
        }
        if (questionNum == 4){
            if (answer == 1){
                return true;
            }
            else { return false; }
        }
        if (questionNum == 5){
            if (answer == 2){
                return true;
            }
            else { return false; }
        }
        if (questionNum == 6){
            if(answer == 2){
                return true;
            }
            else { return false; }
        }
        if (questionNum == 7){
            if (answer == 1){
                return true;
            }
            else { return false; }
        }
        if (questionNum == 8){
            if (answer == 1){
                return true;
            }
            else { return false; }
        }
        if (questionNum == 9){
            if (answer == 1){
                return true;
            }
            else { return false; }
        }
        if (questionNum == 10){
            if (answer == 1){
                return true;
            }
            else { return false; }
        }
        else { return false; }

    }

}