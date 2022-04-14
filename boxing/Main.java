public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("A",10,120,100,50);
        Fighter f2=new Fighter("B",20,85,85,50);

        Ring match=new Ring(f1,f2,85,100);
        match.run();
    }
}
