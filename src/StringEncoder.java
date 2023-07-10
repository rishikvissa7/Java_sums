import java.util.*;

public class StringEncoder {

    public static String[] stringEncoder(String[] input1,int input2){
        int arr_size = input1.length;
        int i=0;
        String[] answer = new String[arr_size];
        for(int j=0;j<arr_size;j++){
            int temp2 = input2;
            String s = input1[j];
            char f = s.charAt(0);
            char m = s.charAt(s.length()/2);
            char l = s.charAt(s.length()-1);
            String temp = f+String.valueOf(m)+l;
            String ans = temp;
            while(temp2-->0){
                ans += temp;
            }
            answer[i++] = ans;
        }
        return answer;
    }

    public static void main(String[] args) {
        String input1[] = new String[]{"World","Hello","Madam"};
        int input2 = 2;
        System.out.println(Arrays.toString(stringEncoder(input1,input2)));

    }

}
