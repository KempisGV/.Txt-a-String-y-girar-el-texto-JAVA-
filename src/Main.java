import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;
public class Main {

	public static void main(String[] args)throws Exception {
		FileReader archivo = new FileReader("/Users/kempisguerrerovelez/Desktop/text.txt");
		BufferedReader reader = new BufferedReader(archivo);
		
		String text = "";
		String line = reader.readLine();
		
		while(line != null) {
			text += line;
			line = reader.readLine();
		}
		
		Stack<String> pila = new Stack<String>();
		String[] texto = text.split(" ");
		
		for (int i = 0; i<texto.length; i++) {
		    pila.push(texto[i]); 
		}
		
		String[] textoAlRevez = new String[texto.length];
		
		for(int j = 0; j<texto.length; j++) {
			textoAlRevez[j] = pila.pop();
		}
		
		for(int k = 0; k<textoAlRevez.length; k++) {
			System.out.print(textoAlRevez[k] + " ");
		}
			
	}

}
