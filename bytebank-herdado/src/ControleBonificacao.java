
public class ControleBonificacao {
 
	private double soma;
	

	public void registra(Funcionario f) {
		double Boni = f.getBonificacao();
		this.soma = this.soma + Boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
