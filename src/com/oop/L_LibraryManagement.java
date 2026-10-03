//Video 51

package com.oop;

import java.util.HashMap;

class Library
{
	
	HashMap <String,Integer> allBooks = new HashMap <String,Integer>();
	HashMap <String, Integer> issuedBooks = new HashMap <String,Integer>();
	Library() // adding the names of books and the number of copies available.
	{
		allBooks.put("Rangbhoomi",6);
		allBooks.put("Anna Karenina",6);
		allBooks.put("Geeta",6);
		allBooks.put("The Psychology Behind Money",6);
		allBooks.put("Geetanjali",6);
	}
	
	//Function to issue book.
	public void issuebook(String bookname)
	{
	
		if (allBooks.containsKey(bookname))  //Checking if the passed book name matches the list of books available.
		{
			if (allBooks.getOrDefault(bookname, 0)==0 )  //If all the copies are already issued then book won't be issued.
			{
				System.out.println("Book not available");
			}
			else
			{
				System.out.println("Book Issued!");
				
				// Decreasing the number of copies available of the issued book.
				allBooks.replace(bookname, allBooks.getOrDefault(bookname, 0), allBooks.getOrDefault(bookname, 0)-1);
				
				//adding the book to the list of issued books, if it was not in the list already. If it's available in the list then we'll increament the number of copies issued.
				if(issuedBooks.containsKey(bookname))
				{
					issuedBooks.replace(bookname, issuedBooks.getOrDefault(bookname, 0), issuedBooks.getOrDefault(bookname, 0)+1);
				}
				else
				{
					issuedBooks.put(bookname,1);
				}
			}
		}
		else
			System.out.println("Book not available.");
	}
	
	public void returnBook(String bookname)
	{
		if (issuedBooks.containsKey(bookname)) // Checking if the book that has to be returned has been issued or not.
		{
			if (issuedBooks.getOrDefault(bookname, 0)==0 )  // If the book has 0 value in issuedBook hash map, then it means no copy has been issued yet. In that case, the book cannot be returned.
			{
				System.out.println("All copies of the book already returned");
			}
			else
			{
				System.out.println("Book Returned!");
				
				//After the book has been returned, the number of available copies has to be increased in allBooks hash map.
				allBooks.replace(bookname, allBooks.getOrDefault(bookname, 0), allBooks.getOrDefault(bookname, 0)+1);
				
				//After the book has been returned, the number of issued copies has to be decreased in issuedBooks hash map.
				issuedBooks.replace(bookname,issuedBooks.getOrDefault(bookname, 0),issuedBooks.getOrDefault(bookname, 0)-1);
			}
		}
		else
			
			// In case correct book name is not entered or the book was never issued so, no entry was made in the issuedBook hash map.
			System.out.println("Enter the correct book name or the book is not issued.");
		
	}
	
	
	// For adding a new book with its available copies in the hash map, allBooks.
	
	public void addBook(String bookName , int bookCopies)
	{
		allBooks.put(bookName,bookCopies);
	}
	
	// For getting the list of issued books with the number of copies issued of that particular book.
	public void issuedBooks()
	{
		System.out.println("All currently issued books with the number of copies issued from the library: "+issuedBooks);
	}
	
	// For getting the list of available books with the number of copies available of that particular book.
	public void availableBooks()
	{
		System.out.println("All books with their number of copies available:"+allBooks);
	}
	
}
public class L_LibraryManagement {

	public static void main(String[] args) 
	{
		Library l1 = new Library();
		l1.issuebook("Geeta");
		l1.issuedBooks();
		l1.availableBooks();
		l1.issuebook("The Psychology Behind Money");
		l1.issuedBooks();
		l1.availableBooks();
		l1.returnBook("Geeta");
		l1.issuedBooks();
		l1.availableBooks();
		
	}

}
