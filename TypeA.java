import java.util.*;
public class TypeA extends Thing {
	public TypeA(int row, int column){
		this.row=row;
		this.col=column;
	}
	public void maybeTurn(Random rand) {
		int i = rand.nextInt(3);
		if (i == 1) this.rightTurn();
		if (i == 2) this.leftTurn();
	}
}
