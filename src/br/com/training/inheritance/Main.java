package br.com.training.inheritance;

import br.com.training.polymorphism.Classroom;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jo�o", 1986, "joao@gmail.com", "ABC123");

        Classroom classroom1 = new Classroom("Jo�o", 1986, "joao@gmail.com",123);

        classroom1.message();
        classroom1.message("My message is...");

        System.out.println("\n"+student1);
        System.out.println(classroom1);


    }
}
