import java.io.*;
import java.lang.*;
public class Homework4 {
public static void main(String[] args) {
  String mail;
  int domain1, domain2;
  try{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    mail = br.readLine();

    //indexOfで一致する文字列を検索する//
    domain1 = mail.indexOf("waseda.jp");
    domain2 = mail.indexOf("waseda.ac.jp");

    if ((domain1 != -1) || (domain2 != -1)){
      System.out.println("このメールアドレスは早稲田大学のアドレスです");
    }else {
      System.out.println("このメールアドレスは早稲田大学のものではありません");
    }
  }
  catch(IOException e){
    System.err.println("学籍番号が正しくありません");
  }
}}