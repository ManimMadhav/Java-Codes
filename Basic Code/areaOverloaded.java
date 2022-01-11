public class Test{
    public static void main(String[] args){
        System.out.println(area(2.5));
        System.out.println(area(2.5,5.6));

    }

    public static double area(double radii) {
        double ar = 3.1428 * radii * radii;
        return ar;
    }

    public static double area(double len, double br) {
        double ar = len*br;
        return ar;
        
    }
}
