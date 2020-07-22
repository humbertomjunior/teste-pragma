public class TratandoConteudo {
	public static void main(String[] args) {
		
		LeituraDeArquivo leituraDeArquivo = new LeituraDeArquivo();
		for (String string : leituraDeArquivo.documento.getPalavras()) {
			System.out.println(string);
		}
		
	}
}
