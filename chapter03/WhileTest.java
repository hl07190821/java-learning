/*
1 初始化部分
while(2 循环条件部分){
	3 循环体部分
	4 迭代部分
}
执行过程 1 - 2 - 3 - 4 - 2 - 3 - 4 - 2 - 3 - 4 - 2 
while（循环条件）中循环条件必须是boolean类型
注意不要忘记声明4迭代部分，否则，循环将不能结束，变成死循环
for循环和while循环可以相互转换，二者没有性能上的差别，实际开发中，根据具体结构的情况，选择哪个格式更合适，美观
for循环与while循环的区别：初始化条件部分的作用域不同
*/
import java.util.Scanner;

//输出5行HelloWorld！
class  WhileTest01{
	public static void main(String[] args) {
		int i = 1;
		while (i <= 5){
			System.out.println("Hello World!");
			i++;
		}
	}
}


//遍历1-100的偶数，并计算所有偶数的和，偶数的个数
class WhileTest02{
	public static void main(String[] args){

		int sum = 0;
		int count = 0;
		int i = 1;

		while(i <= 100){
			sum += i%2 == 0 ? i : 0;
			count += i%2 == 0 ? 1 : 0;
			i++;
		}

		System.out.println("1-100的偶数，所有偶数的和为："+sum);
		System.out.println("1-100的偶数，所有偶数的个数为："+count);
	}
}

/* *
随机生成一个100以内的数，猜这个随机数是多少？

从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。

提示：生成一个[a,b] 范围的随机数的方式：(int)(Math.random() * (b - a + 1) + a)
*/

class WhileTest03{
//class WhileTest02{//类名重复不报错
	public static void main(String[] args){
		//获取一个随机数
		int random = (int)(Math.random() * 100) + 1;

		//记录猜的次数
		int count = 1;

		//实例化Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数（1-100）：");
		int guess = input.nextInt();

		while(guess != random){
			
			if(guess > random){
				System.out.println("猜大了");
			}
			if(guess < random){
				System.out.println("猜小了");
			}

			System.out.println("重新输入一个整数（1-100）：");
			guess = input.nextInt();

			//累加猜的次数
			count++;
		}
		input.close();

		System.out.println("猜中了！");
		System.out.println("一共猜了" + count + "次");
	}
}

/*
世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，
它的厚度是0.1毫米。请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
*/
class WhileTest04{
	public static void main(String[] args){
		//定义纸张的厚度
		double d1 = 0.001;
		//定义一个计数器，初始值为0
		int count = 0;
		while(d1 <= 8848.86){
			d1 *= 2;
			count++;
		}
		System.out.println("需要折叠"+count+ "次");
	}
}

/* 
从键盘输入整数，输入0结束，统计输入的正数、负数的个数。
*/
class WhileTest05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//记录正数个数
		int positiveNum = 0;
		//记录负数个数
		int negativeNum = 0;
		
		System.out.println("请输入一个整数：");
		int i = input.nextInt();

		//第一次判断正负，如果为正pn加一，如果为负，nn加一
		positiveNum += i > 0 ? 1 : 0;
		// * negativeNum += i > 0 ? 0 : 1;//如果这样写，会把0判断为负数
		negativeNum += i < 0 ? 1 : 0;

		while(i != 0){
			System.out.println("请输入一个整数：");
			i = input.nextInt();
			positiveNum += i > 0 ? 1 : 0;
		    negativeNum += i < 0 ? 1 : 0;
		}

		System.out.println("输入的正数有"+positiveNum+"个");
		System.out.println("输入的负数有"+negativeNum+"个");
	}
}