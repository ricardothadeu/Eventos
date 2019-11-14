package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastrarPessoa extends JPanel{
		JLabel lCpf, lNome, lEmail;
		JTextField tCpf, tNome, tEmail;
		JButton bCadastrar;
		
		
		
	TelaCadastrarPessoa(){
		this.setSize(500,400);
		//this.setLocation(500,500);
		this.setLayout(null);
		
		lCpf = new JLabel("CPF");
		lCpf.setSize(50, 50);
		lCpf.setLocation(30, 30);
		this.add(lCpf);
		
		tCpf = new JTextField("");
		tCpf.setLocation(100, 40);
		tCpf.setSize(80, 30);
		this.add(tCpf);
		
		lNome = new JLabel("Nome");
		lNome.setSize(50,30);
		lNome.setLocation(30, 90);
		this.add(lNome);
		
		tNome = new JTextField("");
		tNome.setSize(100,30);
		tNome.setLocation(100, 90);
		this.add(tNome);
		
		lEmail = new JLabel("Email");
		lEmail.setSize(50, 50);
		lEmail.setLocation(30, 120);
		this.add(lEmail);
		
		tEmail = new JTextField("");
		tEmail.setSize(150, 30);
		tEmail.setLocation(80, 130);
		
		this.add(tEmail);
		
		bCadastrar = new JButton("Cadastrar");
		bCadastrar.setSize(150,30);
		bCadastrar.setLocation(120,200);
		this.add(bCadastrar);
		this.setVisible(true);
		
		
	}
}
