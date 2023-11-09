public class Sportsman {
    private static int bestScore;
    private static String nameWinner;
    private String name;
    private int score;
    public  Sportsman(String name, int score){
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public static String getNameWinner() {
        return nameWinner;
    }

    public static int getBestScore() {
        return bestScore;
    }
    public static void updateBestScore(int newScore, String name){
        if(bestScore < newScore){
            bestScore = newScore;
            nameWinner = name;
        }
    }
}
