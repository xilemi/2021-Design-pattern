package AdapterPattern;

public class MyFruit implements Cloneable {
	protected String kind;
	public void display()
	{
	System.out.println(kind);
	}
	public Object clone()
	{
		Object obj=null;
		try {
			obj=super.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	public String Get() {
		// TODO �Զ����ɵķ������
		return kind;
	}
}
