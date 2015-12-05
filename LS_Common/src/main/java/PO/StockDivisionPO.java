/**
 * 
 */
package PO;

import java.io.Serializable;

/**
 * @author G
 *
 */
public class StockDivisionPO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String listNum;
	private String cityNum;
	private String destination;
	private int block;
	private int place;
	
	
	/**
	 * @param listnum	订单号
	 * @param cn    id of this warehouse
	 * @param des   destination of this place
	 * @param b	    block to which this place belongs
	 * @param p	    number of this place
	 * @param avai  state of this place
	 */
	public StockDivisionPO(String listnum, String cn, String des, int b, int p){
		this.listNum = listnum;
		cityNum=cn;
		destination=des;
		block=b;
		place=p;
		
	}
	
	

	public String getListNum() {
		return listNum;
	}



	public void setListNum(String listNum) {
		this.listNum = listNum;
	}



	public String getCityNum() {
		return cityNum;
	}

	public String getDestination() {
		return destination;
	}

	public int getBlock() {
		return block;
	}

	public int getPlace() {
		return place;
	}

	

	public void setCityNum(String cityNum) {
		this.cityNum = cityNum;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setBlock(int block) {
		this.block = block;
	}

	public void setPlace(int place) {
		this.place = place;
	}


	
	
	
	
}
