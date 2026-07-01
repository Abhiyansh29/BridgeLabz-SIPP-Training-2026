import java.util.*;

interface Category {}

class BookCategory implements Category {}
class ClothingCategory implements Category {}
class GadgetCategory implements Category {}

class Product<T extends Category> {

    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void display() {
        System.out.println(name + " | Price = " + price);
    }
}

public class MarketplaceDemo {

    public static <T extends Product<?>> void applyDiscount(
            T product, double percentage) {

        product.price -= (product.price * percentage / 100);
    }

    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Programming",
                        500,
                        new BookCategory());

        applyDiscount(book, 10);

        book.display();
    }
}