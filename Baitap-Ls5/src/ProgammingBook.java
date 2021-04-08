public class ProgammingBook {
    String bookCode, name, author, language, framework;
    int price, number;

    public ProgammingBook(String bookCode, String name, String author, String language, String framework, int price, int number) {
        this.bookCode = bookCode;
        this.name = name;
        this.author = author;
        this.language = language;
        this.framework = framework;
        this.price = price;
        this.number = number;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ProgammingBook{" +
                "bookCode='" + bookCode + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}
