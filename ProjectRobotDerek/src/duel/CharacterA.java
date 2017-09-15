package duel;

public class CharacterA implements Dueler {
	
	private String name;
	private int hp;
	
	public CharacterA(){
		
	}
	public void taunt() {
		String taunt =  ("Lul");
		System.out.println(taunt);
	}
	
	public String getName() {
		name = "Raymond";
		return name;
	}
	
	public void setStartingHP(int hp) {
		System.out.println(hp);
	}
	
	public int getHP() {
		
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int target) {
		if(d.getHP() == target) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getAction(Object caller) {
		return (int) (Math.random()*3);
	}
	
	public void hit(Object caller) {
		if(caller instanceof Dueler)
		{
			this.hp = hp - 10;
		}
	}
}
