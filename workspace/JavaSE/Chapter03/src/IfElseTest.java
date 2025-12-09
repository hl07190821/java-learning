class IfElseTest1
{
	public static void main(String[] args) 
	{
		int heartBeats = 89;
		if (heartBeats < 60 || heartBeats > 100)
		{
			System.out.println("需要进一步检查");
		}
		System.out.println("体检结束");
	}
}



class IfElseTest2
{
	public static void main(String[] arg)
	{
		int num = 1;
		if (num % 2 == 0)
		{
			System.out.println(num + "是偶数");
		}
		else
		{
			System.out.println(num + "是奇数");
		}
	}
}

class IfElseTest3
{
	public static void main(String[] arg)
	{
		int score = 94;
		if(score == 100){
			System.out.println("奖励一辆跑车");
		}else if(score > 80 && score <= 99){
			System.out.println("奖励一辆山地自行车");
		}else if(score >= 60 && score <= 80){//缺少一个右括号	
			System.out.println("奖励环球影城一日游");
		}else{
			System.out.println("胖揍一顿");
		}

		//写法二，默认成绩为[0,100]
		if (score == 100){
			System.out.println("奖励一辆跑车");
		}else if(score >80){
			System.out.println("奖励一辆山地自行车");
		}else if(score >= 60){
			System.out.println("奖励环球影城一日游");
		}else{
			System.out.println("胖揍一顿");
		}
	}
}

//if-else 嵌套
class IfElseTest4//对num1，num2，num3进行排序，并从小到大输出
{
	public static void main(String[] arg)
	{
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		if (num1 >= num2){
			if(num3 >= num1){
				System.out.println("从小到大依次是num2 num1 num3");
			}
			else if(num3 >= num2){//else if 而不是elseif
				System.out.println("从小到底依次是num2 num3 num1");
			}
			else{
				System.out.println("从小到大依次是num3 num2 num1");
			}
		}else{
			if(num3 >= num2){
				System.out.println("从小到大依次是num1 num2 num3");
			}else if(num3 >= num1){
				System.out.println("从小到大依次是num1 num3 num2");
			}else{
				System.out.println("从小到大依次是num3 num1 num2");
			}
		}
	}
}


class IfElseTest5
//语句块只有“一条”执行语的时候，{}可以省略
//当if-else结构是多选一时，最后的else是可选的，根据需要可以省略
{
	public static void main(String[] arg)
	{
		int x = 4;
		int y = 1;
		if(x > 2){
			if(y > 2)
			System.out.println(x + y);//第二个if只执行这条
			System.out.println("啊啊啊啊啊啊");//第一个if执行
		}else
			System.out.println("x is "+ x);//只有这条算是else执行语句
			System.out.println("呀呀呀呀呀呀");
	}//输出为啊啊啊啊啊 呀呀呀呀呀呀
}

class IfElseTest6
//定义两个整数，分别为small和big，如果第一个整数small大于第二个整数big就交换，输出显示small和big变量的值
{
	public static void main(String[] arg)
	{
		int small = 99;
		int big = 9;
		if(small > big){
			int temp = small;
			small = big;
			big = temp;
		}
		System.out.println("small的值为："+ small + " big的值为：" + big);
	}
}


class IfElseTest7
//声明2个int型变量并赋值，判断两数之和，如果大于等于50，打印hello world
{
	public static void main(String[] arg)
	{
		int i1 = 15;
		int i2 = 25;
		if(i1 + i2 >= 50){
			System.out.println("hello world");
		}
	}
}

class IfElse8
//声明2个double型变量，判断第一个数大于10.0，且第二个数小于20.0，打印两数之和，否则，打印两数的乘积
{
	public static void main(String[] arg)
	{
		double d1 = 21.2,d2 = 12.3;
		if(d1 > 10.0 && d2 <20.0){
			System.out.println("两数之和为：" +(d1 + d2));
		}else{
			System.out.println("两数之积为：" +(d1*d2));
		}
	}
}

class IfElseTest8
/*
如果大于95℃，则打印“开水”；

如果大于70℃且小于等于95℃，则打印“热水”；

如果大于40℃且小于等于70℃，则打印“温水”；

如果小于等于40℃，则打印“凉水”。
*/
{
	public static void main(String[] arg)
	{
		int waterTemperature = 85;
		if(waterTemperature > 95){
			System.out.println("开水");
		}else if(waterTemperature > 70){
			System.out.println("热水");
		}else if(waterTemperature > 40){
			System.out.println("温水");
		}else{
			System.out.println("凉水");
		}
	}
}