public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Mucahit",12,100,80,50);
        Fighter f2=new Fighter("Rakip",10,100,80,50);

        Match match=new Match(f1,f2,70,90);
        match.run();

    }
}
