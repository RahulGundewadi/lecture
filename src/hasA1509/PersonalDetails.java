package hasA1509;

public class PersonalDetails {

	@Override
	public String toString() {
		return "PersonalDetails [fatherName=" + fatherName + ", matherName=" + matherName + "]";
	}

	private String fatherName;
	
	private String matherName;

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMatherName() {
		return matherName;
	}

	public void setMatherName(String matherName) {
		this.matherName = matherName;
	}
	
	
}
