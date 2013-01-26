package cucumber.poker;

/**
 * User: T.Ebina
 * Date: 2013/01/19
 * Time: 18:41
 */
public class PokerGame {
    private Status status = Status.INIT;
    private Hands hands = null;

    public void setUp(Card... cards) {
        if (status != Status.INIT) throw new IllegalStateException();
        hands = new Hands(cards);
        this.status = Status.READY;
    }

    public void noChange() {
        if (status != Status.READY) throw new IllegalStateException();
        // do nothing
        this.status = Status.CHANGED;
    }

    public Pat pat() {
        if (status != Status.CHANGED) throw new IllegalStateException();
        return Pat.make(hands);
    }

    private enum Status {
        INIT, READY, CHANGED
    }
}
