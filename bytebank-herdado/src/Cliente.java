
public class Cliente implements Autenticavel {

	private int senha;
	private AutenticacaoUtil util;
	
	public Cliente() {
		this.util = new AutenticacaoUtil();
	}
	
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;		
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
		return false;
		}
	}

	

}
