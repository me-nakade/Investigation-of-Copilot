//0~1000までのフィボナッチ数列を表示する
public class sample04_2 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;

        System.out.print(n1 + ", " + n2);

        int f = n1 + n2;
        while (f <= 1000) {
            System.out.print(", " + f);
            n1 = n2;
            n2 = f;
            f = n1 + n2;
        }
        System.out.println();
    }
}