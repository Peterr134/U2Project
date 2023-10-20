import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Please input coordinates in this format: (x,y)");
        System.out.print("Enter coordinate 1: ");
        String coord1 = scanner.nextLine();
        double x1 = Double.parseDouble(coord1.substring(1,coord1.indexOf(",")));
        double y1 = Double.parseDouble(coord1.substring(coord1.indexOf(",")+1,coord1.indexOf(")")));
        System.out.print("Enter coordinate 2: ");
        String coord2 = scanner.nextLine();
        double x2 = Double.parseDouble(coord2.substring(1,coord2.indexOf(",")));
        double y2 = Double.parseDouble(coord2.substring(coord2.indexOf(",")+1,coord2.indexOf(")")));
        System.out.println();
        if(x1==x2){
            System.out.println("That line's slope is incompatable with this calculator");
            System.exit(1);
        }
        LinearEquation lineq = new LinearEquation(x1,y1,x2,y2);
        System.out.println(lineq.lineInfo());
        System.out.println();
        System.out.print("Enter a value for X: ");
        x1 = scanner.nextDouble();
        System.out.println("This point on the line is (" + x1 + ", " + lineq.roundHundredth(x1*lineq.getSlope()+ lineq.getYIntercept()) + ")");
    }
}
