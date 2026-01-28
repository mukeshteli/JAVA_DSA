
public class BinomialCoffcient {
    
    public static int fact (int num){
        int fact = 1;
        for(int i = num;i>=1;i--){
            fact = fact *i;

        }
        return fact;}
    public static void main(String[] args) {
    int n = 5;
    int r = 2;
   
    int n1 = fact(n);
    System.out.println("Factorial of n is : "+ n1);
    int r1 =fact(r);
    System.out.println("Factorial of r is : "+ r1);
    int g = n - r;
    int n_r1 =fact(g);
    System.out.println("Factorial of n-r is : "+ n_r1);
    
    int binomialCoff = n1/(r1*n_r1);
    System.err.println("Binomial Cofficient is : "+ binomialCoff);

    
}}
