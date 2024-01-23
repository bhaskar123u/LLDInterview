public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    // Optional parameters
    private int age;
    private String email;
    private Address address;
    // ***** Note that employee is build from EmployeeBuilder object *****
    public Employee(EmployeeBuilder employeeBuilder) {
        this.id = employeeBuilder.id;
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;
        this.age = employeeBuilder.age;
        this.email = employeeBuilder.email;
        this.address = employeeBuilder.address;
    }
    // Getters and Setters as required
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email + ", address=" + address + "]";
    }
}