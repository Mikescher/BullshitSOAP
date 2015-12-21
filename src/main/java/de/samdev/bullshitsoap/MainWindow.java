package de.samdev.bullshitsoap;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import de.samdev.bullshitsoap.DebugLogger.DebugLogListener;
import de.samdev.bullshitsoap.http.HTTPReader;
import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.helper.PathHelper;
import de.samdev.bullshitsoap.parser.operations.WSDLOperation;
import de.samdev.bullshitsoap.templates.WSDLInvoker;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = 6293022652906529242L;

	private WSDLDefinition wsdl = null;
	
	private JPanel contentPane;
	private JTextField edWsdlUrl;
	private JButton btnParseWsdl;
	private JTextArea edLog;
	private JLabel lblNewLabel;
	private JList listOperations;
	private JScrollPane scrollPaneLog;
	private JScrollPane scrollPane_1;
	private JLabel lblLog;
	private JLabel lblDescription;
	private JPanel panel;
	private JLabel lblParameter;
	private JLabel lblResult;
	private JButton btnInvoke;
	private JTextArea edRequest;
	private JTextArea edResponse;
	private JTextField edPackageName;
	private JButton btnCreateAPI;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_2;
	private JTextField edOutputPath;

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
				ColumnSpec.decode("60dlu:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("60dlu:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("0dlu:grow(2)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("0dlu:grow(2)"),
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
				RowSpec.decode("0dlu:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,}));
		
		panel = new JPanel();
		contentPane.add(panel, "2, 2, 7, 1, fill, fill");
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
		contentPane.add(lblNewLabel, "2, 4, 7, 1");
		
		scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1, "2, 6, 3, 7, fill, fill");
		
		listOperations = new JList();
		listOperations.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				SelectOperation((WSDLOperation) listOperations.getModel().getElementAt(e.getFirstIndex()));
			}
		});
		scrollPane_1.setViewportView(listOperations);
		
		lblDescription = new JLabel("%Documentation%");
		lblDescription.setFont(new Font("Dialog", Font.ITALIC, 12));
		contentPane.add(lblDescription, "6, 6, 3, 1");
		
		lblParameter = new JLabel("Parameter:");
		contentPane.add(lblParameter, "6, 8");
		
		lblResult = new JLabel("Result:");
		contentPane.add(lblResult, "8, 8");
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "6, 10, fill, fill");
		
		edRequest = new JTextArea();
		scrollPane.setViewportView(edRequest);
		edRequest.setLineWrap(true);
		
		scrollPane_2 = new JScrollPane();
		contentPane.add(scrollPane_2, "8, 10, 1, 3, fill, fill");
		
		edResponse = new JTextArea();
		scrollPane_2.setViewportView(edResponse);
		
		btnInvoke = new JButton("Invoke");
		btnInvoke.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				InvokeWSDL();
			}
		});
		contentPane.add(btnInvoke, "6, 12");
		
		lblLog = new JLabel("Log:");
		contentPane.add(lblLog, "2, 14, 3, 1");
		
		scrollPaneLog = new JScrollPane();
		scrollPaneLog.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(scrollPaneLog, "2, 16, 7, 1, fill, fill");
		
		edLog = new JTextArea();
		edLog.setLineWrap(true);
		edLog.setWrapStyleWord(true);
		edLog.setEditable(false);
		scrollPaneLog.setViewportView(edLog);
		
		edOutputPath = new JTextField();
		contentPane.add(edOutputPath, "4, 18, fill, fill");
		edOutputPath.setText("src/main");
		edOutputPath.setColumns(10);
		
		edPackageName = new JTextField();
		edPackageName.setText("de.samdev.bullshitsoap");
		contentPane.add(edPackageName, "6, 18, fill, fill");
		edPackageName.setColumns(10);
		
		btnCreateAPI = new JButton("Create");
		btnCreateAPI.setEnabled(false);
		btnCreateAPI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					wsdl.createAPIClasses(PathHelper.combinePaths(System.getProperty("user.dir"), edOutputPath.getText()), edPackageName.getText());
				}catch (Exception e) {
					JOptionPane.showMessageDialog(MainWindow.this, e.toString() + "\r\n" + e.getMessage());
					e.printStackTrace();
				}
			}
		});
		contentPane.add(btnCreateAPI, "8, 18");
	}

	public static String prettyFormat(String input) {
	    try {
	        Source xmlInput = new StreamSource(new StringReader(input));
	        StringWriter stringWriter = new StringWriter();
	        StreamResult xmlOutput = new StreamResult(stringWriter);
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        //transformerFactory.setAttribute("indent-number", 2);
	        Transformer transformer = transformerFactory.newTransformer(); 
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	        transformer.transform(xmlInput, xmlOutput);
	        return xmlOutput.getWriter().toString();
	    } catch (Exception e) {
	        throw new RuntimeException(e); // simple exception handling, please review it
	    }
	}
	
	protected void InvokeWSDL() {
		try {
			edResponse.setText(prettyFormat(new WSDLInvoker(new URL(edWsdlUrl.getText())).getReponse(edRequest.getText())));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(MainWindow.this, e.toString() + "\r\n" + e.getMessage());
			e.printStackTrace();
		}
	}

	protected void SelectOperation(WSDLOperation operation) {
		lblDescription.setText(operation.Documentation);
	}

	private void SetWSDL(WSDLDefinition wsdl) {
		this.wsdl = wsdl;
		
		DefaultListModel opList = new DefaultListModel();
		for (WSDLOperation operation : wsdl.getOperations()) {
			opList.addElement(operation);
		}
		listOperations.setModel(opList);
		
		setTitle("BullshitSOAP - " + wsdl.getServiceName());
		btnCreateAPI.setEnabled(true);
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
