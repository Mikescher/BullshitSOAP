package com.mikescher.bullshitsoap;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.mikescher.bullshitsoap.http.HTTPReader;
import com.mikescher.bullshitsoap.parser.WSDLDefinition;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = 6293022652906529242L;
	
	private JPanel contentPane;
	private JTextField edWsdlUrl;
	private JButton btnParseWsadl;

	
	private WSDLDefinition wsdl = null;
	
	
	/**
	 * Create the frame.
	 */
	public MainWindow() {
		initGUI();
	}
	
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		edWsdlUrl = new JTextField();
		edWsdlUrl.setText("http://www.comunio.de/soapservice.php?wsdl");
		contentPane.add(edWsdlUrl, "2, 2, fill, default");
		edWsdlUrl.setColumns(10);
		
		btnParseWsadl = new JButton("PARSE WSDL");
		btnParseWsadl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					wsdl = new WSDLDefinition(HTTPReader.getHTTP(edWsdlUrl.getText()));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(MainWindow.this, e.toString());
					e.printStackTrace();
				}
			}
		});
		contentPane.add(btnParseWsadl, "4, 2");
	}

}
