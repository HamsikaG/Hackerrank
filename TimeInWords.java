
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeInWords {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "fifteen");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        map.put(30, "thirty");
        map.put(40, "forty");
        map.put(50, "fifty");
        map.put(60, "sixty");
        map.put(70, "seventy");
        map.put(80, "eighty");
        map.put(90, "ninety");

        int h =12;
        int m=15;

        if(m==0){
            System.out.println(map.get(h)+" o' clock");
        }
       else  if(m==30)
            System.out.println("half past "+map.get(h));
        else if(m<30){
            if(m!=1){
            	if(m!=15){
            		if(m>20){
            		 int u=m%10;
                     int t=m/10;
                     System.out.println(map.get(t*10)+" "+map.get(u)+" minutes past "+map.get(h));
            		}
            		else
            System.out.println(map.get(m)+" minutes past "+map.get(h));
            	}
            	else
                    System.out.println("quarter past "+map.get(h));

            }
            else
            System.out.println(map.get(m)+" minute past "+map.get(h));
        }
        else{
        	m=60-m;
            if(m!=1){
            int u=m%10;
            int t=m/10;
            if(m>20)
            System.out.println(map.get(t*10)+" "+map.get(u)+" minutes to "+map.get(h+1));
            else{
            	if(m!=15)
                System.out.println(map.get(m)+" minutes to "+map.get(h+1));
            	else
                    System.out.println("quarter to "+map.get(h+1));


            }

            }
            else
            System.out.println(map.get(m)+" minute to "+map.get(h+1));

       }
    }
}
