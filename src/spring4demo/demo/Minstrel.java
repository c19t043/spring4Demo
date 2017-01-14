package spring4demo.demo;

import java.io.PrintStream;

public class Minstrel {
	private PrintStream stream;
	public Minstrel(PrintStream stream){
		this.stream = stream;
	}
	public void singBeforeQuest(){
		this.stream.println("Fa la la, the knight is so brave!");
	}
	public void singAfterQuest(){
		this.stream.println("Tee hee hee, the brave knight did embark on a quest!");
	}
}
