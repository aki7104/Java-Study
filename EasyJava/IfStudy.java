import java.io.*;
import java.lang.*;

class IfStudy {
  public static void main (String args[]) {
  int first, last;
  String str = "ab,cde,fghq";

  first = str.indexOf(",");
  last = str.lastIndexOf(",");

  String firstStr, lastStr;
  if (first != last) {
    firstStr =  str.substring(0, first);
    lastStr = str.substring(last + 1);

    System.out.println("First:" + firstStr);
    System.out.println("Last:" + lastStr);
  }else{
  System.out.println("String Length:" + str.length());
  }
}
}