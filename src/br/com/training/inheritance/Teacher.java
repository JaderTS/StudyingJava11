package br.com.training.inheritance;

public class Teacher extends Person{
    private String teach;

    public Teacher(String name, int bith_year, String e_mail, String teach){
        super(name,bith_year,e_mail);
        this.teach=teach;
    }

    public String getTeach(){
        return this.teach;
    }

    public void setTeach(String teach){
        this.teach=teach;
    }
}
