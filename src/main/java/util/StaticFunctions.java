package util;

import java.util.Random;

/**
 * A class that contains static methods.
 * The code based is from Recommneder101:
 * http://ls13-www.cs.tu-dortmund.de/homepage/recommender101/index.shtml
 */
public class StaticFunctions {
    private static Randomness rand = new Randomness();

    public static double ran_gaussian(double mean, double stdev) {
	if ((stdev == 0.0) || (Double.isNaN(stdev))) {
	    return mean;
	} else {
	    return mean + stdev * ran_gaussian();
	}
    }

    private static double ran_gaussian() {
	return rand.nextGaussian();
    }
    
    public static class Randomness {
        private final Random rand = new Random();
        double nextGaussian() {
            return rand.nextGaussian();
        }
    }
}
