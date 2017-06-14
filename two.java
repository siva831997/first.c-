import java.util.Scanner;
import java.util.Arrays;

public class Prefix {
	public static void main(String[] args) {
		int a=658462;
		int b[]=new int[10];
		int c=0,d=1;
		int i=0;
		while(a!=0)
		{
		c=a%10;
		b[i]=c;
		i++;
		a=a/10;
		}
		Arrays.sort(b,0,i);
		for(int j=1;j>=0;j--){
			System.out.print(b[j]);
		}
		
	}

}
