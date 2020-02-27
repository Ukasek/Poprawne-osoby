import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public static Person createPerson() throws NameUndefinedException, IncorrectAgeException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź imię: ");
        String firstName = scanner.nextLine();
        if (firstName == null || firstName.length() < 3) {
            throw new NameUndefinedException("Nie wprowadzono imienia!");
        }

        System.out.println("Wprowadź nazwisko: ");
        String lastName = scanner.nextLine();
        if (lastName == null || lastName.length() < 3) {
            throw new NameUndefinedException("Nie wprowadzono imienia! ");
        }

        System.out.println("Wprowadź wiek: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age < 0) {
            throw new IncorrectAgeException("Wprowadzony wiek jest za mały! ");
        }

        System.out.println("Wprowadź pesel: ");
        String pesel = scanner.nextLine();
        scanner.close();
        return new Person(firstName, lastName, age, pesel);
    }

    @Override
    public String toString() {
        return "Osoba: " + firstName + " "
                + lastName + ", " +
                "wiek: " + age +
                " nr. pesel: " + pesel;
    }
}

