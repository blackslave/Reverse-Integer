/**
 * 與迴文相同
 * 即：將122反轉
 * 先前反轉值0乘10加上122先取10餘數2為2		122先除10，得出12，餘數為2
 * 先前反轉值2乘10加上12先取10餘數2為22		12除10，得出1，餘數為2	
 * 先前反轉值22乘10加上1先取10餘數1為221	1除10，得出0，結束迴圈
 * 反轉後可能超過int存放上限，故以long來儲存
 * @author black
 *
 */
public class Solution 
{
	public int reverse(int x)
	{	
		int tem=x,result=0;
		long x2=0;
	    	while (true)
	    	{
	    		int tem2=tem%10;
	    		x2=(x2*10)+tem2;
	    		if(x2>2147483647 || x2<-2147483648)
	    		{
	    			return 0;
	    		}
	    		else
	    		{
	    			result=(result*10)+tem2;
	    		}
	    		tem/=10;
	    		if(tem==0)
	    			break;
	    	}
		return result;
	}
}
