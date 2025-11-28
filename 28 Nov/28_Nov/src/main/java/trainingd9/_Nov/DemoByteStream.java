package trainingd9._Nov;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoByteStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		BufferedReader reader = new BufferedReader(new FileReader("F1/MaxVerstappen.txt"));
//		
//		String data;
//		while((data = reader.readLine())!= null) {
//			System.out.println(data);
//		}
//		
//		BufferedWriter writer = new BufferedWriter(new FileWriter("F1/MaxVerstappen.txt", true));
//		writer.newLine();
//		writer.write("Qatar GP Here We Come");
//		
//		writer.close();
//		
//		while((data = reader.readLine())!= null) {
//			System.out.println(data);
//		}
//		reader.close();
//		
//		FileOutputStream fis = new FileOutputStream("F1/LewisHamilton.txt");
//		String text = "7 Time World Champion Sir Lewis";
//		fis.write(text.getBytes());
//		fis.close();
//		
//		FileInputStream fos = new FileInputStream("F1/LewisHamilton.txt");
//		int b;
//		
//		while ((b = fos.read()) != -1) {
//			System.out.print((char)b);
//		}
//		
//		byte arr[] = new byte [(int)new File("F1/LewisHamilton.txt").length()];
//		fos.read(arr);
//		System.out.println(new String(arr));
//		fos.close();
//		
//		Bottle b = new Bottle(1, "Cello", 800.00, "Green");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F1/LewisHamilton.txt"));
//		
//		oos.writeObject(b);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F1/LewisHamilton.txt"));
		ois.read();
		
		Bottle b1 = (Bottle)ois.readObject();
		System.out.println(b1);
		ois.close();
		
	}

}
