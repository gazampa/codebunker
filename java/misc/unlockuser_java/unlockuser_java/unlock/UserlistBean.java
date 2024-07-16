package unlock;


public class UserlistBean  {

    private String userId;
    private String userLogin;
    private String userName;

	public String getUserId(){
		return userId;
	}

	public void setUserId(String uId){
		this.userId=uId;
	}

	public String getUserLogin(){
		return userLogin;
	}

	public void setUserLogin(String uLog){
		this.userLogin=uLog;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String uName){
		this.userName=uName;
	}

}
