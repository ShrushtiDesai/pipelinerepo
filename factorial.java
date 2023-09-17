public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    //comment added
    //another comment 2

    public static void main(String[] args) {
        int num = 5;
        int factorialResult = factorial(num);
        System.out.println("Factorial of " + num + " is: " + factorialResult);
    }
    
}
