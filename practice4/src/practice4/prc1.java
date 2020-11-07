/**
 *
 */
package practice4;

/**
 * @author shimizuryuunosuke
 *
 */
public class prc1 {

	/**
	 * @param args
	 */

	//javaは実行すると自動的にメインメソッド(※1)が実行される
	//※1
	public static void main(String[] args) {
		hello(); //※2
	}//ここまで※1

	//メインメソッドが各メソッドに指示を与え(※2)、各メソッドが処理を実行(※3)
	//※3
	public static void hello() {
	  System.out.println("Hello Java");
	} //※3 ここまで
}


