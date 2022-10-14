import java.util.Scanner;
class stringvcds
{
     public static void main(String args[])
     {
    String str;
int vCount=0,cCount=0,digits=0,spaces=0,spe_Char=0;
 Scanner scan=new Scanner(System.in); 
    
str=scan.nextLine();
for(int i=0; i<=str.length()-1; i++){
char ch=str.charAt(i);
if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u' // check vowels
    ||ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U' ){
        vCount++;
    }
    else if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )) 
{ 
        cCount++;
    }
    else if(ch>='0' && ch<='9') 
    {
        digits++;
    }
    else if(ch==' '){ 
        spaces++;
    }
    else{
        spe_Char++;
    }
}
System.out.println("Vowels: "+vCount);
System.out.println("Consonants: "+cCount);
System.out.println("Digits: "+digits);
System.out.println("White spaces: "+spaces); 
}
}