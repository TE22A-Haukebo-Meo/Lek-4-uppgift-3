import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("Vem e du jao?");
        String jag = tb.nextLine();
        
        int space1 = jag.indexOf(" ");
        int space2 = jag.indexOf(" ", space1+1);
        int space3 = jag.indexOf(" ", space2+1);
        int space4 = jag.indexOf(" ", space3+1);
        int slut = jag.indexOf(".", space4+1);

        String förnamn = jag.substring(0,space1);
        String efternamn = jag.substring(space1,space2);
        String ålder = jag.substring(space2,space3);
        String längd = jag.substring(space3,space4);
        String vikt = jag.substring(space4,slut);
       

        System.out.println("Du heter "+förnamn+" "+efternamn);
        System.out.println("Du är "+ålder+" år gammal");
        System.out.println("Du är "+längd+" lång och väger "+vikt+" kg");
    }
}
