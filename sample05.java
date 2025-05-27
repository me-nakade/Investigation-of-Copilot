import java.io.*;
public class sample05{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        System.out.print("数字を入力してください(1~12)");
        int month = Integer.parseInt(br.readLine());

        //入力された月の日数を表示

        //入力された月の日本名を表示

    }
}