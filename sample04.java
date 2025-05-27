//0~1000までのフィボナッチ数列を表示する
import java.io.*;
public class sample04 {
    public static void main(String[] args)throws IOException{
        //BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        int cnt = 0;
        int n1 = 0;
        int n2 = 1;
        int f = 0;

        while(f <= 1000){
            //System.out.println("cnt="+cnt);
            if(cnt == 0 || cnt == 1){
                System.out.print(cnt+", ");
                cnt++;
                continue;
            }
            f = n1 + n2;
            
            if(f > 1000){
                break;
            }
            System.out.print(f+", ");
            n1 = n2;
            n2 = f;
            cnt++;
        }
    }
}