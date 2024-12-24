public class Main {
    public static void main(String[] args) {
        String input = "HelloWorld";
        boolean isAlphabetical = input.chars().allMatch(Character::isLetter);
        
        if (isAlphabetical) {
            System.out.println("The string is alphabetical.");
        } else {
            System.out.println("The string is not alphabetical.");
        }
    }
}