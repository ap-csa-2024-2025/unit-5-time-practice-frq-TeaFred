import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Test your tick method below using the Scanner class to
    // prompt the user for an initial time, and use the tick method
    // on that Time object.  Check that the resulting time is correct
    // after the tick
    Time t1 = new Time();
    Time t2 = new Time(23, 59, 59);
    System.out.println(t2);
    t2.tick();
    System.out.println(t2);
    
  
    // Uncomment these lines of code when you are ready to test your tick and add methods
    // testTick();
    // testAdd();
  }

  public static void testTick()
  {
    Time time = new Time(0, 0, 0);
    time.tick();
    System.out.println(
            "For (0,0,0) and tick() you got "
                    + time
                    + " which should be 00:00:01");

    time = new Time(0, 0, 58);
    time.tick();
    System.out.println(
            "For (0,0,58) and tick() you got "
                    + time
                    + " which should be 00:00:59");

    time = new Time(0, 0, 59);
    time.tick();
    System.out.println(
            "For (0,0,59) and tick() you got "
                    + time
                    + " which should be 00:01:00");

    time = new Time(0, 58, 59);
    time.tick();
    System.out.println(
            "For (0,58,59) and tick() you got "
                    + time
                    + " which should be 00:59:00");

    time = new Time(0, 59, 59);
    time.tick();
    System.out.println(
            "For (0,59,59) and tick() you got "
                    + time
                    + " which should be 01:00:00");

    time = new Time(23, 59, 59);
    time.tick();
    System.out.println(
            "For (23,59,59) and tick() you got "
                    + time
                    + " which should be 00:00:00");
  }

  public static void testAdd()
  {
    Time time1 = new Time(1, 1, 1);
    Time time2 = new Time(2, 2, 2);
    time1.add(time2);
    System.out.println(
            "The result of (1,1,1).add(2,2,2) is "
                    + time1
                    + " and should be (03:03:03)");

    time1 = new Time(0, 0, 59);
    time2 = new Time(0, 0, 1);
    time1.add(time2);
    System.out.println(
            "The result of (0,0,59).add(0,0,1) is "
                    + time1
                    + " and should be (00:01:00)");

    time1 = new Time(0, 59, 0);
    time2 = new Time(0, 0, 1);
    time1.add(time2);
    System.out.println(
            "The result of (0,59,0).add(0,0,1) is "
                    + time1
                    + " and should be (00:59:01)");

    time1 = new Time(0, 59, 59);
    time2 = new Time(0, 0, 1);
    time1.add(time2);
    System.out.println(
            "The result of (0,59,59).add(0,0,1) is "
                    + time1
                    + " and should be (01:00:00)");

    time1 = new Time(23, 0, 0);
    time2 = new Time(1, 0, 0);
    time1.add(time2);
    System.out.println(
            "The result of (23,0,0).add(1,0,0) is "
                    + time1
                    + " and should be (00:00:00)");

    time1 = new Time(9, 30, 30);
    time2 = new Time(2, 45, 45);
    time1.add(time2);
    System.out.println(
            "The result of (23,59,59).add(23,59,59) is "
                    + time1
                    + " and should be (23:59:58)");
  }
}
