import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;
import java.util.Scanner;

public class nonPrimeSum {

    public static boolean isPrime(int n){
        if(n == 0 || n==1){
            return true;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            Arrays.sort(arr);
            System.out.println(arr[i]);
        }

        int sum=0;
        for(int i=0;i<n;i++){
            if(isPrime(arr[i])){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
