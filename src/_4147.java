//汉诺塔问题
public class _4147 {
	
	private static void moveOne(int numDisk,String init,String desti)
	{
		System.out.println(numDisk+":"+init+"->"+desti);
	}
	
	private static void move(int numDisk,String init,String temp,String desti)
	{
		if(numDisk == 1)
			moveOne(1, init, desti);
		else
		{
			move(numDisk-1, init, desti, temp);
			moveOne(numDisk, init, desti);
			move(numDisk-1, temp, init, desti);
		}
	}
	
    public static void main(String[] args) {
		move(3,"a","b","c");
	}
	

}
