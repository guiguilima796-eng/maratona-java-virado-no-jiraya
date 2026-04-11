package String;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(",Hello");
        sb.append(" ");
        sb.append("World").append(",my name is Guilherme!");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
        sb.reverse();
        sb.delete(0, 5);
        System.out.println(sb.toString());
    }
}
