package ra.bussiness;

import java.util.Scanner;

public class Book {
    private static int nextBookId = 1;
    private int bookId;
    private String bookName;
    private String author;
    private String descriptions;
    private double importPrice;
    private double exportPrice;
    private float interest;
    private boolean bookStatus = true;

    public Book() {
        this.bookId = nextBookId++;
    }

    public Book(String bookName, String author, String descriptions, double importPrice, double exportPrice) {
        this.bookId = nextBookId++;
        this.bookName = bookName;
        this.author = author;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = (float) (exportPrice - importPrice);
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sách:");
        bookName = scanner.nextLine();

        System.out.print("Nhập tác giả: ");
        author = scanner.nextLine();

        System.out.print("Nhập mô tả (ít nhất 10 ký tự): ");
        descriptions = scanner.nextLine();

        while (descriptions.length() < 10) {
            System.out.println("Mô tả phải dài ít nhất 10 ký tự.");

            descriptions = scanner.nextLine();
        }

        System.out.print(" giá nhập phai lon hon 0 : ");
        importPrice = scanner.nextDouble();

        while (importPrice <= 0) {
            System.out.println("Giá nhập khẩu phải lớn hơn 0.");

            importPrice = scanner.nextDouble();
        }

        System.out.print("Nhập giá xuất lớn hơn 1,2 lần giá nhập:");
        exportPrice = scanner.nextDouble();

        while (exportPrice <= 1.2 * importPrice) {
            System.out.println("Giá xuất khẩu phải lớn hơn 1,2 lần giá nhập khẩu.");

            exportPrice = scanner.nextDouble();
        }

        interest = (float) (exportPrice - importPrice);
    }

    public void displayData() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Descriptions: " + descriptions);
        System.out.println("Import Price: " + importPrice);
        System.out.println("Export Price: " + exportPrice);
        System.out.println("Interest: " + interest);
        System.out.println("Book Status: " + bookStatus);
    }
}
