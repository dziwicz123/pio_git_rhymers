package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int size = 12;
    private static final int initialTotal = -1;
    private static final int maxTotal = 11;
    private final int[] NUMBERS = new int[size];

    private int total = initialTotal;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == initialTotal;
        }
        
            public boolean isFull() {
                return total == maxTotal;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return initialTotal;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return initialTotal;
                        return NUMBERS[total--];
                    }

}
