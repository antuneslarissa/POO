package Exe3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface {

	private JFrame frame;
	private JTextField textFiNomeCompleto;
	private JTextField textFNomeMAe;
	private JTextField textFCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][grow]", "[][][][][]"));
		
		JLabel lblNome = new JLabel("Nome Completo:");
		frame.getContentPane().add(lblNome, "cell 1 1");
		
		textFiNomeCompleto = new JTextField();
		frame.getContentPane().add(textFiNomeCompleto, "cell 3 1,growx");
		textFiNomeCompleto.setColumns(10);
		
		JLabel lblNomeMaw = new JLabel("Nome da Mãe");
		frame.getContentPane().add(lblNomeMaw, "cell 1 2");
		
		textFNomeMAe = new JTextField();
		frame.getContentPane().add(textFNomeMAe, "cell 3 2,growx");
		textFNomeMAe.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		frame.getContentPane().add(lblCidade, "cell 1 3");
		
		textFCidade = new JTextField();
		frame.getContentPane().add(textFCidade, "cell 3 3,growx");
		textFCidade.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] vet = new String[3];
				vet[0] = textFiNomeCompleto.getText();
				vet[1] = textFNomeMAe.getText();
				vet[2] = textFCidade.getText();
				
				String nomeGerado = NameGenerator.generateStarWarsName(vet);
				
				JOptionPane.showMessageDialog(frame,nomeGerado);
			}
		});
		btnSalvar.setEnabled(true);
		frame.getContentPane().add(btnSalvar, "cell 2 4");
	}

}
