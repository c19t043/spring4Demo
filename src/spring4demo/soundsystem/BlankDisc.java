package spring4demo.soundsystem;

public class BlankDisc implements CompactDisc{
	private String title ;
	private String artist ;
	public BlankDisc(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	@Override
	public void play() {
		System.out.println("Playing "+ title+" by "+ artist);
	}

}
