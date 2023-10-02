//gerente é um funcionario, gerente herda da classe funcionario, assina o contrato autenticavel, é um autenticavel
public class Gerente extends Funcionario implements Autenticavel {
   
	 private AutenticacaoUtil autenticador;
	
	 public Gerente() {
		   this.autenticador = new AutenticacaoUtil();
	   }
	 
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do gerente");
		return super.getSalario();
		
	}
	
	  @Override
		public void setSenha(int senha) {
			this.autenticador.setSenha(senha);	
		}

		@Override
		public boolean autentica(int senha) {
		  boolean autenticou = this.autenticador.autentica(senha);
		  return autenticou;

	   }

		public String getNome() {
			
			return null;
		}

}
