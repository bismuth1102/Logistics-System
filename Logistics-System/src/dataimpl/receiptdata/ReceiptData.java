package dataimpl.receiptdata;

import java.util.ArrayList;

import PO.ReceiptPO;
import dataservice.receiptdataservice.ReceiptDataService;
import util.enumData.*;

public class ReceiptData implements ReceiptDataService{
	
	ArrayList<ReceiptPO> repArray = new ArrayList<ReceiptPO>();
	
	@Override
	public ArrayList<ReceiptPO> getRep() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveRep(ReceiptPO po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Rep rep, int n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Rep rep, String num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ReceiptPO> show(Rep rep) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReceiptPO find(Rep rep, String num) {
		// TODO Auto-generated method stub
		return null;
	}

}