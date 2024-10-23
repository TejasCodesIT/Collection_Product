
public class Product {
	
	
	private int pid;
	private String pname;
	private String prize;
	
	
	
	
	
	public Product(int pid, String pname, String prize) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.prize = prize;
	}
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	
	

}
