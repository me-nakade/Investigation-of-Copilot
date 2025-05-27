import java.io.*;
public class sample05{
    public static void main(String[] args)throws IOException{
        //“ü—Í‚³‚ê‚½ŒŽ‚Ì“ú–{–¼‚ð•\Ž¦
        monthJapan(month);
    }
    
    public static void monthJapan(int m){
        String[] japaneseMonthNames = {"–rŒŽ", "”@ŒŽ", "–í¶", "‰KŒŽ", "ŽHŒŽ", "…–³ŒŽ", "•¶ŒŽ", "—tŒŽ", "’·ŒŽ", "_–³ŒŽ", "‘šŒŽ", "Žt‘–"};

        if(m > 0 && m < 13){
            System.out.println(m + "ŒŽ‚Í" + japaneseMonthNames[m-1] + "‚Å‚·B");
        }else{
            System.out.println("1‚©‚ç12‚Ì”Žš‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
        }
    }
}