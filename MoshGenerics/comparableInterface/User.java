package MoshGenerics.comparableInterface;



public class User implements Comparable<User> {

    /**
     * Logic: compare user objects (by their points)
     *
     * this < o, return -1
     * this == o, return 0
     * this > o, return 1
     *
     * */

    private int points;

    // constructor
    public User(int points_){
        this.points = points_;
    }

    @Override
    public int compareTo(User otherUser) {

        if (points < otherUser.points)
            return -1;
        if (points== otherUser.points)
            return 0;

        return 1;

        // return points - otherUser.points; (short form)
    }

    @Override
    public String toString(){
        return "Points=" + points;
    }
}
