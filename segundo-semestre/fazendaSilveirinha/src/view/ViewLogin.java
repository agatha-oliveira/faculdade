package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ViewLogin {

	private JFrame frame;
	private JTextField txtNome;
	private JPasswordField passwordSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 393, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNome.setBounds(74, 155, 46, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSenha.setBounds(74, 220, 46, 14);
		frame.getContentPane().add(lblSenha);
		
		txtNome = new JTextField();
		txtNome.setBounds(74, 170, 211, 27);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblLogo = new JLabel("New label");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\Agath\\Downloads\\Logo1.png"));
		lblLogo.setBounds(58, 11, 263, 117);
		frame.getContentPane().add(lblLogo);
		
		passwordSenha = new JPasswordField();
		passwordSenha.setBounds(74, 238, 211, 27);
		frame.getContentPane().add(passwordSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checarLogin(txtNome.getText(), new String (passwordSenha.getPassword()))){
					
					JOptionPane.showInternalMessageDialog(null, "Bem vindo ao programa de análise da Fazenda do Silveirinha!");
					new ViewTela1();
					frame.dispose();
					
				
				} else {
					
					JOptionPane.showInternalMessageDialog(null, "Credencias inválidas", "", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnEntrar.setBounds(139, 296, 89, 23);
		frame.getContentPane().add(btnEntrar);
		
	}
	
	public boolean checarLogin(String nome, String senha) {
		return nome.equals("Silveira") && senha.equals("123");
	}
	
	
}


