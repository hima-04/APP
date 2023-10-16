class RA2211003010004_TrafficLight {
    private String RA2211003010004_color; 
    private int RA2211003010004_duration;
    public RA2211003010004_TrafficLight(String color, int duration) {
        RA2211003010004_color = color;
        RA2211003010004_duration = duration;
    }    
    public void changeColor(String newColor) {
        RA2211003010004_color = newColor;
    }
    public boolean isRed() {
        return RA2211003010004_color.equalsIgnoreCase("red");
    }
    public boolean isGreen() {
        return RA2211003010004_color.equalsIgnoreCase("green");
    }
    public String getColor() {
        return RA2211003010004_color;
    }
    public int getDuration() {
        return RA2211003010004_duration;
    }
}

public class RA2211003010004_Question2{
    public static void main(String[] args) {
        RA2211003010004_TrafficLight trafficLightRed = new RA2211003010004_TrafficLight("red", 30);
        System.out.println("Initial Red Traffic Light State:");
        System.out.println("Color: " + trafficLightRed.getColor());
        System.out.println("Duration: " + trafficLightRed.getDuration() + " seconds");
        
        if (trafficLightRed.isRed()) {
            System.out.println("The red traffic light is red.");
        } else if (trafficLightRed.isGreen()) {
            System.out.println("The red traffic light is green.");
        }

        RA2211003010004_TrafficLight trafficLightGreen = new RA2211003010004_TrafficLight("green", 30);
        System.out.println("\nInitial Green Traffic Light State:");
        System.out.println("Color: " + trafficLightGreen.getColor());
        System.out.println("Duration: " + trafficLightGreen.getDuration() + " seconds");

        if (trafficLightGreen.isRed()) {
            System.out.println("The green traffic light is red.");
        } else if (trafficLightGreen.isGreen()) {
            System.out.println("The green traffic light is green.");
        }

        trafficLightGreen.changeColor("yellow");
        
        System.out.println("\nUpdated Green Traffic Light State:");
        System.out.println("Color: " + trafficLightGreen.getColor());
        System.out.println("Duration: " + trafficLightGreen.getDuration() + " seconds");
        
        if (trafficLightGreen.isRed()) {
            System.out.println("The green traffic light is red.");
        } else if (trafficLightGreen.isGreen()) {
            System.out.println("The green traffic light is green.");
        }
    }
}