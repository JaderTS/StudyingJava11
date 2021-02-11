package br.com.training.inheritance;

public abstract class Person {
    private String name;
    private int birth_year;
    private String e_mail;

    public Person(String name, int birth_year, String e_mail) {
        this.name = name;
        this.birth_year = birth_year;
        this.e_mail = e_mail;
    }

    public String getName() {
        return this.name;
    }

    public int getBirth_year() {
        return this.birth_year;
    }

    public String getE_mail() {
        return this.e_mail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
}
