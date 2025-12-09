/*
①初始化部分;
do{
    ③循环体部分
    ④迭代部分
}while(②循环条件部分); 

执行过程 1-3-4-2-3-4-2-3-4-2...-2

do-while结构的循环体语句是至少会执行一次，这个和for和while是不一样的
循环的三个结构for while do-while是可以相互转换的
*/


/*
遍历1-100的偶数，并计算所有偶数的和、偶数的个数（累加的思想）
*/
import java.util.Scanner;

class DoWhileTest01
{
	public static void main(String[] args) 
	{
		int num = 1;
		
		int sum = 0;//记录偶数的个数
		int count = 0;//记录偶数的和

		do{
		//循环体部分
			sum += num % 2 == 0 ? num : 0;
			count += num % 2 == 0 ? 1 : 0; 

			num++;
		}while(num <= 100);


		System.out.println("1-100的偶数所有偶数的和为："+sum);
		System.out.println("1-100的偶数所有偶数的个数为："+count);
	}
}

/*
体会do-while至少会执行一次循环体
*/
class DoWhileTest02{
	public static void main(String[] args){
		//while循环：
		int num1 = 10;
		while(num1 > 10){
			System.out.println("hello:while");
			num1--;
		}

		//do-while循环：
		int num2 = 10;
		do{
			System.out.println("hello:do-while");
			num2--;
		}while(num2 < 10);

	}
}

/*
声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。

=========ATM========
   1、存款
   2、取款
   3、显示余额
   4、退出
请选择(1-4)：
*/

class DoWhileTest03{
	public static void main(String[] args){
		
		//初始化条件
		double balance = 0.0;
		Scanner scan = new Scanner(System.in);
		boolean isFlag = true;//用于控制循环的结束

		do{
			System.out.println("=======ATM=====");
			System.out.println("\t1、存款");
			System.out.println("\t2、取款");
			System.out.println("\t3、显示余额");
			System.out.println("\t4、退出");
			System.out.println("请选择（1-4）：");

			int selection = scan.nextInt();
			
			switch(selection){
				case 1:
					System.out.println("要存款的额度为：");
					double addMoney = scan.nextDouble();
					if(addMoney > 0){
						balance += addMoney;
					}
					break;
				case 2:
					System.out.println("要取款的额度为：");
					double withdrawMoney = scan.nextDouble();
					if(withdrawMoney > 0){
						balance -= withdrawMoney;
					}
					break;
				case 3:
					System.out.println("你的余额为："+balance);
					break;
				case 4:
					isFlag = false;
					break;
				case 5:
					System.out.println("请重新选择！");//输入不在1-4范围内
					break;
			}
			System.out.println("");
		}while(isFlag);
		scan.close();
	}
}

/*
随机生成一个100以内的数，猜这个随机数是多少？
从键盘输入数，如果大了提示，大了；如果小了，提示小了
；如果对了，就不再猜了，并统计一共猜了多少次。
*/
class DoWhileTest04{
	public static void main(String[] args){
		//设置统计次数变量
		int count = 0;
	
		//生成一个100以内的随机数
		int random = (int)(Math.random()*100)+1;
	
		//猜数字
		Scanner scan = new Scanner(System.in);//
		System.out.println("请输入一个1-100的整数：");
		int num = scan.nextInt();

		do{
			count++;
			if(num > random){
				System.out.println("大了，重新猜测：");
				num = scan.nextInt();
			}else if(num < random) {
				System.out.println("小了，重新猜测：");
				num = scan.nextInt();
			}
		
		}while(num != random);
		System.out.println("一共猜测了"+count+"次");
	}
}

/*
对于三种循环结构如何选择？
遍历有明显循环次数的需求，选择for循环
遍历没有明显的循环次数的需求，选择while循环
如果循环体语句块至少执行一次，可以考虑使用do-while循环
*/