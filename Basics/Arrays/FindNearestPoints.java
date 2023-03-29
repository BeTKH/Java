import java.util.Scanner;

public class FindNearestPoints {

    // main
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");

        int numberOfPoints = input.nextInt();


        //create an array to store points
        double [][] points = new double[numberOfPoints][2];
        System.out.print("Enter "+numberOfPoints+" points : ");

        for (int i = 0; i < points.length ; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        // initialize the shortest points
        int p1 = 0;
        int p2 = 1;
        double shortestDistance = distanceBetweenPoints( points[p1][0], points[p1][1], points[p2][0], points[p2][1]);


        // compute distance for every two point
        for (int i = 0 ; i < points.length ; i++){
            for (int j = i +1 ; j < points.length ; j++ ){

                double distance = distanceBetweenPoints( points[i][0], points[i][1], points[j][0], points[j][1]);

                if ( shortestDistance > distance){
                    p1 = i;
                    p2 = j;

                    shortestDistance = distance;
                }
            }
        }

        // output the ressult
        System.out.println("The closest two points are ("+points[p1][0]+", "+points[p1][1]+") and ("+points[p2][0]+", "+points[p2][1]+")");
    }

    // method

    public static double distanceBetweenPoints( double x1, double y1, double x2, double y2){
        return Math.sqrt( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }


}