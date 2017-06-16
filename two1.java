public class ee {

	public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 int[] a=new int[10];
 int b=s.nextInt();
 int c=0,d=0;
 for(int i=0;i<b;i++)
 {
	 a[i]=s.nextInt();
 }
 for(int i=0;i<=b;i++){
	 for(int j=0;j<b&&i!=j;j++){
		 if(a[i]-a[j]==0||a[i]+a[j]==0){
			 c=i;
			 d=j;
			 break;
		 }
	 }
 }System.out.println("the two element are "+a[c]+"\n"+a[d]);
	}
