import java.util.Comparator;

public class ResultComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        if (p1.getResult() < p2.getResult())
            return -1;
        else if (p1.getResult() > p2.getResult())
            return 1;
        else if (p1.getLastName().equals(p2.getLastName()))
            return p1.getFirstName().compareTo(p2.getFirstName());
        else
            return p1.getLastName().compareTo(p2.getLastName());
    }
}