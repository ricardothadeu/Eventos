package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastrarEvento extends JPanel{
	JLabel lNome, lTipo, lLocal;
	JTextField tNome, tTipo, tLocal;
	JButton bCadastrar;
	
	TelaCadastrarEvento(){
	
	
	
	this.setSize(500,400);
	//this.setLocation(500,500);
	this.setLayout(null);
	
	
	lNome = new JLabel("Nome");
	lNome.setSize(50,30);
	lNome.setLocation(30, 30);
	this.add(lNome);
	
	tNome = new JTextField("");
	tNome.setSize(100,30);
	tNome.setLocation(100, 90);
	this.add(tNome);

	lTipo = new JLabel("Tipo");
	lTipo.setSize(50, 30);
	lTipo.setLocation(30, 90);
	this.add(lTipo);
	
	tTipo = new JTextField("");
	tTipo.setLocation(100, 40);
	tTipo.setSize(80, 30);
	this.add(tTipo);
	
	
	lLocal = new JLabel("Local");
	lLocal.setSize(50, 50);
	lLocal.setLocation(30, 120);
	this.add(lLocal);
	
	tLocal = new JTextField("");
	tLocal.setSize(150, 30);
	tLocal.setLocation(80, 130);
	this.add(tLocal);
	
	bCadastrar = new JButton("Cadastrar");
	bCadastrar.setSize(150,30);
	bCadastrar.setLocation(120,200);
	this.add(bCadastrar);
	this.setVisible(true);
	

}
}
