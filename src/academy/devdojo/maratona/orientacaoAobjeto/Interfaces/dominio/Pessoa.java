package Interfaces.dominio;

public interface Pessoa {
    public static final String NOME = "Pessoa";

    default void falar(String fala){
        System.out.println(fala);
    }

    public abstract void andar();

    @Override
    String toString();
}
