package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int initialTotalRejected = 0;
    int totalRejected = initialTotalRejected;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) totalRejected++;
        else super.countIn(in);
    }
}
