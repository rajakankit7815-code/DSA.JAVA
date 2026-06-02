public class mostFreqChar {

    public static void main(String[] args) {
        String s = "sccdffrvvgghhffdddddd";
        if (s == null || s.isEmpty()) {
            System.out.println("Input string is empty");
            return;
        }

        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        char mostChar = s.charAt(0);
        int mostCount = freq[mostChar];
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] > mostCount) {
                mostCount = freq[i];
                mostChar = (char) i;
            }
        }

        System.out.println("Most frequent character: '" + mostChar + "' occurred " + mostCount + " times");
    }

}
