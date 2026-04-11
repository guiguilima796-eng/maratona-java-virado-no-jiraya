package introducaoMetodos.dominio;

public class Calculadora{

    public void somaDoisNumeros(int a,int b){
        int n1 = a;
        int n2 = b;
        System.out.println(n1+" + "+n2+" = "+ (n1+n2));
    }

    public int subtraiDoisNumeros(int a,int b){
        return a - b;
    }

    public void mutiplicaDoisNumeros(float a,float b){
        float n1 = a;
        float n2 = b;
        System.out.println(n1+" X "+n2+" = "+ (n1 * n2));
    }

    public void calculaArray(int[] array){
        int[] arr = array;
        double soma = 0;
        for (int n : arr) {
            soma += n;
        }
        System.out.println("Soma = "+soma);
    }

    public void calculaVarargs(int... array){
        int[] arr = array;
        int soma = 0;
        for (int i : arr) {
            soma += i;   
        }
        System.out.println("Soma:"+soma);
    }


}