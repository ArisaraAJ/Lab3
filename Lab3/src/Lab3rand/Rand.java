package Lab3rand;

import java.util.Scanner;
import java.util.Random;

public class Rand {
	public static void main(String[] args){
		
		Random rand = new Random(); // �� rand �繡�����¡������᷹ 
		Scanner scanf = new Scanner(System.in);	 // �� scanf �繡�����¡������᷹
		int n ;
		int r = 0 ;
		
		System.out.print("Please enter your random value :");
		n = scanf.nextInt(); //�Ѻ��� n ��
		System.out.println("-----------------------");
		
		int[] Array = new int[n];// ���ҧ Array ��ҡѺ��Ҵ�ͧ n
		for(int i = 0 ; i <= n ; i ++) {
			
			Array[r] = rand.nextInt(100); // �纤�� r ��� random ����������� Array
			
			System.out.print("Array["+i+"]");
			System.out.println(" = " + Array[r]);
		}
		
		
		
	}
}