package card;

public class BlankCard {

	private String cardId;
	
	private String cardName;

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public BlankCard(String cardId, String cardName) {
		super();
		this.cardId = cardId;
		this.cardName = cardName;
	}

	@Override
	public String toString() {
		return "卡号：" + cardId + ", 卡名称：" + cardName + "]";
	}
	
}
