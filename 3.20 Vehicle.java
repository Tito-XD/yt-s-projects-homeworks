
public class Vehicle {

	public void main(String[] args) {}
	private double speed;
	private int power;
	void speedUp(int s){
		speed=s+speed;
		if(speed > 200) {
			speed=200;
			System.out.println("�ٶȲ��ܳ���200��");
		}
	}

	void speedDown(int d) {
		speed=speed-d;
		if(speed<0) {
			speed=0;
			System.out.println("�ٶȲ��ܵ���0��");
		}
	}

	void setPower(int p) {
		power=p;
	}

	int getPower() {
		return power;
	}

	double getSpeed() {
		return speed;
	}

}
