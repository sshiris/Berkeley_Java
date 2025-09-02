public class OHRequest {
    public String description;
    public String name;
    public boolean isSetup;
    public OHRequest next;

    public OHRequest(String description, String name, boolean isSetup, OHRequest next){
        this.next = next;
        this.description = description;
        this.isSetup = isSetup;
        this.name = name;
    }
}
