import java.io.*;

public class sample02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("数字を入力してください：");
        int input = Integer.parseInt(br.readLine());
        boolean isPrime = true;

        if (input <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(input); i++) {
                if (input % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("素数です");
        } else {
            System.out.println("素数でない");
        }
    }
}