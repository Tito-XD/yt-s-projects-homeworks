package Bank;

public class Bank {
	double lilv;
	int year;
	double money;
	double lixi;
	public double computerInterest(){
		lixi=money*year*lilv;
		return lixi;
	}
	public void setLilv(double lilv){
		this.lilv=lilv;
	}
}