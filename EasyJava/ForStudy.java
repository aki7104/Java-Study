import java.io.*;
import java.lang.*;

class ForStudy{
  public static void main(String[] args) throws IOException{
    //1〜10までの偶数を出力するコード
    int i = 0;
    System.out.println("＜課題1＞");
    System.out.println("1〜10までの偶数を出力します");
    for (i = 1; i <= 10; i++){
      if (i % 2 == 0){
        System.out.println(i);
      }
    }
    System.out.println("課題終了\n\n");

    //キーボードからテストの点数を入力し、合計点を出力するコード
    //最後にゼロを入力すると答えを出力する
    System.out.println("＜課題2＞");
    System.out.println("テストの点数を入力してください");
    int sum = 0;
    int score = 0;
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    do {
    String test = br.readLine();
    score = Integer.parseInt(test);
    sum += score;
    } while (score != 0);
    System.out.println("テストの合計点は" + sum + "点です");
    System.out.println("課題終了\n\n");

  //アスタリスクを1つずつインクリメントしながら改行するコード//
  System.out.println("＜課題3＞");
  int b;
  for (b = 1; b <= 5; b++){
    switch(b){
      case 1:
      System.out.println("*\n");
      break;
      case 2:
      System.out.println("**\n");
      break;
      case 3:
      System.out.println("***\n");
      break;
      case 4:
      System.out.println("****\n");
      break;
      case 5:
      System.out.println("*****\n");
      break;
    }
  }
  System.out.println("課題終了\n\n");
  }
}