import java.util.Random;
public class Sample07 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 3;
        int b = random.nextInt(6); // 0から5のランダムな整数を生成
        System.out.println("bの値は " + b + " です。");

        // a+bが5以上か判定する
        if (a + b >= 5) {
            System.out.println("a + b は 5以上 です。");
        } else {
            System.out.println("a + b は 5以上 ではありません。");
        }
    }
}