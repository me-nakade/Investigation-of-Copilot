import java.io.*;
public class sample05{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        System.out.print("��������͂��Ă�������(1~12)�F");
        int month = Integer.parseInt(br.readLine());

        //���͂��ꂽ���̓�����\��
        switch(month){
            case 1:
            System.out.println("1����31���ł��B");
            break;
            case 2:
            System.out.println("2����28���ł��B");
            break;
            case 3:
            System.out.println("3����31���ł��B");
            break;
            case 4:
            System.out.println("4����30���ł��B");
            break;
            case 5:
            System.out.println("5����31���ł��B");
            break;
            case 6:
            System.out.println("6����30���ł��B");
            break;
            case 7:
            System.out.println("7����31���ł��B");
            break;
            case 8:
            System.out.println("8����31���ł��B");
            break;
            case 9:
            System.out.println("9����30���ł��B");
            break;
            case 10:
            System.out.println("10����31���ł��B");
            break;
            case 11:
            System.out.println("11����30���ł��B");
            break;
            case 12:
            System.out.println("12����31���ł��B");
            break;
            default:
            System.out.println("1����12�̐�������͂��Ă��������B");
        }

        //���͂��ꂽ���̓��{����\��

    }
}