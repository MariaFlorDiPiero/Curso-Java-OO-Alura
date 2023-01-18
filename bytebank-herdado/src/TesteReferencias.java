
public class TesteReferencias {

	public static void main(String[] args) {
		
		
		Gerente gerente = new Gerente();
		gerente.setNome("Marcos");
		gerente.setSalario(5000.00);
		
		EditorVideo editorvideo = new EditorVideo();
		editorvideo.setSalario(2500.00);
		
		Designer designer = new Designer();
		designer.setSalario(2000.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(designer);
		controle.registra(editorvideo);
		controle.registra(gerente);
		
		System.out.println(controle.getSoma());

	}

}
