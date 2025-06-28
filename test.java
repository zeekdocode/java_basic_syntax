public class test {
    public static void main(String[] args) {
        String input1 = "   Hey \n   This \n   is \n   indented.";
        String output = input1.stripIndent();
        System.out.println(output);
    }
}