/**
 *  File name     :  CalendarStuffTester.java
 *  Purpose       :  Provides a tester class to test the methods in the CalendarStuff class
 *  Author        :  B.J. Johnson (prototype)
 *  Date          :  2017-01-02 (prototype)
 *  Author        :  <your name here>
 *  Date          :  <date of writing here>
 *  Description   :  This file provides the "test harness" for checking out the methods which are part of
 *                   the homework01 assignment.  It also provides examples of proper documentation, and
 *                   uses the source file header template as specified in the "Greeter.java" template file
 *                   for use in CMSI 186, Spring 2017.
 *  Notes         :  There are (presently) fifty-four separate tests. Successful (unsuccessful) tests
 *                   output an appropriate message for pass/fail.  If an exception is thrown, the test
 *                   simply outputs "false".  Tests for main() are not included; your professor and the
 *                   lab assistants can test that separately, using the daysBetween() tests, below.
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2017-01-13  B.J. Johnson  Initial writing and release
 */

public class CalendarStuffTester {

  /**
   * the main method which calls all of the test methods in the class
   * @param args String[] array containing command line parameters
   * @return void
   */
   public static void main ( String [] args ) {
      test_isLeapYear();      // 11 tests
      test_daysInMonth();     // 13 tests
      test_isValidDate();     //  8 tests
      test_dateEquals();      //  5 tests
      test_compareDate();     //  7 tests
      test_daysBetween();     // 12 tests
   }

  /**
   * method to test the "isLeapYear()" method in the CalendarStuff class
   * @return void
   */
   static void test_isLeapYear(){

      System.out.println( "\nELEVEN TESTS FOR isLeapYear():" );
      System.out.println( "  [note: verified via 'http://www.miniwebtool.com/leap-years-list/?start_year=1582&end_year=2017']\n" );

      System.out.print( "   Test for year 1600 (long): " );
      try { System.out.println( CalendarStuff.isLeapYear( 1600L ) ? "true" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test for year 1700 (long): " );
      try { System.out.println( CalendarStuff.isLeapYear( 1700L ) ? "true" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test for year 1800 (int) : " );
      try { System.out.println( CalendarStuff.isLeapYear( 1800 ) ? "true" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test for year 1900 (int) : " );
      try { System.out.println( CalendarStuff.isLeapYear( 1900 ) ? "true" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test for year 1992 (int) : " );
      try { System.out.println( CalendarStuff.isLeapYear( 1992 ) ? "true" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test for year 1415 (long): " );
      try { System.out.println( CalendarStuff.isLeapYear( 1415L ) ? "true" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test for year 1996 (long): " );
      try { System.out.println( CalendarStuff.isLeapYear( 1996L ) ? "true" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test for year 1995 (int) : " );
      try { System.out.println( CalendarStuff.isLeapYear( 1995 ) ? "true" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

       System.out.print( "   Test for year 1215 (long): " );
      try { System.out.println( CalendarStuff.isLeapYear( 1215L ) ? "true" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test for year 2004 (int) : " );
      try { System.out.println( CalendarStuff.isLeapYear( 2004 ) ? "true" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test for year 1814 (long): " );
      try { System.out.println( CalendarStuff.isLeapYear( 1814L ) ? "true" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }
   }

  /**
   * method to test the "daysInMonth()" method in the CalendarStuff class
   * @return void
   */
   static void test_daysInMonth() {

      System.out.println( "\nTHIRTEEN TESTS FOR daysInMonth():" );

      System.out.print( "   Test January 2001  : " );
      try { System.out.println( 31 == CalendarStuff.daysInMonth( 1, 2001 ) ? "correct, 31" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test February 2003 : " );
      try { System.out.println( 28 == CalendarStuff.daysInMonth( 2, 2003 ) ? "correct, 28" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test February 2004 : " );
      try { System.out.println( 29 == CalendarStuff.daysInMonth( 2, 2004 ) ? "correct, 29" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test March 2014    : " );
      try { System.out.println( 31 == CalendarStuff.daysInMonth( 3, 2014 ) ? "correct, 31" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test April 2012    : " );
      try { System.out.println( 30 == CalendarStuff.daysInMonth( 4, 2012 ) ? "correct, 30" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test May 1993      : " );
      try { System.out.println( 31 == CalendarStuff.daysInMonth( 5, 1993 ) ? "correct, 31" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test June 1994     : " );
      try { System.out.println( 30 == CalendarStuff.daysInMonth( 6, 1994 ) ? "correct, 30" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test July 1995     : " );
      try { System.out.println( 31 == CalendarStuff.daysInMonth( 7, 1995 ) ? "correct, 31" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test August 1865   : " );
      try { System.out.println( 31 == CalendarStuff.daysInMonth( 8, 1865 ) ? "correct, 31" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test September 2102: " );
      try { System.out.println( 30 == CalendarStuff.daysInMonth( 9, 2102 ) ? "correct, 30" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test October 1993  : " );
      try { System.out.println( 31 == CalendarStuff.daysInMonth( 10, 1993 ) ? "correct, 31" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test November 1999 : " );
      try { System.out.println( 30 == CalendarStuff.daysInMonth( 11, 1999 ) ? "correct, 30" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }

      System.out.print( "   Test December 2014 : " );
      try { System.out.println( 31 == CalendarStuff.daysInMonth( 12, 2014 ) ? "correct, 31" : "false" ); }
      catch( Exception e ) { System.out.println ( false ); }
   }

  /**
   * method to test the "isValidDate()" method in the CalendarStuff class
   * @return void
   */
   static void test_isValidDate() {

      System.out.println ( "\nEIGHT TESTS FOR isValidDate():" );

      System.out.print( "   Test January 1, 2000    : " );
      try { System.out.println( CalendarStuff.isValidDate(  1,  1, 2000 ) ? "valid" : "invalid" ); }
      catch( Exception e ) { System.out.println( false ); }

      System.out.print( "   Test February 29, 2001  : " );
      try { System.out.println( CalendarStuff.isValidDate(  2, 29, 2001 ) ? "valid" : "invalid" ); }
      catch( Exception e ) { System.out.println( false ); }

      System.out.print( "   Test December 31, 2014  : " );
      try { System.out.println( CalendarStuff.isValidDate( 12, 31, 2014 ) ? "valid" : "invalid" ); }
      catch( Exception e ) { System.out.println( false ); }

      System.out.print( "   Test December 0, 2000   : " );
      try { System.out.println( CalendarStuff.isValidDate( 12,  0, 2000 ) ? "valid" : "invalid" ); }
      catch( Exception e ) { System.out.println( false ); }

      System.out.print( "   Test December 32, 2005  : " );
      try { System.out.println( CalendarStuff.isValidDate( 12, 32, 2005 ) ? "valid" : "invalid" ); }
      catch( Exception e ) { System.out.println( false ); }

      System.out.print( "   Test Zeroary 15, 2005   : " );
      try { System.out.println( CalendarStuff.isValidDate(  0, 15, 2005 ) ? "valid" : "invalid" ); }
      catch( Exception e ) { System.out.println( false ); }

      System.out.print( "   Test Thirtember 1, 2005 : " );
      try { System.out.println( CalendarStuff.isValidDate( 13,  1, 2005 ) ? "valid" : "invalid" ); }
      catch( Exception e ) { System.out.println( false ); }

      System.out.print( "   Test February 29, 2004  : " );
      try { System.out.println( CalendarStuff.isValidDate(  2, 29, 2004 ) ? "valid" : "invalid" ); }
      catch( Exception e ) { System.out.println( false ); }

   }

  /**
   * method to test the "dateEquals()" method in the CalendarStuff class
   * @return void
   */
   static void test_dateEquals() {

      System.out.println( "\nSEVEN TESTS FOR dateEquals():" );

      System.out.print( "   Test February 29, 2004 with February 29, 2004  : " );
      try { System.out.println( CalendarStuff.dateEquals(  2, 29, 2004, 2, 29, 2004 ) ? "equal" : "not equal" ); }
      catch( Exception e ) { System.out.println( false ); }

      System.out.print( "   Test December 29, 2004 with February 29, 2004  : " );
      try { System.out.println( CalendarStuff.dateEquals( 12, 29, 2004, 2, 29, 2004 ) ? "equal" : "not equal" ); }
      catch( Exception e ) { System.out.println( false ); }

      System.out.print( "   Test February 29, 2004 with February 28, 2004  : " );
      try { System.out.println( CalendarStuff.dateEquals(  2, 29, 2004, 2, 28, 2004 ) ? "equal" : "not equal" ); }
      catch( Exception e ) { System.out.println( false ); }

      System.out.print( "   Test February 28, 2004 with February 28, 2005  : " );
      try { System.out.println( CalendarStuff.dateEquals(  2, 28, 2004, 2, 28, 2005 ) ? "equal" : "not equal" ); }
      catch( Exception e ) { System.out.println( false ); }

      System.out.print( "   Test February 20, 2000 with January 13, 2000  : " );
      try { System.out.println( CalendarStuff.dateEquals(  2, 20, 2000, 1, 13, 2000 ) ? "equal" : "not equal" ); }
      catch( Exception e ) { System.out.println( false ); }

      System.out.print( "   Test February 20, 2000 with January 20, 2001  : " );
      try { System.out.println( CalendarStuff.dateEquals(  2, 20, 2001, 1, 20, 2001 ) ? "equal" : "not equal" ); }
      catch( Exception e ) { System.out.println( false ); }

      System.out.print( "   Test February 20, 2000 with January 13, 2010  : " );
      try { System.out.println( CalendarStuff.dateEquals(  2, 20, 2000, 1, 13, 2010 ) ? "equal" : "not equal" ); }
      catch( Exception e ) { System.out.println( false ); }

   }

  /**
   * method to test the "compareDate()" method in the CalendarStuff class
   * @return void
   */
   static void test_compareDate() {

      System.out.println( "\nTHREE TESTS FOR compareDate():" );

      System.out.print( "   Test Ides of March 2005 with Ides of March 2006  : " );
      try { System.out.println( -1 == CalendarStuff.compareDate(  3, 15, 2005,  3, 15, 2006 ) ? "first <  second" : "et tu Brute" ); }
      catch( Exception e ) { System.out.println( false ); }

      System.out.print( "   Test Ides of March 2005 with Ides of March 2005  : " );
      try { System.out.println(  0 == CalendarStuff.compareDate(  3, 15, 2005,  3, 15, 2005 ) ? "first == second" : "et tu Brute" ); }
      catch( Exception e ) { System.out.println( false ); }

      System.out.print( "   Test Ides of March 2006 with Ides of March 2005  : " );
      try { System.out.println(  1 == CalendarStuff.compareDate(  3, 15, 2006,  3, 15, 2005 ) ? "first >  second" : "et tu Brute" ); }
      catch( Exception e ) { System.out.println( false ); }

   }

  /**
   * method to test the "daysBetween()" method in the CalendarStuff class
   * @return void
   */
   static void test_daysBetween() {

      System.out.println ( "\nTWELVE TESTS FOR daysBetween():" );

     System.out.print( "   Counting 0000 days between 03-15-2005 and 03-15-2005 : " );
     try { System.out.println(    0 == CalendarStuff.daysBetween(  3, 15, 2005,  3, 15, 2005 ) ? "zero days " : "bad count" ); }
     catch( Exception e ) { System.out.println( false ); }

     System.out.print( "   Counting 0001 day  between 03-15-2005 and 03-16-2005 : " );
     try { System.out.println(    1 == CalendarStuff.daysBetween(  3, 15, 2005,  3, 16, 2005 ) ? "one day   " : "bad count" ); }
     catch( Exception e ) { System.out.println( false ); }

     System.out.print( "   Counting 0001 day  between 03-31-2005 and 04-01-2005 : " );
     try { System.out.println(    1 == CalendarStuff.daysBetween(  3, 31, 2005,  4,  1, 2005 ) ? "one day   " : "bad count" ); }
     catch( Exception e ) { System.out.println( false ); }

     System.out.print( "   Counting 0003 days between 12-30-2005 and 01-02-2006 : " );
     try { System.out.println(    3 == CalendarStuff.daysBetween( 12, 30, 2005,  1,  2, 2006 ) ? "three days" : "bad count" ); }
     catch( Exception e ) { System.out.println( false ); }

     System.out.print( "   Counting 0365 days between 08-15-2005 and 08-15-2006 : " );
     try { System.out.println(  365 == CalendarStuff.daysBetween(  8, 15, 2005,  8, 15, 2006 ) ? "0365 days"  : "bad count" ); }
     catch( Exception e ) { System.out.println( false ); }

     System.out.print( "   Counting 0366 days between 08-15-2007 and 08-15-2008 : " );
     try { System.out.println(  366 == CalendarStuff.daysBetween(  8, 15, 2007,  8, 15, 2008 ) ? "0366 days"  : "bad count" ); }
     catch( Exception e ) { System.out.println( false ); }

     System.out.print( "   Counting 0364 days between 08-15-2001 and 08-14-2002 : " );
     try { System.out.println(  364 == CalendarStuff.daysBetween(  8, 15, 2001,  8, 14, 2002 ) ? "0364 days"  : "bad count" ); }
     catch( Exception e ) { System.out.println( false ); }

     System.out.print( "   Counting 0508 days between 03-15-2006 and 08-05-2007 : " );
     try { System.out.println(  508 == CalendarStuff.daysBetween(  3, 15, 2006,  8,  5, 2007 ) ? "0508 days"  : "bad count" ); }
     catch( Exception e ) { System.out.println( false ); }

     System.out.print( "   Counting 1239 days between 03-15-2005 and 08-05-2008 : " );
     try { System.out.println( 1239 == CalendarStuff.daysBetween(  3, 15, 2005,  8,  5, 2008 ) ? "1239 days"  : "bad count" ); }
     catch( Exception e ) { System.out.println( false ); }

     System.out.print( "   Counting 1060 days between 11-15-2005 and 10-10-2008 : " );
     try { System.out.println( 1060 == CalendarStuff.daysBetween( 11, 15, 2005, 10, 10, 2008 ) ? "1060 days"  : "bad count" ); }
     catch( Exception e ) { System.out.println( false ); }

     System.out.print( "   Counting 8638 days between 11-15-2001 and 07-10-2025 : " );
     try { System.out.println( 8638 == CalendarStuff.daysBetween( 11, 15, 2001,  7, 10, 2025 ) ? "8638 days"  : "bad count" ); }
     catch( Exception e ) { System.out.println( false ); }

     System.out.print( "   Counting 0001 day  between 03-16-2005 and 03-15-2005 : " );
     try { System.out.println(    1 == CalendarStuff.daysBetween(  3, 16, 2005,  3, 15, 2005 ) ? "one day   " : "bad count" ); }
     catch( Exception e ) { System.out.println( false ); }

   }

}