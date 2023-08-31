package two;

public class Add extends one.Values{
int sum;

void add()
{
	sum=i+j;
	System.out.println("Sum="+sum);
}
public static void main(String args[])
{
	Add a=new Add();
	a.add();
}
}

