public class ee {

	public static void main(String[] args) {
		int  flag = 0, count = 0;
        Scanner s = new Scanner(System.in);
       int  n = s.nextInt();
        int a[] = new int[n];
       
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Non repeated elements are:");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i != j)
                {
                    if(a[i] != a[j])
                    {
                        flag = 1;
                    }
                    else
                    {
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag == 1)
            {
                
                System.out.print(a[i]+" ");
            }
        }
        System.out.println("");
    }}
