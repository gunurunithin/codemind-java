import java.util.Scanner;
class roober
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n,count=0;
        n=Sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=Sc.nextInt();
            if(arr[i]%2!=0)
            count++;
            
        }
        if(count<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}