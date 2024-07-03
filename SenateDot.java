/**
 * In the world of Dota2, there are two parties: the Radiant and the Dire.

The Dota2 senate consists of senators coming from two parties. Now the Senate wants to decide on a change in the Dota2 game. The voting for this change is a round-based procedure. In each round, each senator can exercise one of the two rights:

Ban one senator's right: A senator can make another senator lose all his rights in this and all the following rounds.
Announce the victory: If this senator found the senators who still have rights to vote are all from the same party, he can announce the victory and decide on the change in the game.
Given a string senate representing each senator's party belonging. The character 'R' and 'D' represent the Radiant party and the Dire party. Then if there are n senators, the size of the given string will be n.

The round-based procedure starts from the first senator to the last senator in the given order. This procedure will last until the end of voting. All the senators who have lost their rights will be skipped during the procedure.

Suppose every senator is smart enough and will play the best strategy for his own party. Predict which party will finally announce the victory and change the Dota2 game. The output should be "Radiant" or "Dire".
 */

public class SenateDot {
    
    public String predictPartyVictory(String senate) {
        boolean[] eliminated = new boolean[senate.length()];

        int i = -1;
        // We know that an answer exists for sure. Hence starting with true while loop.
        while (true) {
            i = (i+1)%(senate.length());
            Character currSenate = senate.charAt(i);
            
            if (eliminated[i]) continue;
            
            // Find next opposite senate that is not eliminated by moving index 
            // to right. If right most is reached, put the index at the beginning of
            // the array index 0. Do this untill all non-eliminated senates are covered.
            int j = (i+1)%(senate.length());
            while (j != i && (currSenate == senate.charAt(j) || eliminated[j])) {         
                j = (j+1)%(senate.length());
            }

            // If we completed one full round without finding a non-eliminated opposite senate,
            // that means all opposite senates are eliminated. 
            if (j == i) {
                return currSenate == 'R' ? "Radiant" : "Dire";
            }

            // If the opposite senate is found, eliminate them.
             eliminated[j] = true;
        }
    }
}
