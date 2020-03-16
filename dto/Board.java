package projectDto;

import java.util.Date;

public class Board {
	private Integer bNo;
	private String bTitle;
	private String bWriter;
	private Date bDate;
	private String bContent;
	private Integer bReadCount;
	private Integer bGroupNo;
	private Integer bStep;
	private Integer bDepth;
	private Integer mNo;
	
	private Member member; //Board입장에선 member가 1:1 관계이며, Board.jsp(view) 에 사용자의 정보를  보여줄 필요가 있을떄 사용
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(Integer bNo, String bTitle, String bWriter, Date bDate, String bContent, Integer bReadCount,
			Integer bGroupNo, Integer bStep, Integer bDepth, Integer mNo, Member member) {
		super();
		this.bNo = bNo;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bDate = bDate;
		this.bContent = bContent;
		this.bReadCount = bReadCount;
		this.bGroupNo = bGroupNo;
		this.bStep = bStep;
		this.bDepth = bDepth;
		this.mNo = mNo;
		this.member = member;
	}

	public Integer getbNo() {
		return bNo;
	}

	public void setbNo(Integer bNo) {
		this.bNo = bNo;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbWriter() {
		return bWriter;
	}

	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}

	public Date getbDate() {
		return bDate;
	}

	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public Integer getbReadCount() {
		return bReadCount;
	}

	public void setbReadCount(Integer bReadCount) {
		this.bReadCount = bReadCount;
	}

	public Integer getbGroupNo() {
		return bGroupNo;
	}

	public void setbGroupNo(Integer bGroupNo) {
		this.bGroupNo = bGroupNo;
	}

	public Integer getbStep() {
		return bStep;
	}

	public void setbStep(Integer bStep) {
		this.bStep = bStep;
	}

	public Integer getbDepth() {
		return bDepth;
	}

	public void setbDepth(Integer bDepth) {
		this.bDepth = bDepth;
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
	
	
}
