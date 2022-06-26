package session2;

public class Student {
    private String name;
    private String javaLevel;
    private int yearsold;

    public void setName(String Lehrlingname){
        this.name = Lehrlingname;
    }

    public void setJavaLevel (String Levelofjava){
        this.javaLevel = Levelofjava;
    }

    public void setYearsold (int YearofBirth){
        this.yearsold = YearofBirth;
    }

    public void printDetails() {
        System.out.println(name + yearsold+ " Java skills level is " + javaLevel);
    }
        }