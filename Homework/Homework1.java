import java.io.*;
import java.lang.*;
public class Homework1 {
public static void main(String[] args) {
  /*ここにコードを書く*/
  int meal1, meal2, meal3;
  meal1 = 320;
  meal2 = 730;
  meal3 = 950;

  int total;
  total = meal1 + meal2 + meal3 - 1800;
  System.out.println("あなたは1日の摂取カロリー目標を" + total + "キロカロリーオーバーしています");

}
}