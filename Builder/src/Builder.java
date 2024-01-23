// Demonstration of builder design pattern
// problem : if a class has N instances, and we want a functionality where we can create object of that class using a subset of those instance,
// normally we may have to create 2^N-1 constructors
// https://medium.com/android-news/create-complex-object-at-run-time-with-builder-pattern-d425e6f4408e
public class Builder {
    public static void main(String[] args) {
        // start building a object with few parameters
        Employee employee = new EmployeeBuilder(1, "Bhaskar", "Sharan")
            .withOptionalEmail("bhaskar123u@gmail.com")
            .build();
        System.out.println(employee.toString());
    }
}
