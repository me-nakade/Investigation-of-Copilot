import java.util.Random;
public class Sample07 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 3;
        int b = random.nextInt(6); // 0����5�̃����_���Ȑ����𐶐�
        System.out.println("b�̒l�� " + b + " �ł��B");

        // a+b��5�ȏォ���肷��
        if (a + b >= 5) {
            System.out.println("a + b �� 5�ȏ� �ł��B");
        } else {
            System.out.println("a + b �� 5�ȏ� �ł͂���܂���B");
        }
    }
}