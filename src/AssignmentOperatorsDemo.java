
public class AssignmentOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j, k;
		j = 10;
		j = 5;
		k = j;
		System.out.println("j is: " + j);
		System.out.println("k is: " + k);
		
		k = j = 10;
		System.out.println("j is: " + j);
		System.out.println("k is: " + k);
		
		ArithmeticOperatorsDemo another = new ArithmeticOperatorsDemo();
	     another.showMessage();
	}

};

class ArithmeticOperatorsDemo {

    public void showMessage() {
        int x, y = 10, z = 5;
        x = y + z;
        System.out.println("+ operator resulted in " + x);
        x = y - z;
        System.out.println("- operator resulted in " + x);
        x = y * z;
        System.out.println("* operator resulted in " + x);
        x = y / z;
        System.out.println("/ operator resulted in " + x);
        x = y % z;
        System.out.println("% operator resulted in " + x);
        x = y++;
        System.out.println("Postfix ++ operator resulted in " + x);
        x = ++z;
        System.out.println("Prefix ++ operator resulted in " + x);
        x = -y;
        System.out.println("Unary operator resulted in " + x);
        
        
    }
    
}