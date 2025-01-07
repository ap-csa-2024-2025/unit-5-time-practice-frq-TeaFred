public class Time
{
  // TODO: Part A - put your attributes here
  private int hours;
  private int minutes;
  private int seconds;


  // TODO: Part B - create your non-default constructor
  /**
  * Precondition: The number of hours is between 0 and 23 inclusive.
  * The number of minutes and seconds is between 0 and 59 inclusive.
  */
public Time(int hours, int minutes, int seconds)
{
  this.hours = hours;
  this.minutes = minutes;
  this.seconds = seconds;
}
public Time()
{
  this(0,0,0); //The time function is recalled b/c it has 3 inputs.
}


  // TODO: Part C - create your default constructor


  // TODO: Part D - complete the documentation for the pad method
  /**
  * Description:  Takes a value and adds a 0 in front if the number is less than 10.
  * Precondition: The value is greater than 0.
  */
  private String pad(int value)
  {
    String output = "";
    if (value < 10)
    {
      return output + "0" + value;
    }
    return output + value;
  }

  // TODO: Part E - complete the toString method; use the pad method as part of your solution
  public String toString()
  {
    return pad(hours) + ":" + pad(minutes) + ":" + pad(seconds);
  }

  // TODO: Part F - write the tick method
  public void tick()
  {
    if (seconds == 59)
    {
      if (minutes == 59)
      {
        if (hours == 23)
        {
          seconds = 0;
          minutes = 0;
          hours = 0;
        }

      } 
    }
    else
    {
      seconds +=1;
    }
  }

  // TODO: Part G - write the add method
  /**
  * Precondition: The variable offset is non-null
  */
  public void add(Time offset)
  {
    this.seconds += offset.seconds % 60;
    this.minutes += offset.minutes %60;
    this.hours += offset.hours %60;
  }
}
