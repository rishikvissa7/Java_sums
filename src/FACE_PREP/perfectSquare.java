package FACE_PREP;

import java.util.Scanner;

public class perfectSquare {

//    public static boolean isperfectSquare(int n){
//        if(n==0){
//            return false;
//        }
//        for(int i=0;i<n/2;i++){
//            if(Math.pow(2,i) == n){
//                return true;
//            }
//        }
//        return false;
//    }

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
