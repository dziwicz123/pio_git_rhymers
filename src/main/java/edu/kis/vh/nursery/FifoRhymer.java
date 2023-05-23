package edu.kis.vh.nursery;

/**
 * FifoRhymer is a class taht extands DefaultCountingOutRhymer and overrides countOut method.
 */
public class FifoRhymer extends DefaultCountingOutRhymer {
    /**
     * temp is an instanc of a DefaultCountingOutRhymer class used in countOut method.
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
    
    @Override
    public int countOut() {
        while (!callCheck())
            
        temp.countIn(super.countOut());
        
        int ret = temp.countOut();
        
        while (!temp.callCheck())
            
        countIn(temp.countOut());
        
        return ret;
    }
}
