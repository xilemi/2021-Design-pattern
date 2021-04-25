package AdapterPattern;

import java.util.Hashtable;

public class MyFruitStore {
	private static Hashtable fruittable=null;
	//private static MyFruitStore fruitstore=null;               //����ʽ
	private static MyFruitStore fruitstore=new MyFruitStore();   //����ʽ
	private MyFruitStore() 
	{
		fruittable=new Hashtable<Integer,MyFruit>();
	}
	public static MyFruitStore Getfruitstore()
	{
		/*if (fruittable==null) {
			fruitstore=new MyFruitStore();
		}*/   //����ʽ
		return fruitstore;
	}
	public void Add(Integer key,MyFruit fruit) {
		fruittable.put(key,fruit);
	}
	public MyFruit Get(Integer key) {
		MyFruit fruit=(MyFruit) fruittable.get(key);
		return (MyFruit) fruit.clone();
	}
	
}
