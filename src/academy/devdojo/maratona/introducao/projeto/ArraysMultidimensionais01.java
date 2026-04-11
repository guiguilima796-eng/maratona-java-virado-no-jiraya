public class ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[7][4];
        int dia = 0;
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                dia ++;
                dias[i][j] = dia;
            }
        }

        // for (int i = 0; i < dias.length; i++) {
        //     for (int j=0;j <dias[i].length;j++) {
        //         System.out.println(dias[i][j]);
        //     }
        // }

        System.out.println("com foreach:\n");

        for (int[] arayBase : dias) {
            for (int num : arayBase) {
                System.out.println(num);
            }
        }
    }
}
