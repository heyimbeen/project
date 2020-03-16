package projectDto;

import java.io.FileInputStream;
import java.util.Date;

public class Review {
	
	private Integer rNo;
	private String rTitle;
	private String rWriter; //-> 회원 이름이 곧 작성자 아닌감?
	private String rContent;
	private Date rRegDate;
	private Integer rReadCount;
	private Integer rRate;
	private String rImage;
	private Integer rGroup;
	private Integer rStep;
	private Integer rDepth;
	private Integer mNo;
	
	private Member member; //Review입장에선 member가 1:1 관계이며, 리뷰.jsp(view) 에 사용자의 정보를  보여줄 필요가 있을떄 사용
	
	public Review() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Review(Integer rNo, String rTitle, String rWriter, String rContent, Date rRegDate, Integer rReadCount,
			Integer rRate, String rImage, Integer rGroup, Integer rStep, Integer rDepth, Integer mNo, Member member) {
		super();
		this.rNo = rNo;
		this.rTitle = rTitle;
		this.rWriter = rWriter;
		this.rContent = rContent;
		this.rRegDate = rRegDate;
		this.rReadCount = rReadCount;
		this.rRate = rRate;
		this.rImage = rImage;
		this.rGroup = rGroup;
		this.rStep = rStep;
		this.rDepth = rDepth;
		this.mNo = mNo;
		this.member = member;
	}

	public Integer getrNo() {
		return rNo;
	}

	public void setrNo(Integer rNo) {
		this.rNo = rNo;
	}

	public String getrTitle() {
		return rTitle;
	}

	public void setrTitle(String rTitle) {
		this.rTitle = rTitle;
	}

	public String getrWriter() {
		return rWriter;
	}

	public void setrWriter(String rWriter) {
		this.rWriter = rWriter;
	}

	public String getrContent() {
		return rContent;
	}

	public void setrContent(String rContent) {
		this.rContent = rContent;
	}

	public Date getrRegDate() {
		return rRegDate;
	}

	public void setrRegDate(Date rRegDate) {
		this.rRegDate = rRegDate;
	}

	public Integer getrReadCount() {
		return rReadCount;
	}

	public void setrReadCount(Integer rReadCount) {
		this.rReadCount = rReadCount;
	}

	public Integer getrRate() {
		return rRate;
	}

	public void setrRate(Integer rRate) {
		this.rRate = rRate;
	}

	public String getrImage() {
		return rImage;
	}

	public void setrImage(String rImage) {
		this.rImage = rImage;
	}

	public Integer getrGroup() {
		return rGroup;
	}

	public void setrGroup(Integer rGroup) {
		this.rGroup = rGroup;
	}

	public Integer getrStep() {
		return rStep;
	}

	public void setrStep(Integer rStep) {
		this.rStep = rStep;
	}

	public Integer getrDepth() {
		return rDepth;
	}

	public void setrDepth(Integer rDepth) {
		this.rDepth = rDepth;
	}

	public Integer getmNo() {
		return mNo;
	}

	public void setmNo(Integer mNo) {
		this.mNo = mNo;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}


	@Override
	public String toString() {
		return "Review [rNo=" + rNo + ", rTitle=" + rTitle + ", rWriter=" + rWriter + ", rContent=" + rContent
				+ ", rRegDate=" + rRegDate + ", rReadCount=" + rReadCount + ", rRate=" + rRate + ", rImage=" + rImage
				+ ", rGroup=" + rGroup + ", rStep=" + rStep + ", rDepth=" + rDepth + ", mNo=" + mNo + ", member="
				+ member + "]";
	}
	
	
}
