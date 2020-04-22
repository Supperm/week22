package card;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @ClassName: CardTest 
 * @Description: 测试
 * @author: 张稳
 * @date: 2020年3月27日 下午2:51:23
 */
public class CardTest {

	public static void setPerson() {
		//添加数据
		List<BlankCard> list = new ArrayList<BlankCard>();
		list.add(new BlankCard("6223800001", "招商银行"));
		list.add(new BlankCard("6223800001", "农业银行"));
		Person person = new Person("41142219801002531X", "张三丰", list);
		
		List<BlankCard> list1 = new ArrayList<BlankCard>();
		list1.add(new BlankCard("6223800002", "招商银行"));
		list1.add(new BlankCard("6223800002", "农业银行"));
		list1.add(new BlankCard("6223800001", "民生银行"));
		Person person1 = new Person("41141219801002532X", "李思宝", list1);
		
		List<BlankCard> list2 = new ArrayList<BlankCard>();
		list2.add(new BlankCard("6223800003", "招商银行"));
		list2.add(new BlankCard("6223800003", "农业银行"));
		list2.add(new BlankCard("6223800002", "民生银行"));
		Person person2 = new Person("411412198010025324", "张三丰", list2);
		
		List<BlankCard> list3 = new ArrayList<BlankCard>();
		list3.add(new BlankCard("6223800004", "招商银行"));
		list3.add(new BlankCard("6223800005", "农业银行"));
		list3.add(new BlankCard("6223800002", "工商银行"));
		Person person3 = new Person("411412198010025311", "孙小宝", list3);	
	
		//打印所有用户的名字,并打印出信息
		System.out.println("打印所有用户的名字,并打印出信息");
		System.out.println(person);
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		
		//获得所有用户名字的 list 集合，并打印出信息
		System.out.println("获得所有用户名字的 list 集合，并打印出信息");
		List<Person> listp = new ArrayList<Person>();
		listp.add(person);
		listp.add(person1);
		listp.add(person2);
		listp.add(person3);
		for (Person person4 : listp) {
			System.out.println(person4);
		}
		
		//获取用户名字是张三丰的用户信息，并打印出信息
		System.out.println("获取用户名字是张三丰的用户信息，并打印出信息");
		for (Person person4 : listp) {
			if(person4.getName().equals("张三丰")) {
				System.out.println(person4);
			}
		}
		
		//获得名字为 “张三” 客户的 银行卡 cards 集合，并答应出信息
		System.out.println("获得名字为 “张三” 客户的 银行卡 cards 集合，并答应出信息");
		for (Person person4 : listp) {
			
		}
	}
	
	public static void main(String[] args) {
		CardTest.setPerson();
	}
	
}
