public class CS61BStudent {
    public int idNumber;
    public int grade;
    public static String instructor = "Hug";

    public CS61BStudent(int idNumber){
        this.idNumber = idNumber;
        this.grade = 100;
    }

    public boolean watchLecture(){
        return true;
    }

    public static String getInstructor(){
        return instructor;
    }
}
