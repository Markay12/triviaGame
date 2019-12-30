# Trivia Game
Trivia Game to Test your Skills in certain Subjects

## __Table Of Contents__

* [Class Files](https://github.com/Markay12/triviaGame#class-files)
* [Possible Additions](https://github.com/Markay12/triviaGame#possible-additions)
* [Version Updates](https://github.com/Markay12/triviaGame#version-updates)


## *Class Files*
---
### *Main.java*
This file is the main method for the program and runs all of the questions and answers
* Uses a main switch statement to choose between the programs
* Main while loops to make sure that they have to answer 5 questions before it is hard


### *information.java*
This file contains all the information about the user which can be displayed and used throughout the main program
1. information, method used to initialize the name var
2. setName, sets the name of the user
3. getName, method to retrieve the users name

### *Math.java*
This file contains all of the questions and answers for the math questions including these methods
1. RandomNum, creates random number to choose which math question will be displayed
2. Questions, holds all of the main questions
3. checkAnswer, checks to see if the right answer is given

### *Programming.java*
This file contains all of the questions and answers for the programming question including these methods
1. RandomNum - to choose a random question number

### *Music.java*
This file contains all of the questions and answers for the music questions including these methods
1. getQuestion - Gathers the music questions from the file and prints them out to the console
2. checkAnswer - Checks the answers that were given and checks them by returning a boolean value


## __Possible Additions__
---
* Add more class files to have harder questions. Same methods but requires an if statment and question to choose the severtiy of questions
* A heirarchical version of methods that adds these harder questions in different methods

## __Version Updates__
---
* *Version 1.0.0* - Method to ask users which quiz they would like to take
* *Version 1.0.1* - Math method has been added which allows users to complete math questions to win
* *Version 1.0.2* - Programming method has been added which allows users to complete programming questions to win
* *Version 1.0.3* - Updated look for Programming questions to better the user experience
* *Version 1.0.4* - Completed Programming methods and questions
* *Version 1.0.5* - Added user readability to math method in Main.java as well as making sure that a user can exit the math quiz in the same manner as exiting the programming quiz
* *Version 1.0.6* - Grammar questions have been updated and completed. Nice look and adds to the app. Best looking questions.
* *Version 1.1.0* - Added some small music questions. Removed version of the randomNum method. Just returns questions in a sequential order. When the user reaches 10 the game should now end