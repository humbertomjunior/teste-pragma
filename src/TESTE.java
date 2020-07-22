import java.util.ArrayList;
import java.util.Scanner;

public class TESTE {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String C = scanner.nextLine();
		String N = scanner.nextLine();
		int NN = Integer.valueOf(N);
		String[] listaItems = new String[NN];
		Integer[] listaValores = new Integer[NN];
		Object[][] lista = new Object[NN][2];
		ArrayList<Object> listaGeral = new ArrayList<Object>();

		for (int i = 0; i < NN; i++) {
			listaItems[i] = scanner.next();
			listaValores[i] = scanner.nextInt();
			for (int j = 0; j < 2; j++) {
				lista[i][j] = listaItems[i];
				lista[i][j + 1] = listaValores[i];
				listaGeral.add(lista[i][j]);
			}
		}

		for (String item : listaItems) {
			System.out.println(item);
		}
		System.out.println(listaGeral);

	}
}