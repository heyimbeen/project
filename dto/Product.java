package projectDto;

import java.util.List;

public class Product {
	private Integer pNo;
	private String pName;
	private Integer pPrice;
	private String pType;
	private Integer pAvailable;
	private String pImg;
	private Integer pCapacity;
	private Integer pRoomSize;
	private String pBedType;
	private Integer pBedQty;
	private String pRoomView;
	
	private List<Product_detail> product_details; //상품과 상품상세정보는 1:n관계
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Integer pNo, String pName, Integer pPrice, String pType, Integer pAvailable, String pImg,
			Integer pCapacity, Integer pRoomSize, String pBedType, Integer pBedQty, String pRoomView,
			List<Product_detail> product_details) {
		super();
		this.pNo = pNo;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pType = pType;
		this.pAvailable = pAvailable;
		this.pImg = pImg;
		this.pCapacity = pCapacity;
		this.pRoomSize = pRoomSize;
		this.pBedType = pBedType;
		this.pBedQty = pBedQty;
		this.pRoomView = pRoomView;
		this.product_details = product_details;
	}

	public Integer getpNo() {
		return pNo;
	}

	public void setpNo(Integer pNo) {
		this.pNo = pNo;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Integer getpPrice() {
		return pPrice;
	}

	public void setpPrice(Integer pPrice) {
		this.pPrice = pPrice;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public Integer getpAvailable() {
		return pAvailable;
	}

	public void setpAvailable(Integer pAvailable) {
		this.pAvailable = pAvailable;
	}

	public String getpImg() {
		return pImg;
	}

	public void setpImg(String pImg) {
		this.pImg = pImg;
	}

	public Integer getpCapacity() {
		return pCapacity;
	}

	public void setpCapacity(Integer pCapacity) {
		this.pCapacity = pCapacity;
	}

	public Integer getpRoomSize() {
		return pRoomSize;
	}

	public void setpRoomSize(Integer pRoomSize) {
		this.pRoomSize = pRoomSize;
	}

	public String getpBedType() {
		return pBedType;
	}

	public void setpBedType(String pBedType) {
		this.pBedType = pBedType;
	}

	public Integer getpBedQty() {
		return pBedQty;
	}

	public void setpBedQty(Integer pBedQty) {
		this.pBedQty = pBedQty;
	}

	public String getpRoomView() {
		return pRoomView;
	}

	public void setpRoomView(String pRoomView) {
		this.pRoomView = pRoomView;
	}

	public List<Product_detail> getProduct_details() {
		return product_details;
	}

	public void setProduct_details(List<Product_detail> product_details) {
		this.product_details = product_details;
	}

	
	
	
	
}
