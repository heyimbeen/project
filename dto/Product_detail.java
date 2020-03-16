package projectDto;

public class Product_detail {
	private Integer pNo;
	private String pdService;
	
	public Product_detail() {
		// TODO Auto-generated constructor stub
	}
	
	public Product_detail(Integer pNo, String pdService) {
		super();
		this.pNo = pNo;
		this.pdService = pdService;
	}

	public Integer getpNo() {
		return pNo;
	}

	public void setpNo(Integer pNo) {
		this.pNo = pNo;
	}

	public String getPdService() {
		return pdService;
	}

	public void setPdService(String pdService) {
		this.pdService = pdService;
	}

	@Override
	public String toString() {
		return "Product_detail [pNo=" + pNo + ", pdService=" + pdService + "]";
	}
	
	
	
	
}
