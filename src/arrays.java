import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int a[] = new int[n];
        for(i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++) {
            if(a[i]%2!=0) {
                System.out.println(a[i]);
            }
        }
    }
}
