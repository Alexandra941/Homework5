package kalashnikova;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String telephone;
    private BigDecimal salary;
    private int age;

    public Employee(String name, String position, String email, String telephone, BigDecimal salary, int age) {
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

    public void printInfo() {
        System.out.println("Имя сотрудника: " + name + ", должность: " + position + ", email адрес: " + email +
                ", номер телефона: " + telephone + ", зарплата: " + salary + ", возраст: " + age );
    }
}
