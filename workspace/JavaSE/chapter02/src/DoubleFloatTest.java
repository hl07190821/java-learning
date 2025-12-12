class DoubleFloatTest
{
	public static void main(String[] args) 
	{
		//测试1：（解释见章末企业真题：为什么0.1 + 0.2不等于0.3）
		System.out.println(0.1 + 0.2);
		//0.30000000000000004
		//测试2：
		float ff1 = 123123123f;
		//float只能精确表示七位以内的计算

		float ff2 = ff1 + 1;
		System.out.println(ff1);
		//1.2312312E8
		System.out.println(ff2);
		//1.2312312E8
		System.out.println(ff1 == ff2);
		//true
		//float 四个byte字节 32位
//分为符号位（1位）*尾数位（23位，表精度）*指数位（8位，表范围）
	}
}
