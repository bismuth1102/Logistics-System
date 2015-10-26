package blservice.formblservice;

import VO.BusinessFormVO;

public interface BusinessFormBLService {
	/**
	 * return a businessForm by giving the start time and the end time you want to check
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public BusinessFormVO show(String startTime,String endTime);
	/**
	 * save the businessForm to local
	 * @param vo
	 * @return
	 */
	public Boolean save(BusinessFormVO vo);
}