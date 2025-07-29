public class CS61B {
    public static String university;
    public String semester;
    public  CS61BStudent[] students;
    int capacity;

    public CS61B(int capacity, CS61BStudent[] signups, String semester){
        this.semester = semester;
        this.capacity = capacity;
        this.students = signups;
    }

    public int makeStudentsWatchLectureLecture(){
        int total = 0;
        for(int i =0; i < capacity; i++){
            boolean watched = students[i].watchLecture();
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
        capacity = newCapacity;
    }
}
