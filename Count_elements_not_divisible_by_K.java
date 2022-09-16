import java.util.Scanner;
class arr5
{
 public static void main(String args[])

   {
    	Scanner sc=new Scanner(System.in);

	int x[],i,n,k,cnt=0;
	n=sc.nextInt();
	x=new int[n];
	k=sc.nextInt();

	for (i=0;i<n;i++)
	    {
		x[i]=sc.nextInt();  
 	    }
	
	for (i=0;i<n;i++)
	{
	    if(x[i]%k!=0)
	    {
	        cnt++;
	    }
	    
	}
		        System.out.print(cnt);
  }
}
