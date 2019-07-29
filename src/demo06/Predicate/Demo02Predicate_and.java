package demo06.Predicate;

import java.util.function.Predicate;

/*
 * �߼����ʽ���������Ӷ���ж�����
 * &&���������
 * ||���������
 * �����������
 * 
 * �����ж�һ���ַ������������ж�����
 * �ַ��������Ƿ����5
 * �ж��ַ������Ƿ����a
 * ������������ͬʱ���㣬���ǾͿ���ʹ��&&�����
 * 
 * predicate�ӿ�����һ��and��������ʾ���ҹ�ϵ��Ҳ������������l�����ж�����
 * 
 * �����ڲ��������ж�������Ҳ��ʹ��&&���������������
 */
public class Demo02Predicate_and {
	/*
	 * ����һ������������һ���ַ���
	 * ��������predicate�ӿ�
	 * һ���ж��ַ��������Ƿ����5
	 * һ���ж��ַ������Ƿ����a
	 * ������������ͬʱ����
	 */
	public static boolean checkString(String s , Predicate<String> pre1 , Predicate<String> pre2) {
//		return pre1.test(s) && pre2.test(s);
		return pre1.and(pre2).test(s);//���д���ȼ�
		
		//����or   pre1.test(s) || pre2.test(s);  ��  pre1.or(pre2).test(s); �ȼ�
		//�ǣ�	return !pre1.test() ��  return pre.negate().test(s);
	}
	public static void main(String[] args) {
		String s = "abcdef";
		boolean b = checkString(s, (String str)->{
			return str.length() > 5 ;
		}, (String str)->{
			return str.contains("a");
		});
		System.out.println(b);
	}
	
}
