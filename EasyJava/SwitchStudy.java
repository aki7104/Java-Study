import java.io.*;
import java.lang.*;

class SwitchStudy {
  public static void main (String args[])throws IOException {
    System.out.println("あなたの成績を1〜5の数字で入力してください");
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    int grade = Integer.parseInt(br.readLine());

    switch(grade){
      case 1:
      System.out.println("もっとがんばりましょう");
      break;
      case 2:
      System.out.println("もう少しがんばりましょう");
      break;
      case 3:
      System.out.println("さらに上をめざしましょう");
      break;
      case 4:
      System.out.println("たいへんよくできました");
      break;
      case 5:
      System.out.println("たいへん優秀です");
      break;
    }
  }
}