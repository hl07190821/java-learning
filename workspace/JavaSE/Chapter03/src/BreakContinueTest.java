/*
            适用范围            在循环结构中使用的作用                        相同点

break       switch-case
            循环结构            一旦执行，就结束(或跳出)当前循环结构            此关键字的后面，不能声明语句

continue    循环结构            一旦执行，就结束(或跳出)当次循环结构            此关键字的后面，不能声明语句
*/


class BreakContinueTest01{
	public static void main(String[] args) {


		for(int i = 1; i <= 10 ; i++ ){
			
			if(i % 4 == 0){
				//break;//123到4跳出整个循环
				continue;//1235678910//直接结束i==4的循环
				//如下的语句不可能被执行，编译不通过
				//System.out.println("今晚吃汉堡");
			}

			System.out.println(i);
		}
		//嵌套循环中的使用
		for(int i = 1 ; i <= 4 ; i++){
			
			for(int j = 1; j <=10 ; j++){
				if(j % 4 == 0){
					break;//结束的是包裹break关键字的最近的一层循环
					//continue;//结束的是包裹break关键字的最近的一层循环的当此
				}
				System.out.println(j);
			}

		System.out.println(i);
		}
	}
}

//带标签的使用
/*
break语句用于终止某个语句块的执行
{    ……     
    break;
     ……
}

break语句出现在多层嵌套的语句块中时，可以通过标签指明要终止的是哪一层语句块 
    label1: {   ……        
    label2:         {   ……
    label3:             {   ……
                           break label2;
                           ……
                     }
                 }
            } 

continue语句出现在多层嵌套的循环语句体中时，也可以通过标签指明要跳过的是哪一层循环。
  
标号语句必须紧接在循环的头部。标号语句不能用在非循环语句的前面。
*/

class BreakContinueTest02{
	public static void main(String[] arg){
		l:for(int i = 1; i <= 4; i++){
		
			for(int j = 1; j <= 10 ;j++){
				if( j%4 == 0){
					break l;
					//continue l;
				}
				System.out.println(j);
			}
			System.out.println(i);
		}
	}
}