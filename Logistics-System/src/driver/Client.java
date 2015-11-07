package driver;

import VO.GoodsVO;
import _Stub.GoodsBLService_Stub;
import bl.goodsbl.GoodsArrivalState;
import bl.goodsbl.GoodsExpressType;
import bl.goodsbl.GoodsLogisticState;
import blservice.goodsblservice.GoodsBLService;

public class Client {
	public static void main(String[] args) {
		
		GoodsBLService goodsbl_stub = new GoodsBLService_Stub();
		GoodsBLService_Driver driver = new GoodsBLService_Driver(goodsbl_stub);
		driver.drive(goodsbl_stub);
		
		
	}
}