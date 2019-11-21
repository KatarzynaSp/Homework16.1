import java.util.Comparator;

public class ResultComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        if (p1.getResult() < p2.getResult())
            return -1;
        else if (p1.getResult() > p2.getResult())
            return 1;
        else {
            LastNameComparator nameComparator = new LastNameComparator();
            return nameComparator.compare(p1, p2);
        }
    }
}