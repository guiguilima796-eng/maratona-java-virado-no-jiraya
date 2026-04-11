public class ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] alunos = new int[3][];

        alunos[0] = new int[2];
        alunos[1] = new int[3];
        alunos[2] = new int[4];

        for (int[] num : alunos) {
            System.out.println("-------");
            for (int qtd : num) {        
                System.out.print(qtd);
            }
        }
    }    
}
