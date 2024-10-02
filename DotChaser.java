
import java.util.*;
public class DotChaser {
  public static Random rand = new Random(System.currentTimeMillis());
  /**
   * YOU'LL NEED TO PUT THIS SOMEWHERE ELSE
   * HINT: WOULDN'T IT BE NICE TO HAVE A LIST OR QUEUE SO THAT
   *       WE DON'T HAVE TO USE NODES HERE?
   * This class is for linked lists of Thing's
   */
  public static class Node {
    public Thing data;
    public Node  next;
  }

  // EEEEEK! STATIC METHODS!!! PLEASE FIND THEM A BETTER HOME.

  
  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    // INSTEAD OF A NODE, CREATE SOMETHING MORE USER-FRIENDLY.
    Node L = null;
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {

        // Add a typeA thing to the list.
        // (GEE, THAT'S A LOT OF CODE FOR JUST CREATING ONE THING)
        TypeA tA = new TypeA(45,50);
        Node nA = new Node();
        nA.data = tA;
        nA.next = L;
        L       = nA;

        // Add a typeB thing to the list
        TypeB tB = new TypeB(55,50);
        tB.lab     = 'b';
        Node nB = new Node();
        nB.data = tB;
        nB.next = L;
        L       = nB;
      }

      // Print out each thing.
      // (SEEMS LIKE A NICE PRINTALL() METHOD CALL WOULD WORK HERE)
      // (SEEMS LIKE A toString() METHOD IN THE CLASS WOULD ALSO BE NICE)
      for( Node T = L; T != null; T = T.next )
        System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);

      System.out.println("done");
      System.out.flush();

      // Move each thing.
      // (SEEMS LIKE A NICE MOVEALL() METHOD CALL WOULD WORK HERE)
      for( Node T = L; T != null; T = T.next ) {
        T.data.maybeTurn(rand);
        T.data.step();
      }
      count++;
    }
  }
}
