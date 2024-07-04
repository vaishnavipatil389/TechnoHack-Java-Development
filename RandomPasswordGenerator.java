import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandomPasswordGenerator {

   
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_+=<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the desired password length: ");
        int length = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Include uppercase letters? (yes/no): ");
        boolean includeUppercase = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Include lowercase letters? (yes/no): ");
        boolean includeLowercase = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Include digits? (yes/no): ");
        boolean includeDigits = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Include special characters? (yes/no): ");
        boolean includeSpecial = scanner.nextLine().equalsIgnoreCase("yes");

       
        String password = generatePassword(length, includeUppercase, includeLowercase, includeDigits, includeSpecial);
        System.out.println("Generated Password: " + password);
    }

    private static String generatePassword(int length, boolean includeUppercase, boolean includeLowercase, boolean includeDigits, boolean includeSpecial) {
       
        StringBuilder characterPool = new StringBuilder();
        if (includeUppercase) characterPool.append(UPPERCASE);
        if (includeLowercase) characterPool.append(LOWERCASE);
        if (includeDigits) characterPool.append(DIGITS);
        if (includeSpecial) characterPool.append(SPECIAL_CHARACTERS);

        if (characterPool.length() == 0) {
            characterPool.append(LOWERCASE);
        }

     
        SecureRandom random = new SecureRandom();

      
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        return password.toString();
    }
}
