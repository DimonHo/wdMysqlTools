package com.wd.cs.po;

import java.util.ArrayList;
import java.util.List;

public class DocSpiderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocSpiderExample() {
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

        public Criteria andSpiderTitleIsNull() {
            addCriterion("spider_title is null");
            return (Criteria) this;
        }

        public Criteria andSpiderTitleIsNotNull() {
            addCriterion("spider_title is not null");
            return (Criteria) this;
        }

        public Criteria andSpiderTitleEqualTo(String value) {
            addCriterion("spider_title =", value, "spiderTitle");
            return (Criteria) this;
        }

        public Criteria andSpiderTitleNotEqualTo(String value) {
            addCriterion("spider_title <>", value, "spiderTitle");
            return (Criteria) this;
        }

        public Criteria andSpiderTitleGreaterThan(String value) {
            addCriterion("spider_title >", value, "spiderTitle");
            return (Criteria) this;
        }

        public Criteria andSpiderTitleGreaterThanOrEqualTo(String value) {
            addCriterion("spider_title >=", value, "spiderTitle");
            return (Criteria) this;
        }

        public Criteria andSpiderTitleLessThan(String value) {
            addCriterion("spider_title <", value, "spiderTitle");
            return (Criteria) this;
        }

        public Criteria andSpiderTitleLessThanOrEqualTo(String value) {
            addCriterion("spider_title <=", value, "spiderTitle");
            return (Criteria) this;
        }

        public Criteria andSpiderTitleLike(String value) {
            addCriterion("spider_title like", value, "spiderTitle");
            return (Criteria) this;
        }

        public Criteria andSpiderTitleNotLike(String value) {
            addCriterion("spider_title not like", value, "spiderTitle");
            return (Criteria) this;
        }

        public Criteria andSpiderTitleIn(List<String> values) {
            addCriterion("spider_title in", values, "spiderTitle");
            return (Criteria) this;
        }

        public Criteria andSpiderTitleNotIn(List<String> values) {
            addCriterion("spider_title not in", values, "spiderTitle");
            return (Criteria) this;
        }

        public Criteria andSpiderTitleBetween(String value1, String value2) {
            addCriterion("spider_title between", value1, value2, "spiderTitle");
            return (Criteria) this;
        }

        public Criteria andSpiderTitleNotBetween(String value1, String value2) {
            addCriterion("spider_title not between", value1, value2, "spiderTitle");
            return (Criteria) this;
        }

        public Criteria andSpiderAuthorIsNull() {
            addCriterion("spider_author is null");
            return (Criteria) this;
        }

        public Criteria andSpiderAuthorIsNotNull() {
            addCriterion("spider_author is not null");
            return (Criteria) this;
        }

        public Criteria andSpiderAuthorEqualTo(String value) {
            addCriterion("spider_author =", value, "spiderAuthor");
            return (Criteria) this;
        }

        public Criteria andSpiderAuthorNotEqualTo(String value) {
            addCriterion("spider_author <>", value, "spiderAuthor");
            return (Criteria) this;
        }

        public Criteria andSpiderAuthorGreaterThan(String value) {
            addCriterion("spider_author >", value, "spiderAuthor");
            return (Criteria) this;
        }

        public Criteria andSpiderAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("spider_author >=", value, "spiderAuthor");
            return (Criteria) this;
        }

        public Criteria andSpiderAuthorLessThan(String value) {
            addCriterion("spider_author <", value, "spiderAuthor");
            return (Criteria) this;
        }

        public Criteria andSpiderAuthorLessThanOrEqualTo(String value) {
            addCriterion("spider_author <=", value, "spiderAuthor");
            return (Criteria) this;
        }

        public Criteria andSpiderAuthorLike(String value) {
            addCriterion("spider_author like", value, "spiderAuthor");
            return (Criteria) this;
        }

        public Criteria andSpiderAuthorNotLike(String value) {
            addCriterion("spider_author not like", value, "spiderAuthor");
            return (Criteria) this;
        }

        public Criteria andSpiderAuthorIn(List<String> values) {
            addCriterion("spider_author in", values, "spiderAuthor");
            return (Criteria) this;
        }

        public Criteria andSpiderAuthorNotIn(List<String> values) {
            addCriterion("spider_author not in", values, "spiderAuthor");
            return (Criteria) this;
        }

        public Criteria andSpiderAuthorBetween(String value1, String value2) {
            addCriterion("spider_author between", value1, value2, "spiderAuthor");
            return (Criteria) this;
        }

        public Criteria andSpiderAuthorNotBetween(String value1, String value2) {
            addCriterion("spider_author not between", value1, value2, "spiderAuthor");
            return (Criteria) this;
        }

        public Criteria andSpiderAbstractIsNull() {
            addCriterion("spider_abstract is null");
            return (Criteria) this;
        }

        public Criteria andSpiderAbstractIsNotNull() {
            addCriterion("spider_abstract is not null");
            return (Criteria) this;
        }

        public Criteria andSpiderAbstractEqualTo(String value) {
            addCriterion("spider_abstract =", value, "spiderAbstract");
            return (Criteria) this;
        }

        public Criteria andSpiderAbstractNotEqualTo(String value) {
            addCriterion("spider_abstract <>", value, "spiderAbstract");
            return (Criteria) this;
        }

        public Criteria andSpiderAbstractGreaterThan(String value) {
            addCriterion("spider_abstract >", value, "spiderAbstract");
            return (Criteria) this;
        }

        public Criteria andSpiderAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("spider_abstract >=", value, "spiderAbstract");
            return (Criteria) this;
        }

        public Criteria andSpiderAbstractLessThan(String value) {
            addCriterion("spider_abstract <", value, "spiderAbstract");
            return (Criteria) this;
        }

        public Criteria andSpiderAbstractLessThanOrEqualTo(String value) {
            addCriterion("spider_abstract <=", value, "spiderAbstract");
            return (Criteria) this;
        }

        public Criteria andSpiderAbstractLike(String value) {
            addCriterion("spider_abstract like", value, "spiderAbstract");
            return (Criteria) this;
        }

        public Criteria andSpiderAbstractNotLike(String value) {
            addCriterion("spider_abstract not like", value, "spiderAbstract");
            return (Criteria) this;
        }

        public Criteria andSpiderAbstractIn(List<String> values) {
            addCriterion("spider_abstract in", values, "spiderAbstract");
            return (Criteria) this;
        }

        public Criteria andSpiderAbstractNotIn(List<String> values) {
            addCriterion("spider_abstract not in", values, "spiderAbstract");
            return (Criteria) this;
        }

        public Criteria andSpiderAbstractBetween(String value1, String value2) {
            addCriterion("spider_abstract between", value1, value2, "spiderAbstract");
            return (Criteria) this;
        }

        public Criteria andSpiderAbstractNotBetween(String value1, String value2) {
            addCriterion("spider_abstract not between", value1, value2, "spiderAbstract");
            return (Criteria) this;
        }

        public Criteria andSpiderSourceIsNull() {
            addCriterion("spider_source is null");
            return (Criteria) this;
        }

        public Criteria andSpiderSourceIsNotNull() {
            addCriterion("spider_source is not null");
            return (Criteria) this;
        }

        public Criteria andSpiderSourceEqualTo(String value) {
            addCriterion("spider_source =", value, "spiderSource");
            return (Criteria) this;
        }

        public Criteria andSpiderSourceNotEqualTo(String value) {
            addCriterion("spider_source <>", value, "spiderSource");
            return (Criteria) this;
        }

        public Criteria andSpiderSourceGreaterThan(String value) {
            addCriterion("spider_source >", value, "spiderSource");
            return (Criteria) this;
        }

        public Criteria andSpiderSourceGreaterThanOrEqualTo(String value) {
            addCriterion("spider_source >=", value, "spiderSource");
            return (Criteria) this;
        }

        public Criteria andSpiderSourceLessThan(String value) {
            addCriterion("spider_source <", value, "spiderSource");
            return (Criteria) this;
        }

        public Criteria andSpiderSourceLessThanOrEqualTo(String value) {
            addCriterion("spider_source <=", value, "spiderSource");
            return (Criteria) this;
        }

        public Criteria andSpiderSourceLike(String value) {
            addCriterion("spider_source like", value, "spiderSource");
            return (Criteria) this;
        }

        public Criteria andSpiderSourceNotLike(String value) {
            addCriterion("spider_source not like", value, "spiderSource");
            return (Criteria) this;
        }

        public Criteria andSpiderSourceIn(List<String> values) {
            addCriterion("spider_source in", values, "spiderSource");
            return (Criteria) this;
        }

        public Criteria andSpiderSourceNotIn(List<String> values) {
            addCriterion("spider_source not in", values, "spiderSource");
            return (Criteria) this;
        }

        public Criteria andSpiderSourceBetween(String value1, String value2) {
            addCriterion("spider_source between", value1, value2, "spiderSource");
            return (Criteria) this;
        }

        public Criteria andSpiderSourceNotBetween(String value1, String value2) {
            addCriterion("spider_source not between", value1, value2, "spiderSource");
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