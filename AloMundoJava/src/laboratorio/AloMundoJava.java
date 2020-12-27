package laboratorio;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AloMundoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strdata = new SimpleDateFormat().format(new Date());
		System.out.println("Agora é " + strdata);
	}

}