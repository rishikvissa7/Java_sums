package FACE_PREP;

import java.util.Scanner;

public class Pow4 {

    public static boolean isPow4(int n){
        if((n & (n-1)) == 0  && ((n%3)  == 1)){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPow4(n));
    }
}
