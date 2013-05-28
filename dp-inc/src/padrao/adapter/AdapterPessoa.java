/**
 * 
 */
package padrao.adapter;

/**
 * @author Fernando
 * 
 */
public class AdapterPessoa extends Funcionario implements ITrabalhador {

    Pessoa pessoa;

    public AdapterPessoa(Pessoa p) {
        this.pessoa = p;
    }

    @Override
    public void desenvolver() {
        pessoa.trampando();
    }

}
