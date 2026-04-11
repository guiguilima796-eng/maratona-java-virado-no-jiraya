package academy.devdojo.maratona.orientacaoAobjeto.Enumeracao.test;

import academy.devdojo.maratona.orientacaoAobjeto.Enumeracao.dominio.Cliente;
import academy.devdojo.maratona.orientacaoAobjeto.Enumeracao.dominio.TipoCliente;
import academy.devdojo.maratona.orientacaoAobjeto.Enumeracao.dominio.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gui",TipoCliente.PESSOA_FISICA,TipoPagamento.CREDITO);
        System.out.println(TipoPagamento.CREDITO.calcularDescontoPorTipoPagamento(100));
        System.out.println(cliente1.getTipoCliente().buscarTipoClientePorNomeRelatorio("Pessoa Física"));
        System.out.println(cliente1);
    }
}
