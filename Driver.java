import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;


public class Driver {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();


        // M2 USING FACTORY
        LocalDate bookPublicationDate = LocalDate.of(2021, 10, 5);
        Product book1 = ProductFactory.createProduct( "book",
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

        Product book2 = ProductFactory.createProduct ("book",
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
        Product audioBook1 = ProductFactory.createProduct("audiobook",
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

        Product audioBook2 = ProductFactory.createProduct ("audiobook",
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
        Product eBook1 = ProductFactory.createProduct("ebook",
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

        Product eBook2 = ProductFactory.createProduct("ebook",
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


        System.out.println("BEFORE Sorting");
        for (Product product : products) {
            System.out.println(product.toString());
        }

        Collections.sort(products);

        System.out.println("AFTER Sorting");
        for (Product product : products) {
            System.out.println(product.toString());
        }



        System.out.println("Compare book1 and book2: " + book1.equals(book2));
        System.out.println("Compare audioBook1 and audioBook2: " + audioBook1.equals(audioBook2));
        System.out.println("Compare eBook1 and eBook2: " + eBook1.equals(eBook2));
        System.out.println();


        if (book1 instanceof Book) {
            Book book = (Book) book1;
            System.out.println("The shipping cost of book1 is: " + "$" + book.calculateShippingCost());
        }

        if (audioBook1 instanceof AudioBook) {
            AudioBook audiobook = (AudioBook) audioBook1;
            System.out.println("The shipping cost of book1 is: " + "$" + audiobook.calculateShippingCost());
        }

        if (eBook1 instanceof EBook) {
            EBook ebook = (EBook) eBook1;
            System.out.println("The shipping cost of book1 is: " + "$" + ebook.calculateShippingCost());
        }
        System.out.println();

        if (audioBook1 instanceof AudioBook) {
            AudioBook audioBook = (AudioBook) audioBook1;
            audioBook.play();
            System.out.println();
            audioBook.stopPlay();
            System.out.println();
        }

        if (eBook1 instanceof EBook) {
            EBook eBook = (EBook) eBook1;
            eBook.download();
            System.out.println();
        }



        System.out.println("Check default category for book1: " + book1.getCategory());
        System.out.println("Check default category for audiobook1: " + audioBook1.getCategory());
        System.out.println("Check default category for ebook1: " + eBook1.getCategory());


        System.out.println("Number of products : " + Product.getNumProducts());




    }


}
