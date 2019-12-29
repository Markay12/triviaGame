public class Music{
	
	public Music(){}
	
	// No need for random number method. Not something to be used when going through the questions
	
	public String getQuestion(int questionNum){
		
		// if statements to print out the questions
		
		if (questionNum == 1){
			
			return "\n[Enter 1 for Yes and 2 for No]\n-------------------------\n\nAre an Fb and an E Natural the same note?\n[ANSWER]: ";
			
		}
		if (questionNum == 2){
			
			return "\n[Enter the Correct Number]\n-------------------------\n\nHow many musicians must you have to be considered a BIG Band?\n[ANSWER]: ";
			
		}
		if (questionNum == 3){
			
			return "\n[Choose the correct corresponding Number]\n\nWhich musical instrument has black and white keys?\n-------------------------\n\n1.) Guitar\n2.) Piano\n3.) Saxophone\n\n[ANSWER]: ";
			
		}
		else { return ""; }
		
	}
	
	
	public boolean checkAnswer(int questionNum, int answer){
		
		// check the user answer
		
		if (questionNum == 1){
			if (answer == 1){
				return true;
			}
			else { return false; }
		}
		if (questionNum == 2){
			if (answer == 10){
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
		else { return false; }
		
	}
	
}