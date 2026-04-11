public class Array03 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};

        for (int i : numeros) {
            System.out.println(i);
        }

        for (int index = 0; index < numeros.length; index++) {
            System.out.println(numeros[index]);
        }
    }
}
