import java.util.*;
//write a program to check even or odd
public class Question4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int a=sc.nextInt();

        if(a%2==0){
            System.out.println("the given  number is even");
        }else{
            System.out.println("the given number is oddd");
        }
    }
}
