package dados;

public abstract class Robo {
	private int id;
	private String modelo;
	private double valorDiario;
	private Status status;

	public Robo(int id, String modelo, double valorDiario) {
		this.id = id;
		this.modelo = modelo;
		this.valorDiario = valorDiario;
		this.status = Status.DISPONIVEL;
	}

	public int getId() {
		return id;
	}

	public String getModelo() {
		return modelo;
	}

	public double getValorDiario() {
		return valorDiario;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public abstract double calculaLocacao(int dias);

	@Override
	public String toString() {
		return "\nROBO:" + "ID: " + id + ", Modelo: " + modelo + ", Valor diário: " + valorDiario + ", status: " + status;
	}
}