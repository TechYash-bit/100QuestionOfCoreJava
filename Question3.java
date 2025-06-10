import java.util.*;
//write a program to swap 2 number

public class Question3 {
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number 'a'");
        a=sc.nextInt();

        System.out.println("Enter the second number 'b'");
        b=sc.nextInt();

        System.out.println("before swaping   a:"+a+"  b:  "+b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println("after swaping   a:"+a+"  b: "+b);



    }

}
