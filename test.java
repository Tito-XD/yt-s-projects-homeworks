import java.util.*; 
public class test {
	
	public static void main(String[] args){


	Random random = new Random();
	int realNumber = random.nextInt(100)+1;

	System.out.println("������һ��1-100��������");
	int i = 0;
	Scanner reader = new Scanner(System.in);{
	i= reader.nextInt();
	while(i != realNumber) 
	if(i < realNumber) {
		System.out.println("��С��");
		i= reader.nextInt();
	}
	else if(i > realNumber) {
		System.out.println("�´���");
		i= reader.nextInt();
	}
	else {
		break;
	}
	System.out.println("�¶���");
	}
	}
}
