import java.io.*;
public class sample05{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        System.out.print("数字を入力してください(1~12)：");
        int month = 0;
        try {
            month = Integer.parseInt(br.readLine());
            if (month < 1 || month > 12) {
                System.out.println("1から12の数字を入力してください。");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("無効な入力です。数字を入力してください。");
            return;
        }

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
            break;
        }
        //入力された月の日本名を表示
        monthJapan(month);
    }
    
    public static void monthJapan(int m){
        String[] japaneseMonthNames = {"睦月", "如月", "弥生", "卯月", "皐月", "水無月", "文月", "葉月", "長月", "神無月", "霜月", "師走"};

        if(m > 0 && m < 13){
            System.out.println(m + "月は" + japaneseMonthNames[m-1] + "です。");
        }else{
            System.out.println("1から12の数字を入力してください。");
        }
    }
}