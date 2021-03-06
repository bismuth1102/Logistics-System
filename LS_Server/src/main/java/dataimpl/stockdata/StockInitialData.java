/**
 * 
 */
package dataimpl.stockdata;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import util.enumData.City;
import util.enumData.ResultMessage;
import PO.StockNumPO;
import dataservice.stockdataservice.StockInitialDataService;
import datautil.DataUtility;

/**
 * @author G
 *
 */
public class StockInitialData extends UnicastRemoteObject implements StockInitialDataService{

	
	String filename = "StockIniNum.txt";
	DataUtility du = new DataUtility();
	/**
	 * @throws RemoteException
	 */
	public StockInitialData() throws RemoteException {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 初始化库存数量
	 */
	@Override
	public ResultMessage initial(StockNumPO po) throws RemoteException {

		try {
			try {
				ArrayList<Object> list = du.getAll(filename);
				
				if (list != null){
					for(int i = 0;i < list.size();++i) {
						StockNumPO stocknumpo = (StockNumPO) list.get(i);
						if(stocknumpo.getCityNum().equals(po.getCityNum())){
							list.remove(i);
						}
					}
				} else{
					list = new ArrayList<Object>();
				}
				list.add(po);
				du.SaveAll(list, filename);
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
		return ResultMessage.SUCCESS;
	}

	/**
	 * 得到库存初始化的值
	 */
	@Override
	public StockNumPO getInitialNum(City citynum) throws RemoteException {
		
		ArrayList<Object> list;
		try {
			list = du.getAll(filename);
			
			for(int i = 0;i < list.size();++i) {
				StockNumPO po = (StockNumPO)list.get(i);
				if(po.getCityNum().equals(citynum)){
					return po;
				}
			}
			
			du.SaveAll(list, filename);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return null;
	}

	
}
