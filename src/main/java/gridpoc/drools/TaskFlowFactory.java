package gridpoc.drools;

public class TaskFlowFactory {

	public static String GV_PIPELINE="GV_PIPELINE";
	public static String WORKDAY_PIPELINE="WORKDAY_PIPELINE";
	public static String SL_PIPELINE="SL_PIPELINE";
	
	private static String GV_PIPELINE_FLOW="VALIDATE_CLIENT_DATA;VALIDATE_GV_DATA;TRANSFORM";
	private static String WORKDAY_PIPELINE_FLOW="VALIDATE_CLIENT_DATA;WORKDAY_CONTRACT;VALIDATE_GV_DATA;TRANSFORM";
	private static String SL_PIPELINE_FLOW="VALIDATE_CLIENT_DATA;TRANSFORM";
	
	
	public static TaskFlow BuildFactory(String flowType) {
		
		if(flowType.equals(GV_PIPELINE))
				return new TaskFlow(GV_PIPELINE_FLOW);
		if(flowType.equals(WORKDAY_PIPELINE))
			return new TaskFlow(WORKDAY_PIPELINE_FLOW);
		if(flowType.equals(SL_PIPELINE))
			return new TaskFlow(SL_PIPELINE_FLOW);
		
		return new TaskFlow();
	}
}
