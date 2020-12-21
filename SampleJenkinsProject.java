public class SampleJenkinsProject
{
public static void main(String[] args)
{
	SampleJenkinsProject sjp = new SampleJenkinsProject();
	String result = sjp.getData();
	System.out.println("The Result is "+result);
	System.out.println("Welcome to JENKINS");
}
public String getData()
{
	return "Hello World From GetData";
}
}