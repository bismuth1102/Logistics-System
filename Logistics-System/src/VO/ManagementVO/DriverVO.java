package VO.ManagementVO;

public class DriverVO {
	public String driverNum;
	public String name;
	public String birthDate;
	public String id;
	public String phoneNum;
	public boolean sex;
	public String licensedTime;

	public DriverVO(String driverNum, String name, String birthDate, String id,
			String phoneNum, boolean sex, String licensedTime) {
		// TODO Auto-generated constructor stub
		this.driverNum = driverNum;
		this.name = name;
		this.birthDate = birthDate;
		this.id = id;
		this.phoneNum = phoneNum;
		this.sex = sex;
		this.licensedTime = licensedTime;
	}
}