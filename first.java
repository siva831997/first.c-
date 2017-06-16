public class ee {

	public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 int[] a=new int[10];
 int b=s.nextInt();
 int c=0;
 for(int i=0;i<b;i++)
 {
	 a[i]=s.nextInt();
 }
 for(int i=0;i<=b;i++){
	 for(int j=1;j<b&&i!=j;j++){
		 
		 if(a[i]==a[j]){
			 
			 c=i;
			 break;
		 }
	 }
 }System.out.println("the two element are "+a[c]);
	}

}
