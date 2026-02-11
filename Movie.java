/*
 * Activity 2 2 7
 *
 * A Movie class for the MediaLibrary program
 */
public class Movie
{
  private String title;
  private double duration;
  private int rating;

  /**
   * Constructs a Movie with a title and duration
   *
   * @param t the title of the movie
   * @param d the duration in hours
   * precondition t is not null and d is positive
   * postcondition A Movie exists with title t duration d rating 0
   */
  public Movie(String t, double d)
  {
    title = t;
    duration = d;
    rating = 0;
  }

  public String getTitle()
  {
    return title;
  }

  public double getDuration()
  {
    return duration;
  }

  public int getRating()
  {
    return rating;
  }

  public void setTitle(String t)
  {
    title = t;
  }

  public void setDuration(double d)
  {
    duration = d;
  }
 /**
  * Adjusts this movie rating by a given amount
  * * @param r the amount to adjust by
  * @return the updated rating
  * precondition none
  * postcondition Rating is updated only if within valid range
  */
  public int adjustRating(int r)
  {
    int newRating = rating + r;
    if (newRating >= 0 && newRating <= 10)
    {
      rating = newRating;
    }
    return rating;
  }

  public boolean equals(Movie m)
  {
    return this.title.equals(m.title) && this.duration == m.duration;
  }

  public String toString()
  {
    String info = "\"" + title + "\" duration " + duration + " hours";
    if (rating != 0)
    {
      info += " rating is " + rating;
    }
    return info;
  }
}
