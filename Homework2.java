import java.io.*;
import java.lang.*;
public class Homework2 {
public static void main(String[] args) {
  /*ここにコードを書く*/
  int max, ppl, left;
  max = 30000 / 70;
  ppl = 30000 / 70 / 5;
  left = 30000 % 70;
  
  /*用意できる飴玉の最大個数 */
  System.out.println("● 用意できる飴玉の最大個数は" + max + "個です");

  /*飴玉を配ることができる人数 */
  System.out.println("● 飴玉を配ることができる人数は" + ppl + "人です");

  /*余る飴玉の個数 */
  System.out.println("● 余ってしまう飴玉の個数は" + left + "個です");
}
}