package de.samdev.bullshitsoap;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.DefaultListModel;
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
import de.samdev.bullshitsoap.parser.operations.WSDLOperation;

import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JTree;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.ScrollPaneConstants;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = 6293022652906529242L;

	private WSDLDefinition wsdl = null;
	
	private JPanel contentPane;
	private JTextField edWsdlUrl;
	private JButton btnParseWsdl;
	private JTextArea edLog;
	private JLabel lblNewLabel;
	private JList<WSDLOperation> listOperations;
	private JScrollPane scrollPaneLog;
	private JScrollPane scrollPane_1;
	private JLabel lblLog;
	private JLabel lblDescription;
	private JPanel panel;
	private JLabel lblParameter;
	private JLabel lblResult;
	private JTree treeInput;
	private JTree treeOutput;
	private JTabbedPane tabbedPane;
	private JTabbedPane tabbedPane_1;
	private JTextArea edRequest;
	private JTextArea edReponse;
	private JButton btnInvoke;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_2;

	public MainWindow() {
		initGUI();

		DebugLogger.addListener(new DebugLogListener() {
			@Override
			public void OnLog(final String message) {
				if (! SwingUtilities.isEventDispatchThread()) {
					SwingUtilities.invokeLater(new Runnable(){
						@Override
						public void run(){
							OnLog(message);
						}
					});
					return;
				}

				edLog.append("\r\n" + message);
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
				ColumnSpec.decode("150dlu"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("0dlu:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("0dlu:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("fill:default"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("12dlu"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("12dlu"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("0dlu:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("0dlu:grow"),}));
		
		panel = new JPanel();
		contentPane.add(panel, "2, 2, 5, 1, fill, fill");
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),
				FormSpecs.UNRELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		edWsdlUrl = new JTextField();
		panel.add(edWsdlUrl, "1, 1, default, fill");
		edWsdlUrl.setText("http://www.comunio.de/soapservice.php?wsdl");
		edWsdlUrl.setColumns(10);
		
		btnParseWsdl = new JButton("PARSE WSDL");
		panel.add(btnParseWsdl, "3, 1");
		btnParseWsdl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				parseWSDL();
			}
		});
		
		lblNewLabel = new JLabel("Operations:");
		contentPane.add(lblNewLabel, "2, 4, 5, 1");
		
		scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1, "2, 6, 1, 7, fill, fill");
		
		listOperations = new JList<WSDLOperation>();
		listOperations.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				SelectOperation(listOperations.getModel().getElementAt(e.getFirstIndex()));
			}
		});
		scrollPane_1.setViewportView(listOperations);
		
		lblDescription = new JLabel("%Documentation%");
		lblDescription.setFont(new Font("Dialog", Font.ITALIC, 12));
		contentPane.add(lblDescription, "4, 6, 3, 1");
		
		lblParameter = new JLabel("Parameter:");
		contentPane.add(lblParameter, "4, 8");
		
		lblResult = new JLabel("Result:");
		contentPane.add(lblResult, "6, 8");
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "4, 10, fill, fill");
		
		treeInput = new JTree();
		tabbedPane.addTab("Values", null, treeInput, null);
		
		scrollPane_2 = new JScrollPane();
		tabbedPane.addTab("Request", null, scrollPane_2, null);
		
		edRequest = new JTextArea();
		scrollPane_2.setViewportView(edRequest);
		edRequest.setEditable(false);
		
		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane_1, "6, 10, 1, 3, fill, fill");
		
		treeOutput = new JTree();
		tabbedPane_1.addTab("Values", null, treeOutput, null);
		
		scrollPane = new JScrollPane();
		tabbedPane_1.addTab("Response", null, scrollPane, null);
		
		edReponse = new JTextArea();
		scrollPane.setViewportView(edReponse);
		edReponse.setEditable(false);
		
		btnInvoke = new JButton("Invoke");
		contentPane.add(btnInvoke, "4, 12");
		
		lblLog = new JLabel("Log:");
		contentPane.add(lblLog, "2, 14");
		
		scrollPaneLog = new JScrollPane();
		scrollPaneLog.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(scrollPaneLog, "2, 16, 5, 1, fill, fill");
		
		edLog = new JTextArea();
		edLog.setLineWrap(true);
		edLog.setWrapStyleWord(true);
		edLog.setEditable(false);
		scrollPaneLog.setViewportView(edLog);
	}

	protected void SelectOperation(WSDLOperation operation) {
		lblDescription.setText(operation.Documentation);
	}

	private void SetWSDL(WSDLDefinition wsdl) {
		this.wsdl = wsdl;
		
		DefaultListModel<WSDLOperation> opList = new DefaultListModel<WSDLOperation>();
		for (WSDLOperation operation : wsdl.getOperations()) {
			opList.addElement(operation);
		}
		listOperations.setModel(opList);
	}

	private void parseWSDL() {
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

					EventQueue.invokeAndWait(new Runnable() {
						@Override
						public void run(){
							SetWSDL(threadWSDL);
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
}
