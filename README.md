This programm is the game of "Rock,Paper and Scissors". 
Rules of the game is that players must choose one of three moves and beat each other (Rock beats Scissors,Scissors beats Paper,Paper beats Rock). 
In the programm it works because of codes "import java.util.Scanner" and "import java.util.Random". 
"import java.util.Scanner" lets user to input his moves, while "import java.util.Random" lets computer to choose his moves 
trim() and toLowerCase() helps computer to understand users input corectly. 
trim() removes the empty spaces in the beginning and the end of the input and toLowerCase() converts the input to lowercase.
random.nextInt(3) Picks a random number 0, 1, or 2. They represent Rock, Paper, or Scissors.
choices[computerIndex] selects a choice from the choices array.
After computer checks if user inputed rock,player or scissors, it will show his move. In the end result of the game will be shown.
