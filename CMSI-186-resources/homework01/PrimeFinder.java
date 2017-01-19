/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name  : PrimeFinder.java
 *  Purpose    : Indulges my obsession with prime numbers
 *  Author     : B.J. Johnson
 *  Date       : 2016-12-16
 *  Description: This class finds if a number passed as an argument on the command line is prime, using
 *               an iterative division approach, up to the square root of the argument value.
 *  Note       : may not be the fastest and/or 'best' algorithm, but easy to understand and it works.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History:
 *  -----------------
 *   Ver      Date     Modified by:  Reason for change/modification
 *  -----  ----------  ------------  ---------------------------------------------------------------------
 *  1.0.0  2016-12-16  B.J. Johnson  Original release of this writing (unclassified version)
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class PrimeFinder {
   private static boolean found = false;              // set to true if the value being checked is prime
   private static long    divisor = 3;                // starting location for the divisor
   private static long    number  = 0;                // the number to check for prime-ality (to coin a word)

  /**
   *  Contstructor for the class, with no arguments
   */
   public PrimeFinder() {
      System.out.println( "Prime Finder says hi...." );
   }

  /**
   *  Contstructor for the class, with one argument
   *  @param value a long which allows creation of the class with a specific number
   */
   public PrimeFinder( long value ) {
      System.out.println( "Checking " + value + " ....." );
   }

  /**
   *  Contstructor for the class, with one argument
   *  @param sayHi a boolean which just lets the constructor be parameterized
   *                 without really doing anything
   */
   public PrimeFinder( boolean sayHi ) {
      if( !sayHi ) {
         //do nothing, but do it quietly
      }
   }

  /**
   *  The findPrime method does the real work.  It also handles the special cases like
   *   when the argument is "1", "2", or "3".  Otherwise, it operates in a "while" loop
   *   to divide the value by successive divisors, iteratively, until the square root of
   *   the number is reached.
   *  @return  boolean true if the number is prime, false otherwise
   *  @note    the value to check is handled by the constructor; see the private static fields
   */
   public boolean findPrime() {
      long stop = (long)Math.sqrt( number );          // initialize a stopping point
      if( 1 == number ) {
         return false;
      } else if( (2 == number) || (3 == number) ) {
         return true;
      } else if( 0 == (number % 2) ) {
         divisor = 2;
         return false;
      } else {
         while( divisor <= stop ) {
            if( 0 == (number % divisor) ) {
               return false;
            }
            divisor += 2;
         }
         return true;
      }
   }

  /**
   *  The main method for the class
   *  @param args an array of Strings which allows access to the command line parameters
   */
   public static void main( String[] args ) {

     // check the arguments -- there must be at least one
      if( 0 == args.length ) {
         System.out.println( "\nUsage: java PrimeFinder <number>\n requires an argument.\n" );
         System.exit( -1 );
      }

     // this version is set up to handle hex values as well, by converting them to their
     //  decimal equivalents.  For hex, there must be a "0x" or "0X" prefix on the value.
      args[0] = args[0].toLowerCase();
      if( args[0].substring( 0, 2 ).contains("0x") ) {
         number = Long.parseLong( args[0].substring(2, args[0].length()), 16 );
         System.out.println( "\nHex value " + args[0] + " is " + number + " decimal......" );
      } else {
         number = Long.parseLong( args[0] );
         System.out.println( "\n" );
      }

     // Create a new instance of this class, using the number from the command line as the value
     //  Then find out and report if that is a prime number or not. 
      PrimeFinder pf2 = new PrimeFinder( number );
      found = pf2.findPrime();
      System.out.println( "\n   The number " + args[0] + " is " + (found ? "" : " NOT") + " prime." );
      if( !found ) {
         System.out.println( "   It is divisible by " + divisor );
      }
      System.exit( 0 );       // That's the name of THAT tune.......
   }
}

