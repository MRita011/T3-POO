package dados;

public class Industrial extends Robo {
	private String funcao;

	public Industrial(int id, String modelo, double valorDiario, String funcao) {
		super(id, modelo, valorDiario);
		this.funcao = funcao;
	}

	public String getFuncao() {
		return funcao;
	}

	@Override
	public double calculaLocacao(int dias) {
		return getValorDiario() * dias * 1.5;
	}

	@Override
	public String toString() {
		return "\nINDUSTRIAL: " + ", ID: "+ getId() + ", Modelo: " + getModelo() + ", Valor diário: " + getValorDiario() + ", Função: " + funcao + ", Status: " + getStatus();
	}
}
