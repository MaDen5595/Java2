package Classes;

public class Ball {
    private double x;
    private double y;
    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ball(){
        this.x = 0.0;
        this.y = 0.0;
    }
    public double getX(){return this.x;}
    public void setX(double x){this.x = x;}
    public double getY(){return this.y;}
    public void setY(double y){this.y = y;}
    public void setXY(double x, double y){
        setX(x);
        setY(y);
    }
    public void move(double xDisp, double yDisp){
        this.x = this.x + xDisp;
        this.y = this.y + yDisp;
    }
    public String toString(){
        return "Ball{X: " + x + ", Y: " + y + "}";
    }
}
