import java.util.Scanner;

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printPerson() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

public class RA2211003010004_Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name for first person:");
        String RA2211003010004_name1 = scanner.nextLine();
        System.out.println("Enter age for first person:");
        int RA2211003010004_age1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name for second person:");
        String RA2211003010004_name2 = scanner.nextLine();
        System.out.println("Enter age for second person:");
        int RA2211003010004_age2 = scanner.nextInt();
        Person RA2211003010004_person1 = new Person(RA2211003010004_name1, RA2211003010004_age1);
        Person RA2211003010004_person2 = new Person(RA2211003010004_name2, RA2211003010004_age2);
        RA2211003010004_person1.printPerson();
        RA2211003010004_person2.printPerson();
        scanner.close();
    }
}
