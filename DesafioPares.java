import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DesafioPares {

    public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); // Lê a linha de entrada
      
		int numero = Integer.parseInt(st.nextToken());
      
    	for (int i =  1; i <= numero  ; i++) {
    		if (i % 2 ==0 ) System.out.println(i);
    	}
    }

}