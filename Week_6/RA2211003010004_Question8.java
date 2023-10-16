interface Flyable {
    void fly_obj();
}
class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("The spacecraft RA2211003010004_Spacecraft is flying.");
    }
}
class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("The airplane RA2211003010004_Airplane is flying.");
    }
}
class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("The helicopter RA2211003010004_Helicopter is flying.");
    }
}
public class RA2211003010004_Question8{
    public static void main(String[] args) {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.fly_obj();

        Airplane airplane = new Airplane();
        airplane.fly_obj();

        Helicopter helicopter = new Helicopter();
        helicopter.fly_obj();
    }
}