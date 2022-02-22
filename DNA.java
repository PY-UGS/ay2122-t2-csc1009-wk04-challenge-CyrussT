import java.util.Scanner;

public class DNA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the DNA sequence: ");
        String dna = input.nextLine();
        char[] dnaArray = dna.toCharArray();
        int countGTC = 0;
        for (int i = 0; i < dna.length(); i++) {
            try {
                String check = "" + dnaArray[i] + dnaArray[i + 1] + dnaArray[i + 2];
                if (check.equals("GTC")) {
                    countGTC++;
                }
            } catch (java.lang.ArrayIndexOutOfBoundsException e){
                break;
            }
        }
        System.out.print("sequence \"GTC\" appeared " + countGTC + " times; ");
        if(countGTC > 10) {
            System.out.println("infection chance is high");
        }
    }
}
