package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int size = 12;
    public static final int initialTotal = -1;
    private final int[] NUMBERS = new int[size];

    public int total = initialTotal;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == -1;
        }
        
            public boolean isFull() {
                return total == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return -1;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return -1;
                        return NUMBERS[total--];
                    }

}
