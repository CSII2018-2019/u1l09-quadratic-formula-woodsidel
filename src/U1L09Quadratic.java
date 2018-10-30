import javax.swing.JOptionPane;
public class U1L09Quadratic {

	public static void main(String[] args) {
		String a1 = JOptionPane.showInputDialog("What is your a value?");
		double a = Double.parseDouble(a1);
		String b1 = JOptionPane.showInputDialog("What is your b value?");
		double b = Double.parseDouble(b1);
		String c1 = JOptionPane.showInputDialog("What is your c value?");
		double c = Double.parseDouble(c1);
		quadratic(a, b,c);
		
		

	}
	public static void quadratic(double num1, double num2, double num3) {
		double squareRoot = Math.sqrt((num2*num2)-4*(num1)*(num3));
		double firstRoot = ((-1*num2)+squareRoot)/(2*num1);
		double secondRoot = ((-1*num2)-squareRoot)/(2*num1);
		JOptionPane.showMessageDialog(null, "First Root = "+firstRoot+"\nSecond Root = "+secondRoot);
		
		
	}


}
