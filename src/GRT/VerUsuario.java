package GRT;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerUsuario extends JFrame {
	private Controlador controlador;

	public VerUsuario() {
		setTitle("Usuario");
		setBounds(200, 400, 500, 500);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.VerUsuarioHome();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnVolver)
					.addContainerGap(401, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(415, Short.MAX_VALUE)
					.addComponent(btnVolver)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
	}
	public void setControlador (Controlador controlador) {
		this.controlador=controlador;
	}

}
