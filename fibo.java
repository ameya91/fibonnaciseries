
public class fibo {
public static void main (String[] args){

int j=1;
int num;

System.out.println(0);
System.out.println(1);

for(int i=0; i+j<500; )  {
		
num = i+j;	
i=j;
j=num;
	System.out.println(+num);
	
}
}
}
