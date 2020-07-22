import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeituraDeArquivo {

	public static void main(String[] args) {
		Documento documento = new Documento();
		try {
			FileInputStream fileInputStream = new FileInputStream(documento.getDocumento());
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			for(String line = bufferedReader.readLine(); line != null ; line = bufferedReader.readLine()) {
				String linha = bufferedReader.readLine();
				documento.adicionaNaLista(linha);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("FileNotFoundException caught");
		} catch (IOException ioe) {
			System.out.println("IOException caught");
		}
		for (String string : documento.getFrases()) {
			System.out.println(string);
		}
		System.out.println(documento.getlistaDePalavras().length);
	}

}
