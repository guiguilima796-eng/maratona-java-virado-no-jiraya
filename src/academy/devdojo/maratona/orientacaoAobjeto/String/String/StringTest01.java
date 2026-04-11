package String;

public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2); // true

        String s3 = new String("Hello");
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true

        String nome = "  João";
        String numeros = "1234567890";
        System.out.println(nome.charAt(0));
        System.out.println(nome.replace("ã", "a"));
        System.out.println(numeros.substring(3, 6));
        System.out.println(numeros.length());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.contains("ão"));
        System.out.println(nome.trim());
    }
}