import java.util.ArrayList;
import java.util.Scanner;

public class PlayerSelection {
    private ArrayList<Player> mPlayers;
    private Scanner mScanner = new Scanner(System.in);

    /**
     * Print the selection command list.
     */
    public void PrintMenu() {
        System.out.println("Commands:");
        System.out.println("    A   -   Add player.");
        System.out.println("    B   -   Display two best batmans.");
        System.out.println("    C   -   Display two best bowlers.");
        System.out.println("    D   -   Display the best keeper.");
        System.out.println("    V   -   View all players.");
        System.out.println();
    }

    /**
     * Add a new player to the list.
     */
    public void AddPlayer() {
        System.out.print("Enter player name: ");
        String name = mScanner.nextLine();

        System.out.print("Enter the number of years the players have played: ");
        int years = Integer.parseInt(mScanner.nextLine());

        System.out.print("Enter the player's type (batting, bowling, keeping): ");
        String type = mScanner.nextLine();
        Player.Type pType;

        // Validate the type.
        {
            if (type.equalsIgnoreCase("batting"))
                pType = Player.Type.BATTING;
            else if (type.equalsIgnoreCase("bowling"))
                pType = Player.Type.BOWLING;
            else
                pType = Player.Type.KEEPING;
        }

        System.out.print("Enter player's statistics: ");
        double stat = Double.parseDouble(mScanner.nextLine());

        mPlayers.add(new Player(name, years, pType, stat));
    }

    /**
     * Display all player information to the console.
     */
    public void ShowAllPlayers() {
        for (Player iterator : mPlayers) {
            System.out.println(iterator);
        }
    }

    /**
     * Sort and print out the two best batsmans.
     */
    public void BestBatsmans() {

    }

    /**
     * Sort and print out the best bowlers.
     */
    public void BestBowlers() {

    }

    /**
     * Iterate and find the best keeper.
     */
    public void BestKeeper() {

    }
}