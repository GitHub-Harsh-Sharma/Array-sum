import java.util.*;

class Arraysum
{
 int []arr= new int[5];

 public void input()
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter elements");
     for (int i=0;i<5;i++)
     {
        arr[i]=sc.nextInt();
     }
 }   

 public void print()
 {
     int sum=0;
     System.out.println("Elements are:");
     for (int i=0;i<5;i++)
        {
        sum=sum+arr[i];
        }
        System.out.println("Sum= "+sum);    
}  
 public static void main(String args[])
 {
     Arraysum arr=new Arraysum();
     arr.input();
     arr.print();
 }
} 