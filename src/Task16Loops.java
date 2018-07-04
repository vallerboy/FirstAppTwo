public class Task16Loops {
    public static void main(String[] args) {
        String word = "adnJDaIfnafKDHDAHDABnammafhabcjbdBFSAJjkd";

        for (int i = 0; i < word.length(); i++) {
            char someChar = word.charAt(i);
            int counter = 0;

            if(!Character.isLowerCase(someChar)){
                continue;
            }
            for (int i1 = 0; i1 < word.length(); i1++) {
                if(word.charAt(i1) == someChar){
                    counter++;
                }
            }
            System.out.println(someChar + ": " + counter);
        }
    }
}
