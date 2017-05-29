public class Battleship {

  int[] locationCells;
  int numOfHits = 0;

  public void setLocationCells(int[] locs) {
    locationCells = locs;
  }

  public string checkYourself(String stringGuess){

    int guess = Integer.parseInt(stringGuess);

    String result = "miss";

    for (int cell : locationCells){
     if (guess.equals(cell)) { //might need to change equal method
       result = "hit";
       numOfHits++;
       break;
     }
    }

    if (numOfHits.equals(locationCells.length)) {
      result = "kill";
    }

    System.out.println(result);
    return result;
  }

}
