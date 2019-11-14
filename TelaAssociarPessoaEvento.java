package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaAssociarPessoaEvento extends JPanel{
	JLabel lCpfPessoa, lNomeEvento;
	JTextField tCpfPessoa, tNomeEvento;
	JButton bAssociar;
	
	TelaAssociarPessoaEvento(){
		this.setSize(500,400);
		//this.setLocation(500,500);
		this.setLayout(null);
		
		
		lCpfPessoa = new JLabel("Nome");
		lCpfPessoa.setSize(50,30);
		lCpfPessoa.setLocation(30, 30);
		this.add(lCpfPessoa);
		
		tCpfPessoa = new JTextField("");
		tCpfPessoa.setSize(100,30);
		tCpfPessoa.setLocation(100, 90);
		this.add(tCpfPessoa);

		lNomeEvento = new JLabel("Tipo");
		lNomeEvento.setSize(50, 30);
		lNomeEvento.setLocation(30, 90);
		this.add(lNomeEvento);
		
		tNomeEvento = new JTextField("");
		tNomeEvento.setLocation(100, 40);
		tNomeEvento.setSize(80, 30);
		this.add(tNomeEvento);
		
		bAssociar = new JButton("Associar");
		bAssociar.setSize(150,30);
		bAssociar.setLocation(120,200);
		this.add(bAssociar);
	}
	
}
