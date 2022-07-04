import java.util.Scanner;
class PanValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pan = scanner.next();
	String name = scanner.next();
        char c[] = pan.toCharArray();
	char n[]=name.toCharArray();
        System.out.println(validatePanNo(c,n));
    }
    private static String validatePanNo(char[] c, char[] name) {
        if(c.length!=10)
            throw new ArithmeticExeption("Length exeption");
        for(int i =0;i<10;i++){
            if((i >= 0 && i<=3) && (c[i] < 'A' || c[i] > 'Z'))
            throw new ArithmeticExeption("Alphabetic series exeption");
	if((i==4) && (c[i] <'A' || c[i]>'P'))
	throw new ArithmeticExeption("fourth character exeption");
	if((i==5) && (c[i] !=name[0]))
	throw new ArithmeticExeption("fifth character exeption");
            }
        return "This might be valid PAN number";
    }
}