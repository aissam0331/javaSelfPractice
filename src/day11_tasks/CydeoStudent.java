package day11_tasks;

public class CydeoStudent {
    public String name;
    public int age;
    public int id;
    public char grade;
    public int batchNumber;
    public int groupNumber;
    public static String SchoolName;
    public static String ProgrammingLanguage;

    public CydeoStudent(String name, int age, int id, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;

    }
    public void study (){
        System.out.println ( name +" " + "is studying");
    }
    public void attendClass(){
        System.out.println ( name + " " + " is attending the live class ");
    }
    public static void schoolNamee(){
        SchoolName = "Cydeo";
        System.out.println ("School name :" + SchoolName );
    }
    public static void programmingLanguage(){
        ProgrammingLanguage = "Java";
        System.out.println ("Programming language : " + ProgrammingLanguage );
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}


