import java.util.*;

public class Math{

    private char answer;
    private char choice;

    public Math(){

        answer = this.answer;
        choice = this.choice;

    }

    public int randomNum(){

        int questionsSize = 10;

        Random rand = new Random();

        int randomNum = rand.nextInt((questionsSize - 1) + 1) + 1;

        return randomNum;

    }

    public String questions(int questionNum){

        // if statements to choose which question to print

        if (questionNum == 1){
            return "What is 1+1?: ";
        } 
        else if (questionNum == 2){
            return "What is 8 * 6?: ";
        }
        else if (questionNum == 3){
            return "What is the derivative of 3?: ";
        }
        else if (questionNum == 4){
            return "How many sides does an octagon have?: ";
        }
        else if (questionNum == 5){
            return "Tell me what number 80-42 (80 minus 42) is: ";
        }
        else if (questionNum == 6){
            return "What is 12 + 2?: ";
        }
        else if (questionNum == 7){
            return "I bet you couldn\'t tell me what 42*3 is: ";
        }
        else if (questionNum == 8){
            return "What do all the angles in a triangle add up to?: ";
        }
        else if (questionNum == 9){
            return "What is 15*4?: ";
        }
        else if (questionNum == 10){
            return "How many people that weight 200lbs can fit on a 5000lb strength elevator?: "; 
        }
        else { 
            return "";
        }

    } // end of questions method

	public boolean checkAnswer(int questionNumber, String answer){

        if (questionNumber == 1){
            if (answer == "2"){
                return true;
            }
            else { return false; }
        }
        else if (questionNumber == 2){
            if(answer == "48"){
                return true;
            }
            else { return false; }
        }
        else if (questionNumber == 3){
            if(answer == "0"){
                return true;
            }
            else { return false; }
        }
        else if (questionNumber == 4){
            if(answer == "8"){
                return true;
            }
            else { return false; }
        }
        else if (questionNumber == 5){
            if (answer == "38"){
                return true;
            }
            else { return false; }
        }
        else if (questionNumber == 6){
            if(answer == "14"){
                return true;
            }
            else { return false; }
        }
        else if (questionNumber == 7){
            if(answer == "126"){
                return true;
            }
            else { return false; }
        }
        else if (questionNumber == 8){
            if(answer == "180"){
                return true;
            }
            else { return false; }
        }
        else if (questionNumber == 9){
            if(answer == "60"){
                return true;
            }
            else { return false; }
        }
        else if (questionNumber == 10){
            if (answer == "25"){
                return true;
            }
            else { return false; }
        }

        else { return false; }
        
    }

}