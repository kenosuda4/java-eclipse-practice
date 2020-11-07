  /**
  *
  */
 package practice4;

 /**
  * @author shimizuryuunosuke
  *
  */
 public class prc4 {

 	/**
 	 * @param args
 	 */

	 public static void main(String[] args) {
		    // 引数に「natumi」を渡す
		    printData("natumi",28);

		    // 引数に「tyori」を渡す
		    printData("tyori",27);

		  }

		  // 引数を受け取るようにしてください
		  public static void printData(String name, int age) {
		    // 「私の名前は◯◯です」年齢は〇〇です　と出力
		    System.out.println("私の名前は"+ name + "です");
		    System.out.println("年齢は"+ age + "です");
		  }

 }