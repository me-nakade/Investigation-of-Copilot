import java.util.Random;
public class sample06{
    public static void main(String[] args){
        //明日の天気を勘で予想する
        Random random = new Random();
        int wheatherNumber = random.nextInt(5);
        System.out.println("明日の天気を勘で予想します。");
        if(wheatherNumber == 0){
            System.out.println("多分晴れ");
        }else if(wheatherNumber == 1){
            System.out.println("多分曇り");
        }else if(wheatherNumber == 2){
            System.out.println("多分雨");
        }else if(wheatherNumber == 3){
            System.out.println("多分雪");
        }else if(wheatherNumber == 4){
            System.out.println("多分みぞれ");
        }else{
            System.out.println("多分雷雨");
        }
    }
}