/*
使用break防止无线循环
*/
import java.util.Scanner;


class EndlessFor01 {
	public static void main(String[] args) {
		for(;;){
			System.out.println("我爱你");
		}
	}
}

class EndlessFor02{
	public static void main(String[] args){
		for(int i = 1 ; i <= 10 ; ){}//循环没有修改，死循环
	
	}
}

class EndlessFor03{
	public static void main(String[] args){
		for(int i = 1 ; true ; ){}//循环永远成立
			
	}
}

class EndlessFor04{
	public static void main(String[] args){
		for(int i = 1 ; i>=10 ; ){}//一次都不执行
			
	}
}

/*
从键盘读入个数不确定的整数，
并判断读入的正数和负数的个数，输入为0时结束程序
*/

class EndlessFor05{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		//储存正数和负数的个数
		int positiveNum = 0;
		int negativeNum = 0;
		
		System.out.println("请输入一个整数:");
		int num = scan.nextInt();

		for(;;){
			if(num > 0){
				positiveNum++;
			}else if(num < 0){
				negativeNum++;
			}else{
				break;//跳出循环
			}
			System.out.println("请再输入一个整数:");
			num = scan.nextInt();
		}

		System.out.println("输入了"+positiveNum+"个正数");
		System.out.println("输入了"+negativeNum+"个负数");
		
		scan.close();
	
	}
}


