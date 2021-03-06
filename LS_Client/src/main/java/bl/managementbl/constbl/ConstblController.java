package bl.managementbl.constbl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import util.enumData.City;
import util.enumData.ResultMessage;
import Exception.ConstNotFoundException;
import VO.ManagementVO.ConstVO;
import blservice.managementblservice.constblservice.ConstBLService;

public class ConstblController implements ConstBLService {
	Constbl constbl=new Constbl();

	@Override
	public ResultMessage insert(ConstVO VO) throws RemoteException {
		// TODO Auto-generated method stub
		return constbl.add(VO);
	}

	@Override
	public ResultMessage update(ConstVO VO) throws RemoteException {
		// TODO Auto-generated method stub
		return constbl.update(VO);
	}

	@Override
	public ResultMessage delete(ConstVO VO) throws RemoteException {
		// TODO Auto-generated method stub
		return constbl.delete(VO);
	}

	@Override
	public ArrayList<ConstVO> show() throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		return constbl.show();
	}

	@Override
	public ConstVO findByCities(City city1,City city2) throws FileNotFoundException, ClassNotFoundException, ConstNotFoundException, IOException {
		// TODO Auto-generated method stub
		City c1,c2;
		c1 =City.getCity1(city1, city2);
		c2 = City.getCity2(city1, city2);
		return constbl.findByCities(c1,c2);
	}}
