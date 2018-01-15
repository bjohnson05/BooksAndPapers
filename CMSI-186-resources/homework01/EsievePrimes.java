/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  EsievePrimes.java
 *  Purpose       :  Lists primes up to a certain value that is passed on the command line
 *  Author        :  B.J. Johnson
 *  Date          :  2017-01-14
 *  Description   :  Simple example program that parses the argument from the command line, then finds
 *                     all the prime numbers up to [and including] that number.  The method used is the
 *                     "Sieve of Eratosthenes" which goes as follows:
 *
 *                         Leave 2, then remove every second number after two
 *                         Leave 3, then remove every third number after three
 *                         Leave 5, then remove all remaining multiples of 5
 *                         Leave 7, then remove all remaining multiples of 7
 *                         The remaining numbers are prime, and their multiples will have been deleted
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-01-15  B.J. Johnson  Initial writing and release
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class EsievePrimes {
   public static void main( String args[] ) {
      int limit = 0;
      int[] primes = {};
      int[] candidates = {};
      if( args.length == 0 ) {
         System.out.println( "\n  This program lists primes based on the Sieve or Eratosthenes." );
         System.out.println( "  Run me again, with a command line argument to tell me how far to list....\n" );
         System.exit( 0 );
      }
//      System.out.println( "  args[0] is: " + args[0] );

     // make the argument into an integer which is the top of the list
      limit = Integer.parseInt( args[0] );

     // make a new array for "candidates" that's the right size
      candidates = new int[limit];

     // load the candidate array with the sequence from 2 to limit
      for( int i = 2; i <= limit; i++ ) {
         candidates[i - 2] = i;
//         System.out.println( "candidates[" + i + "-2] = " + candidates[i-2]);
      }

     // start at candidates[2] which contains "4"; remove that value and every other even value
      for( int i = 2; i < candidates.length; i += 2 ) {
         candidates[i] = 0;
      }

     // start at candidates[4] which contains "6"; remove that value and every third value
      for( int i = 4; i < candidates.length; i += 3 ) {
         candidates[i] = 0;
      } 

     // start at candidates[8] which contains "10"; remove that value and all multiples of "5"
      for( int i = 8; i < candidates.length; i += 5 ) {
         candidates[i] = 0;
      } 

     // start at candidates[12] which contains "14"; remove that value and all multiples of "7"
      for( int i = 12; i < candidates.length; i += 7 ) {
         candidates[i] = 0;
      }

     // what remains are primes, according to the ancient Greek Eratosthenes; copy all non-zero
     //  values into the "primes" array for output
      primes = new int[limit];
      for( int i = 0, j = 0; i < limit; i++ ) {
         if( candidates[i] != 0 ) {
            primes[j++] = candidates[i];
         }
      }

     // load the candidate array with the sequence from 2 to limit
      System.out.print( "Primes less than or equal to " + limit + ":\n" );
      System.out.print( "  " + primes[0] );
      for( int i = 1; i <= limit; i++ ) {
         if( primes[i] == 0 ) {
            break;
         }
         System.out.print( ", " + primes[i] );
      }
      System.out.println( "\b\b\b" );

   }
}