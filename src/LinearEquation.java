public class LinearEquation {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public LinearEquation (double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double roundHundredth(double input){
        return (double) ((int) (input * 100)) /100;
    }

    public String getPointCoordinates(){
        return("The coordinates of point 1 are (" + x1 + ", " + y1 + ") and the coordinates of point 2 are (" + x2 + ", " + y2 + ")");
    }

    public double getSlope(){
        return roundHundredth((y2-y1)/(x2-x1));
    }

    public double getYIntercept(){
        return roundHundredth(y1-getSlope()*x1);
    }

    public String getEquation(){
        if(getSlope()%1==0) {
            if(getSlope()==1){
                //slope is 1
                if(getYIntercept()==0) {
                    if(getYIntercept()%1==0) {
                        if(getYIntercept()<0){
                            return("y = x -" + Math.abs((int)getYIntercept()));
                        }else {
                            return ("y = x +" + (int) getYIntercept());
                        }
                    }else{
                        if(getYIntercept()<0){
                            return ("y = x - " + Math.abs(getYIntercept()));
                        }else {
                            return ("y = x +" + getYIntercept());
                        }
                    }
                }else{
                    return ("y = x ");
                }
            }else if (getSlope()==-1) {
                //slope is -1
                if(getYIntercept()==0) {
                    return ("y=-x");
                }else {
                    if(getYIntercept()%1==0){
                        if(getYIntercept()<0){
                            return ("y = -x - " + Math.abs(getYIntercept()));
                        }else {
                            return ("y = -x + " + (int) getYIntercept());
                        }
                    }else {
                        if(getYIntercept()<0){
                            return ("y = -x - " + Math.abs(getYIntercept()));
                        }else{
                            return ("y = -x + " + getYIntercept());
                        }
                    }
                }
            }else if (getSlope() == 0){
                //slope is 0
                if(getYIntercept()%1==0){
                    if(getYIntercept()<0){
                        return("y = -" + Math.abs(getYIntercept()));
                    }else {
                        return ("y = " + getYIntercept());
                    }
                }else {
                    if(getYIntercept()<0){
                        return("y = -" + Math.abs(getYIntercept()));
                    }else {
                        return ("y = " + getYIntercept());
                    }
                }
            }else{
                //slope is a whole number, not 1, 0, or -1
                if(getYIntercept()!=0) {
                    if(getYIntercept()%1==0){
                        if(getYIntercept()<0){
                            return("y = " + (int) getSlope() + "x - " + Math.abs((int) getYIntercept()));
                        }else {
                            return ("y = " + (int) getSlope() + "x + " + (int) getYIntercept());
                        }
                    }else {
                        if(getYIntercept()<0){
                            return "y = " + ((int) getSlope()) + "x - " + Math.abs(getYIntercept());
                        }else {
                            return "y = " + ((int) getSlope()) + "x + " + getYIntercept();
                        }
                    }
                }else{
                    return "y = " + ((int) getSlope()) + "x";
                }
            }
        }else{
            if(getSlope()<1) {
                //slope is in fraction form, and negative
                if(getYIntercept()==0) {
                    return "y = " + "-" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x";
                }else{
                    if(getYIntercept()%1==0){
                        if(getYIntercept()<0){
                            return "y = " + "-" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x - " + Math.abs((int) getYIntercept());
                        }else {
                            return "y = " + "-" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x + " + (int) getYIntercept();
                        }
                    }else {
                        if(getYIntercept()<0) {
                            return "y = " + "-" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x - " + Math.abs(getYIntercept());
                        }else{
                            return "y = " + "-" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x + " + getYIntercept();
                        }
                    }
                }
            }else{
                //slope is in fraction form, and positive
                if(getYIntercept()==0) {
                    return "y = " + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x";
                }else{
                    if(getYIntercept()%1==0) {
                        if(getYIntercept()<0){
                            return "y = " + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x - " + Math.abs((int) getYIntercept());
                        }else {
                            return "y = " + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x + " + (int) getYIntercept();
                        }
                    }else{
                        if(getYIntercept()<0){
                            return "y = " + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x - " + Math.abs(getYIntercept());
                        }else {
                            return "y = " + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x + " + getYIntercept();
                        }
                    }
                }
            }
        }
    }

    public double getDistance(){
        return roundHundredth(Math.sqrt(Math.pow(Math.abs(x2-x1),2)+Math.pow(Math.abs(y2-y1),2)));
    }

    public String lineInfo(){
        return(getPointCoordinates() + "\nThe equation of the line is " + getEquation() + "\nThe slope of the line is " + getSlope() + "\nThe y intercept is " + getYIntercept() + "\nThe points are " + getDistance() + " apart");
    }
}
