import java.util.Optional;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final Insurance insurance;

    public Employee(String firstName, String lastName, Insurance insurance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.insurance = insurance;
    }

    public Employee(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Optional<Insurance> getInsurance() {
        return Optional.ofNullable(insurance);
    }
}
