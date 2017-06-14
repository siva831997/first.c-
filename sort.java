import java.util.Scanner;
import java.util.Arrays;

public class Prefix {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		int a[]=new int[10];
		int c=s.nextInt();
		for(int i=0;i<c;i++){
			a[i]=s.nextInt();
		}Arrays.sort(a,0,c-1);
		
	for(int i=c-1;i>=0;i--){
		System.out.println(a[i]);}
	}

}
