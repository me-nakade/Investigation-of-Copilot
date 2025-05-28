import java.util.Random;
public class sample06{
    public static void main(String[] args){
        //明日の天気を勘で予想する
        Random random = new Random();
        int weatherNumber = random.nextInt(5); 
        System.out.println("明日の天気を勘で予想します。");
        predictWeather(weatherNumber);
    }

    public static void predictWeather(int w){
        String[] weather = {"晴れ", "曇り", "雨", "雪", "みぞれ"};
        System.out.println("多分" + weather[w]);
    }
}