package kyu8;

public class PersonalizedMessage {
    static String greet(String name, String owner) {

        return (name.equalsIgnoreCase(owner))? "Hello boss" : "Hello guest";
    }
}
