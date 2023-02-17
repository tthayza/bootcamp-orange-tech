
import edu.thayza.desafio.dominio.Banco;
import edu.thayza.desafio.dominio.ContaConjunta;
import edu.thayza.desafio.dominio.ContaCorrente;
import edu.thayza.desafio.dominio.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        ContaConjunta conjunta = new ContaConjunta("thayza", 122222, 5.0, "matheus");
        System.out.println(conjunta.getTitular());
        conjunta.verificaTitular();
        conjunta.fazerDeposito(10.0);
        System.out.println(conjunta.getSaldo());

        ContaCorrente corrente = new ContaCorrente("fred", 4444, 7.4);
        corrente.consultarSaldo();
        corrente.fazerDeposito(4.5);
        corrente.consultarSaldo();
        corrente.sacar(3.0);
        corrente.consultarSaldo();

        ContaPoupanca poupa = new ContaPoupanca("zeca", 121212, 5.0);
        poupa.consultarSaldo();
        System.out.println(poupa.getNumeroConta());
        poupa.getNumeroConta();


        Banco banco = new Banco();
        banco.iniciaPrograma();


    }
}
