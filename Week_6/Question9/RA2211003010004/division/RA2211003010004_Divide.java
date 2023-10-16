package RA2211003010004.division;
public class RA2211003010004_Divide {
    public int divide(int RA2211003010004_a, int RA2211003010004_b) {
        if (RA2211003010004_b != 0) {
            return RA2211003010004_a / RA2211003010004_b;
        } else {
            System.out.println("Error! Dividing by zero is not allowed.");
            return 0;
        }
    }
}