
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ʹ��new �������Ĭ�ϵĹ��췽����������car1 car2
		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Vehicle();
				// �ֱ�����car1 car2�Ĺ���Ϊ155��115
		car1.setPower(155);
		car2.setPower(115);
				// ���car1 car2�Ĺ���
				System.out.println("car1�Ĺ����ǣ�" + car1.getPower());
				System.out.println("car2�Ĺ����ǣ�" + car2.getPower());

				// car1����speedUp()�������Լ���speed��ֵ����80
				car1.speedUp(80);
				// car2����speedUp()�������Լ���speed��ֵ����60
				car2.speedUp(60);
				// ���car1 ��car2���ٶȣ�
				System.out.println("car1���ٶ���:"+car1.getSpeed());
				System.out.println("car2���ٶ���:"+car2.getSpeed());
				// car1����speedDown()�������Լ���speed��ֵ����20
				car1.speedDown(20);
				// car2����speedDown()�������Լ���speed��ֵ����30
				car2.speedDown(30);
				// ���car1 ��car2���ٶȣ�
				System.out.println("car1���ٶ��ǣ�" + car1.getSpeed());
				System.out.println("car2���ٶ��ǣ�" + car2.getSpeed());

	}

}
