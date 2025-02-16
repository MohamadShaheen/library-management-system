package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        Book book1 = new Book(1, "title1", "author1", true);
        Book book2 = new Book(2, "title2", "author2", true);
        Book book3 = new Book(3, "title3", "author3", true);
        Book book4 = new Book(4, "title4", "author4", true);

        Library library = new Library(book1, book2, book3, book4);

        while (running) {
            System.out.print("""
                [1]: Add a book to the library.\
                
                [2]: Remove a book from the library.\
                
                [3]: Set a book as available for rent.\
                
                [4]: Set a book as unavailable for rent.\
                
                [5]: List all the available books in the library.\
                
                [6]: List all the unavailable books in the library.\
                
                [7]: List all the books in the library.\
                
                [8]: Exit.
                """);
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    System.out.print("\tID: ");
                    int id = scanner.nextInt();
                    System.out.print("\tTitle: ");
                    String title = scanner.next();
                    System.out.print("\tAuthor: ");
                    String author = scanner.next();
                    System.out.print("\tAvailable [y/n]: ");
                    String available = scanner.next();
                    library.addBook(new Book(id, title, author, available.equals("y")));
                    break;
                case 2:
                    System.out.print("\tID: ");
                    id = scanner.nextInt();
                    library.removeBook(id);
                    break;
                case 3:
                    System.out.print("\tID: ");
                    id = scanner.nextInt();
                    library.setBookAvailability(id, true);
                    break;
                case 4:
                    System.out.print("\tID: ");
                    id = scanner.nextInt();
                    library.setBookAvailability(id, false);
                    break;
                case 5:
                    library.printBooksFilter(true);
                    break;
                case 6:
                    library.printBooksFilter(false);
                    break;
                case 7:
                    System.out.println(library);
                    break;
                case 8:
                    running = false;
                    break;
                default:
                    System.out.println("\tInvalid operation");
            }
        }
    }
}