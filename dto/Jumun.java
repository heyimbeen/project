package projectDto;

import java.sql.Date;
import java.util.List;

public class Jumun {
	private Integer jNo;
	private Integer mNo ;
	private String jName;
	private Date jCheckin;
	private Date jCheckOut;
	private String jRequest;
	private Integer jRoomQty;
	private Integer jTotPay;
	private Integer jdNo;
	
	private List<Jumun_detail> jumun_details; //주문과 주문상세는 1:n관계 
	
	public Jumun() {
		// TODO Auto-generated constructor stub
	}

	public Jumun(Integer jNo, Integer mNo, String jName, Date jCheckin, Date jCheckOut, String jRequest,
			Integer jRoomQty, Integer jTotPay, Integer jdNo, List<Jumun_detail> jumun_details) {
		super();
		this.jNo = jNo;
		this.mNo = mNo;
		this.jName = jName;
		this.jCheckin = jCheckin;
		this.jCheckOut = jCheckOut;
		this.jRequest = jRequest;
		this.jRoomQty = jRoomQty;
		this.jTotPay = jTotPay;
		this.jdNo = jdNo;
		this.jumun_details = jumun_details;
	}

	
	public Integer getjNo() {
		return jNo;
	}

	public void setjNo(Integer jNo) {
		this.jNo = jNo;
	}

	public Integer getmNo() {
		return mNo;
	}

	public void setmNo(Integer mNo) {
		this.mNo = mNo;
	}

	public String getjName() {
		return jName;
	}

	public void setjName(String jName) {
		this.jName = jName;
	}

	public Date getjCheckin() {
		return jCheckin;
	}

	public void setjCheckin(Date jCheckin) {
		this.jCheckin = jCheckin;
	}

	public Date getjCheckOut() {
		return jCheckOut;
	}

	public void setjCheckOut(Date jCheckOut) {
		this.jCheckOut = jCheckOut;
	}

	public String getjRequest() {
		return jRequest;
	}

	public void setjRequest(String jRequest) {
		this.jRequest = jRequest;
	}

	public Integer getjRoomQty() {
		return jRoomQty;
	}

	public void setjRoomQty(Integer jRoomQty) {
		this.jRoomQty = jRoomQty;
	}

	public Integer getjTotPay() {
		return jTotPay;
	}

	public void setjTotPay(Integer jTotPay) {
		this.jTotPay = jTotPay;
	}

	public Integer getJdNo() {
		return jdNo;
	}

	public void setJdNo(Integer jdNo) {
		this.jdNo = jdNo;
	}

	public List<Jumun_detail> getJumun_details() {
		return jumun_details;
	}

	public void setJumun_details(List<Jumun_detail> jumun_details) {
		this.jumun_details = jumun_details;
	}
	
	
}
