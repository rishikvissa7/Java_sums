import java.util.*;

public class MinSteps {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact =1;
        int steps = 0;
        while(n>0) {
            for(int i=1;i<n;i++) {
                if(n%i==0) {
                    fact = i;
                }
            }
            n = n - fact;
            steps++;
        }
        System.out.println(steps);
    }
}
