package spring4demo.demo;

public class BraveKnight implements Knight{
	private Quest quest;
	public BraveKnight(Quest quest){
		this.quest = quest;
	}
	public void embarkOnQuest(){
		this.quest.embark();
	}
}

