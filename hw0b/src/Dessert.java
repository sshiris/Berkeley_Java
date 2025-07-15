public class Dessert {
    public static void main(String[] args){
        System.out.println("I love dessert!");
    }
    public int flavor;
    public int price;
    public static int numDesserts = 0;

    public Dessert(int flavor, int price){
        this.flavor = flavor;
        this.price = price;
        numDesserts += 1;
    }

    public void printDessert(){
        System.out.print(flavor +" "+price +" "+ numDesserts);
    }
}
