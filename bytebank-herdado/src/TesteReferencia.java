
public class TesteReferencia {
    public static void main(String[] args) {
		
    	Gerente g1 = new Gerente();
    	g1.setNome("Marcos");
    	String nome = g1.getNome();
    	System.out.println(nome);
    	g1.setSalario(5000.0);
    	
    	
    	EditorVideo ev = new EditorVideo();
    	ev.setSalario(2500.0);
    	
    	ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);

        System.out.println(controle.getSoma());
    }
}
