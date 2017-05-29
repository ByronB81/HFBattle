public class Game {
  public static void main(String[] args) {

    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();

    Battleship cruiser = new Battleship();
    int randomNum = (int) (Math.random() * 5);

    int[] locations = {randomNum, randomNum + 1, randomNum + 2};
    cruiser.setLocationCells(locations);
    boolean isAlive = true;

    while (isAlive == true) {
      String guess = helper.getUserInput("Enter a number");
      String result = cruiser.checkYourself(guess);
      numOfGuesses++;

      if (result.equals("kill")) {
        isAlive = false;
        System.out.println("You sunk my cruiser");
        System.out.println("It took " + numOfGuesses + " guesses!");
      }
    }

  }
}
