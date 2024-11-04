import exercicios.Cidade;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

public class Principal {
    public static void main(String[] args) {
        // CidadeRecord (imutável)
        CidadeRecord cidadeRecord = new CidadeRecord("São Paulo");
        System.out.println("CidadeRecord: " + cidadeRecord);

        // Cidade (mutável)
        Cidade cidade = new Cidade("Rio de Janeiro");
        System.out.println("Cidade (antes): " + cidade.getNome());
        cidade.setNome("Curitiba");
        System.out.println("Cidade (depois): " + cidade.getNome());

        // PessoaRecordShallow (imutabilidade superficial)
        PessoaRecordShallow pessoaShallow = new PessoaRecordShallow("Alice", cidade);
        System.out.println("PessoaRecordShallow (antes): " + pessoaShallow);
        cidade.setNome("Belo Horizonte");  // Alteração em "Cidade" afeta PessoaRecordShallow
        System.out.println("PessoaRecordShallow (depois de mudar cidade): " + pessoaShallow);

        // PessoaRecord (imutabilidade profunda)
        PessoaRecord pessoaDeep = new PessoaRecord("Bob", cidadeRecord);
        System.out.println("PessoaRecord: " + pessoaDeep);
    }
}
