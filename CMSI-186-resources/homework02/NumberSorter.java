/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  NumberSorter.java
 *  Purpose       :  Sorts the numbers in an array
 *  Author        :  B.J. Johnson
 *  Date          :  2017-01-16
 *  Description   :  Implementation of (I think) bubble sort; the main demonstrates use of the "sort()"
 *                   method using a randomly generated list of values which are calculated and assigned
 *                   in a loop.
 *  Notes         :  This program shows inclusion of a method in a class which is then called by the
 *                   "main()" of the class.  It also shows the use of an "import" statement to get access
 *                   to something that is not part of the "java.lang" package.  It also shows the use of
 *                   nested loops, and a nested "if" block, as well as how to define an array in Java.
 *                   Finally, it shows the use of JavaDocs to comment the code.
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2017-01-16  B.J. Johnson  Initial writing and release
 *  @version 1.1.0  2017-01-22  B.J. Johnson  Filled in the actual code for the program
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.text.DecimalFormat;

/**
 * This is the NumberSorter class that demonstrates a number-sorting algorithm
 *
 */
public class NumberSorter {

   private static final int MAXIMUM = 17;

  /**
   * This is the sorting algorithm method.  It goes through the input array of doubles
   *  finding the next occurrence of a number which is smaller than the current index,
   *  and swaps the two.  It continues in this way until all the numbers have been
   *  compared and sorted.
   *
   * @param numberArray double[] the numbers to sort; note that this is done <em>in place</em>
   *
   */
   public static void sort( double numberArray[] ) {
      for( int i = 0; i < numberArray.length; i++ ) {
         int smallest = i;                               // index of current smallest value for each iteration
         for( int j = i; j < numberArray.length; j++ ) {
            if( numberArray[j] < numberArray[smallest] ) {
               smallest = j;
            }
         }

        // swap the two values using a "temporary" variable
         double temp = numberArray[i];
         numberArray[i] = numberArray[smallest];
         numberArray[smallest] = temp;
      }
      return;
   }

  /**
   * The main() method to run the program, initialize the array to random values, call the sort
   *  algorithm method, and display the formatted results before and after sorting.  Note the use of the
   *  DecimalFormat class to format the double values to two decimal places for output.
   *
   * @param args  String array containing command line arguments (none handled in this case)
   *
   */
   public static void main( String args[] ) {
      System.out.println( "\n   Welcome to the Number Sorter!!\n" );
      System.out.println( "   This demonstration simply sorts a small array of " +
                          MAXIMUM + " double-precision numbers.\n" );
      double[] numbers = new double[MAXIMUM];
      DecimalFormat df = new DecimalFormat( "#.00" );

     // Initialize the array to a set of random numbers between 1 and 100, then display them
      for( int i = 0; i < MAXIMUM; i++ ) {
         numbers[i] = Math.random() * 100;
      }
      System.out.print( "   Unsorted:\n   " );
      for( int i = 0; i < MAXIMUM; i++ ) {
         System.out.print( df.format(numbers[i]) + " " );
      }
      System.out.println();

     // Sort the array values, then display the sorted values on the output
      sort( numbers );
      System.out.print( "   Sorted:\n   " );
      for( int i = 0; i < MAXIMUM; i++ ) {
         System.out.print( df.format(numbers[i]) + " " );
      }
      System.out.println( "\n" );
   }
}
