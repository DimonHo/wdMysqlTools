package com.wd.cs.po;

import java.util.ArrayList;
import java.util.List;

public class DocKeywordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocKeywordsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDguidIsNull() {
            addCriterion("dguid is null");
            return (Criteria) this;
        }

        public Criteria andDguidIsNotNull() {
            addCriterion("dguid is not null");
            return (Criteria) this;
        }

        public Criteria andDguidEqualTo(String value) {
            addCriterion("dguid =", value, "dguid");
            return (Criteria) this;
        }

        public Criteria andDguidNotEqualTo(String value) {
            addCriterion("dguid <>", value, "dguid");
            return (Criteria) this;
        }

        public Criteria andDguidGreaterThan(String value) {
            addCriterion("dguid >", value, "dguid");
            return (Criteria) this;
        }

        public Criteria andDguidGreaterThanOrEqualTo(String value) {
            addCriterion("dguid >=", value, "dguid");
            return (Criteria) this;
        }

        public Criteria andDguidLessThan(String value) {
            addCriterion("dguid <", value, "dguid");
            return (Criteria) this;
        }

        public Criteria andDguidLessThanOrEqualTo(String value) {
            addCriterion("dguid <=", value, "dguid");
            return (Criteria) this;
        }

        public Criteria andDguidLike(String value) {
            addCriterion("dguid like", value, "dguid");
            return (Criteria) this;
        }

        public Criteria andDguidNotLike(String value) {
            addCriterion("dguid not like", value, "dguid");
            return (Criteria) this;
        }

        public Criteria andDguidIn(List<String> values) {
            addCriterion("dguid in", values, "dguid");
            return (Criteria) this;
        }

        public Criteria andDguidNotIn(List<String> values) {
            addCriterion("dguid not in", values, "dguid");
            return (Criteria) this;
        }

        public Criteria andDguidBetween(String value1, String value2) {
            addCriterion("dguid between", value1, value2, "dguid");
            return (Criteria) this;
        }

        public Criteria andDguidNotBetween(String value1, String value2) {
            addCriterion("dguid not between", value1, value2, "dguid");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andRootKeywordIsNull() {
            addCriterion("root_keyword is null");
            return (Criteria) this;
        }

        public Criteria andRootKeywordIsNotNull() {
            addCriterion("root_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andRootKeywordEqualTo(String value) {
            addCriterion("root_keyword =", value, "rootKeyword");
            return (Criteria) this;
        }

        public Criteria andRootKeywordNotEqualTo(String value) {
            addCriterion("root_keyword <>", value, "rootKeyword");
            return (Criteria) this;
        }

        public Criteria andRootKeywordGreaterThan(String value) {
            addCriterion("root_keyword >", value, "rootKeyword");
            return (Criteria) this;
        }

        public Criteria andRootKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("root_keyword >=", value, "rootKeyword");
            return (Criteria) this;
        }

        public Criteria andRootKeywordLessThan(String value) {
            addCriterion("root_keyword <", value, "rootKeyword");
            return (Criteria) this;
        }

        public Criteria andRootKeywordLessThanOrEqualTo(String value) {
            addCriterion("root_keyword <=", value, "rootKeyword");
            return (Criteria) this;
        }

        public Criteria andRootKeywordLike(String value) {
            addCriterion("root_keyword like", value, "rootKeyword");
            return (Criteria) this;
        }

        public Criteria andRootKeywordNotLike(String value) {
            addCriterion("root_keyword not like", value, "rootKeyword");
            return (Criteria) this;
        }

        public Criteria andRootKeywordIn(List<String> values) {
            addCriterion("root_keyword in", values, "rootKeyword");
            return (Criteria) this;
        }

        public Criteria andRootKeywordNotIn(List<String> values) {
            addCriterion("root_keyword not in", values, "rootKeyword");
            return (Criteria) this;
        }

        public Criteria andRootKeywordBetween(String value1, String value2) {
            addCriterion("root_keyword between", value1, value2, "rootKeyword");
            return (Criteria) this;
        }

        public Criteria andRootKeywordNotBetween(String value1, String value2) {
            addCriterion("root_keyword not between", value1, value2, "rootKeyword");
            return (Criteria) this;
        }

        public Criteria andLowerKeywordIsNull() {
            addCriterion("lower_keyword is null");
            return (Criteria) this;
        }

        public Criteria andLowerKeywordIsNotNull() {
            addCriterion("lower_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andLowerKeywordEqualTo(String value) {
            addCriterion("lower_keyword =", value, "lowerKeyword");
            return (Criteria) this;
        }

        public Criteria andLowerKeywordNotEqualTo(String value) {
            addCriterion("lower_keyword <>", value, "lowerKeyword");
            return (Criteria) this;
        }

        public Criteria andLowerKeywordGreaterThan(String value) {
            addCriterion("lower_keyword >", value, "lowerKeyword");
            return (Criteria) this;
        }

        public Criteria andLowerKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("lower_keyword >=", value, "lowerKeyword");
            return (Criteria) this;
        }

        public Criteria andLowerKeywordLessThan(String value) {
            addCriterion("lower_keyword <", value, "lowerKeyword");
            return (Criteria) this;
        }

        public Criteria andLowerKeywordLessThanOrEqualTo(String value) {
            addCriterion("lower_keyword <=", value, "lowerKeyword");
            return (Criteria) this;
        }

        public Criteria andLowerKeywordLike(String value) {
            addCriterion("lower_keyword like", value, "lowerKeyword");
            return (Criteria) this;
        }

        public Criteria andLowerKeywordNotLike(String value) {
            addCriterion("lower_keyword not like", value, "lowerKeyword");
            return (Criteria) this;
        }

        public Criteria andLowerKeywordIn(List<String> values) {
            addCriterion("lower_keyword in", values, "lowerKeyword");
            return (Criteria) this;
        }

        public Criteria andLowerKeywordNotIn(List<String> values) {
            addCriterion("lower_keyword not in", values, "lowerKeyword");
            return (Criteria) this;
        }

        public Criteria andLowerKeywordBetween(String value1, String value2) {
            addCriterion("lower_keyword between", value1, value2, "lowerKeyword");
            return (Criteria) this;
        }

        public Criteria andLowerKeywordNotBetween(String value1, String value2) {
            addCriterion("lower_keyword not between", value1, value2, "lowerKeyword");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}