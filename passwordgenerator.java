import java.util.Scanner;

public class passwordgenerator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print (" How many character you want in your password ?" ) ;
        int length = sc.nextInt();

        String lowercase = "qwertyuiopasdfghjklzxcvbnm";
        String uppercase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String specialchar = "!@#$%^&*";
        String number = "0123456789";
        String combinedchar = lowercase + uppercase + specialchar + number;

        for(int i=0;i<length;i++){
            int k = (int)(Math.random()*36);
            System.out.print(combinedchar.charAt(k));
        }
    }
   
}