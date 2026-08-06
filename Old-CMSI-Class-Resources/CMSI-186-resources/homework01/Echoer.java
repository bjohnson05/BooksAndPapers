/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Echoer.java
 *  Purpose       :  Echos the arguments from the command line one at a time on individual lines
 *  Author        :  B.J. Johnson
 *  Date          :  2017-01-14
 *  Description   :  Simple example program that parses the arguments from the command line, and outputs
 *                   each one on its own line on the output.  Demonstrates the idea of a for loop, and
 *                   shows the way to get/parse command line args array of String objects
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2017-01-14  B.J. Johnson  Initial writing and release
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class Echoer {
   public static void main( String args[] ) {
      if( args.length == 0 ) {
         System.out.println( "\n  Run me again, with some command line arguments....\n" );
         System.exit( 0 );
      }
      for( int i = 0; i < args.length; i++ ) {
         System.out.println( "  args[" + i + "] is: " + args[i] );
      }
   }
}
