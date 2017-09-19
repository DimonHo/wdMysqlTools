package com.wd.cs.po;

import java.util.ArrayList;
import java.util.List;

public class DocBiyinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocBiyinExample() {
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

        public Criteria andByJournalIsNull() {
            addCriterion("by_journal is null");
            return (Criteria) this;
        }

        public Criteria andByJournalIsNotNull() {
            addCriterion("by_journal is not null");
            return (Criteria) this;
        }

        public Criteria andByJournalEqualTo(String value) {
            addCriterion("by_journal =", value, "byJournal");
            return (Criteria) this;
        }

        public Criteria andByJournalNotEqualTo(String value) {
            addCriterion("by_journal <>", value, "byJournal");
            return (Criteria) this;
        }

        public Criteria andByJournalGreaterThan(String value) {
            addCriterion("by_journal >", value, "byJournal");
            return (Criteria) this;
        }

        public Criteria andByJournalGreaterThanOrEqualTo(String value) {
            addCriterion("by_journal >=", value, "byJournal");
            return (Criteria) this;
        }

        public Criteria andByJournalLessThan(String value) {
            addCriterion("by_journal <", value, "byJournal");
            return (Criteria) this;
        }

        public Criteria andByJournalLessThanOrEqualTo(String value) {
            addCriterion("by_journal <=", value, "byJournal");
            return (Criteria) this;
        }

        public Criteria andByJournalLike(String value) {
            addCriterion("by_journal like", value, "byJournal");
            return (Criteria) this;
        }

        public Criteria andByJournalNotLike(String value) {
            addCriterion("by_journal not like", value, "byJournal");
            return (Criteria) this;
        }

        public Criteria andByJournalIn(List<String> values) {
            addCriterion("by_journal in", values, "byJournal");
            return (Criteria) this;
        }

        public Criteria andByJournalNotIn(List<String> values) {
            addCriterion("by_journal not in", values, "byJournal");
            return (Criteria) this;
        }

        public Criteria andByJournalBetween(String value1, String value2) {
            addCriterion("by_journal between", value1, value2, "byJournal");
            return (Criteria) this;
        }

        public Criteria andByJournalNotBetween(String value1, String value2) {
            addCriterion("by_journal not between", value1, value2, "byJournal");
            return (Criteria) this;
        }

        public Criteria andByTitleIsNull() {
            addCriterion("by_title is null");
            return (Criteria) this;
        }

        public Criteria andByTitleIsNotNull() {
            addCriterion("by_title is not null");
            return (Criteria) this;
        }

        public Criteria andByTitleEqualTo(String value) {
            addCriterion("by_title =", value, "byTitle");
            return (Criteria) this;
        }

        public Criteria andByTitleNotEqualTo(String value) {
            addCriterion("by_title <>", value, "byTitle");
            return (Criteria) this;
        }

        public Criteria andByTitleGreaterThan(String value) {
            addCriterion("by_title >", value, "byTitle");
            return (Criteria) this;
        }

        public Criteria andByTitleGreaterThanOrEqualTo(String value) {
            addCriterion("by_title >=", value, "byTitle");
            return (Criteria) this;
        }

        public Criteria andByTitleLessThan(String value) {
            addCriterion("by_title <", value, "byTitle");
            return (Criteria) this;
        }

        public Criteria andByTitleLessThanOrEqualTo(String value) {
            addCriterion("by_title <=", value, "byTitle");
            return (Criteria) this;
        }

        public Criteria andByTitleLike(String value) {
            addCriterion("by_title like", value, "byTitle");
            return (Criteria) this;
        }

        public Criteria andByTitleNotLike(String value) {
            addCriterion("by_title not like", value, "byTitle");
            return (Criteria) this;
        }

        public Criteria andByTitleIn(List<String> values) {
            addCriterion("by_title in", values, "byTitle");
            return (Criteria) this;
        }

        public Criteria andByTitleNotIn(List<String> values) {
            addCriterion("by_title not in", values, "byTitle");
            return (Criteria) this;
        }

        public Criteria andByTitleBetween(String value1, String value2) {
            addCriterion("by_title between", value1, value2, "byTitle");
            return (Criteria) this;
        }

        public Criteria andByTitleNotBetween(String value1, String value2) {
            addCriterion("by_title not between", value1, value2, "byTitle");
            return (Criteria) this;
        }

        public Criteria andByAuthorIsNull() {
            addCriterion("by_author is null");
            return (Criteria) this;
        }

        public Criteria andByAuthorIsNotNull() {
            addCriterion("by_author is not null");
            return (Criteria) this;
        }

        public Criteria andByAuthorEqualTo(String value) {
            addCriterion("by_author =", value, "byAuthor");
            return (Criteria) this;
        }

        public Criteria andByAuthorNotEqualTo(String value) {
            addCriterion("by_author <>", value, "byAuthor");
            return (Criteria) this;
        }

        public Criteria andByAuthorGreaterThan(String value) {
            addCriterion("by_author >", value, "byAuthor");
            return (Criteria) this;
        }

        public Criteria andByAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("by_author >=", value, "byAuthor");
            return (Criteria) this;
        }

        public Criteria andByAuthorLessThan(String value) {
            addCriterion("by_author <", value, "byAuthor");
            return (Criteria) this;
        }

        public Criteria andByAuthorLessThanOrEqualTo(String value) {
            addCriterion("by_author <=", value, "byAuthor");
            return (Criteria) this;
        }

        public Criteria andByAuthorLike(String value) {
            addCriterion("by_author like", value, "byAuthor");
            return (Criteria) this;
        }

        public Criteria andByAuthorNotLike(String value) {
            addCriterion("by_author not like", value, "byAuthor");
            return (Criteria) this;
        }

        public Criteria andByAuthorIn(List<String> values) {
            addCriterion("by_author in", values, "byAuthor");
            return (Criteria) this;
        }

        public Criteria andByAuthorNotIn(List<String> values) {
            addCriterion("by_author not in", values, "byAuthor");
            return (Criteria) this;
        }

        public Criteria andByAuthorBetween(String value1, String value2) {
            addCriterion("by_author between", value1, value2, "byAuthor");
            return (Criteria) this;
        }

        public Criteria andByAuthorNotBetween(String value1, String value2) {
            addCriterion("by_author not between", value1, value2, "byAuthor");
            return (Criteria) this;
        }

        public Criteria andByVolumeIsNull() {
            addCriterion("by_volume is null");
            return (Criteria) this;
        }

        public Criteria andByVolumeIsNotNull() {
            addCriterion("by_volume is not null");
            return (Criteria) this;
        }

        public Criteria andByVolumeEqualTo(String value) {
            addCriterion("by_volume =", value, "byVolume");
            return (Criteria) this;
        }

        public Criteria andByVolumeNotEqualTo(String value) {
            addCriterion("by_volume <>", value, "byVolume");
            return (Criteria) this;
        }

        public Criteria andByVolumeGreaterThan(String value) {
            addCriterion("by_volume >", value, "byVolume");
            return (Criteria) this;
        }

        public Criteria andByVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("by_volume >=", value, "byVolume");
            return (Criteria) this;
        }

        public Criteria andByVolumeLessThan(String value) {
            addCriterion("by_volume <", value, "byVolume");
            return (Criteria) this;
        }

        public Criteria andByVolumeLessThanOrEqualTo(String value) {
            addCriterion("by_volume <=", value, "byVolume");
            return (Criteria) this;
        }

        public Criteria andByVolumeLike(String value) {
            addCriterion("by_volume like", value, "byVolume");
            return (Criteria) this;
        }

        public Criteria andByVolumeNotLike(String value) {
            addCriterion("by_volume not like", value, "byVolume");
            return (Criteria) this;
        }

        public Criteria andByVolumeIn(List<String> values) {
            addCriterion("by_volume in", values, "byVolume");
            return (Criteria) this;
        }

        public Criteria andByVolumeNotIn(List<String> values) {
            addCriterion("by_volume not in", values, "byVolume");
            return (Criteria) this;
        }

        public Criteria andByVolumeBetween(String value1, String value2) {
            addCriterion("by_volume between", value1, value2, "byVolume");
            return (Criteria) this;
        }

        public Criteria andByVolumeNotBetween(String value1, String value2) {
            addCriterion("by_volume not between", value1, value2, "byVolume");
            return (Criteria) this;
        }

        public Criteria andByIssueIsNull() {
            addCriterion("by_issue is null");
            return (Criteria) this;
        }

        public Criteria andByIssueIsNotNull() {
            addCriterion("by_issue is not null");
            return (Criteria) this;
        }

        public Criteria andByIssueEqualTo(String value) {
            addCriterion("by_issue =", value, "byIssue");
            return (Criteria) this;
        }

        public Criteria andByIssueNotEqualTo(String value) {
            addCriterion("by_issue <>", value, "byIssue");
            return (Criteria) this;
        }

        public Criteria andByIssueGreaterThan(String value) {
            addCriterion("by_issue >", value, "byIssue");
            return (Criteria) this;
        }

        public Criteria andByIssueGreaterThanOrEqualTo(String value) {
            addCriterion("by_issue >=", value, "byIssue");
            return (Criteria) this;
        }

        public Criteria andByIssueLessThan(String value) {
            addCriterion("by_issue <", value, "byIssue");
            return (Criteria) this;
        }

        public Criteria andByIssueLessThanOrEqualTo(String value) {
            addCriterion("by_issue <=", value, "byIssue");
            return (Criteria) this;
        }

        public Criteria andByIssueLike(String value) {
            addCriterion("by_issue like", value, "byIssue");
            return (Criteria) this;
        }

        public Criteria andByIssueNotLike(String value) {
            addCriterion("by_issue not like", value, "byIssue");
            return (Criteria) this;
        }

        public Criteria andByIssueIn(List<String> values) {
            addCriterion("by_issue in", values, "byIssue");
            return (Criteria) this;
        }

        public Criteria andByIssueNotIn(List<String> values) {
            addCriterion("by_issue not in", values, "byIssue");
            return (Criteria) this;
        }

        public Criteria andByIssueBetween(String value1, String value2) {
            addCriterion("by_issue between", value1, value2, "byIssue");
            return (Criteria) this;
        }

        public Criteria andByIssueNotBetween(String value1, String value2) {
            addCriterion("by_issue not between", value1, value2, "byIssue");
            return (Criteria) this;
        }

        public Criteria andByPagesIsNull() {
            addCriterion("by_pages is null");
            return (Criteria) this;
        }

        public Criteria andByPagesIsNotNull() {
            addCriterion("by_pages is not null");
            return (Criteria) this;
        }

        public Criteria andByPagesEqualTo(String value) {
            addCriterion("by_pages =", value, "byPages");
            return (Criteria) this;
        }

        public Criteria andByPagesNotEqualTo(String value) {
            addCriterion("by_pages <>", value, "byPages");
            return (Criteria) this;
        }

        public Criteria andByPagesGreaterThan(String value) {
            addCriterion("by_pages >", value, "byPages");
            return (Criteria) this;
        }

        public Criteria andByPagesGreaterThanOrEqualTo(String value) {
            addCriterion("by_pages >=", value, "byPages");
            return (Criteria) this;
        }

        public Criteria andByPagesLessThan(String value) {
            addCriterion("by_pages <", value, "byPages");
            return (Criteria) this;
        }

        public Criteria andByPagesLessThanOrEqualTo(String value) {
            addCriterion("by_pages <=", value, "byPages");
            return (Criteria) this;
        }

        public Criteria andByPagesLike(String value) {
            addCriterion("by_pages like", value, "byPages");
            return (Criteria) this;
        }

        public Criteria andByPagesNotLike(String value) {
            addCriterion("by_pages not like", value, "byPages");
            return (Criteria) this;
        }

        public Criteria andByPagesIn(List<String> values) {
            addCriterion("by_pages in", values, "byPages");
            return (Criteria) this;
        }

        public Criteria andByPagesNotIn(List<String> values) {
            addCriterion("by_pages not in", values, "byPages");
            return (Criteria) this;
        }

        public Criteria andByPagesBetween(String value1, String value2) {
            addCriterion("by_pages between", value1, value2, "byPages");
            return (Criteria) this;
        }

        public Criteria andByPagesNotBetween(String value1, String value2) {
            addCriterion("by_pages not between", value1, value2, "byPages");
            return (Criteria) this;
        }

        public Criteria andBySourceIsNull() {
            addCriterion("by_source is null");
            return (Criteria) this;
        }

        public Criteria andBySourceIsNotNull() {
            addCriterion("by_source is not null");
            return (Criteria) this;
        }

        public Criteria andBySourceEqualTo(String value) {
            addCriterion("by_source =", value, "bySource");
            return (Criteria) this;
        }

        public Criteria andBySourceNotEqualTo(String value) {
            addCriterion("by_source <>", value, "bySource");
            return (Criteria) this;
        }

        public Criteria andBySourceGreaterThan(String value) {
            addCriterion("by_source >", value, "bySource");
            return (Criteria) this;
        }

        public Criteria andBySourceGreaterThanOrEqualTo(String value) {
            addCriterion("by_source >=", value, "bySource");
            return (Criteria) this;
        }

        public Criteria andBySourceLessThan(String value) {
            addCriterion("by_source <", value, "bySource");
            return (Criteria) this;
        }

        public Criteria andBySourceLessThanOrEqualTo(String value) {
            addCriterion("by_source <=", value, "bySource");
            return (Criteria) this;
        }

        public Criteria andBySourceLike(String value) {
            addCriterion("by_source like", value, "bySource");
            return (Criteria) this;
        }

        public Criteria andBySourceNotLike(String value) {
            addCriterion("by_source not like", value, "bySource");
            return (Criteria) this;
        }

        public Criteria andBySourceIn(List<String> values) {
            addCriterion("by_source in", values, "bySource");
            return (Criteria) this;
        }

        public Criteria andBySourceNotIn(List<String> values) {
            addCriterion("by_source not in", values, "bySource");
            return (Criteria) this;
        }

        public Criteria andBySourceBetween(String value1, String value2) {
            addCriterion("by_source between", value1, value2, "bySource");
            return (Criteria) this;
        }

        public Criteria andBySourceNotBetween(String value1, String value2) {
            addCriterion("by_source not between", value1, value2, "bySource");
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