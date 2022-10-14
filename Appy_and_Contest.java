import java.util.Scanner;
class Sample
{
    public static int LCM(int a,int b)
    {
        int max = a>b?a:b;
        int lcm=max;
        while(true)
        {
            if(lcm%a==0 && lcm%b==0)
              break;
            lcm+=max;
        }
        return lcm;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int k=sc.nextInt();
            int temp = (int)n/a+(int)n/b-2*(int)(n/LCM(a,b));
            if(temp>=k)
              System.out.println("Win");
            else
              System.out.println("Lose");
        }
    }
}