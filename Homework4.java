import java.io.*;
import java.lang.*;
public class Homework4 {
public static void main(String[] args) {
  /*ここにコードを書く*/
  String fullNum;
  try{
    System.out.println("学籍番号を半角英数字で入力してください");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    /*学籍番号を入力すると3・4文字目のテキストを取り出す機能 */
    fullNum = br.readLine();
    String shortString;
    shortString = fullNum.substring(2,4);

    /*取り出したテキストを入学年度に繋げて出力する機能*/
    System.out.println("学籍番号が" + fullNum + "の学生は20" + shortString + "年度入学です");
  }
  catch(IOException e){
    System.err.println("学籍番号が正しくありません");
}
}
}