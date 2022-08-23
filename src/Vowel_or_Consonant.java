import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
        //noinspection ReassignedVariable
        char Al;
        System.out.println("Enter a character");
        Scanner r =new Scanner(System.in);
        Al =r.next().charAt(0);

        if(Al =='a' || Al =='e' || Al =='i' || Al =='o' || Al =='u'){
            System.out.println(Al + " is Vowel");
        }
        else{
            System.out.println(Al + " is Consonant");
        }
    }
}

