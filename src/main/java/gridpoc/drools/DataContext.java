package gridpoc.drools;

public class DataContext {

	
	 public static final int GV = 0;
     public static final int WORKDAY = 1;
     public static final int STREAMLINE = 2;
     
	private String clientId;
	private String entityId;
	private String partnerId;
	private int clientType;
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public int getClientType() {
		return clientType;
	}
	public void setClientType(int clientType) {
		this.clientType = clientType;
	}
	
	
}
