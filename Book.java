/*
 * Activity 2 2 7
 *
 * A Book class for the MediaLibrary program
 */
public class Book
{
  private String title;
  private String author;
  private int rating;

  /**
   * Constructs a Book with a title and author
   *
   * @param t the title of the book
   * @param a the author of the book
   * precondition t and a are not null
   * postcondition A Book exists with t author a rating 0
   */
  public Book(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
  }

  /**
   * Gets the title of this book
   *
   * @return the title
   * precondition none
   * postcondition The state of this Book is unchanged
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * Gets the author of this book
   *
   * @return the author
   * precondition none
   * postcondition The state of this Book is unchanged
   */
  public String getAuthor()
  {
    return author;
  }

  /**
   * Gets the rating of this book
   *
   * @return the rating
   * precondition none
   * postcondition The state of this Book is unchanged
   */
  public int getRating()
  {
    return rating;
  }

  /**
   * Sets the title of this book
   *
   * @param t the new title
   * precondition t is not null
   * postcondition This Book title is changed to t
   */
  public void setTitle(String t)
  {
    title = t;
  }

  /**
   * Sets the author of this book
   *
   * @param a the new author
   * precondition a is not null
   * postcondition This Book author is changed to a
   */
  public void setAuthor(String a)
  {
    author = a;
  }

  /**
   * Adjusts this book rating by a given amount
   * The rating is only changed if the result is between 0 and 10 inclusive
   *
   * @param r the amount to adjust by
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

    // Change the parameter after using it to demonstrate call by value.
    // This does not affect the argument passed in from the caller.
    r = 0;

    return rating;
  }

  /**
   * Determines whether this Book is equal to another Book
   * Two books are equal if they have the same title and author
   *
   * @param b the Book to compare
   * @return true if equal false otherwise
   * precondition b is not null
   * postcondition The state of both Book objects is unchanged
   */
  public boolean equals(Book b)
  {
    return this.title.equals(b.title) && this.author.equals(b.author);
  }

  /**
   * Returns a String representation of this Book
   *
   * @return formatted book information
   * precondition none
   * postcondition The state of this Book is unchanged
   */
  public String toString()
  {
    String info = "\"" + title + "\" written by " + author;
    if (rating != 0)
    {
      info += " rating is " + rating;
    }
    return info;
  }
}
