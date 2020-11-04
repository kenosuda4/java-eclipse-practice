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
	    System.out.println("理論演算詞");
	    // trueと出力される(どちらか)
	    System.out.println(true || false);

	    // falseと出力される (尚且つ)
	    System.out.println(false && true);

	    // 「8 < 5」かつ「3 >= 2」の結果を出力 (尚且つ 両方満たすとtrue) 結果 false
	    System.out.println(8 < 5 && 3 >= 2 );

	    // 「8 < 5」または「3 >= 2」の結果を出力 (どちらかを満たすとtrue) 結果 true
	    System.out.println(8 < 5 || 3 >= 2);

	    // 「8 < 5」でない、の結果を出力 !は条件反転 結果true
	    System.out.println(!(8 < 5));

	    // 条件分岐

	    //if文
	    System.out.println("条件分岐");
	    // 条件式に直接trueをいれてください
	    if (true) {
	      System.out.println("条件式がtrueのため、出力されます");
	    }

	    // 条件式に直接falseをいれてください
	    if (false) {
	      System.out.println("条件式がfalseのため、出力されません");
	    }

	    int x = 5;
	    // if文を用いて、変数xが3より大きいとき「xは3より大きい」と出力
	    if (x > 3){
	      System.out.println("xは2より大きい");
	    }

	    // if文を用いて、変数xが8より大きいとき「xは9より大きい」と出力してください
	    if (x > 9){
	      System.out.println("xは9より大きい");

		}

	    // xが20より小さいとき、どちらでもないときの条件分岐を追加してください
	    if (x < 10){
	      System.out.println("10以下");
	    }else if(x < 20){
	      System.out.println("10以上、20より小さい");
	    }else{
	      System.out.println("20以上");
	    }

	    //switch文

	    // numberを3で割った余りで条件分岐
	    int number = 15;

	    switch(number % 3){
	    case 0:
	      System.out.println("3で割り切れます");
	      break;
	    case 1:
	      System.out.println("3で割ると1余ります");
	      break;
	    case 2:
	      System.out.println("3で割ると2余ります");
	      break;
	    }

	    // defaultを用いて、どのcaseにも合致しない場合
	    switch (number % 5) {
	      case 0:
	        System.out.println("大吉です");
	        break;
	      case 1:
	        System.out.println("中吉です");
	        break;
	      case 4:
	        System.out.println("凶です");
	        break;
	      default:
	        System.out.println("吉です");
	        break;
	    }

	    //while文

	    // while文を用いて、numberが0より大きい場合に繰り返す、繰り返す処理
	    while(number > 0){
	      System.out.println(number);
	      number --;
	    }
	    //for文
	    // for文を用いた、繰り返し処理
	    for(int i = 1; i <= 10; i++) // 最後の変数の更新にはつけない
	    System.out.println(i+ "回目のループです");

	    // breakとcontinue
	    System.out.println("=== while文 ===");
	    int i = 1;
	    while (i < 10) {
	      // iが5の倍数のとき、繰り返し処理を終了する
	      if(i % 5 == 0){
	        break;     //breakは処理を強制的に止める。
	      }

	      System.out.println(i);
	      i++;
	    }

	    System.out.println("=== for文 ===");
	    for (int j = 1; j < 10; j++) {
	      // jが3の倍数のとき、処理をスキップする
	      if(j % 3 == 0 ){
	        continue;     //continueはその時だけ処理をスキップする
	      }

	      System.out.println(j);
	    }

	    //配列
	    String[]names = {"asumi", "asumi",  "kazuki", "nosuke"};

	    // インデックス番号が0の要素を出力
	    System.out.println(names[0]);

	    // インデックス番号が2の要素を出力
	    System.out.println(names[2] );
	    
	    // 変数languagesを定義し、配列を代入
	    String[] languages = {"Ruby", "PHP", "Python"};
	    
	    // インデックス番号が「1」の要素を出力してください
	    System.out.println(languages[1]);
	    
	    // インデックス番号が「1」の要素を「Java」で上書きしてください
	    languages[1] =  "Java";
	    
	    // インデックス番号が「1」の要素を出力してください
	    System.out.println(languages[1]);

	}
}


