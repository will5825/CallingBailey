
public class Query {
	
	final String queryId;
	final String callerId;
	final QueryType type;
	final QueryWhen when;
	
	public Query(String queryId, String callerId, QueryType type, QueryWhen when) {
		this.queryId = queryId;
		this.callerId = callerId;
		this.type = type;
		this.when = when;
	}

	public String getQueryId() {
		return queryId;
	}

	public String getCallerId() {
		return callerId;
	}

	public QueryType getType() {
		return type;
	}

	public QueryWhen getWhen() {
		return when;
	}
	
	
}
