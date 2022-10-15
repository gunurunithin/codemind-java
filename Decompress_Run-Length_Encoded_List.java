import java.util.Scanner;
class Sample
{
    public static void decompressArray(int x[],int n)
    {
        int k;
        for(int i=0;i<n;i=i+2)
        {
            k=x[i];
            while(k-->0)
            {
                System.out.print(x[i+1]+" ");
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        decompressArray(x,n);
    }
}