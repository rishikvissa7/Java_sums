package FACE_PREP;

import java.util.Scanner;

public class Pow2 {

    public static boolean isPow2(int n){
        if((n & (n-1)) == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPow2(n));
    }
}
