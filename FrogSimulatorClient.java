public class FrogSimulatorClient {
   public static void main(String[] args) {
      FrogSimulator frog = new FrogSimulator(30, 6);
      
      System.out.println(frog.simulate());
      System.out.println(frog.runSimulations(100));
      
   }
}