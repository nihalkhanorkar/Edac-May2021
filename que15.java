import java.util.Scanner;
public class que15
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the valves");
int i=sc.nextInt();
int j=sc.nextInt();
int temp;

System.out.println("addtion: "+i);
System.out.println("addtion: "+j);
temp=i;
i=j;
j=temp;
System.out.println("swapping");
System.out.println("i: "+i);
System.out.println("j: "+j);

}


}