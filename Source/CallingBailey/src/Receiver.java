import java.util.Queue;


public class Receiver {
	
	private Queue<Query> queryQueue;
	
	public Receiver(){
		
	}
	
	public void addQuery(Query q){ 
		queryQueue.add(q);
	}
	
	public Query getQuery(){
		if (!queryQueue.isEmpty())
			return queryQueue.remove();
		return null;
	}
}
