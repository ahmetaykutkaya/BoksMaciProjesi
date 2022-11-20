public class Main {
    public static void main(String[] args)
    {
        Fighter f1 =new Fighter("Ahmet",10,120,100);
        Fighter f2 =new Fighter("Mehmet",10,85,85);

        Match match = new Match(f1,f2,85,100);
        match.run();

    }
}