package calculator;

import java.util.Scanner;

/**
 *
 * @author collins shibambo
 */
public class exercise4Calculator {

    public static void main(String[] args, char A, char S, char M, char D) {
        Scanner scan = new Scanner(System.in);
        
        //read the first integer
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        
        //read second integer
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        
        //The user will choose the operation of  his/her choice A=add, M=multiply, D=divide, S=subtract
       
        System.out.print("Enter character(A,S,M,D): ");
        char operations =scan.next().charAt(0);
        
        if(operations == 'A'){
            System.out.println("Add " + (num1 + num2));
        }
        else if(operations == 'S') {
            System.out.println("Substract " + (num1 - num2));
        }
        else if(operations == 'M') {
            System.out.println("Multiply " + (num1 * num2));
        }
        else if(operations == 'D') {
            System.out.println("Divide " + (num1 / num2));
        }
        else {
            System.out.println("Enter valid operation!!!");
        }
        
        // TODO code application logic here
    }
    
}
