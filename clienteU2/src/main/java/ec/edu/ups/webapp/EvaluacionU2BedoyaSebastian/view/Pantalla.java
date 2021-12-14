package ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.bussines.VehiculoONRemote;
import ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.model.vehiculo;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Pantalla extends JFrame {

	private JPanel contentPane;
	private JTextField tfplaca;
	private JTextField tfmodelo;
	private JTextField tfmarca;
	private JTextField tfcod;
	public VehiculoONRemote vehi;
	private JButton btnbuscar;
	private JButton btnmodificar;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Pantalla(VehiculoONRemote vehi) {
		this.vehi = vehi;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 878, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnionsertar = new JButton("Insertar");
		btnionsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				insertar();

			}
		});
		btnionsertar.setBounds(80, 209, 85, 21);
		contentPane.add(btnionsertar);

		tfplaca = new JTextField();
		tfplaca.setBounds(80, 61, 96, 19);
		contentPane.add(tfplaca);
		tfplaca.setColumns(10);

		tfmodelo = new JTextField();
		tfmodelo.setBounds(80, 107, 96, 19);
		contentPane.add(tfmodelo);
		tfmodelo.setColumns(10);

		tfmarca = new JTextField();
		tfmarca.setBounds(80, 156, 96, 19);
		contentPane.add(tfmarca);
		tfmarca.setColumns(10);

		tfcod = new JTextField();
		tfcod.setBounds(80, 24, 96, 19);
		contentPane.add(tfcod);
		tfcod.setColumns(10);

		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(10, 27, 61, 13);
		contentPane.add(lblNewLabel);

		JLabel placa = new JLabel("Placa");
		placa.setBounds(10, 64, 45, 13);
		contentPane.add(placa);

		JLabel lblNewLabel_2 = new JLabel("Modelo");
		lblNewLabel_2.setBounds(10, 110, 45, 13);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Marca");
		lblNewLabel_3.setBounds(10, 159, 45, 13);
		contentPane.add(lblNewLabel_3);

		btnbuscar = new JButton("buscar");
		btnbuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscar();
			}
		});
		btnbuscar.setBounds(212, 45, 85, 21);
		contentPane.add(btnbuscar);

		btnmodificar = new JButton("Modificar");
		btnmodificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizar();
			}
		});
		btnmodificar.setBounds(212, 106, 85, 21);
		contentPane.add(btnmodificar);
	}

	public void insertar() {
		vehiculo v = new vehiculo();
		v.setCodigo(Integer.parseInt(tfcod.getText()));
		v.setPlaca(tfplaca.getText());
		v.setMarca(tfmarca.getText());
		v.setModelo(tfmodelo.getText());

		vehi.insertar(v);
	}

	public void buscar() {
		int codigo = Integer.parseInt(tfcod.getText());
		vehiculo v=vehi.leer(codigo);
	tfplaca.setText(v.getPlaca());
	tfmarca.setText(v.getMarca());
	tfmodelo.setText(v.getModelo());
		
	}
	public void actualizar(){
		
		vehiculo v = new vehiculo();
		v.setCodigo(Integer.parseInt(tfcod.getText()));
		v.setPlaca(tfplaca.getText());
		v.setMarca(tfmarca.getText());
		v.setModelo(tfmodelo.getText());
		
		vehi.actualizar(v);
	}
}
