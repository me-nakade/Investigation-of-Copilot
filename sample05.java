import java.io.*;
public class sample05{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        System.out.print("数字を入力してください(1~12)：");
        int month = Integer.parseInt(br.readLine());

        //入力された月の日数を表示
        switch(month){
            case 1:
            System.out.println("1月は31日です。");
            break;
            case 2:
            System.out.println("2月は28日です。");
            break;
            case 3:
            System.out.println("3月は31日です。");
            break;
            case 4:
            System.out.println("4月は30日です。");
            break;
            case 5:
            System.out.println("5月は31日です。");
            break;
            case 6:
            System.out.println("6月は30日です。");
            break;
            case 7:
            System.out.println("7月は31日です。");
            break;
            case 8:
            System.out.println("8月は31日です。");
            break;
            case 9:
            System.out.println("9月は30日です。");
            break;
            case 10:
            System.out.println("10月は31日です。");
            break;
            case 11:
            System.out.println("11月は30日です。");
            break;
            case 12:
            System.out.println("12月は31日です。");
            break;
            default:
            System.out.println("1から12の数字を入力してください。");
        }

        //入力された月の日本名を表示

    }
}