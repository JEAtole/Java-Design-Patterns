public class ComApp {

    public static void main(String[] args) {

        User user1 = new User.UserBuilder(
                "Gojo", "Satoru", "gojo_satoru@gmail.com")
                .address("143 Jujutsu Kaisen World")
                .age(28)
                .phone("09123456789")
                .build();

        User user2 = new User.UserBuilder(
                "Conan", "Edogawa", "conan_edogawa@gmail.com")
                .age(7)
                        .build();

        User user3 = new User.UserBuilder(
                "Killua", "Zoldyck", "killua_zoldyck@gmail.com")
                .address("Kukuroo Mountain")
                        .build();

        System.out.println(user1.getInfo());
        System.out.println(user2.getInfo());
        System.out.println(user3.getInfo());

    }

}
