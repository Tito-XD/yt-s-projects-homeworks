package Bank;

public class ChongqingBank extends Bank {
	double year;
    double daylilv=0.0002;
	public double computerInterest(){
		super.year=(int)year;
		double yearInterest = super.computerInterest();
		double dayInterest=(year-super.year)*1000*daylilv*super.money;
		lixi=yearInterest+dayInterest;
		return lixi;
	}
}
