package projectDto;

import java.util.List;

public class Jumun_detail {
	
	private Integer jdNo;
	private Integer jdRoomTypeQty;
	private Integer jdRoomTypePrice;
	private Integer pNo;
	private Product product;
	
	
	public Jumun_detail() {
		super();
	}


	public Jumun_detail(Integer jdNo, Integer jdRoomTypeQty, Integer jdRoomTypePrice, Integer pNo, Product product) {
		super();
		this.jdNo = jdNo;
		this.jdRoomTypeQty = jdRoomTypeQty;
		this.jdRoomTypePrice = jdRoomTypePrice;
		this.pNo = pNo;
		this.product = product;
	}


	public Integer getJdNo() {
		return jdNo;
	}


	public void setJdNo(Integer jdNo) {
		this.jdNo = jdNo;
	}


	public Integer getJdRoomTypeQty() {
		return jdRoomTypeQty;
	}


	public void setJdRoomTypeQty(Integer jdRoomTypeQty) {
		this.jdRoomTypeQty = jdRoomTypeQty;
	}


	public Integer getJdRoomTypePrice() {
		return jdRoomTypePrice;
	}


	public void setJdRoomTypePrice(Integer jdRoomTypePrice) {
		this.jdRoomTypePrice = jdRoomTypePrice;
	}


	public Integer getpNo() {
		return pNo;
	}


	public void setpNo(Integer pNo) {
		this.pNo = pNo;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	@Override
	public String toString() {
		return "Jumun_detail [jdNo=" + jdNo + ", jdRoomTypeQty=" + jdRoomTypeQty + ", jdRoomTypePrice="
				+ jdRoomTypePrice + ", pNo=" + pNo + ", product=" + product + "]";
	}
	
	
}
