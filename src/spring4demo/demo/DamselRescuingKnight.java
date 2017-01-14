package spring4demo.demo;

public class DamselRescuingKnight implements Knight{
	private RescueDamselQuest quest;
	public DamselRescuingKnight(){
		this.quest = new RescueDamselQuest();
	}
	public void embarkOnQuest(){
		this.quest.embark();
	}
}
