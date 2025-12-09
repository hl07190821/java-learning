/*
嵌套循环，是指一个循环结构A的循环体是另一个循环结构B。

技巧：从二维图形的角度看，外层循环控制“行数”，内层循环控制“列数”。
开发经验：实际开发中，我们最多见到的嵌套循环是两层。一般不会出现超过三层的嵌套循环。如果将要出现，一定要停下来重新梳理业务逻辑，重新思考算法的实现，控制在三层以内。否则，可读性会很差。

例如两个for嵌套循环格式：
for(初始化语句1 ; 循环条件语句2 ; 迭代语句7 ) {
    for(初始化语句3 ; 循环条件语句4 ; 迭代语句6 ) {
          循环体语句5 ;
    }
}

//执行过程：1-2-3-4-5-6-4-5-6-...-4-7-2-3-4-5-6-...-4-7-3-4-5-6

*/

/*
打印5行6个*
*/
class  ForForTest01
{
	public static void main(String[] args) 
	{
		for(int i1 = 1 ; i1 <= 5 ;i1 ++){
			for(int i2 = 1 ; i2 <= 6 ; i2++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}


/*
打印5行直角三角形
*/
class  ForForTest02
{
	public static void main(String[] args) 
	{
		for(int i1 = 1 ; i1 <= 5 ; i1++){
			for(int i2 = 1 ; i2 <= i1 ; i2++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

/*
打印5行倒直角三角形
*/
class  ForForTest03
{
	public static void main(String[] args) 
	{
		for(int i1 = 5 ; i1 >= 1 ; i1--){
			for(int i2 = 1 ; i2 <= i1 ; i2++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}


/*
** 打印菱形形状的图案
*/
class  ForForTest04
/*仅作演示，数据不真实
        上半部分        i        m(表示-的个数)    n(表示*的个数)关系式：2*i + m = 10 --> m = 10 - 2*i
    --------*           1       8               1                            n = 2 * i - 1
    ------* * *         2       6               3
    ----* * * * *       3       4               5
    --* * * * * * *     4       2               7
    * * * * * * * * *   5       0               9

        下半部分       i      m                n              关系式： m = 2 * i
    --* * * * * * *    1      2                7                     n = 9 - 2 * i
    ----* * * * *      2      4                5
    ------* * *        3      6                3
    --------*          4      8                1

            */
{
	public static void main(String[] args) 
	{
		//打印上半部分
		for(int i1 = 1 ; i1 <= 5 ; i1++){
			//打印--
			for(int i2 = 1 ; i2 <= 11-i1 ; i2++){
				System.out.print("-");
			}
			//打印**
			for(int i3 = 1 ; i3 <= 2*i1-1 ; i3++){
				System.out.print("*");
			}
			System.out.println("");
		}

		//打印下半部分
		for(int i1 = 1 ; i1 <= 5 ; i1++){
			//打印--
			for(int i2 = 1 ; i2 <= i1+5 ; i2++){
				System.out.print("-");
			}
			//打印**
			for(int i3 = 1 ; i3 <=11 - 2*i1 ; i3++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}


/*
九九乘法表
*/
class ForForTest05{
	public static void main(String[] args){
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i ; j++){
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print("\t");
			}
			System.out.println("");
		}	
	}
}

/*
将一天中的时间打印到控制台
*/
class ForForTest06{
	public static void main(String[] args){

		for(int hour = 0 ; hour < 24 ; hour++){
			for(int min = 0 ; min < 60 ; min++){
				System.out.println(hour + "时" + min + "分");
			}
		}
	}
}