public class methods{
    public static void main(String[] args){
      //another method
      System.out.println(getDuration(500, 57)); 

    }
    
    public static String getDuration(int minutes, int seconds){
        if (minutes<0 || (seconds<0 && seconds>59)){
            return "Invalid input.";
        }

        else{
            int hours = minutes/60;
            int min = minutes%60;

            return (hours+" Hours, "+min+" minutes, "+seconds+" seconds.");
        }
    }
}
