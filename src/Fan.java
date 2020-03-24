public class Fan {
    final byte SLOW = 1;
    final byte MEDIUM = 2;
    final byte FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private int radius = 5;
    private String color = "blue";

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    public Fan(){}

    @Override
    public String toString(){
        if(this.on){
            return "color = " + this.color +", speed = " + this.speed + ", radius = " + this.radius + ", fan is on.";
        } else {
            return "color = " + this.color +", speed = " + this.speed + ", radius = " + this.radius + ", fan is off.";
        }
    }
}