

class CommandLineArg
{
public static void main(String[] args){
String name = args[0];
int a = Integer.parseInt(args[1]);
int b = Integer.parseInt(args[2]);

int sum = a+b;
System.out.println("Hello"+name);
System.out.println("The Addition of 2 Nos is : "+sum);
}
}