import javax.sql.rowset.spi.SyncResolver;

public class GuessTheWordLevelTwo {
    public static void LevelTwo(){

        System.out.println("You are Now at Level Two ");
        System.out.println("Bonus of 10 points added to your score ");
        GuessTheWord.score+=10;
        System.out.println("New Score: " + GuessTheWord.score);
    }
}