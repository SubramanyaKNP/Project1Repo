import java.util.*;
public class Factorial {
	
	int retVal=1;
	public int fact(int num){
		if(num==0||num==1)
			retVal=1;
		else
			retVal=fact(num)*fact(num-1);
		return retVal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Scanner inp=new Scanner(System.in);
		int num=inp.nextInt();
		int res=1;
		if(num==0||num==1)
			System.out.println(res);
		else{
			while(num!=0){
				res=res*num;
				num--;
			}
			System.out.println(res);
		}
*/	/*
		Factorial obj=new Factorial();
		Scanner inp=new Scanner(System.in);
		int num=inp.nextInt();
		System.out.println(obj.fact(num));
		
	*/	
		
	String t="dhd hdf fdkf";	
	//char t2=(char)t;
	char c='s';
	//String t2=(String)c;
	Character i=new Character('c');
	String t2=new String();
	String t3=new String();
	//t3=(t2)i;	
	}
}
