import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Collections;
import java.util.Scanner;


public class Driver {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();


        // M2 USING FACTORY
        LocalDate bookPublicationDate = LocalDate.of(2021, 10, 5);
        Product book1 = ProductFactory.createProduct(ProductFactory.ProductType.BOOK,
                1,
                true,
                "The Brothers Karamazov",
                "Fyodor Dostoyevsky's powerful meditation on faith, " +
                        "meaning and morality, The Brothers Karamazov is " +
                        "translated with an introduction and notes by David " +
                        "McDuff in Penguin Classics.",
                3.56, 9.00, 6.00, 14.99,
                "9780140449242",
                "Fyodor Dostoyevsky",
                "Penguin Classics",
                "novel",
                "English",
                "paperback",
                "Reissue edition (April 29, 2003)",
                1056,
                bookPublicationDate,
                null, 0.00, null, null

        );

        Product book2 = ProductFactory.createProduct(ProductFactory.ProductType.BOOK,
                1,
                true,
                "The Brothers Karamazov",
                "Fyodor Dostoyevsky's powerful meditation on faith, " +
                        "meaning and morality, The Brothers Karamazov is " +
                        "translated with an introduction and notes by David " +
                        "McDuff in Penguin Classics.",
                3.56, 9.00, 6.00, 14.99,
                "9780140449242",
                "Fyodor Dostoyevsky",
                "Penguin Classics",
                "novel",
                "English",
                "paperback",
                "Reissue edition (April 29, 2003)",
                1056,
                bookPublicationDate,
                null, 0.00, null, null
        );


        LocalDate audioBookPublicationDate = LocalDate.of(2019, 1, 1);
        Product audioBook1 = ProductFactory.createProduct(ProductFactory.ProductType.AUDIO_BOOK,
                2,
                true,
                "Anna Karenina",
                "The embodiment of the clash between Russia's old-world tradition and its " +
                        "liberal reform, Leo Tolstoy's willful heroine remains one of the most notorious " +
                        "and tragic in all of world literature.",
                0.00, 0.00, 0.00, 8.99,
                "9781853262715",
                "Leo Tolstoy",
                "Brilliance Audio",
                "novel",
                "English",
                "audiobook",
                "New edition",
                0,
                audioBookPublicationDate,
                "Elizabeth Knowelden",
                38.07,
                null, null
        );

        Product audioBook2 = ProductFactory.createProduct(ProductFactory.ProductType.AUDIO_BOOK,
                1,
                true,
                "Anna Karenina",
                "The embodiment of the clash between Russia's old-world tradition and its " +
                        "liberal reform, Leo Tolstoy's willful heroine remains one of the most notorious " +
                        "and tragic in all of world literature.",
                0.00, 0.00, 0.00, 8.99,
                "9781853262715",
                "Leo Tolstoy",
                "Brilliance Audio",
                "novel",
                "English",
                "audiobook",
                "New edition",
                0,
                audioBookPublicationDate,
                "Elizabeth Knowelden",
                38.07,
                null, null
        );


        LocalDate eBookPublicationDate = LocalDate.of(2011, 5, 3);
        Product eBook1 = ProductFactory.createProduct(ProductFactory.ProductType.E_BOOK,
                3,
                true,
                "Gone with the Wind",
                "Since its original publication in 1936, Gone With the Wind—winner " +
                        "of the Pulitzer Prize and one of the bestselling novels of all time—has been " +
                        "heralded by readers everywhere as The Great American Novel.",
                0.00, 0.00, 0.00, 9.99,
                "9781451635621",
                "Margaret Mitchell ",
                "Scribner",
                "novel",
                "English",
                "ebook",
                "Reissue edition (November 1, 2007)",
                524,
                eBookPublicationDate,
                null, 0.00,
                "https://ia803006.us.archive.org/16/items/GoneWithTheWindByMargaretMitchell/Gone%20with%20the%20Wind%20by%20Margaret%20Mitchell.pdf",
                "3225 KB");

        Product eBook2 = ProductFactory.createProduct(ProductFactory.ProductType.E_BOOK,
                3,
                true,
                "Gone with the Wind",
                "Since its original publication in 1936, Gone With the Wind—winner " +
                        "of the Pulitzer Prize and one of the bestselling novels of all time—has been " +
                        "heralded by readers everywhere as The Great American Novel.",
                0.00, 0.00, 0.00, 9.99,
                "9781451635621",
                "Margaret Mitchell ",
                "Scribner",
                "novel",
                "English",
                "ebook",
                "Reissue edition (November 1, 2007)",
                524,
                eBookPublicationDate,
                null, 0.00,
                "https://ia803006.us.archive.org/16/items/GoneWithTheWindByMargaretMitchell/Gone%20with%20the%20Wind%20by%20Margaret%20Mitchell.pdf",
                "3225 KB");


        products.add(book1);
        products.add(audioBook1);
        // add Anna Karenina book with id 1 to test compareTo for id part
        products.add(audioBook2);
        products.add(eBook1);


        // System.out.println("BEFORE Sorting");
        // for (Product product : products) {
        //     System.out.println(product.toString());
        // }

        // Collections.sort(products);

        // System.out.println("AFTER Sorting");
        // for (Product product : products) {
        //     System.out.println(product.toString());
        // }


        // System.out.println("Compare book1 and book2: " + book1.equals(book2));
        // System.out.println("Compare audioBook1 and audioBook2: " + audioBook1.equals(audioBook2));
        // System.out.println("Compare eBook1 and eBook2: " + eBook1.equals(eBook2));
        // System.out.println();


        if (book1 instanceof Book) {
            Book book = (Book) book1;
            //     System.out.println("The shipping cost of book1 is: " + "$" + book.calculateShippingCost());
        }

        if (audioBook1 instanceof AudioBook) {
            AudioBook audiobook = (AudioBook) audioBook1;
            //     System.out.println("The shipping cost of book1 is: " + "$" + audiobook.calculateShippingCost());
        }

        if (eBook1 instanceof EBook) {
            EBook ebook = (EBook) eBook1;
            //     System.out.println("The shipping cost of book1 is: " + "$" + ebook.calculateShippingCost());
        }
        System.out.println();

        if (audioBook1 instanceof AudioBook) {
            AudioBook audioBook = (AudioBook) audioBook1;
            //     audioBook.play();
            //     System.out.println();
            //     audioBook.stopPlay();
            //     System.out.println();
        }

        if (eBook1 instanceof EBook) {
            EBook eBook = (EBook) eBook1;
            //     eBook.download();
            //     System.out.println();
        }


        // System.out.println("Check default category for book1: " + book1.getCategory());
        // System.out.println("Check default category for audiobook1: " + audioBook1.getCategory());
        // System.out.println("Check default category for ebook1: " + eBook1.getCategory());

        // System.out.println();

        // System.out.println("Number of products : " + Product.getNumProducts());


        // M3 USING COMPARATOR
        ArrayList<Book> books = new ArrayList<>();
        LocalDate bookPublicationDate11 = LocalDate.of(2021, 10, 5);
        books.add(new Book(
                        ProductFactory.ProductType.BOOK,
                        1,
                        true,
                        "The Brothers Karamazov",
                        "Fyodor Dostoyevsky's powerful meditation on faith, " +
                                "meaning and morality, The Brothers Karamazov is " +
                                "translated with an introduction and notes by David " +
                                "McDuff in Penguin Classics.",
                        3.56, 9.00, 6.00, 14.99,
                        "9780140449242",
                        "Fyodor Dostoyevsky",
                        "Penguin Classics",
                        "drama",
                        "English",
                        "paperback",
                        "Reissue edition (April 29, 2003)",
                        1056,
                        bookPublicationDate11
                )
        );

        LocalDate bookPublicationDate22 = LocalDate.of(2023, 8, 4);

        books.add(new AudioBook(
                        ProductFactory.ProductType.AUDIO_BOOK,
                        2,
                        true,
                        "Anna Karenina",
                        "The embodiment of the clash between Russia's old-world tradition and its " +
                                "liberal reform, Leo Tolstoy's willful heroine remains one of the most notorious " +
                                "and tragic in all of world literature.",
                        0.00, 0.00, 0.00, 8.99,
                        "9781853262715",
                        "Leo Tolstoy",
                        "Brilliance Audio",
                        "novel",
                        "English",
                        "audiobook",
                        "New edition",
                        0,
                        bookPublicationDate22,
                        "Elizabeth Knowelden",
                        38.07
                )
        );

        LocalDate bookPublicationDate33 = LocalDate.of(1973, 4, 2);
        books.add(new EBook(
                        ProductFactory.ProductType.E_BOOK,
                        3,
                        true,
                        "Gone with the Wind",
                        "Since its original publication in 1936, Gone With the Wind—winner " +
                                "of the Pulitzer Prize and one of the bestselling novels of all time—has been " +
                                "heralded by readers everywhere as The Great American Novel.",
                        0.00, 0.00, 0.00, 9.99,
                        "9781451635621",
                        "Margaret Mitchell ",
                        "Scribner",
                        "historical novel",
                        "English",
                        "ebook",
                        "Reissue edition (November 1, 2007)",
                        524,
                        bookPublicationDate33,
                        "https://ia803006.us.archive.org/16/items/GoneWithTheWindByMargaretMitchell/Gone%20with%20the%20Wind%20by%20Margaret%20Mitchell.pdf",
                        "3225 KB"
                )
        );

        // Interactive Driver part 1 START

        Scanner scan = new Scanner(System.in);

        boolean keepCreatingProducts = true;
        System.out.print("Welcome!");

        while (keepCreatingProducts) {
            System.out.print("You are at the beginning of creating product");

            boolean keepEntering1 = true;
            ProductFactory.ProductType type = null;

            while (keepEntering1) {
                System.out.println("Enter product details:");
                System.out.println("Select # for product type:");
                System.out.println("1 (Book)");
                System.out.println("2 (Audio Book)");
                System.out.println("3 (E-Book)");
                System.out.print("Enter choice: ");

                try {
                    int productChoice = Integer.parseInt(scan.nextLine());

                    switch (productChoice) {
                        case 1:
                            type = ProductFactory.ProductType.BOOK;
                            keepEntering1 = false;
                            break;
                        case 2:
                            type = ProductFactory.ProductType.AUDIO_BOOK;
                            keepEntering1 = false;
                            break;
                        case 3:
                            type = ProductFactory.ProductType.E_BOOK;
                            keepEntering1 = false;
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            continue;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                }

            }

            int id = validateIntegerInput(scan, "Product ID: ");

            boolean availability;
            while (true) {
                System.out.print("Availability (true/false): ");
                String availabilityInput = scan.nextLine().toLowerCase();

                switch (availabilityInput) {
                    case "true":
                        availability = true;
                        break;
                    case "false":
                        availability = false;
                        break;
                    default:
                        System.out.println("Invalid input. Please enter 'true' or 'false'.");
                        continue;
                }

                break;
            }

            System.out.print("Name: ");
            String name = scan.nextLine();

            System.out.print("Description: ");
            String description = scan.nextLine();

            double weight = validateDoubleNumericInput(scan, "Weight: ");
            double length = validateDoubleNumericInput(scan, "Length: ");
            double height = validateDoubleNumericInput(scan, "Height: ");
            double price = validateDoubleNumericInput(scan, "Price: ");

            String isbn = "";
            String author = "";
            String publisher = "";
            String genre = "";
            String language = "";
            String format = "";
            String edition = "";
            int numOfPages = 0;
            LocalDate publicationDate = null;

            Book newBook = null;

            System.out.print("ISBN: ");
            isbn = scan.nextLine();

            System.out.print("Author: ");
            author = scan.nextLine();

            System.out.print("Publisher: ");
            publisher = scan.nextLine();

            System.out.print("Genre: ");
            genre = scan.nextLine();

            System.out.print("Language: ");
            language = scan.nextLine();

            System.out.print("Format: ");
            format = scan.nextLine();

            System.out.print("Edition: ");
            edition = scan.nextLine();

            numOfPages = validateIntegerInput(scan, "Number of Pages: ");

            boolean validDate = false;

            while (!validDate) {
                try {
                    System.out.print("Publication Date (yyyy-mm-dd): ");
                    String dateInput = scan.nextLine();
                    publicationDate = LocalDate.parse(dateInput);
                    validDate = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid date format. Please enter the date in yyyy-mm-dd format.");
                }
            }

            switch (type) {
                case BOOK:
                    newBook = new Book(type, id, availability, name, description, weight, length, height, price,
                            isbn, author, publisher, genre, language, format, edition, numOfPages, publicationDate);
                    break;
                case AUDIO_BOOK:
                    System.out.print("Narrator: ");
                    String narrator = scan.nextLine();

                    double listeningLength = validateDoubleNumericInput(scan, "Listening Length: ");

                    newBook = new AudioBook(type, id, availability, name, description, weight, length, height, price,
                            isbn, author, publisher, genre, language, format, edition, numOfPages,
                            publicationDate, narrator, listeningLength);
                    break;
                case E_BOOK:
                    System.out.print("Link to Read: ");
                    String linkToRead = scan.nextLine();

                    System.out.print("File Size: ");
                    String fileSize = scan.nextLine();


                    newBook = new EBook(type, id, availability, name, description, weight, length, height, price,
                            isbn, author, publisher, genre, language, format, edition, numOfPages,
                            publicationDate, linkToRead, fileSize);
                    break;

            }

            System.out.println(newBook);

            books.add(newBook);
            System.out.println("Book added successfully!");

            String tryYesNoInput = "";
            boolean validYesNoInput = false;

            while (!validYesNoInput) {
                System.out.println("Do you want to enter another book? (yes/no)");
                tryYesNoInput = scan.nextLine().toLowerCase();

                if (tryYesNoInput.equals("yes") || tryYesNoInput.equals("no")) {
                    validYesNoInput = true;
                } else {
                    System.out.println("Invalid input. Please enter yes or no.");
                }
            }

            if (tryYesNoInput.equals("no")) {
                keepEntering1 = false;
                break;
            }

        }

        // Interactive Driver part 1 END


        // Interactive Driver part 2 START
        boolean keepEntering2 = true;
        boolean keepPrinting = true;
        String sortedBy = "";
        while (keepEntering2) {
            System.out.println("Enter" +
                    "\n\t1 to sort by author's last name " +
                    "\n\t2 to sort by publication date from oldest " +
                    "\n\t3 to sort by genre " +
                    "\n\t4 to exit ");

            try {
                int choice = Integer.parseInt(scan.nextLine());

                switch (choice) {
                    case 1:
                        Collections.sort(books, Book.AUTHOR_LAST_NAME_COMPARATOR);
                        sortedBy = "Auther's last name";
                        keepPrinting = true;
                        break;
                    case 2:
                        Collections.sort(books, Book.PUBLICATION_DATE_COMPARATOR);
                        sortedBy = "Publication date";
                        keepPrinting = true;
                        break;
                    case 3:
                        Collections.sort(books, Book.GENRE_COMPARATOR);
                        sortedBy = "Genre";
                        keepPrinting = true;
                        break;
                    case 4:
                        System.out.println("Good bye.");
                        keepEntering2 = false;
                        break;
                    default:
                        System.out.println("Invalid Choice.");
                        keepPrinting = false;

                }

                if (keepEntering2 && keepPrinting) {
                    System.out.println("AFTER Sorting by " + sortedBy);
                    for (Book book : books) {
                        System.out.println(book.toString());
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }

        }
        // Interactive Driver part 2 END

    }

    public static double validateDoubleNumericInput(Scanner scan, String userInput) {
        boolean validInput = false;
        double value = 0.0;

        while (!validInput) {
            try {
                System.out.print(userInput);
                value = Double.parseDouble(scan.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return value;
    }

    public static int validateIntegerInput(Scanner scan, String userInput) {
        boolean validInput = false;
        int value = 0;

        while (!validInput) {
            try {
                System.out.print(userInput);
                value = Integer.parseInt(scan.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return value;
    }


}