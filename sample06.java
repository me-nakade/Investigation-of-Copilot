import java.util.Random;
public class sample06{
    public static void main(String[] args){
        //�����̓V�C�����ŗ\�z����
        Random random = new Random();
        int wheatherNumber = random.nextInt(5);
        System.out.println("�����̓V�C�����ŗ\�z���܂��B");
        if(wheatherNumber == 0){
            System.out.println("��������");
        }else if(wheatherNumber == 1){
            System.out.println("�����܂�");
        }else if(wheatherNumber == 2){
            System.out.println("�����J");
        }else if(wheatherNumber == 3){
            System.out.println("������");
        }else if(wheatherNumber == 4){
            System.out.println("�����݂���");
        }else{
            System.out.println("�������J");
        }
    }
}