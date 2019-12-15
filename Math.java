import java.util.*;

public class Math{

    private char answer;
    private char choice;

    public Math(){

        answer = this.answer;
        choice = this.choice;

    }

    public int randomNum(){

        int questionsSize = 1;

        Random rand = new Random();

        int randomNum = rand.nextInt((questionsSize - 1) + 1) + 1;

        return randomNum;

    }

    public String questions(int questionNum){

        // if statements to choose which question to print

        if (questionNum == 1){
            return "Question1";
        } 
        else { 
            return "";
        }

    } // end of questions method

}