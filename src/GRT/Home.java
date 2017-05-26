package GRT;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class Home extends JFrame {
	private Controlador controlador;
	private JTextField txtBusquedaDeCliente;
	private JList list;

	public Home() {
		setTitle("Home");
		setBounds(200, 400, 500, 500);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.homeLogin();
			}
		});

		txtBusquedaDeCliente = new JTextField();
		txtBusquedaDeCliente.setText("busqueda de cliente");
		txtBusquedaDeCliente.setColumns(10);

		JButton btnBuscar = new JButton("buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
			}
		});

		JScrollPane scrollPane = new JScrollPane();

		JButton btnAadirCliente = new JButton("a\u00F1adir cliente");
		btnAadirCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAadirCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.homeAddUsuario();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
								.createSequentialGroup()
								.addContainerGap().addComponent(btnVolver))
								.addGroup(groupLayout
										.createSequentialGroup().addGap(60).addGroup(groupLayout
												.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(txtBusquedaDeCliente, GroupLayout.PREFERRED_SIZE,
																259, GroupLayout.PREFERRED_SIZE)
														.addGap(7).addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE,
																79, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
														.addComponent(btnAadirCliente)
														.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 383,
																GroupLayout.PREFERRED_SIZE)))))
						.addContainerGap(39, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup().addGap(39)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtBusquedaDeCliente, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addGap(28).addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE).addGroup(groupLayout
						.createParallelGroup(Alignment.BASELINE).addComponent(btnVolver).addComponent(btnAadirCliente))
				.addContainerGap()));

		JList list = new JList();

		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				list.getSelectedValue();
				controlador.HomeVerUsuario();
			}
		});
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "Ruben", "Borja", "Carlos", "Sergio", "Jorge" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		getContentPane().setLayout(groupLayout);

	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

}