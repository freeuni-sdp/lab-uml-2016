// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public abstract class BookReader   
{
    public BookReader()  {
        setBook(buyBook());
    }

    private Book __Book;
    public Book getBook() {
        return __Book;
    }

    public void setBook(Book value) {
        __Book = value;
    }

    public abstract Book buyBook() ;

    public void displayOwnedBooks() throws Exception {
        System.out.println(getBook().getClass().getName());
    }

}


