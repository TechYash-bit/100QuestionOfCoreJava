//write a program to check no is positive negative or zero
import java.util.*;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int a=sc.nextInt();

        if(a>0){
            System.out.println("the given number is positive ");
        }else if(a==0){
            System.out.println("the given number is zero");
        }else{
            System.out.println("the given number is negative");
        }

    }
}
