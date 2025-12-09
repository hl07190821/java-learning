/*
基本数据类型
1个byte（字节） = 8bit
数据类型有一定范围
整型 byte\short 2字节\int 4字节\long 8字节

声明long类型使要提供后缀l或者L
如 long l1 = 23445L;

浮点型 float\double
声明float类型时，需要声明后缀f或者F


字符型 char
布尔型 boolean


引用数据类型

类
数组
接口

枚举
注解
记录
*/
class VariableTest
{
	public static void main(String[] args){
		char gender;
		gender = '男';
		int age = 10;
		System.out.println("age = "+age);
		System.out.println("age");//结果为age
		System.out.println(age);
	}
}

class FloatDoubleTest
{
	public static void main(String[] args){
	//定义圆周率变量
	double pi = 3.14;
	
	//定义三个圆的半径
	double radius1 = 1.2;
	double radius2 = 2.5;
	int radius3 = 6;
	
	//计算面积
	double area1 = pi * radius1*radius1;
	double area2 = pi * radius2*radius2;
	double area3 = pi * radius3*radius3;

	//输出
	System.out.println("圆1的半径为："+radius1+",面积为："+area1);
	System.out.println("圆2的半径为："+radius2+",面积为："+area2);
	System.out.println("圆3的半径为："+radius3+",面积为："+area3);
	}
}

class Variable
{
	public static void main(String[] args){
		int i1 = 12;
		float f1 = i1;
		//++i1++;(报错)
		System.out.println(i1+"\n"+f1);
		System.out.println("i1\t");
		}
}

class Test
{
	public static void main(String[] args){
	//System.out.println(1+a+"Hello!");
	System.out.println('a');
	System.out.println('a'+1+"Hello");
	System.out.println('\n');
	System.out.println("i\t");
	}
}