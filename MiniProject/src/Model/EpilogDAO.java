package Model;

import javazoom.jl.player.MP3Player;

public class EpilogDAO {
	
		public void epilog(){
				
		
		MP3Player mp3 = new MP3Player();
		
		String bgm = "C:/Users/Donald/Dropbox/����Ʈ���簳�߿�/�̴�������Ʈ1_�ڹ�/epilog_bgm.mp3";
		String type = "C:/Users/Donald/Dropbox/����Ʈ���簳�߿�/�̴�������Ʈ1_�ڹ�/type.mp3";
		
		mp3.play(bgm);
		
		
		String story
		=("���� ���� Java�� ����� �������� �Ǵ���� �־���.\n")
		+ ("�Ǵ���� �������� �ߵ��� ���� �鼺���� �Ǵ���� ����ĥ ��縦 ��ٸ��� �־��µ�...");
		
		
			try {
				Thread.sleep(1000);
				for(int i = 0; i < story.length() ; i++)
				{
					System.out.print(story.substring(0+i, i+1));
					Thread.sleep(200);
					mp3.play(type);
				}
				Thread.sleep(5000);
				mp3.stop();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

	
}
