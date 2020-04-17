package Bank;

public class Main {
	public static void main(String[] args) {
		int amount=80000;
		ConstructionBank cbank=new ConstructionBank();
		cbank.money = amount;
		cbank.year=8.168;
		cbank.setLilv(0.035);
		System.out.println("建设银行"+cbank.computerInterest());
		ChongqingBank cqbank=new ChongqingBank();
		cqbank.money=amount;
		cqbank.year=8.168;
		cqbank.setLilv(0.042);
		System.out.println("重庆银行"+cqbank.computerInterest());
	}
}
 