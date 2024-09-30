
public class User implements IValidate {
	
	private String userid;
	private String password;
	
	public User() {}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	void addUser(String userid,String password) {
		this.userid = userid;
		this.password = password;
	}
	
	@Override
	public boolean IsAuthenticated(String userid,String password) {
		return false;
	}
}
