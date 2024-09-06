package sat0903;

public class userException extends Exception{

	private String msg="you can not vote";
	
	public userException()
	{
		System.out.println("Error");
	}
	public userException(String msg)
	{
		this.msg=msg;
	}
	public void showError()
	{
		System.out.println("You are not elegible for Vote");
		System.out.println(msg);
	}



}
