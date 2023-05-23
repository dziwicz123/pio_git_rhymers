package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int INITIAL_TOTAL = -1;
    private static final int ERROR_VALUE = -1;
    private static final int MAX_TOTAL = MAX_SIZE-1;
    private final int[] NUMBERS = new int[MAX_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = INITIAL_TOTAL;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == INITIAL_TOTAL;
        }
        
            public boolean isFull() {
                return total == MAX_TOTAL;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return ERROR_VALUE;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return ERROR_VALUE;
                        return NUMBERS[total--];
                    }

}
