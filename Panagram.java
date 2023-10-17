import java.util.Scanner;

public class Panagram {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence : ");
        char s[] = scan.nextLine().toCharArray();
        
        int count = 0;
        for(int i =65; i<=90 ; i++) //A-Z --> 65 to 90
        {
            for(int j : s)
            {
                if(i==j)
                {
                    count++;
                    break;
                }
            }
        }

        if(count == 26)
        {
            System.out.println("The given sentence is PANAGRAM");
        }
        else
        {
             System.out.println("The given sentence is NOT A PANAGRAM");
        }
    }
}
