
public class methods{
    public static void main(String[] args){
       
        double[] answerArray = calcFeetAndInchesToCentimeters(19.76, 5.64);
        System.out.println("Inch to cm is "+ answerArray[0]);
        System.out.println("Feet to cm is "+ answerArray[1]);

    }
    
    static double[] calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet<0 && (inches<0 && inches>12)){
            return null;
        }
        else{
            double inchToCm = inches * 2.54d;
            double feetToCm = inchToCm * 12;

            double[] array = new double[2];
            array[0] = inchToCm;
            array[1] = feetToCm;
            return array;
        }
    }
}
