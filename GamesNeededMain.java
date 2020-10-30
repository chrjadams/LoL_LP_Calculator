import java.util.Scanner;



public class GamesNeededMain extends GamesNeeded{
    
    public static void main(String[] args) throws NoSuchFieldException{
    boolean keepGoing = true;
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Games Needed Calculator!");
    
    String inputStr;
    int inputInt;
    
    String currentRank;
    String goalRank;
    int currentLp;
    int totalLP; 
    double winRate;
    double lossRate;
    int gainLp;
    int loseLp;
    double doubleGamesNeeded; 
    double lpPerGame;
    
    GamesNeeded gamesNeeded = new GamesNeeded();
    
    
    
    while(keepGoing) {
        System.out.println("Enter your current rank (ex: Gold 4)");
            currentRank = scan.nextLine();
        System.out.println("Enter your current LP.");
        currentLp = Integer.parseInt(scan.nextLine());
            totalLP = gamesNeeded.totalLp(currentRank, currentLp);
        System.out.println("Enter your goal rank (ex: Diamond 4)");
            goalRank = scan.nextLine();
        System.out.println("Enter your average win rate as a decimal (ex .56 for 56% wr)");
         winRate = Double.parseDouble(scan.nextLine());
            if (winRate < .505){
                System.out.println("Sorry, but you cannot reasonably climb with this winrate! Focus on improving then try to climb!");
                keepGoing = false;
                break;
            }
            if (winRate > 1){
                System.out.println("Error, invalid winrate.");
                keepGoing = false;
                break;
            }
            lossRate = 1 - winRate;
        System.out.println("Enter your current LP gain per win.");
            gainLp = Integer.parseInt(scan.nextLine());
        System.out.println("Enter your current LP gain per loss.");
            loseLp = Integer.parseInt(scan.nextLine());
        System.out.println("\n" + "-----------------------------" +"\n");
        System.out.println("Current rank: "+currentRank);
        System.out.println("Goal rank: "+goalRank);
            int goalLpTotal = gamesNeeded.totalLp(goalRank, 0);
        System.out.println("Goal LP: "+goalLpTotal);
        System.out.println("Current LP: "+currentLp);
        System.out.println("Total current LP: " + totalLP);
            int lpDiff = goalLpTotal - totalLP;
        System.out.println("LP difference: " +lpDiff);
        System.out.println("Current gain: +"+gainLp);
        System.out.println("Current lose: -"+loseLp);
        System.out.println("\n" + "-----------------------------" +"\n");
            double winsNeededInt = lpDiff / (double) gainLp;
        System.out.println("Wins needed NOT COUNTING PROMOS: "+Math.ceil(winsNeededInt));
            double winRateAsWhole = Math.round(winRate * 100);
            lpPerGame = (winRate * gainLp) - (lossRate * loseLp);
        System.out.println("Average lp gain @"+winRateAsWhole +"% winrate: " +lpPerGame+" LP");
            doubleGamesNeeded = Math.round(lpDiff / lpPerGame);
        System.out.println("Total games needed NOT COUNTING PROMOS @"+winRateAsWhole +"% winrate: "+doubleGamesNeeded);
        System.out.println("If you wish to try again, enter K. \nElse, enter any other key.");
            if (!scan.nextLine().equalsIgnoreCase("k")){
                System.out.println("Thank you for using my LP Calculator!"); 
                scan.close();
                keepGoing = false;
            }
}
}
}