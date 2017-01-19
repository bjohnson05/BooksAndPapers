/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  FibonacciLister.java
 *  Purpose       :  Lists the Fibonacci numbers from 1 to "N", where "N" is a command line parameter
 *  Author        :  B.J. Johnson
 *  Date          :  2017-01-16
 *  Description   :  See purpose (in this case; other files will have more details)
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
public class FibonacciLister {
   public static void main( String args[] ) {
      System.out.println( "\n   Welcome to the Fibonacci Lister!!\n" );
      long num1 = 1;
      long num2 = 1;
      long num3 = 0;
      System.out.print( "   " + num1 + " " + num2 + " " );
      for( int i = 0; i < 18; i++ ) {
         num3 = num1 + num2;
         System.out.print( num3 + " " );
         num1 = num2;
         num2 = num3;
      }
      System.out.println();
      System.exit( 0 );
   }
}
