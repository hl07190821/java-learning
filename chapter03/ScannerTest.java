/*
如何从键盘获取不同类型（基本数据类型、String类型）的变量：使用Scanner类。
  
键盘输入代码的四个步骤：
  
  1. 导包：import java.util.Scanner;
  2. 创建Scanner类型的对象：Scanner scan = new Scanner(System.in);
  3. 调用Scanner类的相关方法（next() / nextXxx()），来获取指定类型的变量
  4. 释放资源：scan.close();
  注意：需要根据相应的方法，来输入指定类型的值。如果输入的数据类型与要求的类型不匹配时，会报异常 导致程序终止
*/
import java.util.Scanner;
//1，导包
//输入数据类型匹配
class  ScannerTest01
{
	public static void main(String[] args) 
	{
		//2.创建Scanner对象
		//Scanner是一个引用数据类型，它的全名是java.util.Scanner
		//Scanner就是一个引用数据类型的变量了，赋给它的值是一个对象（暂时的说法）
		//new Scanner(System.in)是一个new表达式，该表达式的结果是一个对象

		//注意scanner.nextLine()与scanner.next()的区别
		//前者只有遇到回车才会结束，但是后者遇到空格和回车都会结束

		//引用数据类型 变量 = 对象
		//这个等式的意思可以理解为用一个引用数据类型的变量代表一个对象，所以这个变量的名称又称为对象名
		//我们也把scanner变量叫做scanner对象
		Scanner scanner = new Scanner(System.in);
		
		//3.根据提示，调用Scanner的方法，获取不同类型的变量
		System.out.println("欢迎光临你好我好交友网站");
		System.out.println("请输入你的网名：");
		String name = scanner.next();

		System.out.println("请输入你的年龄：");
		int age = scanner.nextInt();

		System.out.println("请输入你的体重：");
		double weight = scanner.nextDouble();

		System.out.println("你是否单身（true/false）");
		boolean isSingle = scanner.nextBoolean();

		System.out.println("请输入你的性别：");
		char gender = scanner.next().charAt(0);//注意： charAt()读取字符串的第一个字符
		
		System.out.println("你的基本情况如下：");
		System.out.println("网名："+name+"\n年龄："+age+"\n体重："+weight+"\n单身情况："+isSingle+"\n性别："+gender);

	}
}


/*
大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条件：高：180cm以上；富：财富1千万以上；帅：是。

如果这三个条件同时满足，则：“我一定要嫁给他!!!”
如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
如果三个条件都不满足，则：“不嫁！”

提示：
System.out.println(“身高: (cm));
scanner.nextInt();

System.out.println(“财富: (千万));
scanner.nextDouble();

System.out.println(“帅否: (true/false));   
scanner.nextBoolean();  

System.out.println(“帅否: (是/否));
scanner.next();   "是".equals(str)  
*/

class ScannerTest02{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("身高：(cm)");
		int height = scan.nextInt();

		System.out.println("财富：(千万)");
		double fortune = scan.nextDouble();

		System.out.println("帅否：(true/false)");
		boolean appearance = scan.nextBoolean();

		System.out.println("帅否：(是/否)");
		char appear = scan.next().charAt(0);

		if(height >= 180 && fortune >= 1000 && appearance == true){
			System.out.println("我一定要嫁给他");
		}else if(height >= 180 || fortune >= 1000 || appearance == true ){
			System.out.println("嫁吧，比上不足，比下有余");
		}else if(height < 180 && fortune <= 1000 && appearance ==false){
			System.out.println("不嫁！");
		}
	}
}

/*
我家的狗5岁了，5岁的狗相当于人类多大呢？其实，狗的前两年每一年相当于人类的10.5岁，
之后每增加一年就增加四岁。
那么5岁的狗相当于人类多少年龄呢？应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁。

编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人类的年龄。
如果用户输入负数，请显示一个提示信息。
*/
class ScannerTest03{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入狗狗年龄：");

		int dogAge = scan.nextInt();//接收狗狗年龄
		double humanAge = 0.0;
		
		for(;;){//如果输入年龄小于0就会一直循环
			if(dogAge >= 0 && dogAge <= 2){
				humanAge = 10.5*dogAge;
				break;
			}else if(dogAge > 2){
				humanAge = 21 + 2*dogAge;
				break;
			}else{
				System.out.println("年龄错误，请重新输入：");
				dogAge = scan.nextInt();
			}
		}
		System.out.println("狗"+dogAge+"岁"+"相当于人类"+humanAge+"岁");
	}
}