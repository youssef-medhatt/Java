import java.util.StringTokenizer;

class CountWord {
    static int countWord1(String sentence, String word) {
        int count = 0;
        while (sentence.contains(word)) {
            count++;
            int index = sentence.indexOf(word);
            sentence = sentence.substring(index + word.length());
        }
        return count;

    }

    static int countWord2(String sentence, String word) {
        int count = 0;
        String arr[] = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                count++;
            }
        }
        return count;

    }

    static int countWordTokenizer(String sentence, String word) {
        int count = 0;
        StringTokenizer st = new StringTokenizer(sentence);
        while (st.hasMoreTokens()) {
            if (st.nextToken().equals(word)) {
                count++;
            }
        }
        return count;
    }

    static void ipSplitter(String ip) {
        String[] arr = ip.split("\\^");
       for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
        
       }


    }
    public static void main(String[] args) {
        String sentence = "ITI develops people and ITI house of developers and ITI for all people";
        String word = "ITI";
       
        System.out.println(countWord1(sentence, word));
        sentence = "develops people and ITI house of developers and ITI for all people";
        System.out.println(countWord2(sentence, word));
        sentence = "develops people and house of developers and ITI for all people";
        System.out.println(countWordTokenizer(sentence, word));
        ipSplitter("192^188.120.312");

    }

}