import java.io.*;

class Copy {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        FileOutputStream fos = new FileOutputStream("bbc.txt");
        int data;
        while((data = fis.read()) != -1){
            fos.write(data);
        }
        System.out.println("Copied");
        fis.close();
        fos.flush();
        fos.close();
    }
}
output:
copied
