import java.util.Scanner;
class Cofficient{
    int fact = 1;
    int fact (int num ){
        for(int i = num;i>=1;i--){
            fact = fact *i;

        }
        return fact;

    }
}
public class BinomialCoffcient {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n ");
    int n = sc.nextInt();
    System.out.println("Enter the value of r ");    
    int r = sc.nextInt();
    Cofficient c = new Cofficient();
    Cofficient c1 = new Cofficient();
    Cofficient c2 = new Cofficient();
    int n1 = c.fact(n);
    System.out.println("Factorial of n is : "+ n1);
    int r1 = c1.fact(r);
    System.out.println("Factorial of r is : "+ r1);
    int g = n - r;
    int n_r1 = c2.fact(g);
    System.out.println("Factorial of n-r is : "+ n_r1);
    sc.close();
    int binomialCoff = n1/(r1*n_r1);
    System.err.println("Binomial Cofficient is : "+ binomialCoff);

    
}}
