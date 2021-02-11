package br.com.training.inheritance;

public class Student extends Person {
    private String ra;

    public Student(String name, int bith_year, String e_mail, String ra) {
        super(name, bith_year, e_mail);
        this.ra = ra;
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return super.toString() + ", ra='" + ra + '\'';
    }
}
