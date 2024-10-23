import java.util.ArrayList;

public class Categories {
	
	
	private String cname;
	private ArrayList<Product> plist;
	
	

	public Categories(String cname, ArrayList<Product> plist) {
		super();
		this.cname = cname;
		this.plist = plist;
	}
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public ArrayList<Product> getPlist() {
		return plist;
	}
	public void setPlist(ArrayList<Product> plist) {
		this.plist = plist;
	}
	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "{ Categories Name :"+cname +",Prducts="+plist+"}";
}
	
	
	

}
