/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  FactorialLister.java
 *  Purpose       :  Lists the factorials from 1 to "N", where "N" is a command line parameter
 *  Author        :  B.J. Johnson
 *  Date          :  2017-01-16
 *  Description   :  Illustrates exception handling with known as well as self-defined exceptions
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  NumberFormatException, NoArgumentsException
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2017-01-16  B.J. Johnson  Initial writing and release
 *  @version 1.1.0  2017-01-22  B.J. Johnson  Added NoArgumentsException and code to empty program
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class FactorialLister {
   public static void main( String args[] ) throws NoArgumentsException {
      int  i     = 1;
      long max   = 1;
      long total = 1;
      System.out.println( "\n   Welcome to the Factorial Lister!!\n" );
      if( 0 == args.length ) {
           throw new NoArgumentsException( "\n\n Sorry, you need to provide an argument.  Please try again!\n");
      } else {
         try {
            max = Long.parseLong( args[0] );
            while( i <= max ) {
               total = total * i;
               i++;
            }
            System.out.println( "\n\n   Factorial of " + args[0] + " is " + total );
         }
         catch( NumberFormatException nfe ) {
            System.out.println( "   Sorry, bad input: must be a long integer number!  Please try again..." );
            System.exit( -1 );
         }
      }
      System.exit( 0 );
   }
}
