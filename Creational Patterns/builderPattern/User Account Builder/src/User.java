public class User {

    // Required parameters
    private final String firstName;
    private final String lastName;
    private final String email;

    // Optional parameters
    private final String address;
    private final String phone;
    private final int age;

    private User(UserBuilder builder) {

        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;

    }

    public String getInfo() {
        String output = "";
        output += "First Name: " + firstName + "\n";
        output += "Last Name: " + lastName + "\n";
        output += "Email: " +  email + "\n";
        if (address != null) {
            output += "Address: " + address + "\n";
        }
        if (phone != null) {
            output += "Phone: " + phone + "\n";
        }
        if (age != 0){
            output += "Age: " + age + "\n";
        }
        return output;
    }

    public static class UserBuilder {

        // Required parameters
        private String firstName;
        private String lastName;
        private String email;

        // Optional parameters
        private String address;
        private String phone;
        private int age;

        public UserBuilder(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public UserBuilder address (String address) {
            this.address = address;
            return this;
        }

        public UserBuilder phone (String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder age (int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

}
