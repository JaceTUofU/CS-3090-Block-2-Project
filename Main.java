import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  This is a password strength checker that can sometimes incorrectly display whether a password is actually strong or not.
 *  The reason that this password strength checker fails in some cases is that it only checks if very basic password cases are met rather than if a password is strong.
 *  Most websites use a system similar to this one that fails to determine if a password is strong.
 *  The reason systems similar to this one fail is that it only checks for specific characters and length, not for true randomness and crackability.
 *  This faulty algorithm that is so close to a lot of popular websites' password checkers leads to people having a false sense of security, and requires more attention
 *      to detail, looking at things such as entropy and recently cracked passwords to determine password safety.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a basic password strength checker. Please input your password: ");
        String password = input.nextLine();

        // These values determine how strong a password is.
        int passwordStrength = 0;
        boolean needsSpecialChars = true;
        boolean needsUppercase = true;
        boolean needsLowercase = true;
        boolean needsNumbers = true;
        boolean needsMoreChars = true;
        int charsNeeded = 0;

        /**
         * Check for special characters.
         */

        // This gets special characters into a Pattern object and then puts them into a matcher.
        Pattern specialCharacters = Pattern.compile("[^a-zA-Z0-9 ]");
        Matcher matcher = specialCharacters.matcher(password);

        // There is at least one special character.
        if (matcher.find()) {
            passwordStrength += 1;
            needsSpecialChars = false;
        }

        /**
         * Check for uppercase letters.
         */

        // This gets uppercase letters into a Pattern object and then puts them into a matcher.
        specialCharacters = Pattern.compile("[A-Z]");
        matcher = specialCharacters.matcher(password);

        // There is at least one uppercase letter.
        if (matcher.find()) {
            passwordStrength += 1;
            needsUppercase = false;
        }

        /**
         * Check for lowercase letters.
         */

        // This gets lowercase letters into a Pattern object and then puts them into a matcher.
        specialCharacters = Pattern.compile("[a-z]");
        matcher = specialCharacters.matcher(password);

        // There is at least one lowercase letter.
        if (matcher.find()) {
            passwordStrength += 1;
            needsLowercase = false;
        }

        /**
         * Check for numbers.
         */

        // This gets lowercase letters into a Pattern object and then puts them into a matcher.
        specialCharacters = Pattern.compile("[0-9]");
        matcher = specialCharacters.matcher(password);

        // There is at least one number.
        if (matcher.find()) {
            passwordStrength += 1;
            needsNumbers = false;
        }

        /**
         * Check for at least 12 characters.
         */

        // The password has at least 12 characters.
        if (password.length() >= 12) {
            passwordStrength += 1;
            needsMoreChars = false;
        } else {
            charsNeeded = 12 - password.length();
        }

        /**
         * Output password strength (potentially incorrectly).
         */

        switch(passwordStrength) {
            case 1:
                System.out.println("Password strength is extremely weak.");
                break;
            case 2:
                System.out.println("Password strength is very weak.");
                break;
            case 3:
                System.out.println("Password strength is weak.");
                break;
            case 4:
                System.out.println("Password strength is good.");
                break;
            case 5:
                System.out.println("Password strength is strong.");
                break;
            default:
                System.out.println("Password strength is terrible.");
                break;
        }

        if (needsSpecialChars)
            System.out.println("Password needs at least one special character.");

        if (needsUppercase)
            System.out.println("Password needs at least one uppercase character.");

        if (needsLowercase)
            System.out.println("Password needs at least one lowercase character.");

        if (needsNumbers)
            System.out.println("Password needs at least one number.");

        if (needsMoreChars)
            System.out.println("Password needs " + charsNeeded + " more character(s).");
    }
}