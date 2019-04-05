package br.com.fiap.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import br.com.fiap.loja.bo.EstoqueBOStub;
import br.com.fiap.loja.bo.EstoqueBOStub.ConsultarProduto;
import br.com.fiap.loja.bo.EstoqueBOStub.ConsultarProdutoResponse;
import br.com.fiap.loja.bo.EstoqueBOStub.ProdutoTO;

public class Tela {

	protected Shell shell;
	private Table table;
	private Text txtCodigo;

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
		shell.setSize(575, 431);
		shell.setText("SWT Application");
		
		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(67, 158, 410, 85);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnCdigo = new TableColumn(table, SWT.NONE);
		tblclmnCdigo.setWidth(101);
		tblclmnCdigo.setText("C\u00F3digo");
		
		TableColumn tblclmnDescrio = new TableColumn(table, SWT.NONE);
		tblclmnDescrio.setWidth(127);
		tblclmnDescrio.setText("Descri\u00E7\u00E3o");
		
		TableColumn tblclmnPreo = new TableColumn(table, SWT.NONE);
		tblclmnPreo.setWidth(100);
		tblclmnPreo.setText("Pre\u00E7o");
		
		TableColumn tblclmnQuantidade = new TableColumn(table, SWT.NONE);
		tblclmnQuantidade.setWidth(100);
		tblclmnQuantidade.setText("Quantidade");
		
		Label lblCdigoProduto = new Label(shell, SWT.NONE);
		lblCdigoProduto.setBounds(72, 120, 95, 15);
		lblCdigoProduto.setText("C\u00F3digo produto");
		
		txtCodigo = new Text(shell, SWT.BORDER);
		txtCodigo.setBounds(173, 117, 76, 21);
		
		Button btnPesquisar = new Button(shell, SWT.NONE);
		btnPesquisar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int codigo = Integer.parseInt(txtCodigo.getText());
				
				try {
					EstoqueBOStub stub = new EstoqueBOStub();
					
					ConsultarProduto param = new ConsultarProduto();
					param.setCodigo(codigo);
					
					ConsultarProdutoResponse resp = stub.consultarProduto(param);
					
					ProdutoTO produto = resp.get_return();
					
					table.removeAll();
					
					//Exibir na tabela
					TableItem item = new TableItem(table, 0);
					item.setText(new String[] {
							String.valueOf(produto.getCodigo()), 
							produto.getDescricao(),
							String.valueOf(produto.getPreco()), 
							String.valueOf(produto.getQuantidade())
					});
					
				} catch (Exception e1) {
					//e1.printStackTrace();
					MessageBox dialog = new MessageBox(shell);
					dialog.setMessage(e1.getMessage());
					dialog.open();
				}
			}
		});
		btnPesquisar.setBounds(255, 115, 75, 25);
		btnPesquisar.setText("Pesquisar");

	}
}






