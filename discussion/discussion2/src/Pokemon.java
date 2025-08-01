public class Pokemon{
    public String name;
    public int level;
    public static String trainer = "Ash";
    public static int partySize = 0;

    public Pokemon(String name, int level){
        this.name = name;
        this.level = level;
        this.partySize += 1;
    }

    public static void change(Pokemon poke, int level){
        poke.level = level;
        level = 50;
        poke = new Pokemon("Luxray", 1);
        poke.trainer = "Team Rocket";
    }

    public void printStats(){
        System.out.println(name + " " + level + " " + trainer);
    }

    public static void main(String[] args){
        Pokemon p = new Pokemon("Pikachu", 17);
        Pokemon j = new Pokemon("Jolteon", 99);
        System.out.println("Party size: " + Pokemon.partySize);//2
        p.printStats();//pikachu 17 Ash
        int level = 18;
        Pokemon.change(p, level);
        p.printStats();//pikachu 18 team rocket
        Pokemon.trainer = "Ash";
        j.trainer = "Cynthia";
        p.printStats();//pikachu 18 cynthia
    }
}