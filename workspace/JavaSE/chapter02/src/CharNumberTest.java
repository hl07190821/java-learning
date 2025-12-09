class CharNumberTest 
{
	public static void main(String[] args) 
	{
		System.out.println("=== 测试1：字符+数字 ===");
		System.out.print("'A' + 10 =");//'A' + 10 =
		System.out.println('A' + 10 );//75
		//System.out.println(A + 10 ); 编译报错

		System.out.print("'0' + 5 =");
		System.out.println('0' + 5 );//53

		System.out.print("'a' + 'b' =");
		System.out.println('a' + 'b' );//195

		//=== 测试2：字符串（有双引号） ===
		System.out.println("\n=== 测试2：字符串 + 数字 ===");
		System.out.print("\"A\" + 10 = ");//"A" + 10 =
		System.out.println("A" + 10 );//A10
		
		System.out.print("\"100\" + 20 = ");//"100" + 20 =
		System.out.println("100" + 20);//10020

		//=== 测试3：没有引号（错误情况） ===
		//System.out.println(A + 10);

		//定义变量
		char A = 'A';
		//System.out.println(A + 10 ); //75
		String ABC = "Hello";

		System.out.print("变量A + 10 = ");
		System.out.println(A + 10);

		System.out.print("变量ABC + 10 = ");
		System.out.println(ABC + 10);//Hello10

		//=== 测试3：转义字符 ===
		char T = '\"' ;
		char S = '\u0022';
		char Q = '"';//T S Q三者完全等价
		System.out.print("\" + 10 = ");
		//System.out.print("" + 10 = ");//报错
		
		//System.out.print(\" + 10 = ");//报错
		System.out.println(T + 10);// 44
		//System.out.print("\u0022 + 10 = ");//报错
		System.out.println("\\u0022 + 10 = ");
		//\u0022 + 10 =注意这里的\\变成转义字符了，同时java编译器的词法分析具有“不回溯”的原则
		
		//===测试4：转义字符的优先级和确定性 ===
		System.out.println("  \\\\ ");
		//System.out.println(" \ ");//报错，非法转义符
        //System.out.println("  \\\");报错
		System.out.println("  \\' ");
		//System.out.println(' '\''' );//报错
		System.out.println( '\'' );
        System.out.println("  \\n ");
		//System.out.println( \\n );//报错
        System.out.println("  \\t ");
		System.out.println(\u0022 + 10 = ");// + 10 = 
		System.out.println(\u0022 + 10 = \u0022);// + 10 =
		//Java编译器处理顺序
		//1.第一阶段： Unicode转义处理
		//2.第二阶段： 词法分析（识别字符串边界即开始，字符字面量）
		//3.第三阶段： 转义序列处理（\n,\t,\",\\等）
		//4.第四阶段： 遇到非转义的"时，字符串结束

		System.out.print("S + 10 = ");//S + 10 = 
		System.out.print("'S' + 10 = ");//'S' + 10 = 
		//System.out.print(S + 10 = ");//报错
		System.out.println(S + 10);
		System.out.print("Q + 10 = ");
		System.out.println(Q + 10);
	}
}

class CharPlusNumberTest{
//println字符和正数的加号运用
	public static void main (String[] arg){
		char A = 'a';
		int B = 'a';//等价于int B = 97;
		System.out.println(A + 1);//98
		System.out.println("" + A + 1);//a1
		System.out.println((char)(A + 1));//b
	} 
}