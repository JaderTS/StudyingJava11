package br.com.training.inheritance;

import br.com.training.polymorphism.Classroom;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("João", 1986, "joao@gmail.com", "ABC123");

        Classroom classroom1 = new Classroom("João", 1986, "joao@gmail.com",123);

        System.out.println(student1);
        System.out.println(classroom1);
    }
}
