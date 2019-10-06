package Basket;

public class Driver {

	public static void main(String[] args) {
		GiftList list= new GiftList();
		System.out.println("Adding gift");
		GiftBasket giftBasket= new GiftBasket(9,"fj",9.0f);
		GiftBasket giftBasket1= new GiftBasket(6,"gj",5.0f);
		GiftBasket giftBasket2= new GiftBasket(7,"kl",3.1f);
			
			list.addToBack(giftBasket);
			list.addToBack(giftBasket1);
			list.addToBack(giftBasket2);
			list.display();
		}
		

	}


