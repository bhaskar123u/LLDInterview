public class EmployeeBuilder {
    protected long id;
    protected String firstName;
    protected String lastName;
    // Optional parameters
    protected int age;
    protected String email;
    protected Address address;
    // Constructor for required parameters only
    public EmployeeBuilder(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public EmployeeBuilder withOptionalAge(int age){
        this.age = age;
        return this;
    }
    public EmployeeBuilder withOptionalEmail(String email){
        this.email = email;
        return this;
    }
    public EmployeeBuilder withOptionalAddress(Address address){
        this.address = address;
        return this;
    }
    public Employee build(){
        if(validateRequiredParamaters() == true)
            return new Employee(this);
        else
            return null;
    }
    private boolean validateRequiredParamaters(){
        // some validation actions
        return true;
    }
}