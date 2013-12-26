package org.tuhao.framework.core.interfaces;

public interface StandardConstants {

	public enum Operation {
		
		SELECT, DELETE, UPDATE, INSERT
		
	}
	
	public enum TableCorrelation {
		
		JOIN, INNER, LEFT, RIGHT, ON, UNION, ALL
		
	}
	
	public enum AssistStatement {
		
		FROM, WHERE, ORDER, HAVING, GROUP, BY, SET, INTO, VALUES, DISTINCT
		
	}
	
	public enum Pagination {
		
		LIMIT, TOP
		
	}
	
	public enum SpecialValues {
		
		NULL, NOW
		
	}

	
	public enum Sort {
		
		ASC, DESC
		
	}
	
	public enum AggregateFunction {
		
		SUM, COUNT, AVG, MAX, MIN
		
	}

	public enum RelationExpression {
		
		AND, OR
		
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
