package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int answer = Fibo(7);
        System.out.println(answer);
    }
    public static int Fibo(int n) {
        if(n < 2) {
            return n;
        }
        return Fibo(n-1) +Fibo(n-2);
    }

    // Time Complexity of Recursive Algorithm is (Golden Ration or 1.6)^N or [ (root5 + 1) / 2 ] ^ N
}
