/**
 * 
 */
package padrao.adapter;

/**
 * @author Fernando
 * 
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Pessoa p = new Pessoa();
        p.nome = "Fernando";

        Empresa e = new Empresa();
        e.funcionario = f1;
        e.trabalhar();

        AdapterPessoa ap = new AdapterPessoa(p);
        e.funcionario = ap;
        e.trabalhar();

    }

}
