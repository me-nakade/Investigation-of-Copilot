import java.util.Random;
public class sample06{
    public static void main(String[] args){
        //明日の天気を勘で予想する
        Random random = new Random();
        int weatherNumber = random.nextInt(5); 
        System.out.println("明日の天気を勘で予想します。");
        if(weatherNumber == 0){ 
            System.out.println("多分晴れ");
        }else if(weatherNumber == 1){ 
            System.out.println("多分曇り");
        }else if(weatherNumber == 2){ 
            System.out.println("多分雨");
        }else if(weatherNumber == 3){
            System.out.println("多分雪");
        }else{
            System.out.println("多分みぞれ");
        }
    }
}