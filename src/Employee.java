public class Employee {
    private String name;
    private String position;
    private String email;
    private int telephone;
    private float salary;
    private int age;

    public Employee(String name, String position, String email, int telephone, float salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String Info() {
        return  String.format("Employee-{name=%s, position=%s, email=%s, telephone=%s, salary=%s, age=%s}"
                , name, position, email, telephone, salary, age);
    }
}
