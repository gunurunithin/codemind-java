import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        if(r%3==0 && r%5==0 && r%7==0)
          System.out.println("PlingPlangPlong");
        else if(r%3==0 && r%5==0)
          System.out.println("PlingPlang");
        else if(r%3==0 && r%7==0)
          System.out.println("PlingPlong");
        else if(r%7==0 && r%5==0)
          System.out.println("PlangPlong");
        else if(r%3==0)
          System.out.println("Pling");
        else if(r%5==0)
          System.out.println("Plang");
        else if(r%7==0)
          System.out.println("Plong");
        else
          System.out.println(r);
    }
}