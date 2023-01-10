package exercise;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    private List<String> cart = new LinkedList<String>();

    public List<String> getCart() {return cart;}

    public void setCart(List<String> cart) {this.cart = cart;}


    // list
    public void list() {
        if (getCart().size() < 1) {
            System.out.print("Your cart is empty\n");
        } else {
            List<String> cartList = getCart();
            for (int i = 0; i <cartList.size(); i++) {
                System.out.printf("%d. %s\n", i+1, cartList.get(i));
            }
        }
    }
    //add
    public void add(String items){
        String[] itemList = items.trim().toLowerCase().split(",");

        List<String> cartList = getCart();
        for(String i: itemList){
            //remove whitespaces
            i = i.trim();
            //item exists in cart
            if(cartList.contains(i)){
                System.out.printf("You have %s in your cart\n",i);
            }else{
                cartList.add(i);
                System.out.printf("%s added to cart\n",i);
            }
        }
        setCart(cartList);
    }
    //delete
    public void delete(int index){
        //index is index-1 because of how listing is 
        try{
            List<String> cartList = getCart();
            String removedItem = cartList.get(index-1);
            cartList.remove(index-1);
            System.out.printf("%s removed from cart\n", removedItem);
            setCart(cartList);
        }catch(IndexOutOfBoundsException ex){System.err.println("Provided a wrong number.");}
    }
}
