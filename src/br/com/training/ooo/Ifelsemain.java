package br.com.training.ooo;

public class Ifelsemain {
    public static void main(String[] args) {
        String name1 = "Maria";
        String name2 = "Pedro";
        String name3 = "Jussara";


        if (name1.length() == 5 && name2.length() == 6) {
            System.out.println(name1 + " & " + name2 + " are brothers");
        } else if (name1.length() == 5 && name3.length() == 5) {
            System.out.println(name1 + " & " + name3 + "are brothers");
        } else if (name2.length() == 5 && name3.length() == 5) {
            System.out.println(name1 + " & " + name3 + "are brothers");
        } else {
            System.out.println(name3 + " is not brother of the " + name1 + " and " + name2);
        }
    }
}
