package demo05.Consumer;

import java.util.function.Consumer;

/*
 * Consumer�ӿڵ�Ĭ�Ϸ���andThen
 * ���ã���Ҫ����Consumer�ӿڣ����Խ�����Consumer�ӿ������һ�𣬶����ݽ�������
 * ���磺
 * Consumer��String>con1
 * Consumer<String>con2
 * String s = "hello"
 * con1.accpet(s)
 * con2.accpet(s)
 * ��������Consumer�ӿ�
 * con1.andThen(con2).accpet(s)˭дǰ��˭������
 */
public class Demo02AndThen {
	//����һ��������������������һ���ַ���h������Consumer�ӿڣ�����ʹ���ַ���
	public static void method(String s , Consumer<String> con1 , Consumer<String> con2) {
//		con1.accept(s);
//		con2.accept(s);
		//����ʹ��andThen����
		con1.andThen(con2).accept(s);
	}
	public static void main(String[] args) {
		method("hello",(t)->{
			System.out.println(t.toUpperCase());
						},(t)->{
			System.out.println(t.toLowerCase());
						});
	}
}
