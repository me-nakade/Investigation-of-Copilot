import java.io.*;
/**
 * sample01�N���X�́A���[�U�[�����͂����������f�����ǂ����𔻒肷��v���O�����ł��B
 * �W�����͂��琮�����󂯎��A���̒l���f���ł���΁u�f���ł��v�A
 * �f���łȂ���΁u�f���łȂ��v�ƕ\�����܂��B
 */
public class sample01 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        System.out.print("��������͂��Ă��������F");
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
            System.out.println("�f���łȂ�");
        }else{
            System.out.println("�f���ł�");
        }
    }
}