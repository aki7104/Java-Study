import java.io.*;
import java.lang.*;
public class Homework1 {
public static void main(String[] args) {
  int num;
  num = (int)(Math.random() * 1000);
  System.out.println("ランダムな数字は" + num + "です");
  if (num >= 500){
    System.out.println("Big");
  } else if (num < 500){
    System.out.println("Small");
  }
  }
} 
