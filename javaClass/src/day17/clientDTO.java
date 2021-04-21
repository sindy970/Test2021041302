package day17;

public class clientDTO {
	//회원 정보 관리를 위한 클래스
	private String clientName, clientPhone;
	private int clientNumber;

	public clientDTO() {
		// TODO Auto-generated constructor stub
	}

	public clientDTO(String clientName, String clientPhone, int clientNumber) {
		super();
		this.clientName = clientName;
		this.clientPhone = clientPhone;
		this.clientNumber = clientNumber;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientPhone() {
		return clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	@Override
	public String toString() {
		return "clientDTO [clientName=" + clientName + ", clientPhone=" + clientPhone + ", clientNumber=" + clientNumber
				+ "]";
	}
	
	
}
