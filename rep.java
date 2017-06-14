public class Prefix {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] a=new int[10];
		int b=s.nextInt();
		int c=0;
		int k=0;
		for(int i=0;i<b;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<b&&k==0;i++)
		{
			for(int j=0;j<b&&i!=j;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]);
					k++;
					break;
				}
			}
		}
	}
