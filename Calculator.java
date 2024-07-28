import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b){
        return a+b;
    }
    public static double sub(double a, double b){
        return a-b;
    }
    public static double mul(double a, double b){
        return a*b;
    }
    public static double div(double a, double b){
        if(b==0){
            System.out.println("error, the number is zero..");
            return 0;
        }
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number:-");
        double num1= sc.nextDouble();
        System.out.println("Enter Second Number:-");
        double num2= sc.nextDouble();
System.out.println("Choose an operation:- +,-,*,/");
char operation= sc.next().charAt(0);

double result=0;
switch (operation) {
    case '+':
    result= add(num1,num2);
        break;
        case '-':
        result=sub(num1,num2);
        break;
        case '*':
        result=mul(num1,num2);
        break;
        case '/':
        result=div(num1,num2);
        break;

    default:
    System.out.println("Invaid operation");
        break;
}
System.out.println("Result is:-" + result);
sc.close();
    }


}
