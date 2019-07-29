package demo06.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo03Test {
	/*
	 * ����һ������
	 * ������������һ����Ա��Ϣ����
	 * ��������Predicate�ӿڣ����ڶ�������Ϣ���й���
	 * ��������������Ϣ�浽ArrayList���ϲ�����
	 */
	public static ArrayList<String> filter(String [] arr, Predicate<String> pre1, Predicate<String> pre2){
		//����һ�����ϣ��洢���˺����Ϣ
		ArrayList<String> list = new ArrayList<>();
		
		for(String str : arr) {
			//ʹ��Predicate�е�test���������Ի�ȡ���ַ��������ж�
			boolean b = pre1.and(pre2).test(str);
			if(b) {
				list.add(str);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		//����һ���ַ�������
		String [] array = {"�����Ȱ�,Ů","��������,Ů","�������,��","����ӱ,Ů"};
		//����filter���������� �ַ�������h������lambda���ʽ
		ArrayList<String> list = filter(array,(String str)->{
			//��ȡ�ַ����е��Ա�
			return str.split(",")[1].equals("Ů");
		},(String str)->{
			return str.split(",")[0].length() == 4 ;
		});
		for(String s : list) {
			System.out.println(s);
		}
	}
}
