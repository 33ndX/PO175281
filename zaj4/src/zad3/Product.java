package zad3;

public class Product {
    public static int numberOfProducts;
    public final static int MAX_PRODUCTS = 120;


    public Product() {
       numberOfProducts++;
       if(numberOfProducts > MAX_PRODUCTS){
           System.out.println("ilosc produktów przekorczona");
           numberOfProducts = MAX_PRODUCTS;
       }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 102; i++){
            Product p = new Product();
        }
    }


}
