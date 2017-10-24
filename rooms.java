/**
 * 
 * @author JGore & Hayden N. Walters
 *
 */
import java.util.*;
public class rooms 
{
	int roomNum;
	String desc;
	rooms[] r;
	
	public rooms(int roomNum)
	{
		this.roomNum = roomNum;
	}
	public void setAdj(rooms[] r)
	{
		this.r = r;
	}
	public void setDesc(String desc)
	{
		this.desc = desc;
	}
	public String toString()
	{
		return roomNum + desc;
	}
}
