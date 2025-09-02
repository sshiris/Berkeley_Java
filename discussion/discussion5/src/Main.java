public class Main {
    public static void main(String[] args){
        OHRequest s5 = new OHRequest("I deleted all of my files, thank u", "Elana", true, null);
        OHRequest s4 = new OHRequest("conceptual: what is Java", "Mihir", false, s5);
        OHRequest s3 = new OHRequest("git: I never did lab 1", "Kevin", true, s4);
        OHRequest s2 = new OHRequest("help", "Ethan", false, s3);
        OHRequest s1 = new OHRequest("no I haven't tried the debugger", "Ashley", false, s2);

        OHQueue q = new OHQueue(s1);

        for(OHRequest request : q){
            System.out.println(request.name);
        }
    }
}
