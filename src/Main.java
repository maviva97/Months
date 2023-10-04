
public class Main {
    public static void main(String args[])
    {
enum Lunile {
    IANUARIE, FEBRUARIE, MARTIE, APRILIE, MAI, IUNIE, IULIE, AUGUST, SEPTEMBRIE,
    OCTOMBRIE, NOIEMBRIE, DECEMBRIE
}
   for (Lunile luna:Lunile.values()){
       System.out.println(luna.name() );
   }
    }
}