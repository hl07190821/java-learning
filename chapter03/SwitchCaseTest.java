/*
switch（表达式）表达式中的值只能是：byte short char int 枚举（jdk5.0） String（jdk 7.0）
case子句中的值必须是常量，不能是变量名或不确定的表达式值或“范围”
同一个switch语句，所有case子句中的常量值互不相同
break语句用来执行完一个case分支后使程序跳出switch语句块
如果没有break。程序会顺序执行要switch结尾
default子句是可选的，同时位置也是灵活的，当没有匹配的case时，执行default语句
*/
//注意 switch的工作原理是：
//直接跳转到匹配的case标签处开始执行；
//从跳转的那个case标签“顺序执行”；
//直到遇到break或者switch结束；
//不会重新检查后续case值是否匹配
import java.util.Scanner;

class SwitchCaseTest01 {
	public static void main(String[] args) {
		int num = 1;
		int a = 1;
		final int b = 1;
		int c = 2;
		final int d = 2;
		switch (num){
			//case 0;//报错
			case 0://冒号
				System.out.println("zero");
				break;
			//case 3-2://表达式可以，但是不能是不确定的表达式
				//System.out.println("one");
			//case a://报错，因为a是变量
				//System.out.println("one a");
			//case b://报错，case标签重复，因为b的值为1，有两个case子句都为1
				//System.out.println("one b");
			//case c-a://报错，需要常量表达式
				//System.out.println("one c-a");
			case d-b://成功编译，运行结果为one d-b /n two
				System.out.println("one d-b");
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			default:
				System.out.println("other");
				//break;
		}

	}
}


class SwitchCaseTest02{
	public static void main(String[] arg){
		
		String season = "summer";
		switch (season){
			case "spring":
				System.out.println("春暖花开");
				break;
			case "summer":
				System.out.println("夏日炎炎");
				break;
			case "autumn":
				System.out.println("秋高气爽");
				break;
			case "winter":
				System.out.println("冬雪皑皑");
				break;
			default:
				System.out.println("季节输入有误");
				break;
		}
	}
}

class SwitchCaseTest03{
//重点 ** 对学生成绩大于60分输出“合格”，低于60分，输出“不合格”
	public static void main(String[] arg){

		int score = 60;
		switch(score / 10){//使用score%60显然不合理
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("不合格");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("合格");
				break;
			default:
				System.out.println("输入成绩有误");
				break;		
		}
		//更好的写法
		switch(score / 60){
			case 0:
				System.out.println("不合格");
				break;
			case 1:
				System.out.println("合格");
				break;
			default:
				System.out.println("输入成绩有误");
				break;
		}
	}
}


//import java.util.Scanner;//报错，Java中import语句必须放在文件的最开始（在package语句之后，在类定义之前）

class SwitchCaseTest04{
//重点 *** 从键盘上输入2023年的“month”和“day”，要求通过程序输出出入的日期为2023年的第几天
	public static void main(String[] arg){
		
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入2023年的month：");
		int month = scan.nextInt();

		System.out.println("请输入2023年的day");
		int day = scan.nextInt();
		
		//这里就不针对month和day进行合法性的判断，以后可以使用正则表达式进行检验
		int sumDays = 0;//记录总天数

		//写法1：不推荐（存在冗余的数据）
		/*
		switch(month){
			case 1:
				sumDays = day;
				break;
			case 2:
				sumDays = 31 + day;
				break;
			case 3:
				sumDays = 31 + 28 + day;
			//...
			case 12:
				sumDays = 31 + 28 + ... + 30 + day;
		}
		*/

		//写法2：推荐
		switch(month){
			case 12:
				sumDays += 30;//十一月份的天数
			case 11:
				sumDays += 31;//十月份的天数
			case 10:
				sumDays += 30;//九月份的天数
			case 9:
				sumDays += 31;//八月份天数
			case 8:
				sumDays += 31;//七月份天数
			case 7:
				sumDays += 30;//六月份天数
			case 6:
				sumDays += 31;//五月份天数
			case 5:
				sumDays += 30;//四月份天数
			case 4:
				sumDays += 31;//三月份天数
			case 3:
				sumDays += 28;//二月份天数
			case 2:
				sumDays += 31;//一月份天数
			case 1:
				sumDays += day;//当月天数
				break;
			default:
				System.out.println("输入月数有误");
				break;
		}
		System.out.println("迄今为止总天数为："+ sumDays);
		//关闭资源
		scan.close();
	}
}


class SwitchCaseTest05{
//测试4进阶，从键盘输入年，月，日，判断这一天是当年的第几天

	public static void main(String[] arg){
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入year：");
		int year = scanner.nextInt(); 

		System.out.println("请输入month");
		int month = scanner.nextInt();

		System.out.println("请输入day");
		int day = scanner.nextInt();
		
		int sumDays = 0;
		switch (month){
			case 12 : 
				//累加的1-11月
				sumDays += 30;
			case 11 : 
				sumDays += 31;
			case 10:
				sumDays += 30;
			case 9:
				sumDays += 31;
			case 8:
				sumDays += 31;
			case 7:
				sumDays += 30;
			case 6:
				sumDays += 31;
			case 5:
				sumDays += 30;
			case 4:
				sumDays += 31;
			case 3:
				sumDays += 28;
				//在此处考虑是否是闰年，二月是否有29天
				if(year % 4 == 0 && year % 100 != 0){
					sumDays += 1;
				}else if(year % 400 == 0){
				//}else(year % 4 == 0){//else后不能接条件
					sumDays += 1;
				}
			case 2:
				sumDays += 31;
			case 1:
				sumDays += day;
		}
		System.out.println(year+"年"+month+"月"+day+"日"+"是这一年的第"+sumDays+"天");
		
		scanner.close();
	}
}

class SwitchCaseTest06{
/*
需求：指定一个月份，输出该月份对应的季节。一年有四季：
3，4，5 春季
6，7，8 夏季
9，10，11 秋季
12，1，2 冬季
*/
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = input.nextInt();
		/*switch (month)
		{
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
		
		}*/
		/*
		switch(month){
			case 3|4|5://不会报错，因为|是位运算符，11|100|101 结果为111 7
		}
		*/
		switch (month % 3){
			case 1:
				System.out.println("春季");
				break;
			case 2:
				System.out.println("夏季");
				break;
			case 3:
				System.out.println("秋季");
				break;
			case 0:
			case 4:
				System.out.println("冬季");
		}
		//使用if-else实现
		if (month % 3 == 1 ){
			System.out.println("春季");
		}else if(month % 3 == 2){
			System.out.println("夏季");
		}else if(month % 3 == 3){
			System.out.println("秋季");
		}else{
			System.out.println("冬季");		
		}
		input.close();
	}
}


//结论：凡是使用switch-case的结构都可以转换为if-else结构，反之，不成立
//如果二者都可以用，建议使用switch-case，因为效率更高

//案例：只能用if-else
//从键盘输入一个整数，判断是正数，负数还是0
class IfOrSwitchDemo{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = input.nextInt();
		if (num > 0) {
		System.out.println("正数");
		} else if (num < 0){
			System.out.println("负数");
		} else {
			System.out.println("零");
		}
	}
}

//练习07 从键盘输入星期的整数值，输出星期的英文单词

class SwitchCaseTest07{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入星期的整数值");
		int weekday = input.nextInt();
		switch (weekday){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuseday");
				break;
			case 3:
				System.out.println("Wensday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("输入的星期值有误");
		}
		input.close();
	}
}

//练习 08 使用switch把小写类型的char转为大写，只转换a，b，c，d，e，其他的输出“other”

class SwitchCaseTest08{
	public static void main(String[] arg){
		
		char word = 'c';
		switch (word){
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		case 'd':
			System.out.println("D");
			break;
		case 'e':
			System.out.println("E");
			break;
		default:
			System.out.println("other");
		}
	}
}

//练习 09 从键盘上读入一个学生成绩，存放在变量score中，根据score的值输出其对应的成绩等级
/*
score >= 90 等级A
70 <= score < 90 等级B
60 <= score < 70 等级C
score < 60 等级D
*/

class SwitchCaseTest09{
	public static void main (String[] arg){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生成绩");
		int score = input.nextInt();
		
		char grade;
		/*
		//方式1：
		if (score >= 90){
			grade = 'A';
		} else if (score >= 70 && score < 90){
			grade = 'B';
		} else if (score >= 60 && score < 70){
			grade = 'C';
		} else {
			grade = 'D';
		}
		*/
		//方式2：
		switch (score / 10){
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
			case 7:
				grade = 'B';
				break;
			case 6:
				grade = 'C';
				break;
			default:
				grade = 'D';
		}
		System.out.println("学生成绩为："+ score+"对应的等级为："+grade);
		input.close();
	}
}


//编写一个程序，为一个给定的年找出其对应的中国生肖
class SwitchCaseTest10{
	public static void main(String[] arg){
		//从键盘输入一个年份
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个年份");
		int num = input.nextInt();
		input.close();

		//判断
		switch (num % 12){
			case 1 :
				System.out.println("属鼠");
				break;
			case 2:
				System.out.println("属牛");
				break;
			case 3:
				System.out.println("属虎");
				break;
			case 4:
				System.out.println("属兔");
				break;
			case 5:
				System.out.println("属龙");
				break;
			case 6:
				System.out.println("属蛇");
				break;
			case 7:
				System.out.println("属马");
				break;
			case 8:
				System.out.println("属羊");
				break;
			case 9:
				System.out.println("属猴");
				break;
			case 10:
				System.out.println("属鸡");
				break;
			case 11:
				System.out.println("属狗");
				break;
			case 12:
				System.out.println("属猪");
				break;
		}
	}
}

//随机产生3个1-6的整数，如果三个数相等，那么称之为“豹子”，如果三个数之和大于9，称之为“大”，如果三个数之和小于等于9，称之为“小”，用户从键盘输入押的是“豹子”，“大”，“小”，并判断是否猜对了
//随机数 Math.random() 产生[0,1)范围内的小数；
//如何获取[a,b]范围内的随机整数呢，(int)(Math.random()*(b - a + 1)) + a

class SwitchCaseTest11{
	public static void main(String[] args){
		//1，随机产生3个1-6的整数
		int a = (int)(Math.random()*6 + 1);
		int b = (int)(Math.random()*6 + 1);
		int c = (int)(Math.random()*6 + 1);

		//2,押宝
		Scanner input = new Scanner(System.in);
		System.out.println("请押宝（豹子，大，小）");
		String ya = input.next();
		input.close();

		//3,判断结果

		boolean result = false;
		//switch支持String类型
		switch (ya){
			case "豹子": result = a == b && a == c; break;
			case "大": result = a + b + c > 9; break;
			case "小": result = a + b + c < 9; break;
			default : System.out.println("输入有误！");
		}

		System.out.println("a,b,c分别是" + a + "，"+ b + "，" + c + "，");
		System.out.println(result ? "猜中了" : "猜错了");
	} 
}

class SwitchCaseTest12{
	public static void main(String[] arg){
		int a = 3;
		int x = 100;
		switch (a){
			case 1 :
				x += 5;
				break;
			case 2 :
				x += 10;
				break;
			case 3 :
				x += 16;
				break;
			default:
				x += 34;
		}
	
	}
}