package spring4demo.demo;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class BraveKnightTest {

	@Test
	public void knightShouldEmbarkOnQuest(){
		Quest mockQuest = mock(Quest.class);//创建mock Quest
		BraveKnight knight = new BraveKnight(mockQuest);//注入 mock Quest
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
}
