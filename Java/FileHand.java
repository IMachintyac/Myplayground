import java.io.*;
import java.util.*;
class FileHand{
    public static void main(String[] args) {
        try{
        File fobj=new File("myFile.txt");
        fobj.createNewFile();}
        catch(IOException e){
            System.out.println(e);
        }
        // try{
        //     FileWriter fw=new FileWriter("myFile.txt");
        //     fw.write("I love Bhojpuri");
        //     fw.close();
        // }
        // catch(IOException e)
        // {
        //     System.out.println(e);
        // }
        try{
            File fobj=new File("myFile.txt");
            Scanner sc=new Scanner(fobj);
            FileReader fr=new FileReader("myFile.txt");
            String fstring;
            while(sc.hasNextLine()){
            fstring=sc.nextLine();
            System.out.println(fstring);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}