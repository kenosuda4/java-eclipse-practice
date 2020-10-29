/**
 *
 */
package practice2;

/**
 * @author shimizuryuunosuke
 *
 */
public class prc2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//数値の計算
		  System.out.println(18 / 3);

		  System.out.println(3 * 6);

		  System.out.println(8 % 3);

		  //変数の初期化(変数の更新)
		  String text = "3＋3=?";
		  int number = 3;
		  System.out.println(text);
		  System.out.println(number + 3);

		  //変数の更新
		  number = 4;

		  //自己代入(既存の変数に変数＋追加したい数値を代入する)
		  number = number + 7 ;
		  System.out.println(number);

		  //自己代入の省略系(+以外の演算子も同じ)
		  number += 6;
		  System.out.println(number);

		  //計算する数値が1の場合はさらに省略できる
		  number ++ ;
		  System.out.println(number);

		  //double javaの小数データ型
		  int month = 12;
		  int date = 31;

		  // 「12月31日」となるように変数と文字列を連結して出力
		  System.out.println(month + "月" + date + "日");

		  // 7を2で割った値を出力 int形なので出力されるのは3
		  System.out.println(7 / 2);

		  System.out.println("7.0を2.0で割った値を出力");
		  System.out.println(7.0 / 2.0);

		  // 7を2.0で割った値を出力
		  System.out.println(6 / 2.0);

		  //int型同士で正確な値を出したいときキャストを使い、データ型を変更する
		  System.out.println((double)month / date);

	}

}
