import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("-----Menu-----");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Tổng tiền sách");
            System.out.println("3. Đếm số sách có language là 'Java'");
            System.out.println("4. Tìm sách");
            System.out.println("0. Thoát");

            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    BookManager.show();
                    break;
                case "2":
                    BookManager.getAmount();
                    break;
                case "3":
                    BookManager.countBookByLanguage();
                    break;
                case "4":
                    BookManager.findBookLessThanPrice();
                    break;
                case "0":
                    System.out.println("Đã thoát!");
                    System.exit(0);
                    break;
            }
        }
    }
}
