public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("String");
        sb.append("is a peer class og String");
        sb.append("that provides much of");
        sb.append("the functionality of String");

        StringBuilder str = new StringBuilder("it is used to at the specified index position");
        str.insert(14,"insert text");

        StringBuilder str1 = new StringBuilder("This method returns the reversed object on which it was called");
        str.reverse();
        System.out.println(sb);
        System.out.println(str);
        System.out.println(str1);
    }
}
