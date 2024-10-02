import java.util.*;
public class TypeC extends Thing{
	protected int timeSinceLast;
	protected boolean turningLeft=true;
	protected int prevFactorial=0;
	protected int factorial=1;
	public TypeC(int row, int column,char lab,Random rand){
		this.row=row;
		this.col=column;
		this.lab=lab;
		this.timeSinceLast=0;
		turningLeft=rand.nextInt(2)==1;
		factorial=rand.nextInt(3);
		if(factorial>1)prevFactorial=rand.nextInt(factorial-1);
	}
	public void maybeTurn(Random rand) {
		int i = rand.nextInt(12);
		this.timeSinceLast++;
		if (this.timeSinceLast == this.factorial) {
			this.timeSinceLast = 0;
			if(i==1){
				this.prevFactorial=0;
				this.factorial=1;
			}else{
				int hold=factorial;
				this.factorial=this.factorial+this.prevFactorial;
				this.prevFactorial=hold;
				if(turningLeft)this.leftTurn();
				else this.rightTurn();
			}
		}
	}
}
