import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * ImageToGrayscale class
 */

public class ImageToGrayscale {

    public static void main(String[] args) throws Exception {

        // Define the input file (unprocessed image)
        File inputFile = new File("beach.png"); 

        // Define the output file (processed image)
        File outputFile = new File("beach_grayscale.png");

        // Read the input file
        BufferedImage image = ImageIO.read(inputFile); 

        // Convert the image to grayscale using the convertToGrayscaleConcurrently() method
        // Also measure how long it takes to process the image
        long startTime2 = System.currentTimeMillis();
        convertToGrayscaleConcurrently(image, 9);
        ImageIO.write(image, "png", outputFile);
        long endTime2 = System.currentTimeMillis();
        long totalTime2 = endTime2 - startTime2;
        System.out.println("Time taken (multi thread): " + totalTime2 + " milliseconds.");
        
        /**
         * Results:
         * 1 threads: 3196 ms
         * 2 threads: 2899 ms
         * 3 threads: 2891 ms
         * 4 threads: 2977 ms
         * 5 threads: 2683 ms
         * 6 threads: 2931 ms 
         * 7 threads: 2576 ms
         * 8 threads: 2626 ms
         */
    }

    /**
     * convertToGrayscaleConcurrently() -converts an image to grayscale (concurrently)
     * @param image
     * @param numberOfThreads
     * @throws InterruptedException
     */
                                                      // 500 pixels height          // 2
    private static void convertToGrayscaleConcurrently(BufferedImage image, int numberOfThreads) throws InterruptedException {
        int heightPerThread = image.getHeight() / numberOfThreads;
        GrayscaleConverterThread[] threads = new GrayscaleConverterThread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            
            // Thread 0 -> 0 * 2500 = 0
            // Thread 1 -> 1 * 2500 = 2500
            int startY = i * heightPerThread;

            // Thread 0 -> 0 + 2500
            // Thread 1 -> 2500 + 2500
            int endY = startY + heightPerThread;

            threads[i] = (new GrayscaleConverterThread(image, startY, endY));
            threads[i].start();
        }
        for (GrayscaleConverterThread thread : threads) {
            thread.join();
        }     
    }
}
