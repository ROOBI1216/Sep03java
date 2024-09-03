package Com.nit;

class RBIACC {
	  String name;
	  int accno;
	
	  public RBIACC(String name, int accno) {
		super();
		this.name = name;
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	@Override
	public String toString() {
		return "RBIACC [name=" + name + ", accno=" + accno + "]";
	}
	
	  
	  
}
   



