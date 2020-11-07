  /**
  *
  */
 package practice4;

 /**
  * @author shimizuryuunosuke
  *
  */
 public class prc7 {

 	/**
 	 * @param args
 	 */

	 public static void main(String[] args) {
		// fullNameメソッドの結果を変数nameに代入
		    String name = fullName("natu", "asa");

		    // printDataの引数をnameと数字にする
		    printData(name, 28, 1.65, 55.0);

		    //printDateの引数をfullNameにする
		    printData(fullName("asu", "asu", "tyori"), 27, 1.6, 50.0);

		  }


	  public static void printData(String name, int age, double height, double weight ) {
	    System.out.println("私の名前は" + name + "です");
	    System.out.println("年齢は" + age + "歳です");

	    // 変数bmiに、bmiメソッドを用いてBMIを代入
	    double bmi = bmi(height, weight);

	    // 変数bmiを用いて、「BMIは◯◯です」と出力してください
	    System.out.println("BMIは" + bmi + "です");

	  }

	  public static String fullName(String firstName, String lastName) {
	    return firstName + " " + lastName;
	  }

	  // fullNameメソッドを定義
	  public static String fullName(String firstName,String middleName, String lastName) {
	    return firstName +" " + middleName + " " + lastName;
	  }

	  // bmiメソッドを定義
	  public static double bmi(double height, double weight){
		    return weight / height / height;
	  }

 }