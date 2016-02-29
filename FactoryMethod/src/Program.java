import java.util.ArrayList;


public class Program {

	public static void main(String[] args) throws Exception {
		ArrayList<BookReader> bookReaderList = new ArrayList<BookReader>();
        bookReaderList.add(new AdventureBookReader());
        bookReaderList.add(new FantasyBookReader());
        bookReaderList.add(new HorrorBookReader());
        for (BookReader reader : bookReaderList)
        {
            System.out.println(reader.getClass().getName());
            // Language agnostic solution
            reader.displayOwnedBooks();
            System.out.println();
        }
        AdventureBookReader genericReader = new AdventureBookReader();
        Book book = genericReader.buyBook();
        System.out.println(book.getClass().getName());
	}

}
