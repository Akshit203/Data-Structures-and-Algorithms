import java.util.*;

class Laptop {
    private int price;
    int sdd_drive;

    int setPrice(int price){
        this.price = price;
        return price;
    }

}

public class example2 {


    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        boolean admin = false;

        if (!admin){
            System.out.println("You are not austhorized");
        }
        else{
            int x = l1.setPrice(10);
            System.out.println(x);

        }
       
        
    }
    
}
