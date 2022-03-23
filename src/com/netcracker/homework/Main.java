package com.netcracker.homework;

import com.netcracker.homework.books.Author;
import com.netcracker.homework.books.Book;
import com.netcracker.homework.employees.Employee;
import com.netcracker.homework.figures.Circle;
import com.netcracker.homework.figures.Rectangle;
import com.netcracker.homework.points.MyPoint;
import com.netcracker.homework.points.MyTriangle;

import java.util.Arrays;

/**
 * @author Lalykin Kirill
 */
public class Main {
    public static void main(String[] args) {

        //Book
        System.out.println("------------Books-----------");
        Author[] authors = new Author[]{
                new Author("Howard Lovecraft","lovecraft@gmail.com",'m'),
                new Author("Howard Lovecraft2","lovecraft@gmail.com",'m')
        };
        Author[] authors2 = new Author[]{
                new Author("Ilia Ilf","Ilf@gmail.com",'m'),
                new Author("Evgeniy Petrov","Petrov@gmail.com",'m'),
                new Author("Temp Temp","Temp@gmail.com",'f')
        };
        Book book1 = new Book("Call of Cthulhu", authors,2000.0);
        Book book2 = new Book("One-story america", authors2,500.0,50000);
        //
        System.out.println(book1);
        System.out.println(book1.getPrice());
        System.out.println(book1.getName());
        System.out.println(book1.getQty());
        System.out.println(Arrays.toString(book1.getAuthors()));
        System.out.println(book1.getAuthorNames());
        /*  */
        System.out.println("------------------------------------");
        System.out.println(book2);
        System.out.println(book2.getPrice());
        System.out.println(book2.getName());
        System.out.println(book2.getQty());
        System.out.println(Arrays.toString(book2.getAuthors()));
        System.out.println(book2.getAuthorNames());
        //--------------------------------------------------------------------------------------
        //Points
        System.out.println("------------Points-----------");
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(3,4);
        MyPoint p3 = new MyPoint(5,6);
        System.out.println(p1);
        System.out.println(p1.distance(3,4));
        System.out.println(p1.distance(p3));
        System.out.println(p1.distance());
        MyTriangle t1 = new MyTriangle(1,4,6,3,4,4);
        MyTriangle t2 = new MyTriangle(p1,p2,p3);
        System.out.println(t1.getPerimeter());
        System.out.println(t2.getPerimeter());
        System.out.println(t1.getType());
        System.out.println(t2.getType());
        //--------------------------------------------------------------------------------------
        //Figures
        System.out.println("------------Figures-----------");
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(4,"pink");
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle2);
        System.out.println(circle2.getArea());
        System.out.println(circle3.getColor());
        System.out.println(circle3.getArea());
        System.out.println("------------------------------------");
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(1,4);
        System.out.println(rect1.getLength());
        System.out.println(rect1.getPerimeter());
        System.out.println(rect2.getLength());
        System.out.println(rect2.getPerimeter());
        //--------------------------------------------------------------------------------------
        //Employees
        System.out.println("------------Employees-----------");
        Employee employee = new Employee(1,"Kirill","Lalykin",10000);
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.getFirstName());
        System.out.println(employee.raiseSalary(80));
        System.out.println(employee);
    }
}
