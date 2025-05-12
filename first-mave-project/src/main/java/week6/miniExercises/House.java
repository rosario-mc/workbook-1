package week6.miniExercises;

public class House {
   private Bed bed;

   public House(){
       bed = new Bed();
   }

   public void goToSleep(){
       bed.sleep();
   }

}
