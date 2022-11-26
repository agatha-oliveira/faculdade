package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class ViewTela1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5639715665099878011L;
	private JPanel contentPane;
	private JLabel lblLogo1;
	private JLabel lblCliente;
	private JLabel lblQuantidade;
	private JLabel lblProduto;
	private JTextField textCliente;
	private JTextPane txtpnDataddmmaaaa;
	private JTextField textField_9;
	private JTable tableCompras;
	DefaultTableModel modelo;
	private JButton btnAdicionar;
	private JButton btnRemover;
	private JButton btnLimpar;
	private JComboBox<String> comboProduto;
	private JScrollPane scrollPane;
	private JSpinner spinnerQuantidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTela1 frame = new ViewTela1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewTela1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblLogo1 = new JLabel("");
		lblLogo1.setIcon(new ImageIcon("C:\\Users\\Agath\\Downloads\\Logo1.png"));
		lblLogo1.setBounds(59, 11, 258, 118);
		contentPane.add(lblLogo1);
		
		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setText("Insira as informações abaixo:");
		txtpnInfo.setBounds(29, 171, 327, 42);
		contentPane.add(txtpnInfo);
		
		lblCliente = new JLabel("Cliente");
		lblCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCliente.setBounds(29, 228, 70, 14);
		contentPane.add(lblCliente);
		
		lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidade.setBounds(29, 289, 70, 14);
		contentPane.add(lblQuantidade);
		
		lblProduto = new JLabel("Produto");
		lblProduto.setHorizontalAlignment(SwingConstants.CENTER);
		lblProduto.setBounds(39, 257, 46, 14);
		contentPane.add(lblProduto);
		
		textCliente = new JTextField();
		textCliente.setBounds(117, 225, 86, 20);
		contentPane.add(textCliente);
		textCliente.setColumns(10);
		
		txtpnDataddmmaaaa = new JTextPane();
		txtpnDataddmmaaaa.setText("Data (DD/MM/AAAA):");
		txtpnDataddmmaaaa.setBounds(29, 140, 144, 20);
		contentPane.add(txtpnDataddmmaaaa);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(170, 140, 204, 20);
		contentPane.add(textField_9);
		modelo = new DefaultTableModel();
		Object[] colunas = {"Cliente","Produto", "Qntd.",};
		final Object[] row = new Object[3];
		modelo.setColumnIdentifiers(colunas);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(400, 22, 279, 328);
		contentPane.add(scrollPane);
		
		tableCompras = new JTable();
		tableCompras.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setViewportView(tableCompras);
		tableCompras.setBackground(new Color(100, 149, 237));
		tableCompras.setForeground(Color.BLACK);
		tableCompras.setModel(modelo);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				row[0]= textCliente.getText();
				row[1]= spinnerQuantidade.getValue();
				row[2]= comboProduto.getSelectedItem();
				modelo.addRow(row);
				JOptionPane.showMessageDialog(null, "Informação adicionada com sucesso.");
			}
		});
		btnAdicionar.setBounds(29, 325, 89, 23);
		contentPane.add(btnAdicionar);
		
		btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=tableCompras.getSelectedRow();
				if(i>=0)
				{
				modelo.removeRow(i);
				JOptionPane.showMessageDialog(null, "Informação deletada com sucesso.");
			
			} else {
				
				JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha.");
			}
		}
		});
		btnRemover.setBounds(150, 325, 89, 23);
		contentPane.add(btnRemover);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textCliente.setText("");
				
			}
		});
		btnLimpar.setBounds(269, 325, 89, 23);
		contentPane.add(btnLimpar);
		
		comboProduto = new JComboBox<>();
		comboProduto.setModel(new DefaultComboBoxModel<>(new String[] {"Cenoura", "Batata", "Nabo"}));
		comboProduto.setBounds(117, 253, 133, 22);
		contentPane.add(comboProduto);
		
		spinnerQuantidade = new JSpinner();
		spinnerQuantidade.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinnerQuantidade.setBounds(116, 286, 30, 20);
		contentPane.add(spinnerQuantidade);
		
		JButton btnExportarDados = new JButton("Exportar dados da tabela");
		btnExportarDados.setBounds(458, 361, 175, 23);
		contentPane.add(btnExportarDados);
	}
}
