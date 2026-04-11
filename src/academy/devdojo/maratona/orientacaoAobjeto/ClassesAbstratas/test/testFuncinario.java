package ClassesAbstratas.test;

import ClassesAbstratas.dominio.Desenvolvedor;
import ClassesAbstratas.dominio.Gerente;

public class testFuncinario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Otavio", 10000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Guilherme",25000);
        desenvolvedor.bonus();
        gerente.bonus();
        System.out.println(desenvolvedor);
        System.out.println(gerente);
    }
}
