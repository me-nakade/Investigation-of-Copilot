import java.util.Random;
public class sample06{
    public static void main(String[] args){
        //�����̓V�C�����ŗ\�z����
        Random random = new Random();
        int weatherNumber = random.nextInt(5); 
        System.out.println("�����̓V�C�����ŗ\�z���܂��B");
        if(weatherNumber == 0){ 
            System.out.println("��������");
        }else if(weatherNumber == 1){ 
            System.out.println("�����܂�");
        }else if(weatherNumber == 2){ 
            System.out.println("�����J");
        }else if(weatherNumber == 3){
            System.out.println("������");
        }else{
            System.out.println("�����݂���");
        }
    }
}