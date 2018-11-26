package creational.builder;

public class User {
    private String name;
    private String password;
    private String nickName;
    private int age;

    private User(String name, String password, String nickName, int age){
        this.name = name;
        this.password = password;
        this.nickName = nickName;
        this.age = age;
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String name;
        private String password;
        private String nickName;
        private int age;

        private UserBuilder(){

        }

        public UserBuilder name(String name){
            this.name = name;
            return this;
        }

        public UserBuilder password(String password){
            this.password = password;
            return this;
        }

        public UserBuilder nickName(String nickName){
            this.nickName = nickName;
            return this;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public User build(){
            if (name == null || password == null){
                throw new RuntimeException("用户名和密码必填");
            }
            if (age <= 0 || age >= 150){
                throw new RuntimeException("年龄不合法");
            }
            if (nickName == null){
                nickName = name;
            }
            return new User(name, password, nickName, age);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                '}';
    }
}
