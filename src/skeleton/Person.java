package skeleton;

/**
 * Model an abstract person class.
 * 
 * @author your name
 *
 */
public abstract class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
