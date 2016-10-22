
public class Processor {
	
	private Query query;
	private Receiver receiver;
	private double activeTime;
	private boolean isBusy;
	private boolean hasInfo;
	private Store store;
	
	public Processor(Receiver receiver, Store store){
		this.receiver = receiver;
		this.store = store;
		isBusy = false;
		hasInfo = false;
	}
	
	public void pullQuery(){
		if (!isBusy){
			query = receiver.getQuery();
			isBusy = true;
			hasInfo = false;
			runQuery();
		}
	}
	
	private void runQuery(){
		
		if (query.getWhen() == QueryWhen.Past){
			String s[] = store.getInternal(query.getType());
			
		}
		
		else if (query.getWhen() == QueryWhen.Present || query.getWhen() == QueryWhen.Future){
			
		}
	}
	
}
