class ModuleDivision 
{
	public static void main(String[] args) 
	{
		//=== 案例一：数字1234打印出 个 十 百 千位 ===
		int num = 1234;
		int ge = num % 10;
		int shi = num /10 % 10;
		int bai = num /100 % 10;
		int qian = num /1000;
		System.out.println("个位："+ge);
		System.out.println("十位："+shi);
		System.out.println("百位："+bai);
		System.out.println("千位："+qian);
		/*
		取模操作取后面数字 如%10 取个位 %100取个位和十位
		除操作取前面数字 如/10 取个位前面的所有数字 /100取个位十位前面的数字
		*/
	}
}


class IncrementDecrement
{
	public static void main(String[] args)
	{
	System.out.println("5+5 = " + 5 + 5);
	
	byte b1 = 127;
	b1++;
	System.out.println("b1 = "+ b1);//127的二进制表示为：0111111,二进制加1 10000000表示-128

	int i = 1;
	int j = i++ + ++i * i++;
	//i++先加载i的值到栈顶再进行i自增，
	//++i先进行i自增再加载i的值到栈顶。
	System.out.println("j = " + j);

	int i1 = 2;
	int j1 = i1++;
	System.out.println(j1);//结果为2

	int m = 2;
	m = m++;
	/*
	步骤一：加载局部变量1（m）的值到栈顶
	步骤二：将局部变量1（m）的值增加1
	步骤三：将栈顶的值存储到局部变量1（m）中
	栈就是操作台，最后是将栈中的值赋给m
	*/
	System.out.println(m);//结果为2
	int n = 10;
	//n += (n++) + (++n);//等价于：n = n + (n++) + (++n),结果为32
	n = (n++) + (++n) + n;//结果为34
	System.out.println(n);
	}
}

class PlusEqual
{
	public static void main(String[] arg)
	{
		short s1 = 10;//int转化为short
		s1 += 2;
		//复合赋值运算符实际上等价于(short)(s1 + 2)
		//所有复合赋值运算符都有这个特性
		System.out.println(s1);

		//s1 = s1 + 2;
		//报错，s1为short类型，2为int类型，结果为int类型
		//将int赋值给short需要窄化转换，java要求宅化转换必须显式强制转换
		s1 = (short)(s1 + 2);
	}
}


class Comparision
{
	public static void main(String[] arg)
	{
	//区分==与=
	boolean b1 = false;
	//if(b1 == true)//结果为假
	if(b1 = true)//结果为真
		System.out.println("结果为真");
	else 
		System.out.println("结果为假");
	}
}


class LogicTest
{
	public static void main(String[] arg)
	{
	//=== 测试一：区分& && ===
	int a = 1;
	int b = 2;
	int c = 3;
	System.out.println((a > b) & (a++ > c));
	System.out.println("a = "+a);
	System.out.println((a > b) && (a++ > c));
	System.out.println("a = "+a);
	System.out.println((a == b) && (a++ >= c));//false
	System.out.println("a = "+a);

	//=== 测试二：区分| || ===
	System.out.println((a > b) | (a++ > c));
	System.out.println("a = "+a);
	System.out.println((a > b) || (a++ > c));
	System.out.println("a = "+a);
	System.out.println((a == b) || (a++ > c));
	System.out.println("a = "+a);
	}
} 

class CompareLogicExer
{
	public static void main(String[] arg)
	{
	int a = 20;
	int b = 20;
	boolean bo1 = ((++a % 3) == 0)&&((a++ % 7) == 0);//加一个比较运算符，ture
	System.out.println("bo1的值为："+bo1);//字符串和整数之间要加+号，true
	System.out.println("a的值为："+a);//22
	boolean bo2 = ((b++ % 3) == 0)&&((++b % 3) == 0);//false
	System.out.println("bo2的值为："+bo2);//false
	System.out.println("b的值为："+b);//21

	int x = 1;
	int y = 1;
	if(x++ == 2 & ++y == 2){
	x = 7;
	}
	//System.out.println("x = "+x "y = "+y);//报错，注意连接运算符！
	System.out.println("x = "+x+ "y = "+y);
	//int x = 1;//报错，不能在同一个类中重复定义变量
	//int y = 1;
	int x1 = 1;
	int y1 = 1;
	if(x1++ == 2 && ++y1 == 2){
	x1 = 7;
	}
	System.out.println("x1 = "+x1+" y1 = "+y1);//注意，空格应该加在后面的字符串开始
	int x2 = 1;
	int y2 = 1;
	if(x2++ == 1 | ++y2 == 1){
	x2 = 7;
	}
	System.out.println("x2 = "+x2+ " y2 = "+ y2);
	int x3 = 1;
	int y3 = 1;
	if(x3++ == 1 || ++y3 ==1){
	x3 = 7;
	}
	System.out.println("x3 = "+x3+ " y3 = "+y3);
	}
}

class BitwiseOperator
{
	public static void main(String[] arg)
	{
	//逻辑运算符和位运算符的区别不在于符号，而在于两边的数值类型
	// 有无符号右移>>>，但是没有无符号左移
	//<< 左移 被移除的高位丢弃 空位补0 
	//>> 右移 被移除的低位丢弃 最高位是0 空位补0 最高位是1 空位补1
	//>>> 无符号右移 被移位的二进制最高位无论是0还是1 都用0补
	//移位运算符都是移动“补码”
	//&按位与，只有1&1时结果为1
	//|按位或，只有0|0时结果为0
	//^按位异或，只有1^0和0^1时结果为0 同时^异或具有交换律和结合律
	//(m^n)^n = m //n^n = 0 m^0 = m
	//~按位取反
	//=== 测试一：高效的方式计算2*8的值 ===
	int a = 2<<3;//等价于2*2^3
	int b = 8<<1;//等价于8*2^1

	//=== 测试二：如何交换两个int类型变量的值 ===
	int m = 10;
	int n = 5;
	//方法一 缺点：需要额外定义
	int temp = m;
	m = n;
	n = temp;

	//方法二 缺点：可能超出int的范围
	m = m + n;
	n = m - n;
	m = m - n;

	//方法三 缺点：不易理解，只能用于数值类型
	m = m ^ n;
	n = m ^ n;
	m = m ^ n;
	}
}

class ConditionalOperator
{
	public static void main(String[] arg)
	{
		//凡是可以使用条件运算符都可以使用if-else结构，反之不成立
		//开发中尽量选择条件运算符，执行效率更高
		int i = (1 == 2 ? 100:200);
		System.out.println(i);
		
		boolean marry = false;
		System.out.println(marry ? "已婚" : "未婚");
		
		int m1 = 1;
		int m2 = 2;
		double d1 = (m1 > m2) ? 1:2.0;
		//如果运算后的结果赋给新的变量要求表达式1与表达式2为同种或兼容的类型
		System.out.println(d1);

		int num =12;
		System.out.println(num > 0 ? true : "num非正数");

		//=== 练习1：获取三个数中的较大值 ===
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;

		int tempMax = (n1 > n2) ? n1 : n2;
		int finalMax = (tempMax > n3) ? tempMax : n3;
		System.out.println("三个数中的最大值为："+ finalMax);

		//=== 练习2：今天是周二，5天以后是周几 ===
		int week =  2;
		week += 5;
		week %= 7;
		System.out.println("今天是周二，10天以后是周"+(week == 0 ? '日' : week ));
		//报错，显示为10天以后是26085，char类型自动被提升为int类型
		System.out.println("今天是周二，10天以后是周"+(week == 0 ? "日" : week ));//注意括号匹配
	}
}