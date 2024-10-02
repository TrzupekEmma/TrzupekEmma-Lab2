class TypeB extends Thing{
	int timeSinceLast;
	public TypeB(int row, int column){
		this.row=row;
		this.col=column;
		this.timeSinceLast=0;
	}
	
  public void maybeTurn(Random rand) {
    int i = rand.nextInt(3);
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
  }
}
