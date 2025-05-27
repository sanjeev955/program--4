package today272.today273;

public class BookSales {
    private String sellerName;
    private int numberOfSales;
    private int sellerId;

    public BookSales(String sellerName, int numberOfSales, int sellerId) {
        this.sellerName = sellerName;
        this.numberOfSales = numberOfSales;
        this.sellerId = sellerId;
    }

    public void display() {
        System.out.println("Seller Name: " + sellerName);
        System.out.println("Number of Sales: " + numberOfSales);
        System.out.println("Seller ID: " + sellerId);
    }

    public static void main(String[] args) {
        BookSales sales = new BookSales("Alice Smith", 150, 101);
        sales.display();
    }
}

