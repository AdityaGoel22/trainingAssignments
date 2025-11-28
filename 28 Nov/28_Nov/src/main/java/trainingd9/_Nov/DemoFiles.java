package trainingd9._Nov;

import java.io.File;
import java.io.IOException;

public class DemoFiles {

	public static void main(String[] args) throws IOException {

		File dir = new File("F1");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		File fl = new File(dir,"MaxVerstappen.txt");
		
		System.out.println(fl.createNewFile());
		
		System.out.println(fl.exists());
		System.out.println(fl.isFile());
		System.out.println(fl.isDirectory());
		System.out.println(fl.getName());
		System.out.println(fl.getParent());
		System.out.println(fl.getPath());
		System.out.println(fl.getAbsolutePath());
		System.out.println(fl.length());
		System.out.println(fl.canRead());
		System.out.println(fl.canWrite());
		System.out.println(fl.canExecute());


	}

}
