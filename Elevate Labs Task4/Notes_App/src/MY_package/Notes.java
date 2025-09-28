package MY_package;

import java.io.*;
import java.util.Scanner;

public class Notes {
    public static void main(String[] args) throws IOException {
//       InputStreamReader ip=new InputStreamReader(System.in);
//       int data=ip.read();
//       BufferedReader bf=new BufferedReader(ip);
//       while (bf.ready()){
//           System.out.println(bf.readLine());
//       }
//
      Scanner sc=new Scanner(System.in);
      String data=sc.nextLine();
  FileWriter fw=new FileWriter("notes.txt",true);
  fw.write(data+"\n");
  fw.close();  // After writing into the buffer we have to flush or close to release resources and to save the data in disk.

  // Reads only single characters in form ascii (int)
//  FileReader fr=new FileReader("notes.txt");
//  while (fr.ready()){
//    System.out.println((char) fr.read());
//  }
// it will automatically closes the resources


  BufferedReader bf=new BufferedReader(new FileReader("notes.txt"));
  while(bf.ready()){
    System.out.println(bf.readLine());
  }
    }
}
