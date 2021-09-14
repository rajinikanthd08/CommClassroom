package LinearSearch;
public class RichestCustomerWealth {


    public static void main(String[] args) {
        int[][] account = new int[][]{{1, 5}, {7, 3}, {3, 5}};
        int abc = maximumWealth(account);
        System.out.println(abc);
    }

    public static int maximumWealth(int[][] accounts) {
        int answer = -2147483648;
        int[][] var2 = accounts;
        int var3 = accounts.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int[] ints = var2[var4];
            int sum = 0;
            int[] var7 = ints;
            int var8 = ints.length;

            for(int var9 = 0; var9 < var8; ++var9) {
                int anInt = var7[var9];
                sum += anInt;
            }

            if (sum > answer) {
                answer = sum;
            }
        }

        return answer;
    }
}