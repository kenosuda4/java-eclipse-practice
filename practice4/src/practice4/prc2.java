/**
 *
 */
package practice4;

/**
 * @author shimizuryuunosuke
 *
 */
public class prc2 {

	/**
	 * @param args
	 */

  public static void main(String[] args) {
    // printnameメソッドを呼び出す ※1
    printname();
  }

  // printDataメソッドを定義 ※2
  public static void printname (){
    System.out.println("私の名前はnosukeです");
  }

}
 /**
 * mainメソッドの中で printnameメソッドが呼び出される ※1
 * public static voidの後に mainで呼び出したprintnameを記述　※2
 * {}内に実行したい処理を記述
 */