import java.util.ArrayList;
import java.time.LocalDate;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        LocalDate bookPublicationDate = LocalDate.of(2021, 10, 5);
        Book book1 = new Book(1,
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
                bookPublicationDate
        );

        Book book2 = new Book(1,
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
                bookPublicationDate
        );


        LocalDate audioBookPublicationDate = LocalDate.of(2019, 1, 1);
        Book audioBook1 = new AudioBook(2,
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
                38.07);

        Book audioBook2 = new AudioBook(2,
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
                38.07);


        LocalDate eBookPublicationDate = LocalDate.of(2011, 5, 3);
        Book eBook1 = new EBook(3,
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
                "https://ia803006.us.archive.org/16/items/GoneWithTheWindByMargaretMitchell/Gone%20with%20the%20Wind%20by%20Margaret%20Mitchell.pdf",
                "3225 KB");

        Book eBook2 = new EBook(3,
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
                "https://ia803006.us.archive.org/16/items/GoneWithTheWindByMargaretMitchell/Gone%20with%20the%20Wind%20by%20Margaret%20Mitchell.pdf",
                "3225 KB");


        products.add(book1);
        products.add(audioBook1);
        products.add(eBook1);

        for (Product product : products) {
            System.out.println(product.toString());
        }

        System.out.println("Compare book1 and book2: " + book1.equals(book2));
        System.out.println("Compare audioBook1 and audioBook2: " + audioBook1.equals(audioBook2));
        System.out.println("Compare eBook1 and eBook2: " + eBook1.equals(eBook2));
        System.out.println();

        System.out.println("The shipping cost of book1 is: " + "$" + book1.calculateShippingCost());
        System.out.println("The shipping cost of audiobook1 is: " + "$" + audioBook1.calculateShippingCost());
        System.out.println("The shipping cost of ebook1 is: " + "$" + eBook1.calculateShippingCost());
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


    }


}
