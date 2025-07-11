package com.iteso.biblioteca.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import javax.swing.border.MatteBorder;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel backGround;
	private CardLayout cardLayout;

	public MainFrame() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(MainFrame.class.getResource("/com/iteso/biblioteca/gui/libro (2).png")));
		setResizable(false);
		setTitle("Gestor Biblioteca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1096, 595);
		backGround = new JPanel();
		backGround.setBackground(new Color(255, 255, 255));
		backGround.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(backGround);
		backGround.setLayout(null);

		JPanel panelCardLayout = new JPanel();
		panelCardLayout.setOpaque(false);
		panelCardLayout.setBackground(new Color(247, 203, 164, 120));
		panelCardLayout.setBounds(153, 10, 919, 538);
		backGround.add(panelCardLayout);
		cardLayout = new CardLayout();
		panelCardLayout.setLayout(cardLayout);

		JPanel pnlInicio = new JPanel();
		pnlInicio.setLayout(null);
		pnlInicio.setBackground(new Color(247, 203, 164, 120));
		panelCardLayout.add(pnlInicio, "inicio");

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(247, 203, 164, 200));
		panel_3.setBounds(59, 342, 374, 149);
		pnlInicio.add(panel_3);

		JLabel lblNewLabel_9 = new JLabel("Usuarios ");
		lblNewLabel_9.setFont(new Font("Roboto", Font.BOLD, 15));
		lblNewLabel_9.setBounds(10, 18, 66, 17);
		panel_3.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("Accede al panel de busqueda y edición de usuarios:");
		lblNewLabel_10.setFont(new Font("Roboto", Font.PLAIN, 13));
		lblNewLabel_10.setBounds(73, 19, 291, 15);
		panel_3.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("\n\nBusqueda de usuario por nombre o ID.");
		lblNewLabel_11.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(10, 53, 354, 13);
		panel_3.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("\n\nRegistrar nuevos usuarios.");
		lblNewLabel_12.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(10, 84, 354, 13);
		panel_3.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("\n\nEliminar usuarios inactivos.");
		lblNewLabel_13.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(10, 115, 354, 13);
		panel_3.add(lblNewLabel_13);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(247, 203, 164, 200));
		panel_1.setBounds(59, 118, 799, 24);
		pnlInicio.add(panel_1);

		JLabel lblNewLabel_2 = new JLabel("Inicio ");
		lblNewLabel_2.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 2, 42, 19);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_7 = new JLabel("Te devuelve a esta pantalla de bienvenida en cualquier momento.");
		lblNewLabel_7.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(62, 4, 565, 15);
		panel_1.add(lblNewLabel_7);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(247, 203, 164, 200));
		panel_5.setBounds(492, 343, 366, 149);
		pnlInicio.add(panel_5);

		JLabel lblNewLabel_14 = new JLabel("Personal ");
		lblNewLabel_14.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_14.setBounds(10, 17, 67, 19);
		panel_5.add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("Gestiona al equipo de la biblioteca:\n\n");
		lblNewLabel_15.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_15.setBounds(87, 20, 269, 15);
		panel_5.add(lblNewLabel_15);

		JLabel lblNewLabel_16 = new JLabel("Localizar datos de cada miembro del personal.\n\n");
		lblNewLabel_16.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_16.setBounds(10, 51, 346, 15);
		panel_5.add(lblNewLabel_16);

		JLabel lblNewLabel_17 = new JLabel("Dar de alta nuevo personal.\n\n");
		lblNewLabel_17.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_17.setBounds(10, 83, 346, 15);
		panel_5.add(lblNewLabel_17);

		JLabel lblNewLabel_18 = new JLabel("Dar de baja al personal que ya no labore.");
		lblNewLabel_18.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_18.setBounds(10, 115, 346, 13);
		panel_5.add(lblNewLabel_18);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(247, 203, 164, 200));
		panel_4.setBounds(492, 163, 366, 149);
		pnlInicio.add(panel_4);

		JLabel lblNewLabel_21 = new JLabel("Ver los préstamos activos.");
		lblNewLabel_21.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_21.setBounds(10, 51, 346, 15);
		panel_4.add(lblNewLabel_21);

		JLabel lblNewLabel_19 = new JLabel("Préstamos");
		lblNewLabel_19.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_19.setBounds(10, 17, 78, 19);
		panel_4.add(lblNewLabel_19);

		JLabel lblNewLabel_20 = new JLabel(" Controla los estados de préstamos:\r\n\r\n");
		lblNewLabel_20.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_20.setBounds(98, 21, 265, 13);
		panel_4.add(lblNewLabel_20);

		JLabel lblNewLabel_22 = new JLabel("\n\nConsultar el historial completo de préstamos.\n\n");
		lblNewLabel_22.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_22.setBounds(10, 83, 346, 15);
		panel_4.add(lblNewLabel_22);

		JLabel lblNewLabel_23 = new JLabel("Actualizar el estado de cada préstamo.");
		lblNewLabel_23.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_23.setBounds(10, 115, 353, 15);
		panel_4.add(lblNewLabel_23);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(247, 203, 164, 200));
		panel.setBounds(59, 24, 799, 65);
		pnlInicio.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Bienvenido a la aplicación de gestión de inventario de biblioteca.");
		lblNewLabel.setBounds(65, 8, 651, 25);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 22));

		JLabel lblSeleccioneLaOperacion = new JLabel(
				"Aquí podrás controlar todos los elementos del inventario, así como la información de usuarios, personal y préstamos.");
		lblSeleccioneLaOperacion.setBounds(10, 41, 761, 16);
		panel.add(lblSeleccioneLaOperacion);
		lblSeleccioneLaOperacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccioneLaOperacion.setFont(new Font("Roboto", Font.BOLD, 14));

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(247, 203, 164, 200));
		panel_2.setBounds(59, 164, 374, 149);
		pnlInicio.add(panel_2);

		JLabel lblNewLabel_3 = new JLabel("Inventario \r\n");
		lblNewLabel_3.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 17, 81, 17);
		panel_2.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Buscar libros u otros materiales.\r\n");
		lblNewLabel_4.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 51, 354, 15);
		panel_2.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Añadir nuevos objetos al inventario.");
		lblNewLabel_5.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 83, 242, 15);
		panel_2.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Eliminar ítems que ya no estén disponibles.");
		lblNewLabel_6.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(10, 115, 282, 15);
		panel_2.add(lblNewLabel_6);

		JLabel lblNewLabel_8 = new JLabel("Accede al panel donde puedes:");
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(101, 18, 239, 15);
		panel_2.add(lblNewLabel_8);

		JPanel pnlInventario = new JPanel();
		pnlInventario.setBackground(new Color(247, 203, 164, 120));
		panelCardLayout.add(pnlInventario, "inventario");
		pnlInventario.setLayout(new BorderLayout(0, 0));

		JMenuBar menuBar = new JMenuBar();
		pnlInventario.add(menuBar, BorderLayout.NORTH);

		JMenu mnNewMenu = new JMenu("Buscar Articulo");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Buscar por Nombre");

		mnNewMenu.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Buscar por codigo");
		
		mnNewMenu.add(mntmNewMenuItem_3);

		JMenu mnNewMenu_1 = new JMenu("Modificar Inventario");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem = new JMenuItem("Agregar Articulo");
		
		mnNewMenu_1.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Eliminar Articulo");

		mnNewMenu_1.add(mntmNewMenuItem_1);

		JPanel inventarioCardLayout = new JPanel();
		inventarioCardLayout.setOpaque(false);
		pnlInventario.add(inventarioCardLayout, BorderLayout.CENTER);
		inventarioCardLayout.setLayout(new CardLayout(0, 0));

		JPanel pnlBuscarPorNombre = new JPanel();
		pnlBuscarPorNombre.setBackground(Color.WHITE);
		inventarioCardLayout.add(pnlBuscarPorNombre, "buscarNombre");

		JPanel pnlBuscarPorCodigo = new JPanel();
		pnlBuscarPorCodigo.setBackground(Color.GRAY);
		inventarioCardLayout.add(pnlBuscarPorCodigo, "buscarCodigo");

		JPanel pnlAgregarArticulo = new JPanel();
		pnlAgregarArticulo.setBackground(Color.BLACK);
		inventarioCardLayout.add(pnlAgregarArticulo, "agregar");

		JPanel pnlEliminarArticulo = new JPanel();
		pnlEliminarArticulo.setBackground(Color.PINK);
		inventarioCardLayout.add(pnlEliminarArticulo, "eliminar");

		JPanel pnlPrestamos = new JPanel();
		pnlPrestamos.setBackground(new Color(247, 203, 164, 120));
		panelCardLayout.add(pnlPrestamos, "prestamos");
		pnlPrestamos.setLayout(new BorderLayout(0, 0));

		JMenuBar menuBar_1 = new JMenuBar();
		pnlPrestamos.add(menuBar_1, BorderLayout.NORTH);

		JMenu mnNewMenu_2 = new JMenu("Ver Préstamos");
		menuBar_1.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Ver Préstamos Activos");
		mnNewMenu_2.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Ver Historial de Préstamos");
		mnNewMenu_2.add(mntmNewMenuItem_5);

		JMenu mnNewMenu_3 = new JMenu("Modificar Préstamos");
		menuBar_1.add(mnNewMenu_3);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Generar Préstamo");
		mnNewMenu_3.add(mntmNewMenuItem_6);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Modificar Estado de Préstamo");
		mnNewMenu_3.add(mntmNewMenuItem_7);

		JPanel prestamosCardLayout = new JPanel();
		prestamosCardLayout.setOpaque(false);
		pnlPrestamos.add(prestamosCardLayout, BorderLayout.CENTER);
		prestamosCardLayout.setLayout(new CardLayout(0, 0));

		JPanel pnlPrestamosActivos = new JPanel();
		prestamosCardLayout.add(pnlPrestamosActivos, "name_141593405642300");

		JPanel pnlHistorialPrestamos = new JPanel();
		pnlHistorialPrestamos.setBackground(Color.GRAY);
		prestamosCardLayout.add(pnlHistorialPrestamos, "name_141602172515600");

		JPanel pnlGenerarPrestamo = new JPanel();
		pnlGenerarPrestamo.setBackground(Color.BLACK);
		prestamosCardLayout.add(pnlGenerarPrestamo, "name_141607943856800");

		JPanel pnlModificarPrestamo = new JPanel();
		pnlModificarPrestamo.setBackground(Color.PINK);
		prestamosCardLayout.add(pnlModificarPrestamo, "name_141611843129300");

		JPanel pnlUsuarios = new JPanel();
		pnlUsuarios.setBackground(new Color(247, 203, 164, 120));
		panelCardLayout.add(pnlUsuarios, "usuarios");
		pnlUsuarios.setLayout(new BorderLayout(0, 0));

		JMenuBar menuBar_2 = new JMenuBar();
		pnlUsuarios.add(menuBar_2, BorderLayout.NORTH);

		JMenu mnNewMenu_4 = new JMenu("Buscar Usuario");
		menuBar_2.add(mnNewMenu_4);

		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Buscar por Nombre");
		mnNewMenu_4.add(mntmNewMenuItem_8);

		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Buscar por ID");
		mnNewMenu_4.add(mntmNewMenuItem_9);

		JMenu mnNewMenu_5 = new JMenu("Modificar Usuario");
		menuBar_2.add(mnNewMenu_5);

		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Registrar Usuario");
		mnNewMenu_5.add(mntmNewMenuItem_10);

		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Eliminar Usuario");
		mnNewMenu_5.add(mntmNewMenuItem_11);

		JPanel usuariosCardLayout = new JPanel();
		usuariosCardLayout.setOpaque(false);
		pnlUsuarios.add(usuariosCardLayout, BorderLayout.CENTER);
		usuariosCardLayout.setLayout(new CardLayout(0, 0));

		JPanel pnlBuscarPorNombreUs = new JPanel();
		usuariosCardLayout.add(pnlBuscarPorNombreUs, "name_141707397930900");

		JPanel pnlBuscarPorIDUs = new JPanel();
		pnlBuscarPorIDUs.setBackground(Color.GRAY);
		usuariosCardLayout.add(pnlBuscarPorIDUs, "name_141712876357600");

		JPanel pnlRegistrarUsuario = new JPanel();
		pnlRegistrarUsuario.setBackground(Color.BLACK);
		usuariosCardLayout.add(pnlRegistrarUsuario, "name_141717190672200");

		JPanel pnlEliminarUsuario = new JPanel();
		pnlEliminarUsuario.setBackground(Color.PINK);
		usuariosCardLayout.add(pnlEliminarUsuario, "name_141720257964900");

		JPanel pnlPersonal = new JPanel();
		pnlPersonal.setBackground(new Color(247, 203, 164, 120));
		panelCardLayout.add(pnlPersonal, "personal");
		pnlPersonal.setLayout(new BorderLayout(0, 0));

		JMenuBar menuBar_3 = new JMenuBar();
		pnlPersonal.add(menuBar_3, BorderLayout.NORTH);

		JMenu mnNewMenu_6 = new JMenu("Buscar Empleado");
		menuBar_3.add(mnNewMenu_6);

		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Buscar por Nombre");
		mnNewMenu_6.add(mntmNewMenuItem_12);

		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Buscar por ID");
		mnNewMenu_6.add(mntmNewMenuItem_13);

		JMenu mnNewMenu_7 = new JMenu("Modificar Personal");
		menuBar_3.add(mnNewMenu_7);

		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Registrar Empleado");
		mnNewMenu_7.add(mntmNewMenuItem_14);

		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Eliminar Empleado");
		mnNewMenu_7.add(mntmNewMenuItem_15);

		JPanel personalCardLayout = new JPanel();
		personalCardLayout.setOpaque(false);
		pnlPersonal.add(personalCardLayout, BorderLayout.CENTER);
		personalCardLayout.setLayout(new CardLayout(0, 0));

		JPanel pnlBuscarPorNombreEm = new JPanel();
		personalCardLayout.add(pnlBuscarPorNombreEm, "name_141746039899200");

		JPanel pnlBuscarPorIDEm = new JPanel();
		pnlBuscarPorIDEm.setBackground(Color.GRAY);
		personalCardLayout.add(pnlBuscarPorIDEm, "name_141750774724800");

		JPanel pnlRegistrarEmpleado = new JPanel();
		pnlRegistrarEmpleado.setBackground(Color.BLACK);
		personalCardLayout.add(pnlRegistrarEmpleado, "name_141753797462200");

		JPanel pnlEliminarEmpleado = new JPanel();
		pnlEliminarEmpleado.setBackground(Color.PINK);
		personalCardLayout.add(pnlEliminarEmpleado, "name_141757030926100");

		JPanel panelOpciones = new JPanel();
		panelOpciones.setBounds(0, 0, 143, 576);
		panelOpciones.setBackground(new Color(243, 181, 124, 220));
		backGround.add(panelOpciones);

		JButton btnInicio = new JButton("Inicio");
		btnInicio.setBounds(10, 188, 123, 42);
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelCardLayout, "inicio");
			}
		});
		panelOpciones.setLayout(null);
		btnInicio.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnInicio.setFont(new Font("Roboto", Font.BOLD, 12));
		btnInicio.setBackground(new Color(254, 253, 241));
		panelOpciones.add(btnInicio);

		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(35, 22, 73, 73);
		lblLogo.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblLogo.setIcon(new ImageIcon(MainFrame.class.getResource("/com/iteso/biblioteca/gui/iteso2.png")));
		panelOpciones.add(lblLogo);

		JButton btnInventario = new JButton("Inventario");
		btnInventario.setBounds(10, 262, 123, 42);
		btnInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelCardLayout, "inventario");
			}
		});
		btnInventario.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnInventario.setFont(new Font("Roboto", Font.BOLD, 12));
		btnInventario.setBackground(new Color(254, 253, 241));
		panelOpciones.add(btnInventario);

		JButton btnPrestamos = new JButton("Prestamos");
		btnPrestamos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelCardLayout, "prestamos");
			}
		});
		btnPrestamos.setBounds(10, 336, 123, 42);
		btnPrestamos.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnPrestamos.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnPrestamos.setFont(new Font("Roboto", Font.BOLD, 12));
		btnPrestamos.setBackground(new Color(254, 253, 241));
		panelOpciones.add(btnPrestamos);

		JButton btnUsuarios = new JButton("Usuarios");
		btnUsuarios.setBounds(10, 410, 123, 42);
		btnUsuarios.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelCardLayout, "usuarios");
			}
		});
		btnUsuarios.setFont(new Font("Roboto", Font.BOLD, 12));
		btnUsuarios.setBackground(new Color(252, 250, 241));
		panelOpciones.add(btnUsuarios);

		JButton btnPersonal = new JButton("Personal\r\n");
		btnPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelCardLayout, "personal");
			}
		});
		btnPersonal.setBounds(10, 484, 123, 42);
		btnPersonal.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnPersonal.setFont(new Font("Roboto", Font.BOLD, 12));
		btnPersonal.setBackground(new Color(252, 250, 241));
		panelOpciones.add(btnPersonal);

		JLabel lblNewLabel_1 = new JLabel("Menú de opciones");
		lblNewLabel_1.setFont(new Font("Roboto", Font.BOLD, 15));
		lblNewLabel_1.setBounds(8, 143, 127, 18);
		panelOpciones.add(lblNewLabel_1);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 201, 174));
		separator.setBounds(10, 161, 123, 2);
		panelOpciones.add(separator);

		JLabel lblNewLabel_24 = new JLabel("ITESO");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_24.setForeground(Color.WHITE);
		lblNewLabel_24.setBounds(42, 96, 58, 22);
		panelOpciones.add(lblNewLabel_24);
		panelOpciones.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { lblLogo, btnInicio,
				btnInventario, btnPrestamos, btnUsuarios, btnPersonal, lblNewLabel_1, separator, lblNewLabel_24 }));

		JLabel lblBackGround = new JLabel("");
		lblBackGround.setOpaque(true);
		lblBackGround.setIcon(
				new ImageIcon(MainFrame.class.getResource("/com/iteso/biblioteca/gui/books-2596809_1280.jpg")));
		lblBackGround.setBounds(0, 0, 1082, 558);
		backGround.add(lblBackGround);

	}
}
