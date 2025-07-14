package com.iteso.biblioteca.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.SwingConstants;

import com.iteso.biblioteca.manager.DataManager;
import com.iteso.biblioteca.model.Empleado;
import com.iteso.biblioteca.model.Usuario;
import com.iteso.biblioteca.enums.*;

import java.awt.CardLayout;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.iteso.biblioteca.enums.Puesto;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.Panel;
import java.awt.Scrollbar;
import javax.swing.JSlider;

public class MainFrame extends JFrame {

	DataManager dataManager = DataManager.getInstance();
	ArrayList<Empleado> personal = dataManager.getPersonal();
	ArrayList<Usuario> usuarios = dataManager.getUsuarios();

	private static final long serialVersionUID = 1L;
	private JPanel backGround;
	private CardLayout cardLayout;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtEmp;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField txtUs;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_23;
	private JTextField txtPer;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField txtRev;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_30;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField txtLib;
	private JTextField textField_5;
	private JTextField textField_13;
	private JTextField textField_16;
	private JTextField textField_31;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_15;
	private JTable table_Empleado;
	private JTextField textField_39;
	private JTable table_1;
	private JTextField textField_40;
	private JTable table_2;
	private JTextField textField_41;
	private JTable tableUsuariosN;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTable tableUsuariosID;
	private JTextField textField_44;
	private JTable tableUsuariosElim;
	private JTextField textField_45;
	private JTable tableArticuloN;
	private JTextField textField_46;
	private JTable tableArticuloID;
	private JTextField textField_47;
	private JTable tableArticuloElim;
	private JTextField textField_48;
	private JTable tablePrestamoActivo;
	private JTextField textField_49;
	private JTable tableHistorialPrestamos;
	private JTextField textField_50;
	private JTable table;
	private JTextField textField_3;
	private JTextField textField_10;
	private JTextField textField_14;

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

		JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
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

		JLabel lblNewLabel_16 = new JLabel("* Localizar datos de cada miembro del personal.\r\n\r\n");
		lblNewLabel_16.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_16.setBounds(10, 51, 346, 15);
		panel_5.add(lblNewLabel_16);

		JLabel lblNewLabel_17 = new JLabel("* Dar de alta nuevo personal.\r\n\r\n");
		lblNewLabel_17.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_17.setBounds(10, 83, 346, 15);
		panel_5.add(lblNewLabel_17);

		JLabel lblNewLabel_18 = new JLabel("* Dar de baja al personal que ya no labore.");
		lblNewLabel_18.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_18.setBounds(10, 115, 346, 13);
		panel_5.add(lblNewLabel_18);

		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(247, 203, 164, 200));
		panel_4.setBounds(492, 163, 366, 149);
		pnlInicio.add(panel_4);

		JLabel lblNewLabel_21 = new JLabel("* Ver los préstamos activos.");
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

		JLabel lblNewLabel_22 = new JLabel("* Consultar el historial completo de préstamos.\r\n\r\n");
		lblNewLabel_22.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_22.setBounds(10, 83, 346, 15);
		panel_4.add(lblNewLabel_22);

		JLabel lblNewLabel_23 = new JLabel("* Actualizar el estado de cada préstamo.");
		lblNewLabel_23.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_23.setBounds(10, 115, 353, 15);
		panel_4.add(lblNewLabel_23);

		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(247, 203, 164, 200));
		panel_2.setBounds(59, 164, 374, 149);
		pnlInicio.add(panel_2);

		JLabel lblNewLabel_3 = new JLabel("Inventario \r\n");
		lblNewLabel_3.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 17, 81, 17);
		panel_2.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("* Buscar libros u otros materiales.\r\n");
		lblNewLabel_4.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 51, 354, 15);
		panel_2.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("* Añadir nuevos objetos al inventario.");
		lblNewLabel_5.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 83, 242, 15);
		panel_2.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("* Eliminar ítems que ya no estén disponibles.");
		lblNewLabel_6.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(10, 115, 282, 15);
		panel_2.add(lblNewLabel_6);

		JLabel lblNewLabel_8 = new JLabel("Accede al panel donde puedes:");
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(101, 18, 239, 15);
		panel_2.add(lblNewLabel_8);

		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
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

		JLabel lblNewLabel_11 = new JLabel("* Busqueda de usuario por nombre o ID.");
		lblNewLabel_11.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(10, 53, 354, 13);
		panel_3.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("* Registrar nuevos usuarios.");
		lblNewLabel_12.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(10, 84, 354, 13);
		panel_3.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("* Eliminar usuarios inactivos.");
		lblNewLabel_13.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(10, 115, 354, 13);
		panel_3.add(lblNewLabel_13);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(247, 203, 164, 200));
		panel_1.setBounds(59, 118, 799, 382);
		pnlInicio.add(panel_1);

		JLabel lblNewLabel_2 = new JLabel("Inicio ");
		lblNewLabel_2.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 10, 42, 19);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_7 = new JLabel("Te devuelve a esta pantalla de bienvenida en cualquier momento.");
		lblNewLabel_7.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(62, 12, 565, 15);
		panel_1.add(lblNewLabel_7);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(247, 203, 164, 200));
		panel.setBounds(59, 24, 799, 70);
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

		JPanel pnlInventario = new JPanel();
		pnlInventario.setBackground(new Color(247, 203, 164, 120));
		panelCardLayout.add(pnlInventario, "inventario");
		pnlInventario.setLayout(new BorderLayout(0, 0));

		JPanel inventarioCardLayout = new JPanel();
		inventarioCardLayout.setOpaque(false);
		pnlInventario.add(inventarioCardLayout, BorderLayout.CENTER);
		inventarioCardLayout.setLayout(new CardLayout(0, 0));

		JMenuBar menuBarInventario = new JMenuBar();
		pnlInventario.add(menuBarInventario, BorderLayout.NORTH);

		JMenu mnNewMenu = new JMenu("Buscar Artículo");
		menuBarInventario.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Buscar por Nombre");
		mntmNewMenuItem_2.addActionListener(e -> {
			CardLayout layout = (CardLayout) inventarioCardLayout.getLayout();
			layout.show(inventarioCardLayout, "buscarNombre");
		});
		mnNewMenu.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Buscar por Código");
		mntmNewMenuItem_3.addActionListener(e -> {
			CardLayout layout = (CardLayout) inventarioCardLayout.getLayout();
			layout.show(inventarioCardLayout, "buscarCodigo");
		});
		mnNewMenu.add(mntmNewMenuItem_3);

		JMenu mnNewMenu_1 = new JMenu("Modificar Inventario");
		menuBarInventario.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Eliminar Artículo");
		mntmNewMenuItem_1.addActionListener(e -> {
			CardLayout layout = (CardLayout) inventarioCardLayout.getLayout();
			layout.show(inventarioCardLayout, "eliminar");
		});

		JMenu mnNewMenu_8 = new JMenu("Agregar Artículo");
		mnNewMenu_1.add(mnNewMenu_8);

		JMenuItem mntmNewMenuItem = new JMenuItem("Agregar Libro");
		mntmNewMenuItem.addActionListener(e -> {
			CardLayout layout = (CardLayout) inventarioCardLayout.getLayout();
			layout.show(inventarioCardLayout, "agregarLibro");
		});
		mnNewMenu_8.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_19 = new JMenuItem("Agregar Revista");
		mntmNewMenuItem_19.addActionListener(e -> {
			CardLayout layout = (CardLayout) inventarioCardLayout.getLayout();
			layout.show(inventarioCardLayout, "agregarRevista");
		});
		mnNewMenu_8.add(mntmNewMenuItem_19);

		JMenuItem mntmNewMenuItem_20 = new JMenuItem("Agregar Periódico");
		mntmNewMenuItem_20.addActionListener(e -> {
			CardLayout layout = (CardLayout) inventarioCardLayout.getLayout();
			layout.show(inventarioCardLayout, "agregarPeriodico");
		});

		mnNewMenu_8.add(mntmNewMenuItem_20);
		mnNewMenu_1.add(mntmNewMenuItem_1);

		JPanel pnlBuscarPorNombre = new JPanel();
		pnlBuscarPorNombre.setOpaque(false);
		pnlBuscarPorNombre.setBackground(Color.YELLOW);
		inventarioCardLayout.add(pnlBuscarPorNombre, "buscarNombre");
		pnlBuscarPorNombre.setLayout(null);

		JPanel panel_9_5_3 = new JPanel();
		panel_9_5_3.setBounds(10, 10, 899, 496);
		pnlBuscarPorNombre.add(panel_9_5_3);
		panel_9_5_3.setLayout(new BorderLayout(0, 0));

		JPanel panel_10_3 = new JPanel();
		panel_9_5_3.add(panel_10_3, BorderLayout.NORTH);
		panel_10_3.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_29_5 = new JLabel(" Ingrese Nombre del Artículo  ");
		lblNewLabel_29_5.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_10_3.add(lblNewLabel_29_5, BorderLayout.WEST);

		textField_45 = new JTextField();
		textField_45.setColumns(10);
		panel_10_3.add(textField_45, BorderLayout.CENTER);

		JButton btnNewButton_3_3 = new JButton("Confirmar");
		btnNewButton_3_3.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_10_3.add(btnNewButton_3_3, BorderLayout.EAST);

		JScrollBar scrollBar_10 = new JScrollBar();
		panel_9_5_3.add(scrollBar_10, BorderLayout.EAST);

		JScrollBar scrollBar_11 = new JScrollBar();
		scrollBar_11.setOrientation(JScrollBar.HORIZONTAL);
		panel_9_5_3.add(scrollBar_11, BorderLayout.SOUTH);

		tableArticuloN = new JTable();
		tableArticuloN.setEnabled(false);
		panel_9_5_3.add(tableArticuloN, BorderLayout.CENTER);

		JPanel pnlBuscarPorCodigo = new JPanel();
		pnlBuscarPorCodigo.setOpaque(false);
		pnlBuscarPorCodigo.setBackground(Color.MAGENTA);
		inventarioCardLayout.add(pnlBuscarPorCodigo, "buscarCodigo");
		pnlBuscarPorCodigo.setLayout(null);

		JPanel panel_9_5_3_1 = new JPanel();
		panel_9_5_3_1.setBounds(10, 10, 899, 496);
		pnlBuscarPorCodigo.add(panel_9_5_3_1);
		panel_9_5_3_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_10_3_1 = new JPanel();
		panel_9_5_3_1.add(panel_10_3_1, BorderLayout.NORTH);
		panel_10_3_1.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_29_5_1 = new JLabel(" Ingrese ID del Artículo  ");
		lblNewLabel_29_5_1.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_10_3_1.add(lblNewLabel_29_5_1, BorderLayout.WEST);

		textField_46 = new JTextField();
		textField_46.setColumns(10);
		panel_10_3_1.add(textField_46, BorderLayout.CENTER);

		JButton btnNewButton_3_3_1 = new JButton("Confirmar");
		btnNewButton_3_3_1.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_10_3_1.add(btnNewButton_3_3_1, BorderLayout.EAST);

		JScrollBar scrollBar_12 = new JScrollBar();
		panel_9_5_3_1.add(scrollBar_12, BorderLayout.EAST);

		JScrollBar scrollBar_13 = new JScrollBar();
		scrollBar_13.setOrientation(JScrollBar.HORIZONTAL);
		panel_9_5_3_1.add(scrollBar_13, BorderLayout.SOUTH);

		tableArticuloID = new JTable();
		tableArticuloID.setEnabled(false);
		panel_9_5_3_1.add(tableArticuloID, BorderLayout.CENTER);

		JPanel pnlAgregarLibro = new JPanel();
		pnlAgregarLibro.setOpaque(false);
		pnlAgregarLibro.setBackground(Color.BLUE);
		inventarioCardLayout.add(pnlAgregarLibro, "agregarLibro");
		pnlAgregarLibro.setLayout(null);

		JPanel pnlFormularioLibro = new JPanel();
		pnlFormularioLibro.setBackground(new Color(247, 203, 164, 200));
		pnlFormularioLibro.setBounds(218, 10, 525, 506);
		pnlAgregarLibro.add(pnlFormularioLibro);
		pnlFormularioLibro.setLayout(new BorderLayout(0, 0));

		JPanel panel_7_2_1 = new JPanel();
		panel_7_2_1.setOpaque(false);
		pnlFormularioLibro.add(panel_7_2_1, BorderLayout.NORTH);
		panel_7_2_1.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_30_2_1 = new JLabel("Agregar Libro");
		lblNewLabel_30_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_30_2_1.setFont(new Font("Roboto", Font.BOLD, 18));
		panel_7_2_1.add(lblNewLabel_30_2_1, BorderLayout.CENTER);

		JLabel lblNewLabel_31_2_1 = new JLabel(
				"Para agregar el libro al inventario llene todos los campos del formulario");
		lblNewLabel_31_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_31_2_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		panel_7_2_1.add(lblNewLabel_31_2_1, BorderLayout.SOUTH);

		JPanel panel_9_2_1 = new JPanel();
		panel_9_2_1.setOpaque(false);
		panel_7_2_1.add(panel_9_2_1, BorderLayout.NORTH);

		JPanel panel_8_2_1_2_1_1 = new JPanel();
		panel_8_2_1_2_1_1.setLayout(null);
		panel_8_2_1_2_1_1.setOpaque(false);
		panel_8_2_1_2_1_1.setBackground(Color.LIGHT_GRAY);
		pnlFormularioLibro.add(panel_8_2_1_2_1_1, BorderLayout.CENTER);

		JLabel lblNewLabel_26_2_1_2_1_1 = new JLabel("Código");
		lblNewLabel_26_2_1_2_1_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_26_2_1_2_1_1.setBounds(31, 116, 227, 17);
		panel_8_2_1_2_1_1.add(lblNewLabel_26_2_1_2_1_1);

		txtLib = new JTextField();
		txtLib.setText("LIB-");
		txtLib.setForeground(Color.BLACK);
		txtLib.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtLib.setColumns(10);
		txtLib.setBounds(31, 143, 227, 21);
		panel_8_2_1_2_1_1.add(txtLib);

		JLabel lblNewLabel_28_2_1_2_1_1 = new JLabel("Editorial");
		lblNewLabel_28_2_1_2_1_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_28_2_1_2_1_1.setBounds(31, 170, 227, 17);
		panel_8_2_1_2_1_1.add(lblNewLabel_28_2_1_2_1_1);

		textField_5 = new JTextField();
		textField_5.setForeground(Color.BLACK);
		textField_5.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(31, 197, 227, 21);
		panel_8_2_1_2_1_1.add(textField_5);

		JLabel lblNewLabel_33_2_1_2_3_1 = new JLabel("Disponibilidad");
		lblNewLabel_33_2_1_2_3_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_33_2_1_2_3_1.setBounds(31, 332, 227, 17);
		panel_8_2_1_2_1_1.add(lblNewLabel_33_2_1_2_3_1);

		JLabel lblNewLabel_29_2_1_2_1_1 = new JLabel("Costo de Multa Diaria");
		lblNewLabel_29_2_1_2_1_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_29_2_1_2_1_1.setBounds(31, 224, 227, 17);
		panel_8_2_1_2_1_1.add(lblNewLabel_29_2_1_2_1_1);

		textField_13 = new JTextField();
		textField_13.setForeground(Color.BLACK);
		textField_13.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_13.setColumns(10);
		textField_13.setBounds(31, 251, 227, 21);
		panel_8_2_1_2_1_1.add(textField_13);

		JCheckBox chckbxNewCheckBox_1_2_2_1 = new JCheckBox("Disponible para prestamo");
		chckbxNewCheckBox_1_2_2_1.setFont(new Font("Roboto", Font.BOLD, 12));
		chckbxNewCheckBox_1_2_2_1.setBounds(31, 357, 179, 23);
		panel_8_2_1_2_1_1.add(chckbxNewCheckBox_1_2_2_1);

		JLabel lblNewLabel_25_3_1 = new JLabel("Idioma");
		lblNewLabel_25_3_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_25_3_1.setBounds(31, 278, 227, 17);
		panel_8_2_1_2_1_1.add(lblNewLabel_25_3_1);

		textField_16 = new JTextField();
		textField_16.setForeground(Color.BLACK);
		textField_16.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_16.setColumns(10);
		textField_16.setBounds(31, 33, 461, 21);
		panel_8_2_1_2_1_1.add(textField_16);

		JLabel lblNewLabel_25_2_1_2_1_1 = new JLabel("Titulo");
		lblNewLabel_25_2_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_25_2_1_2_1_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_25_2_1_2_1_1.setBounds(31, 8, 471, 17);
		panel_8_2_1_2_1_1.add(lblNewLabel_25_2_1_2_1_1);

		JLabel lblNewLabel_26_3_1 = new JLabel("ISBN");
		lblNewLabel_26_3_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_26_3_1.setBounds(268, 116, 227, 17);
		panel_8_2_1_2_1_1.add(lblNewLabel_26_3_1);

		textField_31 = new JTextField();
		textField_31.setForeground(Color.BLACK);
		textField_31.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_31.setColumns(10);
		textField_31.setBounds(268, 143, 224, 21);
		panel_8_2_1_2_1_1.add(textField_31);

		JLabel lblNewLabel_27_2_1_2_1_1 = new JLabel("Año de Publicación");
		lblNewLabel_27_2_1_2_1_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_27_2_1_2_1_1.setBounds(268, 170, 227, 17);
		panel_8_2_1_2_1_1.add(lblNewLabel_27_2_1_2_1_1);

		textField_37 = new JTextField();
		textField_37.setForeground(Color.BLACK);
		textField_37.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_37.setColumns(10);
		textField_37.setBounds(268, 197, 224, 21);
		panel_8_2_1_2_1_1.add(textField_37);

		JLabel lblNewLabel_33_2_1_2_1_1_1 = new JLabel("Condición del Libro");
		lblNewLabel_33_2_1_2_1_1_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_33_2_1_2_1_1_1.setBounds(268, 224, 227, 17);
		panel_8_2_1_2_1_1.add(lblNewLabel_33_2_1_2_1_1_1);

		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setModel(new DefaultComboBoxModel(Estado.values()));
		comboBox_2_2.setFont(new Font("Roboto", Font.PLAIN, 12));
		comboBox_2_2.setBounds(268, 252, 224, 20);
		panel_8_2_1_2_1_1.add(comboBox_2_2);

		JLabel lblNewLabel_32_2_1_2_1_1 = new JLabel("Costo de Reparación");
		lblNewLabel_32_2_1_2_1_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_32_2_1_2_1_1.setBounds(268, 278, 227, 17);
		panel_8_2_1_2_1_1.add(lblNewLabel_32_2_1_2_1_1);

		textField_38 = new JTextField();
		textField_38.setForeground(Color.BLACK);
		textField_38.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_38.setColumns(10);
		textField_38.setBounds(268, 305, 224, 21);
		panel_8_2_1_2_1_1.add(textField_38);

		JLabel lblNewLabel_33_2_1_2_2_1_1 = new JLabel("Histórico");
		lblNewLabel_33_2_1_2_2_1_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_33_2_1_2_2_1_1.setBounds(268, 332, 227, 17);
		panel_8_2_1_2_1_1.add(lblNewLabel_33_2_1_2_2_1_1);

		JCheckBox chckbxNewCheckBox_1_2_1_1_1 = new JCheckBox("No es prestable");
		chckbxNewCheckBox_1_2_1_1_1.setFont(new Font("Roboto", Font.BOLD, 12));
		chckbxNewCheckBox_1_2_1_1_1.setBounds(268, 357, 125, 23);
		panel_8_2_1_2_1_1.add(chckbxNewCheckBox_1_2_1_1_1);

		JLabel lblNewLabel_32_2_1_2_3_1_1 = new JLabel("Género");
		lblNewLabel_32_2_1_2_3_1_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_32_2_1_2_3_1_1.setBounds(31, 388, 227, 17);
		panel_8_2_1_2_1_1.add(lblNewLabel_32_2_1_2_3_1_1);

		JButton btnNewButton_2_2_2_1_1 = new JButton("Confirmar");
		btnNewButton_2_2_2_1_1.setFont(new Font("Roboto", Font.BOLD, 14));
		btnNewButton_2_2_2_1_1.setBounds(326, 412, 154, 25);
		panel_8_2_1_2_1_1.add(btnNewButton_2_2_2_1_1);

		JComboBox comboBox_2_1_1 = new JComboBox();
		comboBox_2_1_1.setModel(new DefaultComboBoxModel(Genero.values()));
		comboBox_2_1_1.setBounds(31, 415, 227, 20);
		panel_8_2_1_2_1_1.add(comboBox_2_1_1);

		JLabel lblNewLabel_27 = new JLabel("Nombre del Autor");
		lblNewLabel_27.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_27.setBounds(31, 62, 461, 17);
		panel_8_2_1_2_1_1.add(lblNewLabel_27);

		textField_15 = new JTextField();
		textField_15.setForeground(Color.BLACK);
		textField_15.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_15.setColumns(10);
		textField_15.setBounds(31, 89, 461, 21);
		panel_8_2_1_2_1_1.add(textField_15);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Roboto", Font.PLAIN, 12));
		comboBox_3.setModel(new DefaultComboBoxModel(Idioma.values()));
		comboBox_3.setBounds(31, 301, 227, 21);
		panel_8_2_1_2_1_1.add(comboBox_3);

		JPanel pnlEliminarArticulo = new JPanel();
		pnlEliminarArticulo.setOpaque(false);
		pnlEliminarArticulo.setBackground(Color.LIGHT_GRAY);
		inventarioCardLayout.add(pnlEliminarArticulo, "eliminar");
		pnlEliminarArticulo.setLayout(null);

		JPanel panel_9_5_3_1_1 = new JPanel();
		panel_9_5_3_1_1.setBounds(10, 10, 899, 496);
		pnlEliminarArticulo.add(panel_9_5_3_1_1);
		panel_9_5_3_1_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_10_3_1_1 = new JPanel();
		panel_9_5_3_1_1.add(panel_10_3_1_1, BorderLayout.NORTH);
		panel_10_3_1_1.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_29_5_1_1 = new JLabel(" Ingrese ID del Artículo  ");
		lblNewLabel_29_5_1_1.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_10_3_1_1.add(lblNewLabel_29_5_1_1, BorderLayout.WEST);

		textField_47 = new JTextField();
		textField_47.setColumns(10);
		panel_10_3_1_1.add(textField_47, BorderLayout.CENTER);

		JButton btnNewButton_3_3_1_1 = new JButton("Confirmar");
		btnNewButton_3_3_1_1.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_10_3_1_1.add(btnNewButton_3_3_1_1, BorderLayout.EAST);

		JScrollBar scrollBar_14 = new JScrollBar();
		panel_9_5_3_1_1.add(scrollBar_14, BorderLayout.EAST);

		JScrollBar scrollBar_15 = new JScrollBar();
		scrollBar_15.setOrientation(JScrollBar.HORIZONTAL);
		panel_9_5_3_1_1.add(scrollBar_15, BorderLayout.SOUTH);

		tableArticuloElim = new JTable();
		tableArticuloElim.setEnabled(false);
		panel_9_5_3_1_1.add(tableArticuloElim, BorderLayout.CENTER);

		JPanel pnlAgregarRevista = new JPanel();
		pnlAgregarRevista.setLayout(null);
		pnlAgregarRevista.setOpaque(false);
		pnlAgregarRevista.setBackground(Color.BLUE);
		inventarioCardLayout.add(pnlAgregarRevista, "agregarRevista");

		JPanel pnlFormularioRevista = new JPanel();
		pnlFormularioRevista.setBackground(new Color(247, 203, 164, 200));
		pnlFormularioRevista.setBounds(218, 10, 525, 506);
		pnlAgregarRevista.add(pnlFormularioRevista);
		pnlFormularioRevista.setLayout(new BorderLayout(0, 0));

		JPanel panel_7_2_1_1 = new JPanel();
		panel_7_2_1_1.setOpaque(false);
		pnlFormularioRevista.add(panel_7_2_1_1, BorderLayout.NORTH);
		panel_7_2_1_1.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_30_2_1_1 = new JLabel("Agregar Revista");
		lblNewLabel_30_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_30_2_1_1.setFont(new Font("Roboto", Font.BOLD, 18));
		panel_7_2_1_1.add(lblNewLabel_30_2_1_1, BorderLayout.CENTER);

		JLabel lblNewLabel_31_2_1_1 = new JLabel(
				"Para agregar la revista al inventario llene todos los campos del formulario");
		lblNewLabel_31_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_31_2_1_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		panel_7_2_1_1.add(lblNewLabel_31_2_1_1, BorderLayout.SOUTH);

		JPanel panel_9_2_1_1 = new JPanel();
		panel_9_2_1_1.setOpaque(false);
		panel_7_2_1_1.add(panel_9_2_1_1, BorderLayout.NORTH);

		JPanel panel_8_2_1_2_1 = new JPanel();
		panel_8_2_1_2_1.setLayout(null);
		panel_8_2_1_2_1.setOpaque(false);
		panel_8_2_1_2_1.setBackground(Color.LIGHT_GRAY);
		pnlFormularioRevista.add(panel_8_2_1_2_1, BorderLayout.CENTER);

		JLabel lblNewLabel_26_2_1_2_1 = new JLabel("Código");
		lblNewLabel_26_2_1_2_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_26_2_1_2_1.setBounds(31, 62, 217, 17);
		panel_8_2_1_2_1.add(lblNewLabel_26_2_1_2_1);

		txtRev = new JTextField();
		txtRev.setText("REV-");
		txtRev.setForeground(Color.BLACK);
		txtRev.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtRev.setColumns(10);
		txtRev.setBounds(31, 87, 227, 21);
		panel_8_2_1_2_1.add(txtRev);

		JLabel lblNewLabel_28_2_1_2_1 = new JLabel("Editorial");
		lblNewLabel_28_2_1_2_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_28_2_1_2_1.setBounds(31, 116, 217, 17);
		panel_8_2_1_2_1.add(lblNewLabel_28_2_1_2_1);

		textField_18 = new JTextField();
		textField_18.setForeground(Color.BLACK);
		textField_18.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_18.setColumns(10);
		textField_18.setBounds(31, 141, 227, 21);
		panel_8_2_1_2_1.add(textField_18);

		JLabel lblNewLabel_33_2_1_2_3 = new JLabel("Disponibilidad");
		lblNewLabel_33_2_1_2_3.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_33_2_1_2_3.setBounds(31, 278, 217, 17);
		panel_8_2_1_2_1.add(lblNewLabel_33_2_1_2_3);

		JLabel lblNewLabel_29_2_1_2_1 = new JLabel("Costo de Multa Diaria");
		lblNewLabel_29_2_1_2_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_29_2_1_2_1.setBounds(31, 170, 217, 17);
		panel_8_2_1_2_1.add(lblNewLabel_29_2_1_2_1);

		textField_19 = new JTextField();
		textField_19.setForeground(Color.BLACK);
		textField_19.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_19.setColumns(10);
		textField_19.setBounds(31, 195, 227, 21);
		panel_8_2_1_2_1.add(textField_19);

		JCheckBox chckbxNewCheckBox_1_2_2 = new JCheckBox("Disponible para prestamo");
		chckbxNewCheckBox_1_2_2.setFont(new Font("Roboto", Font.BOLD, 12));
		chckbxNewCheckBox_1_2_2.setBounds(31, 303, 179, 23);
		panel_8_2_1_2_1.add(chckbxNewCheckBox_1_2_2);

		JLabel lblNewLabel_25_3 = new JLabel("Idioma");
		lblNewLabel_25_3.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_25_3.setBounds(31, 224, 217, 17);
		panel_8_2_1_2_1.add(lblNewLabel_25_3);

		JLabel lblNewLabel_33_2_1_2_5_2 = new JLabel("Número de Edición");
		lblNewLabel_33_2_1_2_5_2.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_33_2_1_2_5_2.setBounds(31, 334, 217, 17);
		panel_8_2_1_2_1.add(lblNewLabel_33_2_1_2_5_2);

		textField_21 = new JTextField();
		textField_21.setForeground(Color.BLACK);
		textField_21.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_21.setColumns(10);
		textField_21.setBounds(31, 359, 227, 21);
		panel_8_2_1_2_1.add(textField_21);

		JLabel lblNewLabel_33_2_1_2_5_1_1 = new JLabel("Mes de Publicación");
		lblNewLabel_33_2_1_2_5_1_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_33_2_1_2_5_1_1.setBounds(31, 386, 217, 17);
		panel_8_2_1_2_1.add(lblNewLabel_33_2_1_2_5_1_1);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinner_1.setFont(new Font("Roboto", Font.PLAIN, 14));
		spinner_1.setBounds(31, 413, 227, 24);
		panel_8_2_1_2_1.add(spinner_1);

		textField_22 = new JTextField();
		textField_22.setForeground(Color.BLACK);
		textField_22.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_22.setColumns(10);
		textField_22.setBounds(31, 33, 464, 21);
		panel_8_2_1_2_1.add(textField_22);

		JLabel lblNewLabel_25_2_1_2_1 = new JLabel("Titulo");
		lblNewLabel_25_2_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_25_2_1_2_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_25_2_1_2_1.setBounds(31, 8, 217, 17);
		panel_8_2_1_2_1.add(lblNewLabel_25_2_1_2_1);

		JLabel lblNewLabel_26_3 = new JLabel("ISSN");
		lblNewLabel_26_3.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_26_3.setBounds(268, 62, 227, 17);
		panel_8_2_1_2_1.add(lblNewLabel_26_3);

		textField_30 = new JTextField();
		textField_30.setForeground(Color.BLACK);
		textField_30.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_30.setColumns(10);
		textField_30.setBounds(268, 87, 227, 21);
		panel_8_2_1_2_1.add(textField_30);

		JLabel lblNewLabel_27_2_1_2_1 = new JLabel("Año de Publicación");
		lblNewLabel_27_2_1_2_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_27_2_1_2_1.setBounds(268, 116, 227, 17);
		panel_8_2_1_2_1.add(lblNewLabel_27_2_1_2_1);

		textField_35 = new JTextField();
		textField_35.setForeground(Color.BLACK);
		textField_35.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_35.setColumns(10);
		textField_35.setBounds(268, 141, 228, 21);
		panel_8_2_1_2_1.add(textField_35);

		JLabel lblNewLabel_33_2_1_2_1_1 = new JLabel("Condición del Periódico");
		lblNewLabel_33_2_1_2_1_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_33_2_1_2_1_1.setBounds(268, 170, 227, 17);
		panel_8_2_1_2_1.add(lblNewLabel_33_2_1_2_1_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(Estado.values()));
		comboBox_2.setBounds(268, 195, 227, 20);
		panel_8_2_1_2_1.add(comboBox_2);

		JLabel lblNewLabel_32_2_1_2_1 = new JLabel("Costo de Reparación");
		lblNewLabel_32_2_1_2_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_32_2_1_2_1.setBounds(268, 223, 227, 17);
		panel_8_2_1_2_1.add(lblNewLabel_32_2_1_2_1);

		textField_36 = new JTextField();
		textField_36.setForeground(Color.BLACK);
		textField_36.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_36.setColumns(10);
		textField_36.setBounds(268, 248, 228, 21);
		panel_8_2_1_2_1.add(textField_36);

		JLabel lblNewLabel_33_2_1_2_2_1 = new JLabel("Histórico");
		lblNewLabel_33_2_1_2_2_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_33_2_1_2_2_1.setBounds(268, 277, 227, 17);
		panel_8_2_1_2_1.add(lblNewLabel_33_2_1_2_2_1);

		JCheckBox chckbxNewCheckBox_1_2_1_1 = new JCheckBox("No es prestable");
		chckbxNewCheckBox_1_2_1_1.setFont(new Font("Roboto", Font.BOLD, 12));
		chckbxNewCheckBox_1_2_1_1.setBounds(268, 302, 125, 23);
		panel_8_2_1_2_1.add(chckbxNewCheckBox_1_2_1_1);

		JLabel lblNewLabel_32_2_1_2_3_1 = new JLabel("Temática");
		lblNewLabel_32_2_1_2_3_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_32_2_1_2_3_1.setBounds(268, 333, 227, 17);
		panel_8_2_1_2_1.add(lblNewLabel_32_2_1_2_3_1);

		JButton btnNewButton_2_2_2_1 = new JButton("Confirmar");
		btnNewButton_2_2_2_1.setFont(new Font("Roboto", Font.BOLD, 14));
		btnNewButton_2_2_2_1.setBounds(326, 412, 111, 25);
		panel_8_2_1_2_1.add(btnNewButton_2_2_2_1);

		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(TematicaRevista.values()));
		comboBox_2_1.setBounds(268, 358, 227, 20);
		panel_8_2_1_2_1.add(comboBox_2_1);

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(Idioma.values()));
		comboBox_4.setBounds(31, 247, 227, 21);
		panel_8_2_1_2_1.add(comboBox_4);

		JPanel pnlAgregarPeriodico = new JPanel();
		pnlAgregarPeriodico.setLayout(null);
		pnlAgregarPeriodico.setOpaque(false);
		pnlAgregarPeriodico.setBackground(Color.BLUE);
		inventarioCardLayout.add(pnlAgregarPeriodico, "agregarPeriodico");

		JPanel pnlFormularioPeriodico = new JPanel();
		pnlFormularioPeriodico.setBackground(new Color(247, 203, 164, 200));
		pnlFormularioPeriodico.setBounds(218, 10, 525, 506);
		pnlAgregarPeriodico.add(pnlFormularioPeriodico);
		pnlFormularioPeriodico.setLayout(new BorderLayout(0, 0));

		JPanel panel_7_2_1_2 = new JPanel();
		panel_7_2_1_2.setOpaque(false);
		pnlFormularioPeriodico.add(panel_7_2_1_2, BorderLayout.NORTH);
		panel_7_2_1_2.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_30_2_1_2 = new JLabel("Agregar Periódico");
		lblNewLabel_30_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_30_2_1_2.setFont(new Font("Roboto", Font.BOLD, 20));
		panel_7_2_1_2.add(lblNewLabel_30_2_1_2, BorderLayout.CENTER);

		JLabel lblNewLabel_31_2_1_2 = new JLabel(
				"Para agregar el periodico al inventario llene todos los campos del formulario");
		lblNewLabel_31_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_31_2_1_2.setFont(new Font("Roboto", Font.PLAIN, 14));
		panel_7_2_1_2.add(lblNewLabel_31_2_1_2, BorderLayout.SOUTH);

		JPanel panel_9_2_1_2 = new JPanel();
		panel_9_2_1_2.setOpaque(false);
		panel_7_2_1_2.add(panel_9_2_1_2, BorderLayout.NORTH);

		JPanel panel_8_2_1_2 = new JPanel();
		panel_8_2_1_2.setLayout(null);
		panel_8_2_1_2.setOpaque(false);
		panel_8_2_1_2.setBackground(Color.LIGHT_GRAY);
		pnlFormularioPeriodico.add(panel_8_2_1_2, BorderLayout.CENTER);

		JLabel lblNewLabel_25_2_1_2 = new JLabel("Titulo");
		lblNewLabel_25_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_25_2_1_2.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_25_2_1_2.setBounds(31, 8, 482, 17);
		panel_8_2_1_2.add(lblNewLabel_25_2_1_2);

		textField_23 = new JTextField();
		textField_23.setForeground(Color.BLACK);
		textField_23.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_23.setColumns(10);
		textField_23.setBounds(31, 33, 464, 21);
		panel_8_2_1_2.add(textField_23);

		JLabel lblNewLabel_26_2_1_2 = new JLabel("Código");
		lblNewLabel_26_2_1_2.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_26_2_1_2.setBounds(31, 62, 227, 17);
		panel_8_2_1_2.add(lblNewLabel_26_2_1_2);

		txtPer = new JTextField();
		txtPer.setText("PER-");
		txtPer.setForeground(Color.BLACK);
		txtPer.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtPer.setColumns(10);
		txtPer.setBounds(31, 87, 227, 21);
		panel_8_2_1_2.add(txtPer);

		JLabel lblNewLabel_27_2_1_2 = new JLabel("Año de Publicación");
		lblNewLabel_27_2_1_2.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_27_2_1_2.setBounds(268, 116, 227, 17);
		panel_8_2_1_2.add(lblNewLabel_27_2_1_2);

		textField_25 = new JTextField();
		textField_25.setForeground(Color.BLACK);
		textField_25.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_25.setColumns(10);
		textField_25.setBounds(267, 141, 228, 21);
		panel_8_2_1_2.add(textField_25);

		JLabel lblNewLabel_28_2_1_2 = new JLabel("Editorial");
		lblNewLabel_28_2_1_2.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_28_2_1_2.setBounds(31, 116, 227, 17);
		panel_8_2_1_2.add(lblNewLabel_28_2_1_2);

		textField_26 = new JTextField();
		textField_26.setForeground(Color.BLACK);
		textField_26.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_26.setColumns(10);
		textField_26.setBounds(31, 141, 227, 21);
		panel_8_2_1_2.add(textField_26);

		JLabel lblNewLabel_33_2_1_2 = new JLabel("Disponibilidad");
		lblNewLabel_33_2_1_2.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_33_2_1_2.setBounds(31, 278, 227, 17);
		panel_8_2_1_2.add(lblNewLabel_33_2_1_2);

		JLabel lblNewLabel_29_2_1_2 = new JLabel("Costo de Multa Diaria");
		lblNewLabel_29_2_1_2.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_29_2_1_2.setBounds(31, 170, 227, 17);
		panel_8_2_1_2.add(lblNewLabel_29_2_1_2);

		textField_27 = new JTextField();
		textField_27.setForeground(Color.BLACK);
		textField_27.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_27.setColumns(10);
		textField_27.setBounds(31, 195, 227, 21);
		panel_8_2_1_2.add(textField_27);

		JLabel lblNewLabel_32_2_1_2 = new JLabel("Costo de Reparación");
		lblNewLabel_32_2_1_2.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_32_2_1_2.setBounds(268, 223, 227, 17);
		panel_8_2_1_2.add(lblNewLabel_32_2_1_2);

		textField_28 = new JTextField();
		textField_28.setForeground(Color.BLACK);
		textField_28.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_28.setColumns(10);
		textField_28.setBounds(267, 248, 228, 21);
		panel_8_2_1_2.add(textField_28);

		JButton btnNewButton_2_2_2 = new JButton("Confirmar");
		btnNewButton_2_2_2.setFont(new Font("Roboto", Font.BOLD, 14));
		btnNewButton_2_2_2.setBounds(326, 412, 111, 25);
		panel_8_2_1_2.add(btnNewButton_2_2_2);

		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("Disponible para prestamo");
		chckbxNewCheckBox_1_2.setFont(new Font("Roboto", Font.BOLD, 12));
		chckbxNewCheckBox_1_2.setBounds(28, 303, 179, 23);
		panel_8_2_1_2.add(chckbxNewCheckBox_1_2);

		JLabel lblNewLabel_33_2_1_2_1 = new JLabel("Condición del Periódico");
		lblNewLabel_33_2_1_2_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_33_2_1_2_1.setBounds(268, 170, 227, 17);
		panel_8_2_1_2.add(lblNewLabel_33_2_1_2_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Estado.values()));
		comboBox.setBounds(268, 195, 227, 20);
		panel_8_2_1_2.add(comboBox);

		JLabel lblNewLabel_33_2_1_2_2 = new JLabel("Histórico");
		lblNewLabel_33_2_1_2_2.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_33_2_1_2_2.setBounds(268, 277, 227, 17);
		panel_8_2_1_2.add(lblNewLabel_33_2_1_2_2);

		JCheckBox chckbxNewCheckBox_1_2_1 = new JCheckBox("Artículo de valor histórico");
		chckbxNewCheckBox_1_2_1.setFont(new Font("Roboto", Font.BOLD, 12));
		chckbxNewCheckBox_1_2_1.setBounds(267, 302, 228, 23);
		panel_8_2_1_2.add(chckbxNewCheckBox_1_2_1);

		JLabel lblNewLabel_25 = new JLabel("Idioma");
		lblNewLabel_25.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_25.setBounds(31, 224, 227, 17);
		panel_8_2_1_2.add(lblNewLabel_25);

		JLabel lblNewLabel_26 = new JLabel("ISSN");
		lblNewLabel_26.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_26.setBounds(268, 62, 227, 17);
		panel_8_2_1_2.add(lblNewLabel_26);

		textField_32 = new JTextField();
		textField_32.setForeground(Color.BLACK);
		textField_32.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_32.setColumns(10);
		textField_32.setBounds(268, 87, 227, 21);
		panel_8_2_1_2.add(textField_32);

		JLabel lblNewLabel_33_2_1_2_5 = new JLabel("Sección Principal");
		lblNewLabel_33_2_1_2_5.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_33_2_1_2_5.setBounds(31, 334, 113, 17);
		panel_8_2_1_2.add(lblNewLabel_33_2_1_2_5);

		textField_33 = new JTextField();
		textField_33.setForeground(Color.BLACK);
		textField_33.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_33.setColumns(10);
		textField_33.setBounds(31, 359, 227, 21);
		panel_8_2_1_2.add(textField_33);

		JLabel lblNewLabel_32_2_1_2_3 = new JLabel("País de origen");
		lblNewLabel_32_2_1_2_3.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_32_2_1_2_3.setBounds(268, 333, 227, 17);
		panel_8_2_1_2.add(lblNewLabel_32_2_1_2_3);

		textField_34 = new JTextField();
		textField_34.setForeground(Color.BLACK);
		textField_34.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_34.setColumns(10);
		textField_34.setBounds(267, 358, 228, 21);
		panel_8_2_1_2.add(textField_34);

		JLabel lblNewLabel_33_2_1_2_5_1 = new JLabel("Fecha de Publicación");
		lblNewLabel_33_2_1_2_5_1.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel_33_2_1_2_5_1.setBounds(31, 386, 227, 17);
		panel_8_2_1_2.add(lblNewLabel_33_2_1_2_5_1);

		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Roboto", Font.PLAIN, 14));
		spinner.setModel(new SpinnerDateModel(new Date(946706400000L), new Date(21600000L), new Date(1752300000000L),
				Calendar.YEAR));
		spinner.setBounds(31, 413, 244, 24);
		panel_8_2_1_2.add(spinner);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(Idioma.values()));
		comboBox_5.setBounds(28, 247, 227, 21);
		panel_8_2_1_2.add(comboBox_5);

		JPanel pnlPrestamos = new JPanel();
		pnlPrestamos.setBackground(new Color(247, 203, 164, 120));
		panelCardLayout.add(pnlPrestamos, "prestamos");
		pnlPrestamos.setLayout(new BorderLayout(0, 0));

		JPanel prestamosCardLayout = new JPanel();
		prestamosCardLayout.setOpaque(false);
		pnlPrestamos.add(prestamosCardLayout, BorderLayout.CENTER);
		prestamosCardLayout.setLayout(new CardLayout(0, 0));

		JMenuBar menuBarPrestamos = new JMenuBar();
		pnlPrestamos.add(menuBarPrestamos, BorderLayout.NORTH);

		JMenu mnNewMenu_2 = new JMenu("Ver Préstamos");
		menuBarPrestamos.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Ver Préstamos Activos");
		mntmNewMenuItem_4.addActionListener(e -> {
			CardLayout layout = (CardLayout) prestamosCardLayout.getLayout();
			layout.show(prestamosCardLayout, "prestamoActivo");
		});
		mnNewMenu_2.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Ver Historial de Préstamos");
		mntmNewMenuItem_5.addActionListener(e -> {
			CardLayout layout = (CardLayout) prestamosCardLayout.getLayout();
			layout.show(prestamosCardLayout, "historialPrestamo");
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);

		JMenu mnNewMenu_3 = new JMenu("Modificar Préstamos");
		menuBarPrestamos.add(mnNewMenu_3);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Generar Préstamo");
		mntmNewMenuItem_6.addActionListener(e -> {
			CardLayout layout = (CardLayout) prestamosCardLayout.getLayout();
			layout.show(prestamosCardLayout, "generarPrestamo");
		});
		mnNewMenu_3.add(mntmNewMenuItem_6);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Modificar Estado de Préstamo");
		mntmNewMenuItem_7.addActionListener(e -> {
			CardLayout layout = (CardLayout) prestamosCardLayout.getLayout();
			layout.show(prestamosCardLayout, "modificarPrestamo");
		});
		mnNewMenu_3.add(mntmNewMenuItem_7);

		JPanel pnlPrestamosActivos = new JPanel();
		pnlPrestamosActivos.setOpaque(false);
		pnlPrestamosActivos.setBackground(Color.DARK_GRAY);
		prestamosCardLayout.add(pnlPrestamosActivos, "prestamoActivo");
		pnlPrestamosActivos.setLayout(null);

		JPanel panel_prestamo = new JPanel();
		panel_prestamo.setBounds(10, 10, 899, 496);
		pnlPrestamosActivos.add(panel_prestamo);
		panel_prestamo.setLayout(new BorderLayout(0, 0));

		JPanel panel_10_3_2 = new JPanel();
		panel_prestamo.add(panel_10_3_2, BorderLayout.NORTH);
		panel_10_3_2.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_29_5_2 = new JLabel(" Ingrese ID del Préstamo ");
		lblNewLabel_29_5_2.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_10_3_2.add(lblNewLabel_29_5_2, BorderLayout.WEST);

		textField_48 = new JTextField();
		textField_48.setColumns(10);
		panel_10_3_2.add(textField_48, BorderLayout.CENTER);

		JButton btnNewButton_3_3_2 = new JButton("Confirmar");
		btnNewButton_3_3_2.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_10_3_2.add(btnNewButton_3_3_2, BorderLayout.EAST);

		JScrollBar scrollBar_16 = new JScrollBar();
		panel_prestamo.add(scrollBar_16, BorderLayout.EAST);

		JScrollBar scrollBar_17 = new JScrollBar();
		scrollBar_17.setOrientation(JScrollBar.HORIZONTAL);
		panel_prestamo.add(scrollBar_17, BorderLayout.SOUTH);

		tablePrestamoActivo = new JTable();
		tablePrestamoActivo.setEnabled(false);
		panel_prestamo.add(tablePrestamoActivo, BorderLayout.CENTER);

		JPanel pnlHistorialPrestamos = new JPanel();
		pnlHistorialPrestamos.setOpaque(false);
		pnlHistorialPrestamos.setBackground(Color.RED);
		prestamosCardLayout.add(pnlHistorialPrestamos, "historialPrestamo");
		pnlHistorialPrestamos.setLayout(null);

		JPanel panel_prestamo_1 = new JPanel();
		panel_prestamo_1.setBounds(10, 10, 899, 496);
		pnlHistorialPrestamos.add(panel_prestamo_1);
		panel_prestamo_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_6 = new JPanel();
		panel_prestamo_1.add(panel_6, BorderLayout.NORTH);
		panel_6.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_30 = new JLabel(" Ingrese ID del Préstamo ");
		panel_6.add(lblNewLabel_30, BorderLayout.WEST);

		textField_49 = new JTextField();
		panel_6.add(textField_49, BorderLayout.CENTER);
		textField_49.setColumns(10);

		JButton btnNewButton_4 = new JButton("Confirmar");
		panel_6.add(btnNewButton_4, BorderLayout.EAST);

		JScrollBar scrollBar_18 = new JScrollBar();
		panel_prestamo_1.add(scrollBar_18, BorderLayout.EAST);

		JScrollBar scrollBar_19 = new JScrollBar();
		scrollBar_19.setOrientation(JScrollBar.HORIZONTAL);
		panel_prestamo_1.add(scrollBar_19, BorderLayout.SOUTH);

		tableHistorialPrestamos = new JTable();
		tableHistorialPrestamos.setEnabled(false);
		panel_prestamo_1.add(tableHistorialPrestamos, BorderLayout.CENTER);

		JPanel pnlGenerarPrestamo = new JPanel();
		pnlGenerarPrestamo.setOpaque(false);
		pnlGenerarPrestamo.setBackground(Color.ORANGE);
		prestamosCardLayout.add(pnlGenerarPrestamo, "generarPrestamo");
		pnlGenerarPrestamo.setLayout(null);

		JPanel pnlFormularioLibro_1 = new JPanel();
		pnlFormularioLibro_1.setBackground(new Color(247, 203, 164, 200));
		pnlFormularioLibro_1.setBounds(218, 10, 525, 506);
		pnlGenerarPrestamo.add(pnlFormularioLibro_1);
		pnlFormularioLibro_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_7_2_1_3 = new JPanel();
		panel_7_2_1_3.setOpaque(false);
		pnlFormularioLibro_1.add(panel_7_2_1_3, BorderLayout.NORTH);
		panel_7_2_1_3.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_32 = new JLabel("Registrar Préstamo");
		lblNewLabel_32.setLocation(1, 10);
		lblNewLabel_32.setFont(new Font("Roboto", Font.BOLD, 18));
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7_2_1_3.add(lblNewLabel_32, BorderLayout.CENTER);

		JPanel panel_11 = new JPanel();
		panel_11.setOpaque(false);
		panel_7_2_1_3.add(panel_11, BorderLayout.NORTH);

		JLabel lblNewLabel_33 = new JLabel("Para registrar el préstamo llene todos los campos del formulario");
		lblNewLabel_33.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7_2_1_3.add(lblNewLabel_33, BorderLayout.SOUTH);

		JPanel panel_12 = new JPanel();
		panel_12.setOpaque(false);
		pnlFormularioLibro_1.add(panel_12, BorderLayout.CENTER);
		panel_12.setLayout(null);

		textField_3 = new JTextField();
		textField_3.setBounds(10, 95, 407, 19);
		panel_12.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_35 = new JLabel("Ingrese ID del usuario");
		lblNewLabel_35.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblNewLabel_35.setBounds(10, 180, 154, 19);
		panel_12.add(lblNewLabel_35);

		textField_10 = new JTextField();
		textField_10.setBounds(10, 209, 407, 19);
		panel_12.add(textField_10);
		textField_10.setColumns(10);

		JLabel lblNewLabel_36 = new JLabel("Ingrese su ID");
		lblNewLabel_36.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblNewLabel_36.setBounds(10, 294, 92, 19);
		panel_12.add(lblNewLabel_36);

		textField_14 = new JTextField();
		textField_14.setBounds(10, 323, 407, 19);
		panel_12.add(textField_14);
		textField_14.setColumns(10);

		JButton btnNewButton_6 = new JButton("Buscar");
		btnNewButton_6.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnNewButton_6.setBounds(427, 94, 85, 21);
		panel_12.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("Buscar");
		btnNewButton_7.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnNewButton_7.setBounds(427, 208, 85, 21);
		panel_12.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("Confirmar");
		btnNewButton_8.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnNewButton_8.setBounds(217, 380, 112, 33);
		panel_12.add(btnNewButton_8);

		JLabel lblNewLabel_34 = new JLabel("Ingrese ID del artículo a préstar");
		lblNewLabel_34.setBounds(10, 64, 222, 19);
		panel_12.add(lblNewLabel_34);
		lblNewLabel_34.setFont(new Font("Roboto", Font.PLAIN, 16));

		JButton btnNewButton_8_1 = new JButton("Buscar");
		btnNewButton_8_1.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnNewButton_8_1.setBounds(427, 322, 85, 21);
		panel_12.add(btnNewButton_8_1);

		JPanel pnlModificarPrestamo = new JPanel();
		pnlModificarPrestamo.setOpaque(false);
		pnlModificarPrestamo.setBackground(Color.GREEN);
		prestamosCardLayout.add(pnlModificarPrestamo, "modificarPrestamo");
		pnlModificarPrestamo.setLayout(null);

		JPanel panel_prestamo_1_1 = new JPanel();
		panel_prestamo_1_1.setBounds(10, 10, 899, 496);
		pnlModificarPrestamo.add(panel_prestamo_1_1);
		panel_prestamo_1_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_7 = new JPanel();
		panel_prestamo_1_1.add(panel_7, BorderLayout.NORTH);
		panel_7.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_31 = new JLabel(" Ingrese ID del Préstamo ");
		panel_7.add(lblNewLabel_31, BorderLayout.WEST);

		textField_50 = new JTextField();
		panel_7.add(textField_50, BorderLayout.CENTER);
		textField_50.setColumns(10);

		JButton btnNewButton_5 = new JButton("Confirmar");
		panel_7.add(btnNewButton_5, BorderLayout.EAST);

		JScrollBar scrollBar_20 = new JScrollBar();
		panel_prestamo_1_1.add(scrollBar_20, BorderLayout.EAST);

		JScrollBar scrollBar_21 = new JScrollBar();
		scrollBar_21.setOrientation(JScrollBar.HORIZONTAL);
		panel_prestamo_1_1.add(scrollBar_21, BorderLayout.SOUTH);

		table = new JTable();
		table.setEnabled(false);
		panel_prestamo_1_1.add(table, BorderLayout.CENTER);

		JPanel pnlUsuarios = new JPanel();
		pnlUsuarios.setBackground(new Color(247, 203, 164, 120));
		panelCardLayout.add(pnlUsuarios, "usuarios");
		pnlUsuarios.setLayout(new BorderLayout(0, 0));

		JPanel usuariosCardLayout = new JPanel();
		usuariosCardLayout.setOpaque(false);
		pnlUsuarios.add(usuariosCardLayout, BorderLayout.CENTER);
		usuariosCardLayout.setLayout(new CardLayout(0, 0));

		JMenuBar menuBar_2 = new JMenuBar();
		pnlUsuarios.add(menuBar_2, BorderLayout.NORTH);

		JMenu mnNewMenu_4 = new JMenu("Buscar Usuario");
		menuBar_2.add(mnNewMenu_4);

		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Buscar por Nombre");
		mntmNewMenuItem_8.addActionListener(e -> {
			CardLayout layout = (CardLayout) usuariosCardLayout.getLayout();
			layout.show(usuariosCardLayout, "buscarNombreUs");
		});
		mnNewMenu_4.add(mntmNewMenuItem_8);

		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Buscar por ID");
		mntmNewMenuItem_9.addActionListener(e -> {
			CardLayout layout = (CardLayout) usuariosCardLayout.getLayout();
			layout.show(usuariosCardLayout, "buscarIDUs");
		});
		mnNewMenu_4.add(mntmNewMenuItem_9);

		JMenu mnNewMenu_5 = new JMenu("Modificar Usuario");
		menuBar_2.add(mnNewMenu_5);

		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Registrar Usuario");
		mntmNewMenuItem_10.addActionListener(e -> {
			CardLayout layout = (CardLayout) usuariosCardLayout.getLayout();
			layout.show(usuariosCardLayout, "registrarUsuario");
		});
		mnNewMenu_5.add(mntmNewMenuItem_10);

		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Eliminar Usuario");
		mntmNewMenuItem_11.addActionListener(e -> {
			CardLayout layout = (CardLayout) usuariosCardLayout.getLayout();
			layout.show(usuariosCardLayout, "eliminarUsuario");
		});
		mnNewMenu_5.add(mntmNewMenuItem_11);

		JPanel pnlBuscarPorNombreUs = new JPanel();
		pnlBuscarPorNombreUs.setOpaque(false);
		pnlBuscarPorNombreUs.setBackground(Color.CYAN);
		usuariosCardLayout.add(pnlBuscarPorNombreUs, "buscarNombreUs");
		pnlBuscarPorNombreUs.setLayout(null);

		JPanel panel_9_5 = new JPanel();
		panel_9_5.setBounds(10, 10, 899, 496);
		pnlBuscarPorNombreUs.add(panel_9_5);
		panel_9_5.setLayout(new BorderLayout(0, 0));

		JScrollBar scrollBar_4 = new JScrollBar();
		panel_9_5.add(scrollBar_4, BorderLayout.EAST);

		JScrollBar scrollBar_5 = new JScrollBar();
		scrollBar_5.setOrientation(JScrollBar.HORIZONTAL);
		panel_9_5.add(scrollBar_5, BorderLayout.SOUTH);

		tableUsuariosN = new JTable();
		tableUsuariosN.setEnabled(false);
		DefaultTableModel modelUsuarios = new DefaultTableModel(new Object[][] {}, new String[] { "Credencial",
				"Nombre", "Correo", "Telefono", "Multas", "Investigador Autorizado", "Permiso" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, Object.class, Double.class,
					Boolean.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		};
		for (Usuario user : usuarios) {
			modelUsuarios.addRow(new Object[] { user.getNumeroCredencial(), user.getNombre(),
					user.getCorreoElectronico(), user.getTelefono(), user.getMultasPendientes(),
					user.isInvestigadorAutorizado(), user.getNivelPermiso().toString() });
		}
		tableUsuariosN.setModel(modelUsuarios);
		panel_9_5.add(tableUsuariosN, BorderLayout.CENTER);

		JPanel panel_10 = new JPanel();
		panel_9_5.add(panel_10, BorderLayout.NORTH);
		panel_10.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_29 = new JLabel(" Ingrese Nombre de Usuario ");
		lblNewLabel_29.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_10.add(lblNewLabel_29, BorderLayout.WEST);

		textField_42 = new JTextField();
		panel_10.add(textField_42, BorderLayout.CENTER);
		textField_42.setColumns(10);

		JButton btnNewButton_3 = new JButton("Confirmar");
		btnNewButton_3.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_10.add(btnNewButton_3, BorderLayout.EAST);

		JPanel pnlBuscarPorIDUs = new JPanel();
		pnlBuscarPorIDUs.setOpaque(false);
		pnlBuscarPorIDUs.setBackground(Color.WHITE);
		usuariosCardLayout.add(pnlBuscarPorIDUs, "buscarIDUs");
		pnlBuscarPorIDUs.setLayout(null);

		JPanel panel_9_5_1 = new JPanel();
		panel_9_5_1.setBounds(10, 10, 899, 496);
		pnlBuscarPorIDUs.add(panel_9_5_1);
		panel_9_5_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_10_1 = new JPanel();
		panel_9_5_1.add(panel_10_1, BorderLayout.NORTH);
		panel_10_1.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_29_3 = new JLabel(" Ingrese ID de Usuario ");
		lblNewLabel_29_3.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_10_1.add(lblNewLabel_29_3, BorderLayout.WEST);

		textField_43 = new JTextField();
		textField_43.setColumns(10);
		panel_10_1.add(textField_43, BorderLayout.CENTER);

		JButton btnNewButton_3_1 = new JButton("Confirmar");
		btnNewButton_3_1.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_10_1.add(btnNewButton_3_1, BorderLayout.EAST);

		JScrollBar scrollBar_6 = new JScrollBar();
		panel_9_5_1.add(scrollBar_6, BorderLayout.EAST);

		JScrollBar scrollBar_7 = new JScrollBar();
		scrollBar_7.setOrientation(JScrollBar.HORIZONTAL);
		panel_9_5_1.add(scrollBar_7, BorderLayout.SOUTH);

		tableUsuariosID = new JTable();
		tableUsuariosID.setEnabled(false);
		tableUsuariosID.setModel(modelUsuarios);
		panel_9_5_1.add(tableUsuariosID, BorderLayout.CENTER);

		JPanel pnlRegistrarUsuario = new JPanel();
		pnlRegistrarUsuario.setOpaque(false);
		pnlRegistrarUsuario.setBackground(Color.GRAY);
		usuariosCardLayout.add(pnlRegistrarUsuario, "registrarUsuario");
		pnlRegistrarUsuario.setLayout(null);

		JPanel pnlFormularioUsuario = new JPanel();
		pnlFormularioUsuario.setBackground(new Color(247, 203, 164, 200));
		pnlFormularioUsuario.setBounds(216, 10, 525, 506);
		pnlRegistrarUsuario.add(pnlFormularioUsuario);
		pnlFormularioUsuario.setLayout(new BorderLayout(0, 0));

		JPanel panel_7_2 = new JPanel();
		panel_7_2.setOpaque(false);
		pnlFormularioUsuario.add(panel_7_2, BorderLayout.NORTH);
		panel_7_2.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_30_2 = new JLabel("Registrar Usuario");
		lblNewLabel_30_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_30_2.setFont(new Font("Roboto", Font.BOLD, 18));
		panel_7_2.add(lblNewLabel_30_2, BorderLayout.CENTER);

		JLabel lblNewLabel_31_2 = new JLabel("Para registrar al Usuario llene todos los campos del formulario");
		lblNewLabel_31_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_31_2.setFont(new Font("Roboto", Font.PLAIN, 16));
		panel_7_2.add(lblNewLabel_31_2, BorderLayout.SOUTH);

		JPanel panel_9_2 = new JPanel();
		panel_9_2.setOpaque(false);
		panel_7_2.add(panel_9_2, BorderLayout.NORTH);

		JPanel panel_8_2 = new JPanel();
		panel_8_2.setLayout(null);
		panel_8_2.setOpaque(false);
		panel_8_2.setBackground(Color.LIGHT_GRAY);
		pnlFormularioUsuario.add(panel_8_2, BorderLayout.CENTER);

		JLabel lblNewLabel_25_2 = new JLabel("Nombre");
		lblNewLabel_25_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_25_2.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_25_2.setBounds(31, 30, 465, 17);
		panel_8_2.add(lblNewLabel_25_2);

		textField_7 = new JTextField();
		textField_7.setForeground(new Color(0, 0, 0));
		textField_7.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_7.setColumns(10);
		textField_7.setBounds(31, 57, 465, 21);
		panel_8_2.add(textField_7);

		JLabel lblNewLabel_26_2 = new JLabel("Apellido Paterno");
		lblNewLabel_26_2.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_26_2.setBounds(31, 108, 468, 17);
		panel_8_2.add(lblNewLabel_26_2);

		textField_8 = new JTextField();
		textField_8.setForeground(new Color(0, 0, 0));
		textField_8.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_8.setColumns(10);
		textField_8.setBounds(31, 135, 465, 21);
		panel_8_2.add(textField_8);

		JLabel lblNewLabel_27_2 = new JLabel("Apellido Materno");
		lblNewLabel_27_2.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_27_2.setBounds(31, 186, 490, 19);
		panel_8_2.add(lblNewLabel_27_2);

		textField_9 = new JTextField();
		textField_9.setForeground(new Color(0, 0, 0));
		textField_9.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_9.setColumns(10);
		textField_9.setBounds(31, 213, 465, 21);
		panel_8_2.add(textField_9);

		JLabel lblNewLabel_28_2 = new JLabel("Número De Credencial");
		lblNewLabel_28_2.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_28_2.setBounds(31, 264, 270, 19);
		panel_8_2.add(lblNewLabel_28_2);

		txtUs = new JTextField();
		txtUs.setText("US-");
		txtUs.setForeground(new Color(0, 0, 0));
		txtUs.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtUs.setColumns(10);
		txtUs.setBounds(31, 291, 270, 21);
		panel_8_2.add(txtUs);

		JLabel lblNewLabel_33_2 = new JLabel("Investigador Autorizado");
		lblNewLabel_33_2.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_33_2.setBounds(311, 267, 197, 19);
		panel_8_2.add(lblNewLabel_33_2);

		JLabel lblNewLabel_29_2 = new JLabel("Correo Electrónico");
		lblNewLabel_29_2.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_29_2.setBounds(31, 342, 270, 19);
		panel_8_2.add(lblNewLabel_29_2);

		textField_11 = new JTextField();
		textField_11.setForeground(new Color(0, 0, 0));
		textField_11.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_11.setColumns(10);
		textField_11.setBounds(31, 369, 270, 21);
		panel_8_2.add(textField_11);

		JLabel lblNewLabel_32_2 = new JLabel("Teléfono");
		lblNewLabel_32_2.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_32_2.setBounds(311, 342, 185, 19);
		panel_8_2.add(lblNewLabel_32_2);

		textField_12 = new JTextField();
		textField_12.setText("+52-");
		textField_12.setForeground(new Color(0, 0, 0));
		textField_12.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_12.setColumns(10);
		textField_12.setBounds(311, 369, 185, 21);
		panel_8_2.add(textField_12);

		JButton btnNewButton_2 = new JButton("Confirmar");
		btnNewButton_2.setFont(new Font("Roboto", Font.BOLD, 14));
		btnNewButton_2.setBounds(208, 419, 111, 25);
		panel_8_2.add(btnNewButton_2);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Acceso a Artículos Privados");
		chckbxNewCheckBox.setFont(new Font("Roboto", Font.BOLD, 12));
		chckbxNewCheckBox.setBounds(311, 292, 185, 23);
		panel_8_2.add(chckbxNewCheckBox);

		JPanel pnlEliminarUsuario = new JPanel();
		pnlEliminarUsuario.setOpaque(false);
		pnlEliminarUsuario.setBackground(Color.BLACK);
		usuariosCardLayout.add(pnlEliminarUsuario, "eliminarUsuario");
		pnlEliminarUsuario.setLayout(null);

		JPanel panel_9_5_2 = new JPanel();
		panel_9_5_2.setBounds(10, 10, 899, 496);
		pnlEliminarUsuario.add(panel_9_5_2);
		panel_9_5_2.setLayout(new BorderLayout(0, 0));

		JPanel panel_10_2 = new JPanel();
		panel_9_5_2.add(panel_10_2, BorderLayout.NORTH);
		panel_10_2.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_29_4 = new JLabel(" Ingrese ID de Usuario ");
		lblNewLabel_29_4.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_10_2.add(lblNewLabel_29_4, BorderLayout.WEST);

		textField_44 = new JTextField();
		textField_44.setColumns(10);
		panel_10_2.add(textField_44, BorderLayout.CENTER);

		JButton btnNewButton_3_2 = new JButton("Confirmar");
		btnNewButton_3_2.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_10_2.add(btnNewButton_3_2, BorderLayout.EAST);

		JScrollBar scrollBar_8 = new JScrollBar();
		panel_9_5_2.add(scrollBar_8, BorderLayout.EAST);

		JScrollBar scrollBar_9 = new JScrollBar();
		scrollBar_9.setOrientation(JScrollBar.HORIZONTAL);
		panel_9_5_2.add(scrollBar_9, BorderLayout.SOUTH);

		tableUsuariosElim = new JTable();
		tableUsuariosElim.setEnabled(false);
		tableUsuariosElim.setModel(modelUsuarios);
		panel_9_5_2.add(tableUsuariosElim, BorderLayout.CENTER);

		JPanel pnlPersonal = new JPanel();
		pnlPersonal.setBackground(new Color(247, 203, 164, 120));
		panelCardLayout.add(pnlPersonal, "personal");
		pnlPersonal.setLayout(new BorderLayout(0, 0));

		JPanel personalCardLayout = new JPanel();
		personalCardLayout.setOpaque(false);
		pnlPersonal.add(personalCardLayout, BorderLayout.CENTER);
		personalCardLayout.setLayout(new CardLayout(0, 0));

		JMenuBar menuBar_3 = new JMenuBar();
		pnlPersonal.add(menuBar_3, BorderLayout.NORTH);

		JMenu mnNewMenu_6 = new JMenu("Buscar Empleado");
		menuBar_3.add(mnNewMenu_6);

		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Buscar por Nombre");
		mntmNewMenuItem_12.addActionListener(e -> {
			CardLayout layout = (CardLayout) personalCardLayout.getLayout();
			layout.show(personalCardLayout, "buscarNombreEm");
		});
		mnNewMenu_6.add(mntmNewMenuItem_12);

		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Buscar por ID");
		mntmNewMenuItem_13.addActionListener(e -> {
			CardLayout layout = (CardLayout) personalCardLayout.getLayout();
			layout.show(personalCardLayout, "buscarIDEm");
		});
		mnNewMenu_6.add(mntmNewMenuItem_13);

		JMenu mnNewMenu_7 = new JMenu("Modificar Personal");
		menuBar_3.add(mnNewMenu_7);

		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Registrar Empleado");
		mntmNewMenuItem_14.addActionListener(e -> {
			CardLayout layout = (CardLayout) personalCardLayout.getLayout();
			layout.show(personalCardLayout, "registrarEmpleado");
		});
		mnNewMenu_7.add(mntmNewMenuItem_14);

		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Eliminar Empleado");
		mntmNewMenuItem_15.addActionListener(e -> {
			CardLayout layout = (CardLayout) personalCardLayout.getLayout();
			layout.show(personalCardLayout, "eliminarEmpleado");
		});
		mnNewMenu_7.add(mntmNewMenuItem_15);

		JPanel pnlBuscarPorNombreEm = new JPanel();
		pnlBuscarPorNombreEm.setOpaque(false);
		pnlBuscarPorNombreEm.setBackground(new Color(247, 203, 164, 120));
		personalCardLayout.add(pnlBuscarPorNombreEm, "buscarNombreEm");
		pnlBuscarPorNombreEm.setLayout(null);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(10, 10, 899, 496);
		pnlBuscarPorNombreEm.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));

		JScrollBar scrollBar = new JScrollBar();
		panel_9.add(scrollBar, BorderLayout.EAST);

		table_Empleado = new JTable();
		table_Empleado.setEnabled(false);
		table_Empleado.setFont(new Font("Roboto", Font.PLAIN, 10));
		DefaultTableModel modelPersonal = new DefaultTableModel(new Object[][] {}, new String[] { "Credencial",
				"Nombre", "Correo", "Tel\u00E9fono", "Puesto", "Departamento", "Permiso" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class,
					String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		};
		for (Empleado emp : personal) {
			modelPersonal.addRow(new Object[] { emp.getNumeroCredencial(), emp.getNombre(), emp.getCorreoElectronico(),
					emp.getTelefono(), emp.getPuesto().toString(), emp.getDepartamento().toString(),
					emp.getNivelPermiso().toString() });
		}

		table_Empleado.setModel(modelPersonal);
		table_Empleado.getColumnModel().getColumn(0).setPreferredWidth(103);
		panel_9.add(table_Empleado, BorderLayout.CENTER);

		Panel panel_8 = new Panel();
		panel_9.add(panel_8, BorderLayout.NORTH);
		panel_8.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_28 = new JLabel(" Ingrese Nombre de Empleado ");
		lblNewLabel_28.setFont(new Font("Roboto", Font.PLAIN, 12));
		panel_8.add(lblNewLabel_28, BorderLayout.WEST);

		textField_39 = new JTextField();
		panel_8.add(textField_39, BorderLayout.CENTER);
		textField_39.setColumns(10);

		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_8.add(btnNewButton, BorderLayout.EAST);

		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setOrientation(JScrollBar.HORIZONTAL);
		panel_9.add(scrollBar_1, BorderLayout.SOUTH);

		JPanel pnlBuscarPorIDEm = new JPanel();
		pnlBuscarPorIDEm.setOpaque(false);
		pnlBuscarPorIDEm.setBackground(new Color(247, 203, 164));
		personalCardLayout.add(pnlBuscarPorIDEm, "buscarIDEm");
		pnlBuscarPorIDEm.setLayout(null);

		JPanel panel_9_3 = new JPanel();
		panel_9_3.setBounds(10, 10, 899, 496);
		pnlBuscarPorIDEm.add(panel_9_3);
		panel_9_3.setLayout(new BorderLayout(0, 0));

		JScrollBar scrollBar_2 = new JScrollBar();
		panel_9_3.add(scrollBar_2, BorderLayout.EAST);

		table_1 = new JTable();
		table_1.setFont(new Font("Roboto", Font.PLAIN, 10));
		table_1.setEnabled(false);

		table_1.setModel(modelPersonal);
		table_1.getColumnModel().getColumn(0).setPreferredWidth(103);
		panel_9_3.add(table_1, BorderLayout.CENTER);

		Panel panel_8_3 = new Panel();
		panel_9_3.add(panel_8_3, BorderLayout.NORTH);
		panel_8_3.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_28_3 = new JLabel(" Ingrese ID de Empleado ");
		lblNewLabel_28_3.setFont(new Font("Roboto", Font.PLAIN, 12));
		panel_8_3.add(lblNewLabel_28_3, BorderLayout.WEST);

		textField_40 = new JTextField();
		textField_40.setColumns(10);
		panel_8_3.add(textField_40, BorderLayout.CENTER);

		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton_1.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_8_3.add(btnNewButton_1, BorderLayout.EAST);

		JScrollBar scrollBar_1_1 = new JScrollBar();
		scrollBar_1_1.setOrientation(JScrollBar.HORIZONTAL);
		panel_9_3.add(scrollBar_1_1, BorderLayout.SOUTH);

		JPanel pnlRegistrarEmpleado = new JPanel();
		pnlRegistrarEmpleado.setOpaque(false);
		pnlRegistrarEmpleado.setBackground(Color.CYAN);
		personalCardLayout.add(pnlRegistrarEmpleado, "registrarEmpleado");
		pnlRegistrarEmpleado.setLayout(null);

		JPanel pnlFormularioEmpleado = new JPanel();
		pnlFormularioEmpleado.setBackground(new Color(247, 203, 164, 200));
		pnlFormularioEmpleado.setBounds(216, 10, 525, 506);
		pnlRegistrarEmpleado.add(pnlFormularioEmpleado);
		pnlFormularioEmpleado.setLayout(new BorderLayout(0, 0));

		JPanel panel_7_1 = new JPanel();
		panel_7_1.setOpaque(false);
		pnlFormularioEmpleado.add(panel_7_1, BorderLayout.NORTH);
		panel_7_1.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_30_1 = new JLabel("Registrar Empleado");
		lblNewLabel_30_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_30_1.setFont(new Font("Roboto", Font.BOLD, 20));
		panel_7_1.add(lblNewLabel_30_1, BorderLayout.CENTER);

		JLabel lblNewLabel_31_1 = new JLabel("Para registrar al Empleado llene todos los campos del formulario");
		lblNewLabel_31_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_31_1.setFont(new Font("Roboto", Font.PLAIN, 16));
		panel_7_1.add(lblNewLabel_31_1, BorderLayout.SOUTH);

		JPanel panel_9_1 = new JPanel();
		panel_9_1.setOpaque(false);
		panel_7_1.add(panel_9_1, BorderLayout.NORTH);

		JPanel panel_8_1 = new JPanel();
		panel_8_1.setLayout(null);
		panel_8_1.setOpaque(false);
		panel_8_1.setBackground(Color.LIGHT_GRAY);
		pnlFormularioEmpleado.add(panel_8_1, BorderLayout.CENTER);

		JLabel lblNewLabel_25_1 = new JLabel("Nombre");
		lblNewLabel_25_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_25_1.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_25_1.setBounds(31, 30, 465, 17);
		panel_8_1.add(lblNewLabel_25_1);

		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(31, 57, 465, 21);
		panel_8_1.add(textField);

		JLabel lblNewLabel_26_1 = new JLabel("Apellido Paterno");
		lblNewLabel_26_1.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_26_1.setBounds(31, 108, 468, 17);
		panel_8_1.add(lblNewLabel_26_1);

		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(31, 135, 465, 21);
		panel_8_1.add(textField_1);

		JLabel lblNewLabel_27_1 = new JLabel("Apellido Materno");
		lblNewLabel_27_1.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_27_1.setBounds(31, 186, 490, 19);
		panel_8_1.add(lblNewLabel_27_1);

		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 0, 0));
		textField_2.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(31, 213, 465, 21);
		panel_8_1.add(textField_2);

		JLabel lblNewLabel_28_1 = new JLabel("Número de ID");
		lblNewLabel_28_1.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_28_1.setBounds(31, 264, 270, 19);
		panel_8_1.add(lblNewLabel_28_1);

		txtEmp = new JTextField();
		txtEmp.setText("EMP-");
		txtEmp.setForeground(new Color(0, 0, 0));
		txtEmp.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtEmp.setColumns(10);
		txtEmp.setBounds(31, 291, 270, 21);
		panel_8_1.add(txtEmp);

		JLabel lblNewLabel_33_1 = new JLabel("Puesto");
		lblNewLabel_33_1.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_33_1.setBounds(311, 264, 210, 19);
		panel_8_1.add(lblNewLabel_33_1);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(Puesto.values()));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Roboto", Font.BOLD, 12));
		comboBox_1.setBounds(311, 291, 185, 21);
		panel_8_1.add(comboBox_1);

		JLabel lblNewLabel_29_1 = new JLabel("Correo Electrónico");
		lblNewLabel_29_1.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_29_1.setBounds(31, 342, 270, 19);
		panel_8_1.add(lblNewLabel_29_1);

		textField_4 = new JTextField();
		textField_4.setForeground(new Color(0, 0, 0));
		textField_4.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(31, 369, 270, 21);
		panel_8_1.add(textField_4);

		JLabel lblNewLabel_32_1 = new JLabel("Teléfono");
		lblNewLabel_32_1.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel_32_1.setBounds(311, 342, 185, 19);
		panel_8_1.add(lblNewLabel_32_1);

		textField_6 = new JTextField();
		textField_6.setText("+52-");
		textField_6.setForeground(new Color(0, 0, 0));
		textField_6.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(311, 369, 185, 21);
		panel_8_1.add(textField_6);

		JButton btnNewButton_2_1 = new JButton("Confirmar");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setFont(new Font("Roboto", Font.BOLD, 14));
		btnNewButton_2_1.setBounds(208, 419, 111, 25);
		panel_8_1.add(btnNewButton_2_1);

		JPanel pnlEliminarEmpleado = new JPanel();
		pnlEliminarEmpleado.setOpaque(false);
		pnlEliminarEmpleado.setBackground(Color.DARK_GRAY);
		personalCardLayout.add(pnlEliminarEmpleado, "eliminarEmpleado");
		pnlEliminarEmpleado.setLayout(null);

		JPanel panel_9_4 = new JPanel();
		panel_9_4.setBounds(10, 10, 899, 496);
		pnlEliminarEmpleado.add(panel_9_4);
		panel_9_4.setLayout(new BorderLayout(0, 0));

		JScrollBar scrollBar_3 = new JScrollBar();
		panel_9_4.add(scrollBar_3, BorderLayout.EAST);

		table_2 = new JTable();
		table_2.setFont(new Font("Roboto", Font.PLAIN, 10));
		table_2.setEnabled(false);
		table_2.setModel(modelPersonal);
		table_2.getColumnModel().getColumn(0).setPreferredWidth(103);
		panel_9_4.add(table_2, BorderLayout.CENTER);

		JScrollBar scrollBar_1_2 = new JScrollBar();
		scrollBar_1_2.setOrientation(JScrollBar.HORIZONTAL);
		panel_9_4.add(scrollBar_1_2, BorderLayout.SOUTH);

		Panel panel_8_3_1 = new Panel();
		panel_9_4.add(panel_8_3_1, BorderLayout.NORTH);
		panel_8_3_1.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_28_3_1 = new JLabel(" Ingrese ID de Empleado ");
		lblNewLabel_28_3_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		panel_8_3_1.add(lblNewLabel_28_3_1, BorderLayout.WEST);

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		panel_8_3_1.add(textField_41, BorderLayout.CENTER);

		JButton btnNewButton_1_1 = new JButton("Confirmar");
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton_1_1.setFont(new Font("Roboto", Font.PLAIN, 10));
		panel_8_3_1.add(btnNewButton_1_1, BorderLayout.EAST);

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
		btnInicio.setFont(new Font("Roboto", Font.BOLD, 14));
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
		btnInventario.setFont(new Font("Roboto", Font.BOLD, 14));
		btnInventario.setBackground(new Color(254, 253, 241));
		panelOpciones.add(btnInventario);

		JButton btnPrestamos = new JButton("Préstamos");
		btnPrestamos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelCardLayout, "prestamos");
			}
		});
		btnPrestamos.setBounds(10, 336, 123, 42);
		btnPrestamos.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnPrestamos.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnPrestamos.setFont(new Font("Roboto", Font.BOLD, 14));
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
		btnUsuarios.setFont(new Font("Roboto", Font.BOLD, 14));
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
		btnPersonal.setFont(new Font("Roboto", Font.BOLD, 14));
		btnPersonal.setBackground(new Color(252, 250, 241));
		panelOpciones.add(btnPersonal);

		JLabel lblNewLabel_1 = new JLabel("Menú de opciones");
		lblNewLabel_1.setFont(new Font("Roboto", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 155, 127, 18);
		panelOpciones.add(lblNewLabel_1);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 201, 174));
		separator.setBounds(10, 131, 123, 2);
		panelOpciones.add(separator);

		JLabel lblNewLabel_24 = new JLabel("ITESO");
		lblNewLabel_24.setFont(new Font("Roboto", Font.BOLD, 18));
		lblNewLabel_24.setForeground(Color.WHITE);
		lblNewLabel_24.setBounds(42, 96, 58, 22);
		panelOpciones.add(lblNewLabel_24);

		JLabel lblBackGround = new JLabel("");
		lblBackGround.setOpaque(true);
		lblBackGround.setIcon(
				new ImageIcon(MainFrame.class.getResource("/com/iteso/biblioteca/gui/books-2596809_1280.jpg")));
		lblBackGround.setBounds(0, 0, 1082, 558);
		backGround.add(lblBackGround);

	}
}
