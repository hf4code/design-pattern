package creational.builder;

public class APP {
    public static void main(String[] args) {
        User user = User.builder()
                .name("zyzy")
                .password("abc123456")
                .age(28)
                .build();

        System.out.println(user);
    }
}
