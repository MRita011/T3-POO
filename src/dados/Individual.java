package dados;

public class Individual extends Cliente {
    private String cpf;

    public Individual(int codigo, String nome, String cpf) {
        super(codigo, nome);
        this.cpf = cpf;
    }

    @Override
    public double calculaDesconto(int quantidadeRobos) {
        if (quantidadeRobos > 1)
            return 0.05;
		
        return 0;
    }

    @Override
    public String toString() {
        return "\nINDIVIDUAL: " + ", Código: " + getCodigo() + ", Nome: " + getNome() + ", CPF: " + cpf;
    }
}