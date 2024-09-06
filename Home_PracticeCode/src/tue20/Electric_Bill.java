package tue20;

public class Electric_Bill {

	private int units;
	
	public Electric_Bill(int units)
	{
		this.units=units;
	}
	public int CalculateBill()
	{
		int unitCharge=0;
		int meterCharge=0;
		if(units>=0 && units<=100)
		{
			meterCharge=150;
			unitCharge=100;
		}
		else if(units>=100 && units<=200)
		{
			meterCharge=200;
			unitCharge=150;
		}
		else if(units>=200 && units<=300)
		{
			meterCharge=250;
			unitCharge=200;
		}
		else if(units>300)
		{
			meterCharge=300;
			unitCharge=250;
		}
		
		return (meterCharge) + (units*unitCharge);
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	
	
}
