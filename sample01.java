import java.io.*;
/**
 * sample01クラスは、ユーザーが入力した数字が素数かどうかを判定するプログラムです。
 * 標準入力から整数を受け取り、その値が素数であれば「素数です」、
 * 素数でなければ「素数でない」と表示します。
 */
public class sample01 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        System.out.print("数字を入力してください：");
        int input = Integer.parseInt(br.readLine());
        int cnt = input-1;
        int flag = 0;

        if(input == 1){
            flag = 1;
        } else {
            while(cnt > 1){
                if(input % cnt == 0){
                    //System.out.println(input+" "+cnt);
                    flag = 1;
                    break;
                }
                cnt--;
            }
        }

        if(flag == 1){
            System.out.println("素数でない");
        }else{
            System.out.println("素数です");
        }
    }
}