import java.io.*;
import java.lang.*;
public class Homework3 {
public static void main(String[] args) {
  //deposit1は普通預金、deposit2は定期預金のことをさす//
  int deposit1, deposit2;
  deposit1 = 100000;
  deposit2 = 200000;
  //totalは引き落とし可能限度額//
  int total;
  total = deposit1 + deposit2;
  System.out.println("引き落とし希望額を入力してください");
  try{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  //moneyは引き落とし額//
  int money;
  money = Integer.parseInt(br.readLine());
  if (money <= deposit1){
    System.out.println("ありがとうございました。残高は" + (deposit1 - money) + "円です");
  }else if ((money > deposit1) && (money <= total)){
    System.out.println("ありがとうございました。引き出し金額が普通預金の金額をこえていたので定期預金からの借用となります。残高は" + (total - money) + "円です");
  } else if (money > total){
    System.out.println("引き出し可能額は" + total + "円な　ので入力された金額を引き出すことはできません");
  }
}
catch(IOException e){
  System.err.println("学籍番号が正しくありません");
}
  }
}