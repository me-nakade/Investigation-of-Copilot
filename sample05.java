import java.io.*;
public class sample05{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        System.out.print("��������͂��Ă�������(1~12)�F");
        int month = Integer.parseInt(br.readLine());

        //���͂��ꂽ���̓�����\��

        //���͂��ꂽ���̓��{����\��
        monthJapan(month);
    }
    
    public static void monthJapan(int m){
        String[] japaneseMonthNames = {"�r��", "�@��", "�퐶", "�K��", "�H��", "������", "����", "�t��", "����", "�_����", "����", "�t��"};

        if(m > 0 && m < 13){
            System.out.println(m + "����" + japaneseMonthNames[m-1] + "�ł��B");
        }else{
            System.out.println("1����12�̐�������͂��Ă��������B");
        }
    }
}