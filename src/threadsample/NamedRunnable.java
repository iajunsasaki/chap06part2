package threadsample;

import java.util.Random;

/**
 * 
 */
public class NamedRunnable implements Runnable {

	private static int idCount = 0;
	
	/** 
	 * idはオブジェクトが増える毎に増えていきます。
	 * 一つ目は0, 二つ目は1, ... 十個目は9など
	 */
	private int id = idCount++;
	
	@Override
	public void run() {
		// 1から10までの数字を取得します。これが待機時間になります
		Random random = new Random();
		int waitSeconds = random.nextInt(1, 10);
		
		try {
			// 待機開始
			System.out.println("id:"+this.id+"開始（待機時間"+waitSeconds+"秒）");
			Thread.sleep(waitSeconds * 1000);
			System.out.println("id:"+this.id+"終了（待機時間"+waitSeconds+"秒）");
			// 待機時間終了
		}
		catch (InterruptedException exception) {
			System.out.println("割り込まれた");
		}
	}

	public String toString() {
		return String.valueOf(this.id);
	}
}
