import java.util.*;

public class Grammar{

    public Grammar(){}

    public int randomNum(){

        int questionSize = 10;

        Random rand = new Random();

        int randomNum = rand.nextInt((questionSize - 1) + 1) + 1;

        return randomNum;

    }

    public String grammarQuestions(int questionNum){

        // if statements which choose the question to print

        if (questionNum == 1){
            return "\n[Idioms]\nNobody is interested, so let's just CANCEL the whole thing\n\n[What should CANCEL be replaced with?]\n---------------------------------\n1.) scratch\n2.) smell\n3.) surf\n\n[ANSWER]: ";
        }
        else if (questionNum == 2){
            return "\n[Fill the Blank]\nWe had ___ rain last night.\n\n[What should be placed here?]\n---------------------------------\n1.) a little\n2.) a few\n\n[ANSWER]: ";
        }
        else if (questionNum == 3){
            return "\n[Prepositions]\nJenny is ___ work now.\n\n[Which Preposition should be used here?]\n---------------------------------\n1.) on\n2.) in\n3.) at\n4.) over\n\n[ANSWER]: ";
        }
        else if (questionNum == 4){
            return "\n[Subject-Verb Agreement]\nThe large companies in our area ___ a cheap source of labor.\n\n[What should be placed here?]\n---------------------------------\n1.) Needs\n2.) Need\n\n[ANSWER]: ";
        }
        else if (questionNum == 5){
            return "\n[Apostrophes]\nYou should be able to borrow ____________ book.\n[Which name goes here?]\n---------------------------------\n1.) Henry'\n2.) Henry's\n3.) Henrys\n4.) Henries\n\n[ANSWER]: ";
        }
        else if (questionNum == 6){
            return "\n[Random Question]\nIf you want to turn left or right, you put these on.\n\n1.) headlights\n2.) steering wheel\n3.) horn\n4.) turn indicator\n5.) rack and pinion\n\n[ANSWER]: ";
        }
        else if (questionNum == 7){
            return "\n[Subject-Verb Agreement]\nOccurring naturally (is, are) over 100 elements, or substances that cannot be separated into different kinds of matter.\n\n[Which one?]\n---------------------------------\n1.) is\n2.) are\n\n[ANSWER]: ";
        }
        else if (questionNum == 8){
            return "\n[Basic Grammar]\nChoose the correct sentence.\n---------------------------------\n1.) Please set the glass on the table.\n2.) Please sit the glass on the table.\n3.) I sat the glass  on the table, to.\n\n[ANSWER]: ";
        }
        else if (questionNum == 9){
            return "\n[General Question]\nWhat is the night ___ for telephone calls overseas?\n\n---------------------------------\n1.) late\n2.) rate\n\n[ANSWER]: ";
        }
        else if (questionNum == 10){
            return "\n[General Question]\nMost university students __________ on campus in their first year. \n\n[Choose the correct answer]\n---------------------------------\n1.) Live\n2.) are living\n3.) live\n\n[ANSWER]: ";
        }

        else { return ""; } 

    }

    public boolean checkAnswer(int questionNum, int answer){

        if (questionNum == 1){
            if(answer == 1){
                return true;
            }
            else if (answer == 2 || answer == 3){
                return false;
            }
        }
        else if (questionNum == 2){
            if (answer == 1){
                return true;
            }
            else { return false; }
        }
        else if (questionNum == 3){
            if (answer == 3){
                return true;
            }
            else { return false; }
        }
        else if (questionNum == 4){
            if (answer == 2){
                return true;
            }
            else { return false; }
        }
        else if (questionNum == 5){
            if (answer == 2){
                return true;
            }
            else { return false; }
        }
        else if (questionNum == 6){
            if (answer == 4){
                return true;
            }
            else { return false; }
        }
        else if (questionNum == 7){
            if (answer == 2){
                return true;
            }
            else { return false; }
        }
        else if (questionNum == 8){
            if (answer == 1){
                return true;
            }
            else { return false; }
        }
        else if (questionNum == 9){
            if (answer == 2){
                return true;
            }
            else { return false; }
        }
        else if (questionNum == 10){
            if (answer == 3){
                return true;
            }
            else { return false; }
        }
        
        return false;
 

    }

}