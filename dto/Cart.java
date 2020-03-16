package projectDto;

public class Cart {
	private Integer mNo;
	private Integer pNo;
	private Integer cRoomQty;
	private Integer cRoomTypePay;
	private Integer cTotPay;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(Integer mNo, Integer pNo, Integer cRoomQty, Integer cRoomTypePay, Integer cTotPay) {
		super();
		this.mNo = mNo;
		this.pNo = pNo;
		this.cRoomQty = cRoomQty;
		this.cRoomTypePay = cRoomTypePay;
		this.cTotPay = cTotPay;
	}

	public Integer getmNo() {
		return mNo;
	}

	public void setmNo(Integer mNo) {
		this.mNo = mNo;
	}

	public Integer getpNo() {
		return pNo;
	}

	public void setpNo(Integer pNo) {
		this.pNo = pNo;
	}

	public Integer getcRoomQty() {
		return cRoomQty;
	}

	public void setcRoomQty(Integer cRoomQty) {
		this.cRoomQty = cRoomQty;
	}

	public Integer getcRoomTypePay() {
		return cRoomTypePay;
	}

	public void setcRoomTypePay(Integer cRoomTypePay) {
		this.cRoomTypePay = cRoomTypePay;
	}

	public Integer getcTotPay() {
		return cTotPay;
	}

	public void setcTotPay(Integer cTotPay) {
		this.cTotPay = cTotPay;
	}

	@Override
	public String toString() {
		return "Cart [mNo=" + mNo + ", pNo=" + pNo + ", cRoomQty=" + cRoomQty + ", cRoomTypePay=" + cRoomTypePay
				+ ", cTotPay=" + cTotPay + "]";
	}
	
	
	
}
