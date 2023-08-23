package Oops;

public class ProductDemo {
	public int m,n,r;
	
	public void getData() {
		m=4;
		n=5;
		System.out.println("get data");
	}
	public void multiply() {
		r = m*n;
		System.out.println("Product = "+r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDemo pd = new ProductDemo();
		pd.getData();
		pd.multiply();

	}

}
