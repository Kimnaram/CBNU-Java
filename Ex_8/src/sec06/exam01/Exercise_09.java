package sec06.exam01;
class UnsupportedFuctionException extends RuntimeException {
	private final int ERR_CODE;
	
	UnsupportedFuctionException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	
	UnsupportedFuctionException(String msg) {
		this(msg, 100);
	}
	
	public int getERRCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return "["+getERRCode()+"]" + super.getMessage();
	}
}

class Exercise_09 {
	public static void main(String[] args) throws Exception {
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
	}
}