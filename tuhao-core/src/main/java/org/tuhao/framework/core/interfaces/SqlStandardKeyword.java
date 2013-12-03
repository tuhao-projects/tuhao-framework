package org.tuhao.framework.core.interfaces;

public interface SqlStandardKeyword {

	public interface Operation {
		
		public String SELECT = "SELECT";
		
		public String DELETE = "DELETE";
		
		public String UPDATE = "UPDATE";
		
		public String INSERT = "INSERT";
		
	}
	
	public interface TableCorrelation {
		
		public String JOIN = "JOIN";
		
		public String INNER = "INNER";
		
		public String LEFT = "LEFT";
		
		public String RIGHT = "RIGHT";
		
		public String ON = "ON";
		
	}
	
	public interface Overall {
		
		public String FROM = "FROM";
		
		public String WHERE = "WHERE";
		
		public String ORDER = "ORDER";
		
		public String HAVING = "HAVING";
		
		public String GROUP = "GROUP";
		
		public String BY = "BY";
		
		public String UNION = "UNION";
		
		public String ALL = "ALL";
		
		public String SET = "SET";
		
		public String INTO = "INTO";
		
		public String VALUES = "VALUES";
		
		public String DISTINCT = "DISTINCT";
		
	}
	
	public interface Pagination {
		
		public String LIMIT = "LIMIT";
		
		public String TOP = "TOP";
		
	}
	
	public interface SpecialValues {
		
		public String NULL = "NULL";
		
		public String NOW = "NOW";
		
	}

	
	public interface Sort {
		
		public String ASC = "ASC";
		
		public String DESC = "DESC";
		
	}
	
	public interface AggregateFunction {
		
		public String SUM = "SUM";
		
		public String COUNT = "COUNT";
		
		public String AVG = "AVG";
		
		public String MAX = "MAX";
		
		public String MIN = "MIN";
		
	}

	public interface RelationExpression {
		
		public String AND = "AND";
		
		public String OR = "OR";
		
	}
	
	public interface ComparisonExpression {
		
		public String EQUAL = "=";
		
		public String GREATER_THAN = ">";
		
		public String LESS_THAN = "<";
		
		public String NOT_LESS_THAN = ">=";
		
		public String NOT_GREATER_THAN = "<=";
		
		public String NOT_EQUAL_1 = "<>";
		
		public String NOT_EQUAL_2 = "!=";
		
		public String IS = "IS";
		
		public String NOT = "NOT";
		
		public String IN = "IN";
		
		public String LIKE = "LIKE";
		
		public String BETWEEN = "BETWEEN";
		
	}
	
	public interface SpecialCharacter {
		
		public String PERCENT = "%";
		
		public String ALL = "*";
		
		public String CONNECTOR = ".";
		
		public String SEPARATOR = ",";
		
		public String OPENING_BRACKETS = "(";
		
		public String CLOSING_BRACKETS = ")";
		
		public String SINGLE_QUOTES = "'";
		
		public String DOUBLE_QUOTES = "\"";
		
	}
}
