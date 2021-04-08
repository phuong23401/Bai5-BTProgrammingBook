import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    private static Scanner scanner = new Scanner(System.in);
    private static List<ProgammingBook> bookList = new ArrayList<>();

    static {
        ProgammingBook book1 = new ProgammingBook("1", "Thinking in Java", "Bruce Eckel", "Java", "a", 50000, 1);
        ProgammingBook book2 = new ProgammingBook("2", "Head first Java", "Kathy Sierra", "Java", "b", 55000, 2);
        ProgammingBook book3 = new ProgammingBook("3", "Effective Java", "Joshua Bloch", "Java", "c", 60000, 2);
        ProgammingBook book4 = new ProgammingBook("4", "Starting Out with Python", "Tony Gaddis", "Python", "d", 55000, 2);
        ProgammingBook book5 = new ProgammingBook("5", "Java: The Complete Reference", "Herbert Schildt", "Java", "e", 50000, 1);
        ProgammingBook book6 = new ProgammingBook("6", "C++ Primer", "Stanley Lippman", "C++", "f", 50000, 2);
        ProgammingBook book7 = new ProgammingBook("7", "A Tour of C++", " Bjarne Stroustrup", "g", "g", 60000, 1);
        ProgammingBook book8 = new ProgammingBook("8", "Java: A Beginner's Guide", "Herbert Schildt", "Java", "h", 60000, 1);
        ProgammingBook book9 = new ProgammingBook("9", "Murach's Java Programming", "Joel Murach", "Java", "i", 70000, 1);
        ProgammingBook book10 = new ProgammingBook("10", "Tiếng Việt 1 Tập 1", "Hoàng Hòa Bình", "Tiếng Việt", "k", 30000, 3);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
        bookList.add(book10);
    }

    public static void getAmount() {
        int total = 0;
        for (ProgammingBook book : bookList) {
            total += book.getPrice() * book.number;
        }
        System.out.println("Tổng tiền sách = " + total);
    }

    public static void countBookByLanguage() {
        for (ProgammingBook book : bookList) {
            if (book.language == "Java") {
                System.out.println(book);
            }
        }
    }

    public static void findBookLessThanPrice() {
        System.out.print("Nhập số tiền: ");
        int num = scanner.nextInt();
        for (ProgammingBook book : bookList) {
            if (book.price < num) {
                System.out.println(book);
            }
        }
    }

    public static void show() {
        for (ProgammingBook book : bookList) {
            System.out.println(book.toString());
        }
    }
}
