/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  StringBufferDemo.java
 *  Purpose       :  Demonstrates some of the cool things about the StringBuffer class in Java
 *  Author        :  B.J. Johnson
 *  Date          :  2017-01-16
 *  Description   :  Since Java Strings are "immutable" [meaning that you can't change them 'in place'],
 *                   there is a special class set up for building and manipulating strings called by
 *                   the somewhat misleading name "StringBuffer".  See "Java Examples in a Nutshell"
 *                   on pp. 19 - 20 for details.
 *                   This program simply adds a bunch of characters and words onto a string using the
 *                   StringBuffer class to build things, displaying the contents at each step.  It also
 *                   demonstrates one way to get user input, for which a couple of other classes are
 *                   shown and used.  Look for them in the "import" statements above the class definition
 *                   line below.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2017-01-16  B.J. Johnson  Initial writing and release
 *  @version 1.1.0  2017-01-23  B.J. Johnson  Filled in code to make the program actually work
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StringBufferDemo {

   private static StringBuffer sb = null;

   public static void main( String args[] ) {
      System.out.println( "\n   Welcome to the String Buffer Demo!!\n" );
      System.out.println( "     Enter any string to see the lowercase 'a' replaced by an uppercase 'A'." );
      System.out.println( "     Press the 'ENTER' key without typing any text to quit the program." );

     // This line uses the two classes to assemble an "input stream" for the user to type
     // text into the program
      BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );
      while( true ) {
         System.out.print( ">>" );
         String inputLine = null;
         try {
            inputLine = input.readLine();
            if( 0 == inputLine.length() ) {
               break;
            }
            sb = new StringBuffer( inputLine.toLowerCase() );
            for( int i = 0; i < sb.length(); i++ ) {
               if( sb.charAt(i) == 'a' ) {
                  sb.setCharAt( i, 'A' );
               }
            }
            System.out.println( "   You typed: " + inputLine );
            System.out.println( "   String buffer is now: " + sb );
         }
         catch( IOException ioe ) {
            System.out.println( "Caught IOException" );
         }
      }
   }
}
