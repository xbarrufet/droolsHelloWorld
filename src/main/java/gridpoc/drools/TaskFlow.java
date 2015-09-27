package gridpoc.drools;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TaskFlow {

	private List<String> flow;
	
	public TaskFlow() {
		this.flow=new ArrayList<String>();
	}
	
	public TaskFlow(String flow) {
		this.flow=new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(flow,";");
		while (st.hasMoreTokens()) {
	        this.flow.add(st.nextToken());
	     }
	}
}
