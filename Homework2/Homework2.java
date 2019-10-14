import java.io.*;
import java.lang.*;
public class Homework2 {
public static void main(String[] args) {
  String str1, str2;
  try{
  System.out.println("文章を2文入力してください");
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  str1 = br.readLine();
  str2 = br.readLine();

  if (str1.equals(str2)){
    System.out.println("Same!");
  } else {
    System.out.println("Different!");
  }
  }

  catch(IOException e){
    System.err.println("学籍番号が正しくありません");
}
  }
}