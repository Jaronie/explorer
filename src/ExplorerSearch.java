import java.util.ArrayList;
import java.util.List;

public class ExplorerSearch {

    /**
     * Returns how much land area an explorer can reach on a rectangular island.
     * 
     * The island is represented by a rectangular int[][] that contains
     * ONLY the following nunbers:
     * 
     * '0': represents the starting location of the explorer
     * '1': represents a field the explorer can walk through
     * '2': represents a body of water the explorer cannot cross
     * '3': represents a mountain the explorer cannot cross
     * 
     * The explorer can move one square at a time: up, down, left, or right.
     * They CANNOT move diagonally.
     * They CANNOT move off the edge of the island.
     * They CANNOT move onto a a body of water or mountain.
     * 
     * This method should return the total number of spaces the explorer is able
     * to reach from their starting location. It should include the starting
     * location of the explorer.
     * 
     * For example
     * 
     * @param island the locations on the island
     * @return the number of spaces the explorer can reach
     */
    public static int reachableArea(int[][] island) {
        // Implement your method here!
        // Please also make more test cases
        // I STRONGLY RECOMMEND testing some helpers you might make too

        // tracking the starter using a helper function
        int[] start = explorerLocation(island);

    }



    /**
     * 
     * @param island int[][] parameter for matrix
     * @return the int [row][column] representing the location of the explorer in the value of 0
     * @throws IllegalArgumentException if the explorer isn't found
     */

    public static int[] explorerLocation(int[][] island) {
        for(int row = 0; row < island.length; row++){ // loop rows
            for(int column = 0; column < island[row].length; column++){ // loop columns by using row length
                if(island[row][column] == 0){
                    return new int[] {row,column};
                }
            }
        }

        throw new IllegalArgumentException("Explorer not found or doesn't exist.");
    }
}
