package Model;

import javazoom.jl.player.MP3Player;

public class EpilogDAO {
	
		public void epilog(){
				
		
		MP3Player mp3 = new MP3Player();
		
		String bgm = "C:/Users/Donald/Dropbox/스마트인재개발원/미니프로젝트1_자바/epilog_bgm.mp3";
		String type = "C:/Users/Donald/Dropbox/스마트인재개발원/미니프로젝트1_자바/type.mp3";
		
		mp3.play(bgm);
		
		
		String story
		=("옛날 옛적 Java로 사람을 괴롭히는 악당들이 있었다.\n")
		+ ("악당들의 괴롭힘을 견디지 못한 백성들은 악당들을 물리칠 용사를 기다리고 있었는데...");
		
		
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
