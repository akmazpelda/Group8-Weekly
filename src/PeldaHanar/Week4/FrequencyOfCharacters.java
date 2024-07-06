package PeldaHanar.Week4;
public class FrequencyOfCharacters {
    public static String frequencyOfChars(String str) {
        StringBuilder result = new StringBuilder();
        int[] frequencies = new int[256]; // ASCII character set size

        for (char c : str.toCharArray()) {
            frequencies[c]++;
        }
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > 0) {
                result.append((char) i).append(frequencies[i]);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println("Frequency of characters: " + frequencyOfChars(input));
    }
}


