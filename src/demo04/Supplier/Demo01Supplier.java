package demo04.Supplier;

import java.util.function.Supplier;

/*
 * ���ú����ӿ�
 * �޲η�����T get()��������ȡһ�����Ͳ���ָ�����͵Ķ�������
 * Supplier<T>�ӿڱ���Ϊ�����ͽӿڣ�ָ���ӿڵķ�����ʲô���ͣ���ô�ӿ���get�����ͻ�����ʲô���͵�����
 */
public class Demo01Supplier {
	//����һ���������������ݽӿ�Supplier<T>�ӿڣ�����ָString ��get�ͻ᷵���ַ���
	public static String getString(Supplier<String> sup) {
		return sup.get();
	}
	public static void main(String[] args) {
		//����getString����������������Supplier��һ�������ӿڣ����Կ���ʹ��lambda���ʽ
		String s = getString(()->{
			//����һ���ַ�����������
			return "����";
		});
		System.out.println(s);
	}
}
