/*
for(1 初始部分;2 循环条件部分;4 迭代部分){
		3 循环体部分
}
执行过程1 - 2 - 3 - 4 - 2 - 3 - 4 - 2 - 3 - 4 ... - 2 
*/
//for (;;)中的两个;; 不能多也不能少
//1，初始化部分可以声明多个变量，但必须是同一个类型，用逗号分隔
//2，循环条件部分为boolean类型表达式，当值为false时，退出循环
//3，可以有多个变量更新，用逗号分隔



//输出五行 hello world
class ForTest01 {
	public static void main(String[] args) {
		for(int i = 1; i <=5 ; i++){
			System.out.println("Hello World!");
		}
	}
}


//写出输出的结果abcbc
class ForTest02{
	public static void main(String[] args){
		int num = 1;
		for(System.out.print("a");num < 3;System.out.print("c"),num++){
			System.out.print("b");
		}
	}
}


//遍历1-100以内的偶数，并获取偶数的个数，获取所有偶数的和
class ForTest03{
	public static void main(String[] args){
		int count = 0;//记录偶数的个数
		int sum = 0;//记录偶数的和

		for(int i1 = 1;i1 <= 100 ; i1++ ){
			count += i1%2 == 0 ? 1 : 0;//如果i1为偶数，count加1，否则加0
			sum += i1%2 == 0 ? i1 : 0;//如果i1为偶数，sum加i1，否则加0
		}
		System.out.println("偶数的个数为："+ count+"，所有偶数的和为："+sum);
	}
}

// * 输出所有的水仙数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身

class ForTest04{
	public static void main(String[] args){
		//定义统计变量，初始化值为0
		int count = 0;

		//获取三位数，用for循环实现
		for(int x = 100;x < 1000 ;x++){
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/100;
			//count = x == ge^3+shi^3+bai^3 ? x : //无法使用
			if(x == (ge*ge*ge + shi*shi*shi + bai*bai*bai)){//注意，ge^3并不是三次方，而是进行了位运算
			//if(x == ge^3 + shi^3 + bai^3){//报错
				System.out.println("水仙花数："+x);
				count++;
			}
		}
		System.out.println("水仙花数共有"+count+"个");
	} 
}


// * 输入两个正整数m和n，求其最大公约数和最小公倍数
class ForTest05{
	public static void main(String[] arg){
		//需求1：最大公约数
		int m = 12, n = 20;
		//取出两个数中的较小值
		int min = (m < n) ? m : n;
		for(int i = min ; i >= 1 ; i--){//for(i = 1; i <= min ; i++),求“最大”公约数
			if(m % i == 0 && n % i == 0){
				System.out.println("最大公约数是："+ i);//公约数
				break;//找到最小公约数就跳出循环结构
			}
		}
		int i1 = 1;
		//int i1 = 2;报错，重复定义
		i1 = 2;
		int max = (m > n) ? m : n; 
		for(int i = max ; i <= m*n ; i++){//
			if( i % m == 0 && i %  n == 0){
				System.out.println("最小公约数是："+ i);
				break;//跳出循环
			}
		}
	}
}


//打印1~100之间所有奇数的和
class ForTest06{
	public static void main(String[] args){
		int sum = 0;//记录奇数的和
		for(int i = 1;i <= 100; i++){
			sum += i%2 == 0 ? 0 : i;
		}
		System.out.println("1~100以内的所有奇数和为："+sum);
	}
}

//打印1~100以内所有是7的倍数的整数的个数及总和（体会设置计数器的思想）
class ForTest07{
	public static void main(String[] args){
		
		int sum = 0;//记录总和
		int count = 0;//记录个数

		for(int i = 1 ; i <= 100 ; i++){
			sum += i%7 == 0 ? i : 0;
			count += i%7 == 0 ? 1 : 0;
		}
		System.out.println("1~100以内所有是7的倍数的整数的个数为："+count);
		System.out.println("1~100以内所有是7的倍数的整数的总和为："+sum);
	}
}


