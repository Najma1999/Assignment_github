package MamAss;

public class PrsnField {
	
	private int jobID;
	private String Profile;
	private String jioningDate;
	
	public void set_JobId(int jobid)
	{
		this.jobID=jobid;
	}
	public int get_JobId()
	{
		return jobID;
	}
	public void set_Profile(String profile)
	{
		this.Profile=profile;
	}
	public String get_Profile()
	{
		return Profile;
	}
    public void set_JioningDate(String jioningdate)
    {
    	this.jioningDate=jioningdate;
    }
	public String get_JioningDate()
	{
		return jioningDate;
	}
}
