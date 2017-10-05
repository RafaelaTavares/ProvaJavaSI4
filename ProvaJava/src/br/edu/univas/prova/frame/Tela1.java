package br.edu.univas.prova.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Tela1 extends JFrame{

	private static final long serialVersionUID = 3769175151324351316L;
	
	private JPanel contentPane = null;

	
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
		westPanel.setBackground(Color.lightGray);
		westPanel.setPreferredSize(new Dimension(150, 0));
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton primeiroButton = new JButton();
		primeiroButton.setText("Botão 1");
		primeiroButton.setPreferredSize(new Dimension(80, 20));	
		primeiroButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				okClicked();
				
			}
		});
		westPanel.add(primeiroButton);
		
		JButton segundoButton = new JButton();
		segundoButton.setText("Botão 2");
		segundoButton.setPreferredSize(new Dimension(80, 20));
		segundoButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				okClicked();
				
			}
		});
		westPanel.add(segundoButton);
		
		JButton terceiroButton = new JButton();
		terceiroButton.setText("Botão 3");
		terceiroButton.setPreferredSize(new Dimension(80, 20));
		terceiroButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				okClicked();
				
			}
		});
		westPanel.add(terceiroButton);
		
		JButton quartoButton = new JButton();
		quartoButton.setText("Botão 4");
		quartoButton.setPreferredSize(new Dimension(80, 20));
		quartoButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				okClicked();
				
			}
		});
		westPanel.add(quartoButton);
		
		JButton quintoButton = new JButton();
		quintoButton.setText("Botão 5");
		quintoButton.setPreferredSize(new Dimension(80, 20));	
		quintoButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				okClicked();
				
			}
		});
		westPanel.add(quintoButton);
		
		JButton sextoButton = new JButton();
		sextoButton.setText("Botão 6");
		sextoButton.setPreferredSize(new Dimension(80, 20));
		sextoButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				okClicked();
				
			}
		});
		westPanel.add(sextoButton);
		
		JButton setimoButton = new JButton();
		setimoButton.setText("Botão 7");
		setimoButton.setPreferredSize(new Dimension(80, 20));		
		setimoButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				okClicked();
				
			}
		});
		westPanel.add(setimoButton);
		
		JButton oitavoButton = new JButton();
		oitavoButton.setText("Botão 8");
		oitavoButton.setPreferredSize(new Dimension(80, 20));
		oitavoButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				okClicked();
				
			}
		});
		westPanel.add(oitavoButton);
		
		JButton nonoButton = new JButton();
		nonoButton.setText("Botão 9");
		nonoButton.setPreferredSize(new Dimension(80, 20));
		nonoButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				okClicked();
				
			}
		});
		westPanel.add(nonoButton);
		
		JButton decimoButton = new JButton();
		decimoButton.setText("Botão 10");
		decimoButton.setPreferredSize(new Dimension(90, 20));
		decimoButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				okClicked();
				
			}
		});
		westPanel.add(decimoButton);
		
		JPanel eatsPanel = new JPanel();
		eatsPanel.setPreferredSize(new Dimension(350, 0));
		contentPane.add(eatsPanel, BorderLayout.CENTER);
		
		JLabel nome = new JLabel();
		nome.setText("Nome:");
		eatsPanel.add(nome);
		
		JTextField textNome = new JTextField();
		textNome.setColumns(25);
		eatsPanel.add(textNome);
		
		JLabel email = new JLabel();
		email.setText("E-mail:");
		eatsPanel.add(email);
		
		JTextField textEmail = new JTextField();
		textEmail.setColumns(25);
		eatsPanel.add(textEmail);
		
		JButton button = new JButton();
		button.setText("Salvar");
		button.setPreferredSize(new Dimension(80, 20));
		eatsPanel.add(button);
		
		Object [][] data = {
				{"João", "111.111.111-11", "joao@gmail.com"},
				{"Maria", "222.222.222-22", "maria@gmail.com"},
				{"José", "333.333.333-33", "jose@gmail.com"}
				
		};
		
		Object[] columnNames = {
				"Nome", "CPF", "E-mail"
		};
		
		JTable table = new JTable(data, columnNames);
		table.setFillsViewportHeight(true);
		
		JScrollPane tableScroll = new JScrollPane(table);
		tableScroll.setPreferredSize(new Dimension(300, 100));
		
		eatsPanel.add(tableScroll);		
	}
	
	private void okClicked(){
		JOptionPane.showMessageDialog(this, "Eu sou o responsável pelo meu futuro!");
	}
}
