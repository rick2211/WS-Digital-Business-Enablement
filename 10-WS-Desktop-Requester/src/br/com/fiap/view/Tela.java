package br.com.fiap.view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.apache.axis2.AxisFault;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.tempuri.CalcPrecoPrazoWSStub;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazo;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazoResponse;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Tela {

	protected Shell shell;
	private Text txtNumero1;
	private Text txtNumero2;
	private Text txtResposta;
	private Label label;
	private Label lblCepOrigem;
	private Label lblCepDestino;
	private Text txtOrigem;
	private Text txtDestino;
	private Button btnCalcular_1;
	private Label lblPrazo;
	private Text txtPrazo;
	private Label lblDataMxima;
	private Text txtDataMaxima;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Tela window = new Tela();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(527, 402);
		shell.setText("SWT Application");
		
		Label lblNmero = new Label(shell, SWT.NONE);
		lblNmero.setBounds(10, 36, 55, 15);
		lblNmero.setText("N\u00FAmero 1");
		
		txtNumero1 = new Text(shell, SWT.BORDER);
		txtNumero1.setBounds(71, 33, 76, 21);
		
		Label lblNmero_1 = new Label(shell, SWT.NONE);
		lblNmero_1.setBounds(10, 83, 55, 15);
		lblNmero_1.setText("N\u00FAmero 2");
		
		txtNumero2 = new Text(shell, SWT.BORDER);
		txtNumero2.setBounds(71, 80, 76, 21);
		
		Button btnCalcular = new Button(shell, SWT.NONE);
		btnCalcular.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//Executado no clique do botão
				//Capturar os dois valores
				int n1 = Integer.parseInt(txtNumero1.getText());
				int n2 = Integer.parseInt(txtNumero2.getText());
				//Somar
				int soma = n1 + n2;
				//Exibir a resposta
				txtResposta.setText(Integer.toString(soma));
				//String.valueOf(soma);
			}
		});
		btnCalcular.setBounds(72, 120, 75, 25);
		btnCalcular.setText("Somar");
		
		txtResposta = new Text(shell, SWT.BORDER);
		txtResposta.setEditable(false);
		txtResposta.setBounds(71, 161, 76, 21);
		
		Label lblResultado = new Label(shell, SWT.NONE);
		lblResultado.setBounds(10, 164, 55, 15);
		lblResultado.setText("Resultado");
		
		label = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		label.setBounds(250, 23, 2, 315);
		
		lblCepOrigem = new Label(shell, SWT.NONE);
		lblCepOrigem.setBounds(275, 36, 69, 15);
		lblCepOrigem.setText("CEP Origem");
		
		lblCepDestino = new Label(shell, SWT.NONE);
		lblCepDestino.setBounds(275, 83, 69, 15);
		lblCepDestino.setText("CEP Destino");
		
		txtOrigem = new Text(shell, SWT.BORDER);
		txtOrigem.setBounds(360, 36, 76, 21);
		
		txtDestino = new Text(shell, SWT.BORDER);
		txtDestino.setBounds(360, 80, 76, 21);
		
		btnCalcular_1 = new Button(shell, SWT.NONE);
		btnCalcular_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				String origem = txtOrigem.getText();
				String destino = txtDestino.getText();
				
				try {
					//Objeto que chama o web service
					CalcPrecoPrazoWSStub stub = new CalcPrecoPrazoWSStub();
					
					//Parametros que serão enviados para o web service
					CalcPrazo param = new CalcPrazo();
					param.setNCdServico("40010"); //SEDEX
					param.setSCepDestino(destino);
					param.setSCepOrigem(origem);
					
					//Chamando o web service e recuperando a resposta
					CalcPrazoResponse resp = stub.calcPrazo(param);
					
					//Exibindo a resposta na tela
					txtPrazo.setText(resp.getCalcPrazoResult().getServicos()
							.getCServico()[0].getPrazoEntrega());
					txtDataMaxima.setText(resp.getCalcPrazoResult().getServicos()
							.getCServico()[0].getDataMaxEntrega());
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCalcular_1.setBounds(360, 120, 75, 25);
		btnCalcular_1.setText("Calcular");
		
		lblPrazo = new Label(shell, SWT.NONE);
		lblPrazo.setBounds(275, 174, 55, 15);
		lblPrazo.setText("Prazo");
		
		txtPrazo = new Text(shell, SWT.BORDER);
		txtPrazo.setEditable(false);
		txtPrazo.setBounds(360, 174, 76, 21);
		
		lblDataMxima = new Label(shell, SWT.NONE);
		lblDataMxima.setBounds(275, 222, 69, 15);
		lblDataMxima.setText("Data M\u00E1xima");
		
		txtDataMaxima = new Text(shell, SWT.BORDER);
		txtDataMaxima.setEditable(false);
		txtDataMaxima.setBounds(360, 216, 76, 21);
		
	}
}
