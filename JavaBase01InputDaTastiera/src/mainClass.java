import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int carattereLetto = -1;
		System.out.println("Inserisci una parola e premi INVIO -->");
		
		InputStreamReader tastiera = new InputStreamReader(System.in);
		
		try {
			carattereLetto = tastiera.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Il carattere ASCII letto da tastiera è: " + carattereLetto);
		
		
	}

}
