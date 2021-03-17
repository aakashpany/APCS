import java.util.Random;

public class FrogSimulator {
   private int goalDistance;
   private int maxHops;
   
   public FrogSimulator(int dist, int numHops) {
      this.goalDistance = dist;
      this.maxHops = numHops;
   }
   
   private int hopDistance() {
   return (int) (Math.random() * 10) + 1 ;
   }
   
   public boolean simulate() {
      int totalDistance = 0;
      for (int k = 0; k <= maxHops; k++) {
         totalDistance += hopDistance();
      }
      
      if(totalDistance >= this.goalDistance) {
         return true;
      }
      
      else {
         return false;
      }
   }
   
   public double runSimulations(int num) {
      int successSimulations = 0;
      for (int k = 0; k <= num; k++) {
         if (simulate() == true) {
            successSimulations++;
         }
      }
      
      return (double)successSimulations/num;
   }
}