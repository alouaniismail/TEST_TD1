public class ExecutionExemple2
{
    public static void main(String[] args)
    {
	boolean estMisAssertion = false;
	assert estMisAssertion = true;

	if (!estMisAssertion) {
	    System.out.println("Execution impossible sans l'option -ea");
	    return;
    }
	}
}
    //application du comment.voila.
