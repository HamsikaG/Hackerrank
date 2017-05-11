import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
     BigInteger factorial = BigInteger.ONE;
		for (int i = 1; i <= N; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		System.out.println(factorial);
        }
    }

