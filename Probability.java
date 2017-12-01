
public class Probability implements ProbabilityCalc, Comparable<Probability>
{
    private double prob;
    private int sampleSpace; 
    private int favorable;
    
    public Probability(int fvrbl, int samp) {
        this.favorable = fvrbl;
        this.sampleSpace = samp;
        prob = ((double)fvrbl)/samp;
    }
    
    public double getProb() {
        return prob;
    }
    
    public double probabilityAND(Probability p2) {
        return this.prob * p2.prob;
    }
    
    public double probabilityOR(Probability p2, double overlap) {
        return ((this.prob) + (p2.prob)) - overlap;
    }
    
    public int compareTo(Probability other) {
        if(this.prob > other.prob) {
            return 1;
        }
        else if(this.prob < other.prob) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
