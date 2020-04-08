import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class MavenMain {
    public static void main(String[] args) {
        System.out.println("Enter Something: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        System.out.println("You entered " + userInput);
        if (!StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is not a number");
        }
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));
        System.out.println(StringUtils.reverseDelimited(userInput, ' '));

    }

}
