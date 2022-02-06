package ru.geekbrains.lesson5;

public class Solution {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович", "менеджер", "ivanov_email@email.ru", "111-11-11", 1000, 21);
        employees[1] = new Employee("Петров Петр Петрович", "ст. менеджер", "petrov_email@email.ru", "222-22-22", 1500, 30);
        employees[2] = new Employee("Сидоров Сидр Сидрович", "руководитель отдела продаж", "sidorov_email@email.ru", "333-33-33", 3000, 41);
        employees[3] = new Employee("Иванова Иванка Ивановна", "секретарь","ivanka_email@email.ru", "444-44-44", 2000, 25);
        employees[4] = new Employee("Петрова Полина Петровна", "Руководитель", "email@email.ru", "555-55-55", 3000, 45);
        for (Employee emp : employees) {
            if(emp.getAge() > 40) {
                emp.info();
            }
        }

    }
}
