//gerente herda da classe funcionario
public class EditorVideo extends Funcionario {
   
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do editor de vídeo");
		return 150;
	}
}
