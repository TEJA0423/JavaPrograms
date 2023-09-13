package StringsPrograms;

public class RemoveAGivenWordFromAString {

	static void remove(String str, String word)
    {
        String msg[] = str.split(" ");
        String new_str = "";
        for (String words : msg) {
            if (!words.equals(word)) {
                new_str += words + " ";
            }
        }
        System.out.print(new_str);
    }
 
    public static void main(String[] args)
    {
        String str = "This is the remove a given word from a string";
        String word = "the";
        remove(str, word);
    }
}
