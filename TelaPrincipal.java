package view;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;







public class TelaPrincipal extends JFrame{
	
	
	

	JTabbedPane abas = new JTabbedPane();
	
	
	public TelaPrincipal(){
		this.setSize(500,600);
		this.setLocation(200,200);
		this.setTitle("Controlador de Eventos");
		this.add(abas);
		abas.addTab("Cadastrar Pessoa", new TelaCadastrarPessoa());
		abas.addTab("Cadastrar Evento", new TelaCadastrarEvento());
		abas.addTab("Associar Pessoa-Evento", new TelaAssociarPessoaEvento());
		abas.addTab("Relação Candidato-Evento", new TelaListarPessoaEvento());
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TelaPrincipal();
	}
}