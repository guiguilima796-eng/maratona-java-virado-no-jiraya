package String;

public class StringPerformance {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(10000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo Total para execução do metódo concatString:"+ (fim - inicio) + "ms");

        long inicio2 = System.currentTimeMillis();
        concatStringBuilder(1000000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo Total para execução do metódo concatStringBuilder:"+ (fim2 - inicio2) + "ms");
        
        long inicio3 = System.currentTimeMillis();
        concatStringBuffer(1000000);
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo Total para execução do metódo concatStringBuffer:"+ (fim3 - inicio3) + "ms");
    }

    private static void concatString(int tamanho) {
        String s = "";
        for (int i = 0; i < tamanho; i++) {
            s += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
