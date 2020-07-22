import java.util.ArrayList;

public class Documento {
	private String documento = "/home/humbertomjunior/eclipseEE-workspace/TestePragma/Files/Quake.txt";
	private ArrayList<String> frases = new ArrayList<String>();
	private String[] listaDePalavras = new String[21];
	private String texto;
	private static String[] palavras;
	
	public void adicionaNaLista(String bufferedReader) {
		this.frases.add(bufferedReader);
		this.texto = String.join("\\n", frases); 
		this.listaDePalavras = this.texto.split("InitGame");
	}
	
	public ArrayList<String> getFrases() {
		return frases;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public String[] getlistaDePalavras() {
		return listaDePalavras;
	}
	
	public String[] getPalavras() {
		return palavras;
	}
	
	public String getDocumento() {
		return documento;
	}
	
	
}
