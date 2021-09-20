package Recursion;

public class RecursionCode {
    public static void main(String[] args) {
        Print(1);
    }

    public static void Print(int n) {
        if(n == 5) {
            System.out.println(5);
            return;
        }
        Print(n+1);
        System.out.println(n);
    }
}
