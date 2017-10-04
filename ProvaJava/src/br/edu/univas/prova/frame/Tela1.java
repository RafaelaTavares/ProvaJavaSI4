package br.edu.univas.prova.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tela1 extends JFrame{

	private static final long serialVersionUID = 3769175151324351316L;
	
	private JPanel contentPane;
//	private JLabel label;
	
	public Tela1(){
		
		this.setSize(500, 450);
		this.setTitle("Prova");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		addComponents();
	}
	
	private void addComponents(){
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		this.setContentPane(contentPane);		
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.WHITE);
		westPanel.setPreferredSize(new Dimension(150, 0));
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton primeiroButton = new JButton();
		primeiroButton.setText("Botão 1");
		primeiroButton.setPreferredSize(new Dimension(80, 20));		
		westPanel.add(primeiroButton);
		
		JButton segundoButton = new JButton();
		segundoButton.setText("Botão 2");
		segundoButton.setPreferredSize(new Dimension(80, 20));
		westPanel.add(segundoButton);
		
		JButton terceiroButton = new JButton();
		terceiroButton.setText("Botão 3");
		terceiroButton.setPreferredSize(new Dimension(80, 20));		
		westPanel.add(terceiroButton);
		
		JButton quartoButton = new JButton();
		quartoButton.setText("Botão 4");
		quartoButton.setPreferredSize(new Dimension(80, 20));
		westPanel.add(quartoButton);
		
		JButton quintoButton = new JButton();
		quintoButton.setText("Botão 5");
		quintoButton.setPreferredSize(new Dimension(80, 20));		
		westPanel.add(quintoButton);
		
		JButton sextoButton = new JButton();
		sextoButton.setText("Botão 6");
		sextoButton.setPreferredSize(new Dimension(80, 20));
		westPanel.add(sextoButton);
		
		JButton setimoButton = new JButton();
		setimoButton.setText("Botão 7");
		setimoButton.setPreferredSize(new Dimension(80, 20));		
		westPanel.add(setimoButton);
		
		JButton oitavoButton = new JButton();
		oitavoButton.setText("Botão 8");
		oitavoButton.setPreferredSize(new Dimension(80, 20));
		westPanel.add(oitavoButton);
		
		JButton nonoButton = new JButton();
		nonoButton.setText("Botão 9");
		nonoButton.setPreferredSize(new Dimension(80, 20));		
		westPanel.add(nonoButton);
		
		JButton decimoButton = new JButton();
		decimoButton.setText("Botão 10");
		decimoButton.setPreferredSize(new Dimension(90, 20));
		westPanel.add(decimoButton);
		
		JPanel eatsPanel = new JPanel();
		eatsPanel.setPreferredSize(new Dimension(350, 0));
		contentPane.add(eatsPanel, BorderLayout.CENTER);
		
		
	}
	
	
	
}
