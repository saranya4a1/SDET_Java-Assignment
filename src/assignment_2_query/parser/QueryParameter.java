package assignment_2_query.parser;

import java.util.List;
import java.util.Map;
/* 
 * This class will contain the elements of the parsed Query String such as conditions,
 * logical operators,aggregate functions, file name, fields group by fields, order by
 * fields, Query Type
 * */
public class QueryParameter {

	public String getFile() {
		return null;
	}
	
	public List<Restriction> getRestrictions() {
		return null;
	}
	
	public List<String> getLogicalOperators() {
		return null;
	}
	
	public List<String> getFields() {
		return null;
	}
	
	public List<AggregateFunction> getAggregateFunctions() {
		return null;
	}
	
	public List<String> getGroupByFields() {
		return null;
	}
	
	public List<String> getOrderByFields() {
		return null;
	}
}
