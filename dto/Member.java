package projectDto;

import java.util.List;

public class Member {
	private Integer mNo;
	private String mId;
	private String mName;
	private String mPassword;
	private Integer mTel;
	private String mEmail;
	private Integer mBirth;
	
	private List<Jumun> jumuns; //회원과 주문은 1:n
	private Cart cart; //회원과 카트는 1:1 관계
	private List<Board> boards; //회원과 게시글의 관계는 1:n
	private List<Review> Reviews; //회원과 리뷰의 관계는 1:n
	

	public Member() {
		super();
	}


	public Member(Integer mNo, String mId, String mName, String mPassword, Integer mTel, String mEmail, Integer mBirth,
			List<Jumun> jumuns, Cart cart, List<Board> boards, List<Review> reviews) {
		super();
		this.mNo = mNo;
		this.mId = mId;
		this.mName = mName;
		this.mPassword = mPassword;
		this.mTel = mTel;
		this.mEmail = mEmail;
		this.mBirth = mBirth;
		this.jumuns = jumuns;
		this.cart = cart;
		this.boards = boards;
		Reviews = reviews;
	}


	public Integer getmNo() {
		return mNo;
	}


	public void setmNo(Integer mNo) {
		this.mNo = mNo;
	}


	public String getmId() {
		return mId;
	}


	public void setmId(String mId) {
		this.mId = mId;
	}


	public String getmName() {
		return mName;
	}


	public void setmName(String mName) {
		this.mName = mName;
	}


	public String getmPassword() {
		return mPassword;
	}


	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}


	public Integer getmTel() {
		return mTel;
	}


	public void setmTel(Integer mTel) {
		this.mTel = mTel;
	}


	public String getmEmail() {
		return mEmail;
	}


	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}


	public Integer getmBirth() {
		return mBirth;
	}


	public void setmBirth(Integer mBirth) {
		this.mBirth = mBirth;
	}


	public List<Jumun> getJumuns() {
		return jumuns;
	}


	public void setJumuns(List<Jumun> jumuns) {
		this.jumuns = jumuns;
	}


	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}


	public List<Board> getBoards() {
		return boards;
	}


	public void setBoards(List<Board> boards) {
		this.boards = boards;
	}


	public List<Review> getReviews() {
		return Reviews;
	}


	public void setReviews(List<Review> reviews) {
		Reviews = reviews;
	}
	
	
}
