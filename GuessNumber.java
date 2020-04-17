import java.util.*; 
public class  {
	
	public static void main(String[] args){


	Random random = new Random();
	int realNumber = random.nextInt(100)+1;

	System.out.println("请输入一个1-100的整数：");
	int i = 0;
	Scanner reader = new Scanner(System.in);{
	i= reader.nextInt();
	while(i != realNumber) 
	if(i < realNumber) {
		System.out.println("猜小了");
		i= reader.nextInt();
	}
	else if(i > realNumber) {
		System.out.println("猜大了");
		i= reader.nextInt();
	}
	else {
		break;
	}
	System.out.println("猜对了");
	}
	}
}
