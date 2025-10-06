
public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "Calcutta Boys";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        Student s3 = new Student();
        s3.schoolName = "ABC"; //this will change the schoolname for all other objects as it is static
    }
}


class Student{
    String name;
    int rollNo;

    static String schoolName;

    String getName(String name) {
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }
}
