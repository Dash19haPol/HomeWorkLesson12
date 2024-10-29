package app;

import app.models.*;

public class Employee {
    public static void main(String[] args) {
        FullName fullName = new FullName();
        fullName.setFullName("Polovneva Daria");
        System.out.println(fullName.getFullName());

        Position position = new Position();
        position.setPosition("Student");
        System.out.println(position.getPosition());

        Email email = new Email();
        email.setEmail("polovnevadd@gmail.com");
        System.out.println(email.getEmail());

        Phone phone = new Phone();
        phone.setPhone(066412722);
        System.out.println(phone.getPhone());

        Age age = new Age();
        age.setAge(15);
        System.out.println(age.getAge());

        Car car = new Car();
        car.start();



    }
}
