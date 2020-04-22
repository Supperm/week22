package card;

import java.util.List;

public class Person {

	private String id;
	
	private String name;
	
	List<BlankCard> cards;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BlankCard> getCards() {
		return cards;
	}

	public void setCards(List<BlankCard> cards) {
		this.cards = cards;
	}

	public Person(String id, String name, List<BlankCard> cards) {
		super();
		this.id = id;
		this.name = name;
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "身份证号：" + id + ", 姓名：" + name + ", 拥有银行卡：" + cards + "]";
	}
	
}
