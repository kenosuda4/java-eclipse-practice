/**
 *
 */
package practice3;

/**
 * @author shimizuryuunosuke
 *
 */
public class practice3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 「true」を用いて、「真」を表す真偽値を出力
	    System.out.println(true);

	    // 「false」を用いて、「偽」を表す真偽値を出力
	    System.out.println(false);

	    // 「==」を用いて、値を比較した結果を出力
	    System.out.println(16/4 == 4);
	    System.out.println(16/4 == 3);

	    // 「!=」を用いて、値を比較した結果を出力してください
	    System.out.println((16/4) != 4);
	    System.out.println(16/4 != 3);

	    // boolean型の変数boolを定義し、「3 * 9 == 27」を代入してください
	    boolean bool = 4 * 5 == 20;

	    // 変数boolの値を出力してください
	    System.out.println(bool);

	    // 9と8を比較 結果　false
	    System.out.println(8 < 9);

	    // 5と2を比較 結果 true
	    System.out.println(5 > 2);

	    //	理論演算詞
	    // trueと出力されるようにしてください
	    System.out.println(true || false);

	    // falseと出力されるようにしてください
	    System.out.println(false && true);

	    // 「8 < 5」かつ「3 >= 2」の結果を出力してください
	    System.out.println(8 < 5 && 3 >= 2 );

	    // 「8 < 5」または「3 >= 2」の結果を出力してください
	    System.out.println(8 < 5 || 3 >= 2);

	    // 「8 < 5」でない、の結果を出力してください
	    System.out.println(!(8 < 5));

		}
}


