import java.io.*;
import java.lang.*;
public class Homework3 {
public static void main(String[] args) {
  /*num1は原価、num2は売価、num3は売れた個数*/
  int num1, num2, num3;
  int profit;

  try {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("原価、売価、売れた個数の順に数字を入力してください");
    num1 = Integer.parseInt(br.readLine());
    num2 = Integer.parseInt(br.readLine());
    num3 = Integer.parseInt(br.readLine());
    profit = (num2 - num1) * num3;
    /*疑問：Javaエスケープシーケンスは環境によって変わるのか？ */
    System.out.println("原価" + num1 + "円の商品を" + num2 + "円で" + num3 + "個販売したので\n全て売り切れたと仮定すると" + profit + "円の利益が出ています");
  }
  catch (IOException ioe) {
  }
    catch(NumberFormatException nfe){
      System.out.println("半角英数で数値を入力してください");
    }
}
}