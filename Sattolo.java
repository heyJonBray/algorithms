import java.util.Arrays;

/**
 * Sattolo cycling algorithm which reads a finite sequence of N data points
 * and generates a uniformly random cycle of length 'n' using Math.random()
 * 
 * Based on Sandra Sattolo's 1986 algorithm
 * 
 * Created by Jon Bray on 7-16-2019
 */
 
 public class Sattolo {
    
  // cycle function to swap two elements of data[] array
  public static void cycle(Object[] data) {
    int n = data.length;
  
    for (int i = n; i > 1; i--) { // cycle through array of length 'n' until all items shuffled (i--)
      int r = (int) (Math.random() * (i-1)); // generate random int 'r' uniformly with range [0, i-1)
      Object swap = data[r]; // initialize randomly chosen object to swap in data[]
      data[r] = data[i-1];
      data[i-1] = swap; // populate data[] with randomly shuffled array
    }

  }

  /**
   * Read and shuffle input sequence, output shuffled array
   */
  public static void main(String[] args) {
    String[] data = {"0", "1", "2", "3", "4", "5", "6"};
    cycle(data);
    System.out.println(Arrays.toString(data));
    
  }
 }
