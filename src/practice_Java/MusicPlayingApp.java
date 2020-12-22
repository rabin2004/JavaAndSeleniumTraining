package practice_Java;

import java.util.Scanner;

public class MusicPlayingApp {
	String name;
	String singer;
	String bandName;
	int year;
	Scanner scan; 
	
	public void searchMusicWithName() {
		scan = new Scanner(System.in);
		
		System.out.println("Name of the Song: ");
		name = scan.nextLine();
		
		System.out.println("Playing songs starting with name: "+ name);
	}
	
	public void searchMusicWithSinger() {
		System.out.println("Name of the Singer: ");
		singer = scan.nextLine();
		
		System.out.println("Playing songs of "+ singer);
	}
	
	public void searchMusicWithBandName() {
		System.out.println("Name of the Band: ");
		bandName = scan.nextLine();
		
		System.out.println("Playing songs of "+ bandName);
	}
	
	public void searchMusicWithYear() {
		System.out.println("Songs of the Year: ");
		year = scan.nextInt();
		
		System.out.println("Playing songs of the year "+year);
	}
	

	public static void main(String[] args) {
		MusicPlayingApp app = new MusicPlayingApp();

		for(int i=0; i<2; i++) {
			app.searchMusicWithName();
		
		if(i==0) {
			app.searchMusicWithYear();
		}
		else if (i==1) {
			app.searchMusicWithSinger();
		}
		else{
			app.searchMusicWithBandName();
		}
//		app.searchMusicWithBandName();
//		app.searchMusicWithSinger();
//		app.searchMusicWithYear();
		}
	}

}
