import java.util.Scanner;
class sample
{
    public static boolean pal(int n)
    {
        int temp=n;
        int rev=0,r;
        while(n>0)
          {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
          }
        if (temp==rev)
          return true;
        else
          return false;
    }
    public static boolean p(int n)
    {
        int cnt=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        { 
            if(n%i==0)
            cnt++;
        }
        if (cnt==0)
         return true;
        else
         return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        for(i=n+1;;i++)
        {
            if(p(i) && pal(i))
            {
            System.out.println(i);
            break;
            }
        }
        
    }
}
