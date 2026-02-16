public class Version1 {

    public static void main(String[] args) {

        // Order #1
        System.out.println("=== Clark's Coffee Cart ===");
        System.out.println("Item: Maple Latte");
        System.out.println("Price: $" + 6.25);
        System.out.println("Thanks for your order!");
        System.out.println("==========================");
        System.out.println();

        // Order #2
        System.out.println("=== Clark's Coffee Cart ===");
        System.out.println("Item: Iced Vanilla Latte");
        System.out.println("Price: $" + 5.75);
        System.out.println("Thanks for your order!");
        System.out.println("==========================");
        System.out.println();

        // Order #3
        System.out.println("=== Clark's Coffee Cart ===");
        System.out.println("Item: Chai");
        System.out.println("Price: $" + 4.50);
        System.out.println("Thanks for your order!");
        System.out.println("==========================");
    }
}


public class Version2 {

    public static void main(String[] args) {
        printReceipt("Maple Latte", 6.25);
        System.out.println();

        printReceipt("Iced Vanilla Latte", 5.75);
        System.out.println();

        printReceipt("Chai", 4.50);
    }

    public static void printReceipt(String item, double price) {
        System.out.println("=== Clark's Coffee Cart ===");
        System.out.println("Item: " + item);
        System.out.println("Price: $" + price);
        System.out.println("Thanks for your order!");
        System.out.println("==========================");
    }
}
