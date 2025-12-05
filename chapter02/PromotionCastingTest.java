/*
常见提升路径：
byte → short → int → long → float → double
char → int → long → float → double
char是16位无符号数，byte是8位有符号整数，二者不能自动转换
*/

class TypePromotion 
{
	public static void main(String[] args) 
	{
		//=== 测试1：自动类型提升 ===
		int i1 = 'A';
		double d = 10;
		long num = 1234567;//结尾没有L表示为int自动提升为long
		
		byte b1 = 'A';
		//常量优化机制，A为char字面量常量unicode值为65，在byte范围内
		//实际发生为'A' -> int(65) -> byte(65)
		char ch1 = 'A';
		char ch2 = '中';
		byte b2 = (byte)ch1;
		byte b3 = (byte)ch2;//成功转换。直接截取了低8位给byte
		//byte b4 = ch1;   
		/*
		报错 ，
		因为ch1是变量，char的范围为0~65535
		而byte的范围为-128~127
		存在潜在的风险
		可以使用强制类型转换明确告诉编译器你接手风险
		或者使用final char让变量变成常量
		*/
		//byte b5 = 200;  //报错 200超出byte范围
		//byte b6 = '中'; //报错 '中'的Unicode值>127
		System.out.println(b2);
		//byte bigB = 130;//报错130超出byte范围
		long bigNum = 12345678912L;//若去掉L报错，常量值超过int范围

		//=== 测试2：混合运算 ===
		int i2 = 1;
		byte b7 = 1;
		double d1 = 1.0;
		double sum = i2 + b7 + d1;

		//=== 测试3：byte short char算数运算按照int类型处理 ===
		byte b8 = 1;
		byte b9 = 2;
		//byte b3 = b8 + b9;报错
		
		char ch3 = '0';
		char ch4 = 'A';
		int i = ch3 + ch4; //至少要用int类型来接收
	}
}

class Casting
{
	public static void main(String[] args) 
	{
		//=== 测试1：损失精度和溢出 ===
		int i1 = (int)3.14;
		//损失精度，double类型强制转换为int，小数部分直接被舍弃
		
		int i2 = 200;
		byte b1 = (byte)i2;
		//溢出
		/*
		步骤一：200 的二进制表示（32位int）：00000000 00000000 00000000 11001000
		步骤二：只保留最后8位：11001000
		步骤三：
		11001000 作为byte（有符号8位补码）：
		1. 最高位是1，表示负数
		2. 计算绝对值：取反加1
		11001000 → 取反：00110111 → 加1：00111000 = 56
		3. 所以：11001000 表示 -56
		*/
		int i7 = 127;
		//byte b2 = i7;报错，需要强制类型转换
		//final i7 = 127将i7从变量变成常量可以解决
		//但是long->byte必须强制转换，就算使用final long也不行
		/*
		final int CONST_INT = 100;
		byte b = CONST_INT;     // ? 允许，视为常量

		final long CONST_LONG = 100L;
		byte b2 = CONST_LONG;   // ? 错误！long→byte必须强制转换
		// 必须写：byte b2 = (byte)CONST_LONG;
		*/

		//=== 测试2：提升数据类型 ===
		int i3 = 1;
		int i4 = 2;
		double bo2 = i4;
		double bo1 = (double)(i3/i4);
		double bo3 = i3/bo2;
		/*
		步骤一：整数除法，等于0余1
		整数除法规则：
		1，操作数都是整数时，执行整数除法

		2，结果只保留整数部分，小数部分直接丢弃

		3，不是四舍五入，是直接截断（向零取整）
		步骤二：将1转换为0.0
		*/
		int i5 = i3/i4;
		System.out.println(bo1);
		System.out.println(bo3);//只要将式子里的一个操作数转换成浮点数就会得到正确的小数结果
		System.out.println(i5);

		//=== 测试3：long与float类型的声明 ===
		long l1 = 123L;
		long l2 = 123;
		
		//long l3 = 123123123123;
		long l4 = 123123123123L;
		int i6 = (int)123123L;//必须进行显式强制类型转换
		byte b3 = 127;//不用进行显式强制类型转换

		//float f1 = 12.3;//12.3看作是double类型不能自动转换为float
		float f2 = 12.3F;
		float f3 = (float)12.3;
	}
}