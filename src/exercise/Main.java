package exercise;

public class Main {
    public static void main(String[]args){
        ShoppingCart cart = new ShoppingCart();
        cart.list();
        cart.add("Apple, pear");
        cart.list();
        cart.add("pear");

        cart.delete(3);
        cart.list();
    }
}
