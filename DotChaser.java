
import java.util.*;
public class DotChaser {
  public static void main(String[] args) {
    int N = 200;

  Random rand = new Random(System.currentTimeMillis());
    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    ThingList TL=new ThingList();
    int count = 0;

    while( true ) {
      // Every N rounds, addThing another typeA and typeB Thing.
      if( count % N == 0 ) {

        // Add a typeA thing to the list.
        TypeA tA = new TypeA(45,50);
        TL.addThing(tA);
        // Add a typeB thing to the list
        TypeB tB = new TypeB(55,50,'b');
        TL.addThing(tB);
	TypeC tC=new TypeC(30,70,'y',rand);
	TL.addThing(tC);
      }

      // Print out each thing.
      // (SEEMS LIKE A NICE PRINTALL() METHOD CALL WOULD WORK HERE)
      TL.printAll();
      System.out.println("done");
      System.out.flush();

      // Move each thing.
      // (SEEMS LIKE A NICE MOVEALL() METHOD CALL WOULD WORK HERE)
      //for( Node T = L; T != null; T = T.next ) {
        //T.data.maybeTurn(rand);
        //T.data.step();
      //}
      TL.moveAll(rand);
      count++;
    }
  }
}
