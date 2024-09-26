import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        String partyAffil = "";

        System.out.print("Enter your party Affiliation: [R,D,I]: ");
        partyAffil = in.nextLine();

        if(partyAffil.equalsIgnoreCase("R"))
        {
            System.out.println("You are a Republican!");
        }
        else if (partyAffil.equalsIgnoreCase("D"))
        {
            System.out.println("You are a democrat!");
        }
        else if (partyAffil.equalsIgnoreCase("I"))
        {
            System.out.println("You are an Independent!");
        }
        else
        {
            System.out.println("I do not know the " + partyAffil + " party affiliation!");
        }

    }

}