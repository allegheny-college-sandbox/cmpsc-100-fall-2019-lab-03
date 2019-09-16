package crownparty;

/** This class implements a crown composition function.
 *
 * @author {YOUR NAME HERE}
 */
public class CrownComposition {
  
  
  /*
   * Replace this comment with a single-line comment explanation of why the variables
   * "densityGold" and "densitySilver" are represented as "final." Don't worry about
   * the "static" keyword: that's there just so they can exist outside the "main" method--
   * they're global constants, after all!
   */
  static final int densityGold = 20;
  static final int densitySilver = 10;
  
  /** This is the main entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // TODO Replace this comment with what the two lines below represent.
    int weightTotal = Integer.parseInt(args[0]);
    int volumeTotal = Integer.parseInt(args[1]);
    // TODO Implement the correct variable types throughout; integers? floats? doubles?
    // TODO Work the math out on paper; what kind of number do you see?
    int volumeGold;
    int volumeSilver;
    // TODO Only implement one volume equation and remove this comment.
    // TODO Convert these to percentages and remove this comment.
    int pctGold;
    int pctSilver;
    System.out.println(report(pctGold,pctSilver));
  }
  
  /** This returns percentage composition statement, if pcts are valid.
   *
   * @param pctGold The percentage of the crown that is gold.
   * @param pctSilver the percentage of the crown that is silver.
   */
  private static String report(float pctGold, float pctSilver) {
    // NOTDO Don't touch this.
    if (pctGold > 0 && pctSilver > 0) {
      return "The crown is " + Math.round(pctGold) / 1.0 + "% gold "
             + "and " + Math.round(pctSilver) / 1.0 + "% silver.";
    } else {
      return "That crown's made of other stuff, friend.";
    }
  }
}