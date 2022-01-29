import java.nio.charset.StandardCharsets;

public class Operations_in_String {
    public static void main(String[] args) {
        String str = "java string pool refers to collection of Strings which are stored in heap memory";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.replace('a','$'));
        System.out.println(str.contains("collections"));
        System.out.println(str.contains("java string pool refers to collection of string which are stored in heap memory"));
        System.out.println(str.toLowerCase().contains("java string pool refers to collection of strings which are stored in heap memory"));
    }
}
