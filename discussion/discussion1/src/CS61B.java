public class CS61B {
    public static String university;
    public String semester;
    public  CS61BStudent[] students;

    public CS61B(int capacity, CS61BStudent[] signups, String semester){
        this.semester = semester;
        this.students = new CS61BStudent[capacity];
        for (int i = 0; i < capacity; i++) {
            this.students[i] = signups[i];
        }
    }

    public int makeStudentsWatchLectureLecture(){
        int total = 0;
        for(CS61BStudent student : students){
            boolean watched = student.watchLecture();
            if(watched){
                total += 1;
            }
        }
        return total;
    }

    public static void changeUniversity(String newUniversity){
        university = newUniversity;
    }

    public void changeCapacity(int newCapacity){

    }
}
