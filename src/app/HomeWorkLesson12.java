package app;
import app.models.Employee;
import app.models.Car;
public class HomeWorkLesson12 {
    public static void main(String[] args) {

        Employee Daria = new Employee(
                "Daria Polovneva",
                "student",
                "polovnevadd@gmail.com",
                664127229,
                15);

        System.out.println(Daria);

        Car car = new Car();
        car.start();
    }
}
