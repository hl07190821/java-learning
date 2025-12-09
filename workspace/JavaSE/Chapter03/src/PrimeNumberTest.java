/* ***
题目：找出100以内所有的素数（质数）？100000以内的呢？

目的：不同的代码的实现方式，可以效率差别很大。

分析：素数（质数）：只能被1和它本身整除的自然数。 ---> 从2开始，到这个数-1为止，此范围内没有这个数的约数。则此数是一个质数。
比如：2、3、5、7、11、13、17、19、23、...

实现方式1：
*/


class PrimeNumberTest01 {
	public static void main(String[] args){
		
		int count = 0;//记录质数的个数

		long start = System.currentTimeMillis();

		for(int i = 2; i <= 10000; i++){
			
			boolean isFlag = true;//用于标识i是否被除尽过

			for(int j = 2; j <= i-1; j++){
				if(i % j == 0){
					isFlag = false;
				}
			}

			//p判断i是否是质数
			if(isFlag){
				System.out.println(i);
				count++;
			}
		
		}

		long end = System.currentTimeMillis();
		System.out.println("质数的个数为："+ count);
		System.out.println("执行此程序花费的毫秒数为："+(end - start));
	}
}

//针对实现方式test 01进行优化
class PrimeNumberTest02{
	public static void main(String[] args){
	
		long start = System.currentTimeMillis();//记录程序开始时间

		int count = 0;//记录质数的个数

		loop1:for(int i = 2; i <= 10000; i++){
			
			boolean isFlag = true;

			for(int j = 2; j <= Math.sqrt(i);j++){//注意：优化点1，使用平方根减少循环次数
			
				if(i %  j == 0){//如果不是质数，isFlag设置为true
					
					isFlag = false;
					continue loop1;//注意：优化点2，结束第一层循环本次循环，优化代码
				}
				
			}
			
			if(isFlag){//isFlag == true 代表是质数
				System.out.println(i);
				count++;
			}
		}
		long end = System.currentTimeMillis();

		System.out.println("质数的个数为："+ count);

		System.out.println("执行此程序花费的毫秒数为："+(end - start));

	
	}
}


//生成1-100之间的随机数，直到生成了97这个数，看看一共用了几次


class RandomTest01{
	public static void main(String[] args){
		
		int count = 0;//记录循环次数

		for(;;){
			int i = (int)(Math.random()*100)+1;
			count++;
			if(i == 97){
				break;//如果i==97结束循环
			}
		}
		System.out.println("一共循环了"+count+"次");
	}
}