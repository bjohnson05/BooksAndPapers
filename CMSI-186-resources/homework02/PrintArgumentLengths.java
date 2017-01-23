/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  PrintArgumentLengths.java
 *  Purpose       :  Simple program to output the command line arguments and their lengths
 *  Author        :  B.J. Johnson
 *  Date          :  2016-10-30
 *  Description   :  This program simply lists out any and all command line arguements that are provided
 *                   by the user, along with the lengths of each argument string.  It also demonstrates
 *                   using the "for( type variable : variables )" form of the venerable "for" loop.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2016-10-30  B.J. Johnson  Initial writing and release
 *  @version 1.1.0  2017-01-23  B.J. Johnson  Added this file header to describe things, and javadocs
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class PrintArgumentLengths {

  /**
   * The main method, which is all there is
   * @param args String array that contains all the command line arguments
   */
   public static void main( String[] args ) {

      if( 0 == args.length ) {
         System.out.println( "\nUsage: java PrintArgumentLengths <any number of arguments>" );
         return;
      }

      int i = 0;
      for( String arg: args ) {
         if( 4 <= arg.length() ) {
            System.out.println( "argument " + (i++) + " - arg: '" + arg + "'\t length is: " + arg.length() );
         } else {
            System.out.println( "argument " + (i++) + " - arg: '" + arg + "'\t\t length is: " + arg.length() );
         }
      }
   }
}
