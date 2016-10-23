
public class Processor {
	
	private Query query;
	private Receiver receiver;
	private double activeTime;
	private boolean isBusy;
	private boolean hasInfo;
	private Store store;
	private OtherSystem oSys;
	
	public Processor(Receiver receiver, Store store, OtherSystem oSys){
		this.receiver = receiver;
		this.store = store;
		this.oSys = oSys;
		isBusy = false;
		hasInfo = false;
	}
	
	public void pullQuery(){
		if (!isBusy){
			query = receiver.getQuery();
			isBusy = true;
			hasInfo = false;
			returnQuery(runQuery());
		}
	}
	
	private void returnQuery(String[] s) {
		
		
	}

	private String[] runQuery(){
		String s[] = null;
		if (query.getWhen() == QueryWhen.Past){
			s = store.getResult(query.getType());
			hasInfo = true;
		}
		
		else if (query.getWhen() == QueryWhen.Present){
			s = oSys.getResult(query.getType());
			hasInfo = true;
		}
		if (!hasInfo){
			s = new String[]{"Nothing Found"};
		}
		return s;
	}
	
}
