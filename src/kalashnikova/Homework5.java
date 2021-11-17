package kalashnikova;

import java.math.BigDecimal;
import java.util.Arrays;

public class Homework5 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee("Иванов Иван Иванович",
                        "Электрик",
                        "ivanov@ivan.ru",
                        "+7 123 456 78 90",
                        new BigDecimal("100.02"),
                        55),
                new Employee("Калашникова Александра Николаевна",
                        "Жук",
                        "kalashnokpva@alexa.ru",
                        "+7 967 455 11 33",
                        new BigDecimal("0.02"),
                        26),
                new Employee("Маренников Денис Александрович",
                        "Пивозавр",
                        "maren@kit.ru",
                        "+7 654 456 52 90",
                        new BigDecimal("0.01"),
                        27),
                new Employee("Уткин Павел Динисович",
                        "Охотник",
                        "utca@jir.ru",
                        "+7 123 745 78 24",
                        new BigDecimal("40.02"),
                        40),
                new Employee("Кошкин Максим Викторович",
                        "Рыбак",
                        "max@kot.ru",
                        "+7 481 354 25 90",
                        new BigDecimal("60.07"),
                        60)
        };

        Arrays.stream(employees).filter(e -> e.getAge() > 40).forEach(Employee::printInfo);
    }
}