package br.com.training.inheritance;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("João", 1986, "joao@gmail.com", "ABC123");

        System.out.println(student1.getName() + " birth on year "+ student1.getBirth_year() +
                ", have the e-mail: "+student1.getE_mail()+" and your register id is: "+student1.getRa());
    }
}
