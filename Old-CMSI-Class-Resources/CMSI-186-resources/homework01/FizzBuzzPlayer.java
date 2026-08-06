/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  FizzBuzzPlayer.java
 *  Purpose       :  Plays the game "Fizz Buzz" based on command line parameters
 *  Author        :  B.J. Johnson
 *  Date          :  2017-01-16
 *  Description   :  This program demonstrates several things:
 *                   1. the use of a "for" loop to iterate
 *                   2. the use of a "block if" to perform decision-making
 *                   3. the use of the "println()" and "print()" methods in System.out
 *                   4. the use of command line arguments to provide input to the program
 *                   5. the use of the "parseInt()" method from the Integer built-in Java class which is
 *                         a "static" method that can be used that way
 *                   6. the use of the "exit()" method to provide feedback on program termination status
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2017-01-16  B.J. Johnson  Initial writing and release
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class FizzBuzzPlayer {
   public static void main( String args[] ) {

      int factor1 = 0;
      int factor2 = 0;
      int maximum = 0;

      System.out.println( "\n   Welcome to the Fizz Buzz Player!!\n" );
      if( args.length < 3 ) {
         System.out.println( "\n  Sorry, you need three arguments to this program:\n" +
                             "    the first two are factors (like 3 or 7) and the last is the top number." );
         System.exit( -1 );      // Negative means program failure
      } else {
         try {
            factor1 = Integer.parseInt( args[0] );
            factor2 = Integer.parseInt( args[1] );
            maximum = Integer.parseInt( args[2] );
         }
         catch( Exception e ) { System.out.println( "\n\nEXCEPTION: " + e.toString() ); };
         for( int i = 1; i <= maximum; i++ ) {
            if( ((i % factor1) == 0) && ((i % factor2) == 0) ) {
               System.out.print( "fizzbuzz" );
            } else if( (i % factor1) == 0 ) {
               System.out.print( "fizz" ) ;
            } else if( (i % factor2) == 0 ) {
               System.out.print( "buzz" );
            } else {
               System.out.print( i );
            }
            System.out.print( " " );
         }
         System.out.println();
      }
   }
}
