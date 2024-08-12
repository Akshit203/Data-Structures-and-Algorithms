import java.util.*;

public class insertion {
    public static void main(String args []){

        Scanner in = new Scanner(System.in);

        int arr[] =  {1, 2, 3, 4, 5}; // Original array
        int arr_len = arr.length;

        int new_arr[] = new int [arr_len + 1]; // New Array

        System.out.println("Enter the number u want to insert :");
        int x = in.nextInt();
        
        /* INSERTION AT THE BEGINNING :

        new_arr[0] = x;

        // Copy elements from the original array to the new array starting from the second position
        for (int i = 1; i < arr_len + 1; i++){
            new_arr[i] = arr[i - 1];
        }

        System.out.println("New Array :");

        for (int i = 0; i < arr_len + 1; i++){
            System.out.print(" " +new_arr[i]);
        } 
        */

        /* INSERTION AT THE END :

        for (int i = 0; i < arr_len; i++){
            new_arr[i] = arr[i];
        }

        System.out.println("New Array : ");
        new_arr[l] = x;

        for (int i = 0; i < arr_len + 1; i++){
            System.out.println(" " +new_arr[i]);
        } */

        /* INSERTION AT SPECIFIC POSITION : 

        System.out.println(" Enter the positon at which you want to insert the Element :");
        int index = in.nextInt();

        System.out.println("Index given by user is : " +index);

        if (index < 0 || index > arr_len) {
            System.out.println("Index out of bounds");
            return;
        }

        for (int i = 0; i < arr_len + 1; i++){

            if (i < index - 1){
                new_arr[i] = arr[i];
            }
            else if (i == index - 1){
                new_arr[index - 1] = x;
            }
            else{
                new_arr[i] = arr[i-1];
            }
        }

        // New array

        for (int i = 0; i < arr_len + 1; i++){
            System.out.println("New array : " +new_arr[i]);
        }  
        */

    }
}
