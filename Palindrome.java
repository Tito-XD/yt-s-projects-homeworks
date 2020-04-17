import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����һ��1��99999������");
		int i = 0;// get user input int
		Scanner scan = new Scanner(System.in);
		i = scan.nextInt();
		if(i>=1&&i<=99999) {
		int d1, d2, d3, d4, d5;
		d5 = i / 10000 % 10;
		d4 = i / 1000 % 10;
		d3 = i / 100 % 10;
		d2 = i / 10 % 10;
		d1 = i % 10;

		if (d5 != 0) {
			if (d5 == d1 && d4 == d2) {
				System.out.println(i + "��5λ������");
			} else {
				System.out.println(i + "��5λ ���ǻ�����");
			}
		}

		else if (d4 != 0) {
			if (d4 == d1 && d3 == d2) {
				System.out.println(i + "��4λ������");
			} else {
				System.out.println(i + "������λ������!");
			}
		}

		else if (d3 != 0) {
			if (d3 == d1) {
				System.out.println(i + "��3λ������");
			} else {
				System.out.println(i + "��3λ ���ǻ�����");
			}
		}

		else if (d2 != 0) {
			if (d2 == d1) {
				System.out.println(i + "��2λ������");
			} else {
				System.out.println(i + "����λ ���ǻ�����");
			}
		}

		else if (d1 != 0) {
			System.out.println(i + "�ǻ�����");
		}

	}else {
		System.out.println("����������Ҫ��");
	}
	}

}
