package threadsample;

public class ThreadSample {

	public static void main(String[] args) {
		// 演習１：スレッドを10作成し、すべてをstartさせてください。
		
		// 演習２：１が終わったら実行してください。
		//   コンソール出力をメモ帳などのエディタに保存します。
		//   ブレークアウトルームメンバーで出力内容が異なる場合、その理由について話し合ってください
		//   - id:XX開始の順番が違うのはなぜか？
		//   - 終了する順番が毎回違うのはなぜか？
		//   - 上記の結果の違いとJavaスレッドが持つ特徴の関連は何か？
		//   演習終了時、各ブレークアウトルームでの結論をまとめ、slackに投稿してください
		//   
		//   出力例：
		//		mainスレッド終了
		//		id:4開始（待機時間8秒）
		//		id:7開始（待機時間4秒）
		//		id:3開始（待機時間4秒）
		//		id:1開始（待機時間8秒）
		//		id:5開始（待機時間8秒）
		//		id:6開始（待機時間4秒）
		//		id:2開始（待機時間2秒）
		//		id:0開始（待機時間2秒）
		//		id:8開始（待機時間3秒）
		//		id:9開始（待機時間4秒）
		//		id:2終了（待機時間2秒）
		//		id:0終了（待機時間2秒）
		//		id:8終了（待機時間3秒）
		//		id:6終了（待機時間4秒）
		//		id:9終了（待機時間4秒）
		//		id:7終了（待機時間4秒）
		//		id:3終了（待機時間4秒）
		//		id:5終了（待機時間8秒）
		//		id:4終了（待機時間8秒）
		//		id:1終了（待機時間8秒）

		System.out.println("mainスレッド終了");
		
		// ワンモアマイル：テキストには記載されていませんが、
		//   System.out.println("mainスレッド終了");
		//   がコンソール出力の一番最後に実行されるようにするにはどうしたらいいか
		//   調査してみましょう。Threadクラスのあるメソッドを呼び出すことが関係します
	}

}
