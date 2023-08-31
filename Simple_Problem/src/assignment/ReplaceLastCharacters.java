package assignment;

public class ReplaceLastCharacters {
	public static String replaceLastCharacters(String original, String newEnding) {
        if (original.length() < 3) {
            return newEnding;
        }

        String modified = original.substring(0, original.length() - 3) + newEnding;
        return modified;
    }
    public static void main(String[] args) {
        String originalString = "Hello, world!";
        String newEnding = "123";

        String modifiedString = replaceLastCharacters(originalString, newEnding);

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }

    
}
