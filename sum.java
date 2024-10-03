
import java.util.*;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];

        int M = scanner.nextInt();
        int[] B = new int[M];

        int L = scanner.nextInt();
        int[] C = new int[L];

        int Q = scanner.nextInt();
        int[] X = new int[Q];


        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < L; i++) {
            C[i] = scanner.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            X[i] = scanner.nextInt();
        }

        for (int target : X) {
            boolean res = false;
            
            for (int a : A) {
                for (int b : B) {
                    for (int c : C) {  
                        if (a + b + c == target) {
                            res = true;
                            break; 
                        }
                    }
                    if (res){
                        break;
                    } 
                }
                if (res){
                    break; 
                } 
            }
            
            if (res) {
                System.out.println("Yes");
            } 
            else {
                System.out.println("No");
            }
        }

    }
}
