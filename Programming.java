import java.util.*;



public class Programming{

    private char answer;
    private char choice;

    public Programming(){

        answer = this.answer;
        choice = this.choice;

    }

    public int programRandomNum(){

        int questionsSize = 1;

        Random rand = new Random();

        int randomNum = rand.nextInt((questionsSize - 1)+1) + 1;

        return randomNum;

    }

    public String programmingQuestions(int questionNum){

        // if statements to choose random questions

        if (questionNum == 1){
            return "Is a class and method in Java the same thing?: ";
        }
        else { return ""; }

    }

    public boolean checkProgrammingAnswer(int questionNum, int answer){

        if (questionNum == 1){
            if (answer == 2){
                return true;
            }
            else { return false; }
        }
        else { return false; }

    }

}