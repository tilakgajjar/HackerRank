import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int Sum;
        int Max = 0;
        int count = 1;
        
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
    
        
        
        for (int i = 0; i < 4; i++) {
            
            
            for (int j = 0; j < 4; j++) {
                
                int sum1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
               
                int sum2 = sum1 + arr[i+1][j+1];
                
                Sum = sum2 + arr[i+2][j] + arr[i+2][j + 1] + arr[i+2][j + 2];
                
                if(count == 1){
                    Max = Sum;
                    count ++;
                }
                
                if (Sum > Max)
                    Max = Sum;
                
                } 
            } 
        System.out.print(Max);
    }
}
