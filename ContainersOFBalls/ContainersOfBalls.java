import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[][] M = new int[n][n];
            int []a =new int[n];
            int []b=new int[n];
            for(int M_i=0; M_i < n; M_i++){
                a[M_i]=0;
                b[M_i]=0;
                for(int M_j=0; M_j < n; M_j++){
                    M[M_i][M_j] = in.nextInt();
                }
            }
            for(int M_i=0; M_i < n; M_i++){
                for(int M_j=0; M_j < n; M_j++){
                  a[M_i]+=  M[M_i][M_j];
                  b[M_i]+=  M[M_j][M_i];
                }
            }  
            String pts = "Possible";
for(int i=0;i<n;i++)
{
    int j=0;
    for(j=i;j<n;j++)
    {
        if(a[i] == b[j])
        {
            int temp = b[j];
            b[j] = b[i];
            b[i] = temp;
            break;
        }
    }
    if(j==n)
    {
        pts = "Impossible";
        break;
    }
}
System.out.println(pts);
        }
    }
}
