import java.util.ArrayList;

public class PlayerSelection {
    private ArrayList<Player> mPlayers;

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
        mPlayers.add(new Player());
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