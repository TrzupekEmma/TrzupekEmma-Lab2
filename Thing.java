  /**
   * A "Thing" moves in a grid world. A TypeA Thing randomly
   * decides to turn left or right (or not turn) every "round",
   * and, afterward, takes a step forward.  A TypeB Thing
   * only considers making a random turn every 10th round.
   */
public class Thing {
  // dir: 0=North, 1=East, 2=South, 3=West.
  // timeSinceLast: this is only important for "TypeB" Things.
  public int  row, col, dir, timeSinceLast;
  public char lab = 'r';
  public boolean isTypeB;
  //to be added to type 
  public void rightTurn() {
    this.dir = (this.dir + 1) % 4;
  }

  public void leftTurn() {
    this.dir = (this.dir + 3) % 4;
  }

  public void maybeTurn(Random rand) {
    int i = rand.nextInt(3);

    if (this.isTypeB) {
      this.timeSinceLast++;

      if (this.timeSinceLast == 10) {
        this.timeSinceLast = 0;

        if (i == 1) {
          this.rightTurn();
        }

        if (i == 2) {
          this.leftTurn();
        }
      }
    } else   {
      if (i == 1) {
        this.rightTurn();
      }

      if (i == 2) {
        this.leftTurn();
      }
    }
  }

}
