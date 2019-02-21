//十六进制转十进制
import java.util.*;
import java.lang.*;
public class _4003 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入需要转换的数据个数：");
		int number = Integer.parseInt(s.nextLine());
		String [] arrayOfHex = new String[number];
		int [] arrayofDec = new int[number];
		System.out.println("请输入具体数据：");
		for(int i = 0;i<number;i++)
		{
			Scanner s_ = new Scanner(System.in);
			arrayOfHex[i] = s_.nextLine();
			arrayofDec[i] = Integer.parseInt(arrayOfHex[i], 16);			
		}
		for(int i = 0;i<number;i++)
		{
			System.out.println(arrayofDec[i]);
		}
	}

}
