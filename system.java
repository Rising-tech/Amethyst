import java.util.Scanner;
import java.lang.*;
public class system{
    public static void main(String[]args){
    Scanner SC=new Scanner(System.in);
    System.out.println(" Enter the Net Mass Flow Rate in the System :");
    float m=SC.nextFloat();
    System.out.println("Enter the Net Change in Internal Energy of the System:");
    float u=SC.nextFloat();
    if((m==0) && (u==0)){
        System.out.print("It is a Isolated System.");
    }
    else if((m!=0)&& (u!=0)){
        System.out.print("It is a Open System.");
    }
    else if((m==0)&&(u!=0)){
        System.out.print("It is a Closed System");
    }
    else{
        System.out.print("It is not a system.");
    }
     
    }
} 