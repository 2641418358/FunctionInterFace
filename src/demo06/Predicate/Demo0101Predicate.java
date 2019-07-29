package demo06.Predicate;

import java.util.function.Predicate;

/*
 * java.util.function.Predicate<T>�ӿ�
 * ���ã���ĳ���������͵����ݽ����жϣ��������һ��booleanֵ
 * Predicate�ӿ��а���һ�����󷽷���
 * boolean test��T t);����ָ�������������ݽ����жϷ���
 * 		�����
 * 			��������������true
 * 			����������������false
 */
public class Demo0101Predicate {
	/*
	 * ����һ������
	 * ��������yһ��String���͵��ַ���
	 * ����һ��Predicate�ӿڣ�����String
	 * ʹ��Predicate�еķ���test�������ַ��������жϣ������жϵĽ������
	 */
	public static boolean checkString(String s , Predicate<String> pre) {
		return pre.test(s);
	}
	
	public static void main(String[] args) {
		//����һ���ַ���
		String s = "abcde";
		//����checkString�������ַ�������У�飬���������ַ�����lambda���ʽ
		boolean b = checkString(s , (String str)->{
				return str.length() > 5 ;
		});
	}
}
