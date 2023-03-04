package EstructuraDelFRame;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import VentanaPrincipal.application;

import javax.swing.JComboBox;
import javax.swing.border.EtchedBorder;


public class JFrameEstructura extends JFrame {

	// Atributos del JFrameEstructura

	private JPanel contentPane;
	private JTextField EntradaCantidad;
	public JComboBox tipoDeConversion;
	public JButton BotonConvertir;
	public JLabel Titulo;
	public JLabel resultadoDeSalida;
	
	 
	

	// MÉTODOS DEL JFRAMEESTRUCTURA

	// Ventana para confirmar el cierre del programa

	public void cerrar() {
		int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?");

		if (confirmar == JOptionPane.OK_OPTION) {

			System.exit(0);

		}
	}

	// Métodos para cambiar nombre de los elementos

	public void nombrarBoton(JButton objeto, String string) {
		objeto.setName(string);
	}

	public void nombrarJlabel(JLabel objeto, String string) {
		objeto.setName(string);
	}

	// Método para Agregar objetos al JComboBox

	public void opcionesJComboBox(String string) {
		tipoDeConversion.addItem(string);
	}

	// Método para cambiar el título del encabezado

	public void CambiarTituloDeJLabel(String string) {
		Titulo.setText(string);
	}

	// Método para transformar la cantidad de entrada, de Cadena a Doble

	public double convertirEntradaADouble() {
		return Double.parseDouble(EntradaCantidad.getText());
	}

	// CONTRUCTOR DEL JFRAMEESTRUCTURA

	public JFrameEstructura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 470);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 217, 115));
		contentPane.setName("content");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Definición de los JPanels

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 240, 201));
		panel_1.setName("panel1");
		panel_1.setBorder(new TitledBorder(null, "Tipo de Conversion", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 64, 128)));
		panel_1.setBounds(47, 80, 495, 107);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 240, 201));
		panel.setName("panel");
		panel.setBorder(new TitledBorder(null, "Datos de Entrada", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 64, 128)));
		panel.setBounds(34, 218, 253, 71);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 240, 201));
		panel_2.setName("panel2");
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dato de Salida", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 64, 128)));
		panel_2.setBounds(339, 218, 222, 71);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		// JLabel del Título

		Titulo = new JLabel();
		nombrarJlabel(Titulo, "Titulo");
		Titulo.setFont(new Font("Dialog", Font.BOLD, 23));
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setBounds(104, 28, 385, 41);
		contentPane.add(Titulo);

		// JComboBox del JFrameEstructura

		tipoDeConversion = new JComboBox();
		tipoDeConversion.setBackground(new Color(254, 255, 255));
		tipoDeConversion.setForeground(new Color(0,0,0));
		tipoDeConversion.setName("tipoDeConversion");
		tipoDeConversion.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		// opcionesJComboBox(tipoDeConversion);
		tipoDeConversion.setBounds(82, 34, 345, 33);
		panel_1.add(tipoDeConversion);

		// JLabel de la cantidad de entrada

		JLabel TituloCantidad = new JLabel("Cantidad:");
		TituloCantidad.setName("TituloCantidad");
		TituloCantidad.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		TituloCantidad.setBounds(10, 15, 73, 41);
		panel.add(TituloCantidad);

		// El JTextfield del dato de Entrada

		EntradaCantidad = new JTextField();
		EntradaCantidad.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		EntradaCantidad.setName("EntradaCantidad");
		EntradaCantidad.setBounds(93, 21, 137, 29);
		panel.add(EntradaCantidad);
		EntradaCantidad.setColumns(10);

		// JLabel del resultado de salida

		resultadoDeSalida = new JLabel("");
		resultadoDeSalida.setHorizontalAlignment(SwingConstants.CENTER);
		resultadoDeSalida.setName("resultadoDeSalida");
		resultadoDeSalida.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		resultadoDeSalida.setBounds(22, 10, 170, 51);
		panel_2.add(resultadoDeSalida);

		// Boton de Salir

		
		javax.swing.JButton BotonSalir = new javax.swing.JButton("Salir");
		BotonSalir.setBackground(new Color(237, 41, 57));
		getContentPane().add(BotonSalir);
		BotonSalir.setName("BotonSalir");
		nombrarBoton(BotonSalir, "Salir");
		// BotonSalir.setName("BotonSalir");
		BotonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cerrar();

			}
		});
		BotonSalir.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		BotonSalir.setBounds(34, 365, 109, 41);
		contentPane.add(BotonSalir);

		// Boton de Atras

		JButton BotonAtras = new JButton("Atras");
		BotonAtras.setBackground(new Color(93, 193, 185));
		BotonAtras.setName("BotonAtras");
		BotonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				application application = new application();

			}
		});
		BotonAtras.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		BotonAtras.setBounds(242, 365, 112, 41);
		contentPane.add(BotonAtras);

		BotonConvertir = new JButton("Convertir");
		BotonConvertir.setName("BotonConvertir");
		nombrarBoton(BotonConvertir, "Convertir");
		BotonConvertir.setBackground(new Color(176,224,230));
		BotonConvertir.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		BotonConvertir.setBounds(449, 365, 112, 41);
		contentPane.add(BotonConvertir);

	}
	//

	
	
}





//
