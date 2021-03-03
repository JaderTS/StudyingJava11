package br.com.training.polymorphism;

import br.com.training.inheritance.Person;

public class Classroom extends Person {
    private int class_number;

    public Classroom(String name, int birth_year, String e_mail, int class_number) {
        super(name, birth_year, e_mail);
        this.class_number = class_number;
    }

    public int getClass_number() {
        return this.class_number;
    }

    public void setClass_number(int class_number) {
        this.class_number = class_number;
    }

    @Override
    public String toString() {
        return super.toString() + ", study in the classroom with number " + class_number;
    }

    public void message(){
        System.out.println("\nI'm just working with overloading...");
    }

    public void message(String msg){
        System.out.println(msg);
    }
}
