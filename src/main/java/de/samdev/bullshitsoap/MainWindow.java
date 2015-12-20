package de.samdev.bullshitsoap;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import de.samdev.bullshitsoap.DebugLogger.DebugLogListener;
import de.samdev.bullshitsoap.http.HTTPReader;
import de.samdev.bullshitsoap.parser.WSDLDefinition;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = 6293022652906529242L;
	
	private JPanel contentPane;
	private JTextField edWsdlUrl;
	private JButton btnParseWsadl;

	
	private WSDLDefinition wsdl = null;
	private JTextPane edLog;
	private JLabel lblNewLabel;
	private JList list;
	private JScrollPane scrollPaneLog;
	private JScrollPane scrollPane_1;
	private JLabel lblLog;
	
	
	/**
	 * Create the frame.
	 */
	public MainWindow() {
		initGUI();
		
		DebugLogger.addListener(new DebugLogListener() {
			@Override
			public void OnLog(final String message) {
				EventQueue.invokeLater(new Runnable(){
					@Override
					public void run(){
						edLog.setText(edLog.getText() + "\r\n" + message);

						scrollPaneLog.getVerticalScrollBar().setValue(scrollPaneLog.getVerticalScrollBar().getMaximum());
					}
				});
			}
		});
	}
	
	private void initGUI() {
		setTitle("Bullshit SOAP Tool");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("100dlu"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("fill:default"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		edWsdlUrl = new JTextField();
		edWsdlUrl.setText("http://www.comunio.de/soapservice.php?wsdl");
		contentPane.add(edWsdlUrl, "2, 2, 3, 1, fill, default");
		edWsdlUrl.setColumns(10);
		
		btnParseWsadl = new JButton("PARSE WSDL");
		btnParseWsadl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new SwingWorker<Void, Void>() {
					private String url;
					
					public void execute(String path) {
						this.url = path;
						
						execute();
					}

					@Override
					protected Void doInBackground() throws Exception {
						try {
							String wsdlSource = HTTPReader.getHTTP(url);
							final WSDLDefinition threadWSDL = new WSDLDefinition(wsdlSource);

							EventQueue.invokeLater(new Runnable(){
								@Override
								public void run(){
									wsdl = threadWSDL;
									DebugLogger.Log("WSDL successfully parsed.");
								}
							});
						} catch (final Exception e) {
							EventQueue.invokeLater(new Runnable(){
								@Override
								public void run(){
									JOptionPane.showMessageDialog(MainWindow.this, e.toString() + "\r\n" + e.getMessage());
									e.printStackTrace();
								}
							});
						}

						return null;
					}
				}.execute(edWsdlUrl.getText());
			}
		});
		contentPane.add(btnParseWsadl, "6, 2");
		
		lblNewLabel = new JLabel("Operations:");
		contentPane.add(lblNewLabel, "2, 4, 3, 1");
		
		scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1, "2, 6, fill, fill");
		
		list = new JList();
		scrollPane_1.setViewportView(list);
		
		lblLog = new JLabel("Log:");
		contentPane.add(lblLog, "2, 8");
		
		scrollPaneLog = new JScrollPane();
		contentPane.add(scrollPaneLog, "2, 10, 5, 1, fill, fill");
		
		edLog = new JTextPane();
		edLog.setEditable(false);
		scrollPaneLog.setViewportView(edLog);
	}

}
