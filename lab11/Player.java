package p2;

import java.util.Scanner;

/**
 * <p>Player.</p>
 * 
 * @author A00983479
 * @version 13/04/2017
 */
public class Player {
    private String name;
    private String team;
    private int jerseyNumber;
    
    /**
     * <p>Reads in the name, team and 
     * jersey number of Player object.</p>
     */
    public void readPlayer() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("Team: ");
        team = scan.nextLine();
        System.out.print("Jersey number: ");
        jerseyNumber = scan.nextInt();
        
        scan.close();
    }
    
    public String getName() {
        return name;
    }
    
    public String getTeam() {
        return team;
    }
    
    public int getJersey() {
        return jerseyNumber;
    }

    /** 
     * <p>Hashcode.</p>
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + jerseyNumber;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((team == null) ? 0 : team.hashCode());
        return result;
    }

    /** 
     * <p>Equals method.</p>
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Player)) {
            return false;
        }
        Player other = (Player) obj;
        if (jerseyNumber != other.jerseyNumber) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (team == null) {
            if (other.team != null) {
                return false;
            }
        } else if (!team.equals(other.team)) {
            return false;
        }
        return true;
    }
}
