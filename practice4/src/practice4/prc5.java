  /**
  *
  */
 package practice4;

 /**
  * @author shimizuryuunosuke
  *
  */
 public class prc5 {

 	/**
 	 * @param args
 	 */

	 public static void main(String[] args) {
		// fullNameメソッドの結果を変数nameに代入してください
		    String name = fullName("natu", "asa");

		    // printDataの引数をnameと数字にする
		    printData(name, 28);

		    // 書き換えない
		    printData("asu asu tyori", 27);

		  }

		  public static void printData(String name, int age) {
		    System.out.println("私の名前は" + name + "です");
		    System.out.println("年齢は" + age + "歳です");
		  }

		  // fullNameメソッドを定義してください
		  public static String fullName(String firstName, String lastName) {
		    return firstName + " " + lastName;
		  }

 }