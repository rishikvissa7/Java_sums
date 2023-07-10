package FACE_PREP;

import java.util.Scanner;

public class FactorialNum {

    public static long factorial(long n){
        long fact = 1;
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long fact = factorial(n);
        System.out.println(fact);

        long cnt=0;
        while(fact>0) {
            if (fact % 10 == 0) {
                cnt++;
            } else if (fact % 10 > 0) {
                break;
            }
            fact /=10;
        }
        System.out.println(cnt);
    }
}
