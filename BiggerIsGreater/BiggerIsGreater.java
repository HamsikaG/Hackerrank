import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BiggerIsGreater {

    public static void main(String[] args)  throws IOException{
       	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
int num = Integer.parseInt(in.readLine());
String line = "";
for (int p = 0; p <=num; p++) {
	line = in.readLine();
		String	 a= line;

	int i,j,k,count=0;
	for(j=0;j<a.length()-1;j++){
		if(a.charAt(j)==a.charAt(j+1))
			count++;

	}
	if(count+1==a.length()){
		System.out.println("no answer");

	}
	else{
	int preLast = 0;
	char c1,c2, max;
	StringBuilder finalS=new StringBuilder();
	StringBuilder sb=new StringBuilder();
	StringBuilder fini=new StringBuilder();
	char[] ch=a.toCharArray();
	char[] b=a.toCharArray();
	finalS.append(b);
    Arrays.sort(ch);
	for( i=b.length-1;i>0;i--){
		c1=b[i];
	    c2=b[i-1];
     		if(	c1>c2)
				break;
	}
		if(i!=0){
        preLast=i-1;
		for(k=0;k<ch.length; k++){
			if(b[preLast]==ch[k] && ch[k]!=ch[k+1])
			break;
		}
    ArrayList<Character> ar=new ArrayList<Character>();
		for(int r=preLast+1;r<b.length;r++){
			ar.add(b[r]);
		}

		k=k+1;
		while(!(ar.contains(ch[k])) && k<ch.length)
			k=k+1;

		char c=ch[k];
		for(j=preLast+1;j<b.length;j++){
			if(b[j]==c)
				break;
		}

	b=swap(preLast,j,b);
		sb.append(b, 0, preLast+1);
		fini.append(b, preLast+1, b.length-preLast-1);
		String f=fini.toString();
		char[] arrfinal=f.toCharArray();
		Arrays.sort(arrfinal);
		  String sortedq = new String(arrfinal);
		sb.append(arrfinal);
	System.out.println(sb);

	}
	else
			System.out.println("no answer");


	}
	  }

}
	private static char[] swap(int c1, int c,char[] b) {
		char temp=b[c1];
		b[c1]=b[c];
		b[c]=temp;
		return b;
	}

}