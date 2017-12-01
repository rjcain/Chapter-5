
/**
 * Write a description of class ProbDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProbDriver
{
   public static void main() {
       Probability prob1 = new Probability(8, 10);
       Probability prob2 = new Probability(6, 10);
       System.out.println("AND Prob: " + prob1.probabilityAND(prob2));
       System.out.println("OR Prob: " + prob1.probabilityOR(prob2, 0.2));
    }
}
