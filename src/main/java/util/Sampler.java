/**
 * 
 */
package util;

import controller.DataLoader;
import model.DataModel;

/**
 * This class samples data based on ratings or users.
 * 
 * @author FBM
 */
public class Sampler {

    /**
     * @param args
     */
    public static
            void main(
                    String[] args)
    {
        final DataLoader loader = new DataLoader();
        final DataModel dataModel = loader.readData();
        dataModel.printStatistic();

        final DataModel sampledDataModel = dataModel.sampleRatings(20);
        //final DataModel sampledDataModel = dataModel.sampleUsers(20);
        sampledDataModel.printStatistic();
        sampledDataModel.writeRatingsToFile("20%RatingsSampledByRating.csv");
        //sampledDataModel.writeRatingsToFile("20%RatingsSampledByUser.csv");
    }

}
