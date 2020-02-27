public class TestClass {
    public static void main(String[] args) {
        try {

            Person person = Person.createPerson();
            System.out.println(person.toString());

        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
