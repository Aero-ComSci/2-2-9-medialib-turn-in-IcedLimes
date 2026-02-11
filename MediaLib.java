/**
 * Activity 2 2 7
 *
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;

  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;
  private static int numEntries = 0;

  /**
   * Adds a book to the library
   *
   * @param b the book to add
   * precondition b is not null
   * postcondition Library book reference is set to b
   */
  public void addBook(Book b)
  {
    book = b;
    numBooks++;
    numEntries++;
  }

  public void addBook(String t, String a)
  {
    addBook(new Book(t, a));
  }

  /**
   * Adds a movie to the library
   *
   * @param m the movie to add
   * precondition m is not null
   * postcondition Library movie reference is set to m
   */
  public void addMovie(Movie m)
  {
    movie = m;
    numMovies++;
    numEntries++;
  }

  public void addMovie(String t, double d)
  {
    addMovie(new Movie(t, d));
  }

  public void addSong(Song s)
  {
    song = s;
    numSongs++;
    numEntries++;
  }

  public void addSong(String t)
  {
    addSong(new Song(t));
  }

  /**
   * Gets the current book stored in the library.
   *
   * @return the current Book reference
   * precondition none
   * postcondition library state is unchanged
   */
  public Book getBook()
  {
    return book;
  }

  /**
   * Gets the current movie stored in the library.
   *
   * @return the current Movie reference
   * precondition none
   * postcondition library state is unchanged
   */
  public Movie getMovie()
  {
    return movie;
  }

  public Song getSong()
  {
    return song;
  }

  public static int getNumBooks()
  {
    return numBooks;
  }

  public static int getNumSongs()
  {
    return numSongs;
  }

  public static int getNumMovies()
  {
    return numMovies;
  }

  public static int getNumEntries()
  {
    return numEntries;
  }

  /*
   * Test method to demonstrate object aliasing
   *
   * public void testBook
   * {
   *   tester.setTitle("Changed Inside MediaLib");
   * }
   */

  /**
   * Returns a String representation of the Media Library.
   *
   * @return a formatted String describing the book and movie currently stored
   * precondition none
   * postcondition library state is unchanged
   */
  public String toString()
  {
    String info = "Book ";
    if (book != null)
    {
      info += book;
    }
    else
    {
      info += "none";
    }

    info += "\nMovie ";
    if (movie != null)
    {
      info += movie;
    }
    else
    {
      info += "none";
    }

    info += "\nSong ";
    if (song != null)
    {
      info += song;
    }
    else
    {
      info += "none";
    }

    return info;
  }
}
