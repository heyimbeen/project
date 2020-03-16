/**********************************/
/* Table Name: 회원 */
/**********************************/
CREATE TABLE member(
		mNo NUMERIC(10) NOT NULL IDENTITY,
		mId VARCHAR(20) NOT NULL,
		mName VARCHAR(20) NOT NULL,
		mPassword VARCHAR(20) NOT NULL,
		mTel NUMERIC(11) NOT NULL,
		mEmail VARCHAR(20) NOT NULL,
		mBirth NUMERIC(8) NOT NULL
);

/**********************************/
/* Table Name: 주문상세 */
/**********************************/
CREATE TABLE jumun_detail(
		jdNo NUMERIC(10) NOT NULL IDENTITY,
		pNo NUMERIC(10) NOT NULL,
		jdRoomTypeQty NUMERIC(2) NOT NULL,
		jdRoomTypePrice NUMERIC(10) NOT NULL
);

/**********************************/
/* Table Name: 주문 */
/**********************************/
CREATE TABLE jumun(
		jNo NUMERIC(10) NOT NULL IDENTITY,
		mNo NUMERIC(10) NOT NULL,
		jName VARCHAR(20) NOT NULL,
		jCheckIn DATE NOT NULL,
		jCheckOut DATE NOT NULL,
		jRequest VARCHAR(20) NOT NULL,
		jRoomQty NUMERIC(2) NOT NULL,
		jTotPay NUMERIC(10) NOT NULL,
		jdNo NUMERIC(10) NOT NULL
);

/**********************************/
/* Table Name: 제품 */
/**********************************/
CREATE TABLE product(
		pNo NUMERIC(10) NOT NULL IDENTITY,
		pName VARCHAR(20) NOT NULL,
		pPrice NUMERIC(10) NOT NULL,
		pType VARCHAR(20) NOT NULL,
		pAvaliable NUMERIC(2) NOT NULL,
		pImg VARCHAR(50) NOT NULL,
		pCapacity NUMERIC(10),
		pRoomSize DOUBLE,
		pBedType VARCHAR(20),
		pBedQty NUMERIC(1),
		pRoomView VARCHAR(20)
);

/**********************************/
/* Table Name: 카트 */
/**********************************/
CREATE TABLE cart(
		mNo NUMERIC(10) NOT NULL,
		pNo NUMERIC(10) NOT NULL,
		cRoomQty NUMERIC(2) NOT NULL,
		cRoomTypePay NUMERIC(10) NOT NULL,
		cTotPay NUMERIC(10) NOT NULL
);

/**********************************/
/* Table Name: 제품상세 */
/**********************************/
CREATE TABLE product_detail(
		pNo NUMERIC(10) NOT NULL,
		pdService VARCHAR(50) NOT NULL
);

/**********************************/
/* Table Name: 게시판 */
/**********************************/
CREATE TABLE board(
		bNo NUMERIC(10) NOT NULL IDENTITY,
		bTitle VARCHAR(50) NOT NULL,
		bWriter VARCHAR(20) NOT NULL,
		bDate DATE NOT NULL,
		bContent VARCHAR(4000) NOT NULL,
		bReadCount NUMERIC(10),
		bGroupNo NUMERIC(10),
		bStep NUMERIC(10),
		bDepth NUMERIC(10),
		mNo NUMERIC(10) NOT NULL
);

/**********************************/
/* Table Name: 리뷰 */
/**********************************/
CREATE TABLE review(
		rNo NUMERIC(10) NOT NULL IDENTITY,
		rTitle VARCHAR(20) NOT NULL,
		rWriter VARCHAR(20) NOT NULL,
		rContent VARCHAR(4000) NOT NULL,
		rRegDate DATE NOT NULL,
		rReadCount NUMERIC(10) NOT NULL,
		rRate NUMERIC(1) NOT NULL,
		rImg1 VARCHAR(50),
		rImg2 VARCHAR(50),
		rGroup NUMERIC(10),
		rStep NUMERIC(10),
		rDepth NUMERIC(10),
		mNo NUMERIC(10) NOT NULL
);


ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (mNo);

ALTER TABLE jumun_detail ADD CONSTRAINT IDX_jumun_detail_PK PRIMARY KEY (jdNo, pNo);

ALTER TABLE jumun ADD CONSTRAINT IDX_jumun_PK PRIMARY KEY (jNo);
ALTER TABLE jumun ADD CONSTRAINT IDX_jumun_FK0 FOREIGN KEY (mNo) REFERENCES member (mNo);

ALTER TABLE product ADD CONSTRAINT IDX_product_PK PRIMARY KEY (pNo);

ALTER TABLE cart ADD CONSTRAINT IDX_cart_PK PRIMARY KEY (mNo, pNo);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK0 FOREIGN KEY (mNo) REFERENCES member (mNo);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK1 FOREIGN KEY (pNo) REFERENCES product (pNo);

ALTER TABLE product_detail ADD CONSTRAINT IDX_product_detail_PK PRIMARY KEY (pNo, pdService);
ALTER TABLE product_detail ADD CONSTRAINT IDX_product_detail_FK0 FOREIGN KEY (pNo) REFERENCES product (pNo);

ALTER TABLE board ADD CONSTRAINT IDX_board_PK PRIMARY KEY (bNo);
ALTER TABLE board ADD CONSTRAINT IDX_board_FK0 FOREIGN KEY (mNo) REFERENCES member (mNo);

ALTER TABLE review ADD CONSTRAINT IDX_review_PK PRIMARY KEY (rNo);
ALTER TABLE review ADD CONSTRAINT IDX_review_FK0 FOREIGN KEY (mNo) REFERENCES member (mNo);


INSERT INTO A (no, name) VALUES (1, 'a');
INSERT INTO A (no, name) VALUES (2, 'b');
INSERT INTO A (no, name) VALUES (3, 'c');
INSERT INTO A (no, name) VALUES (4, 'd');
INSERT INTO A (no, name) VALUES (5, 'e');

select no, name from A where no=1;

UPDATE A set name='a1' where no = 1;

delete from A where no = 1;

