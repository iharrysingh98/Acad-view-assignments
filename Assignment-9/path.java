
import java.io.*;
 class Path{

	public static void main(String[] args) throws IOException {
		try{


    File file=new File("acadview.txt");
    FileWriter w=new FileWriter("abc.txt");
    String f1;
    f1=file.getAbsolutePath();
    w.write(f1);
    w.close();
    System.out.println("Completed Successfully");


    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
}
}
