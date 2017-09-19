package com.wd.cs.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JournalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JournalExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andJournalTitleIsNull() {
            addCriterion("journal_title is null");
            return (Criteria) this;
        }

        public Criteria andJournalTitleIsNotNull() {
            addCriterion("journal_title is not null");
            return (Criteria) this;
        }

        public Criteria andJournalTitleEqualTo(String value) {
            addCriterion("journal_title =", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleNotEqualTo(String value) {
            addCriterion("journal_title <>", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleGreaterThan(String value) {
            addCriterion("journal_title >", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleGreaterThanOrEqualTo(String value) {
            addCriterion("journal_title >=", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleLessThan(String value) {
            addCriterion("journal_title <", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleLessThanOrEqualTo(String value) {
            addCriterion("journal_title <=", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleLike(String value) {
            addCriterion("journal_title like", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleNotLike(String value) {
            addCriterion("journal_title not like", value, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleIn(List<String> values) {
            addCriterion("journal_title in", values, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleNotIn(List<String> values) {
            addCriterion("journal_title not in", values, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleBetween(String value1, String value2) {
            addCriterion("journal_title between", value1, value2, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andJournalTitleNotBetween(String value1, String value2) {
            addCriterion("journal_title not between", value1, value2, "journalTitle");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Date value) {
            addCriterionForJDBCDate("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Date value) {
            addCriterionForJDBCDate("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Date value) {
            addCriterionForJDBCDate("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Date value) {
            addCriterionForJDBCDate("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Date> values) {
            addCriterionForJDBCDate("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Date> values) {
            addCriterionForJDBCDate("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andIssnIsNull() {
            addCriterion("issn is null");
            return (Criteria) this;
        }

        public Criteria andIssnIsNotNull() {
            addCriterion("issn is not null");
            return (Criteria) this;
        }

        public Criteria andIssnEqualTo(String value) {
            addCriterion("issn =", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotEqualTo(String value) {
            addCriterion("issn <>", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnGreaterThan(String value) {
            addCriterion("issn >", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnGreaterThanOrEqualTo(String value) {
            addCriterion("issn >=", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnLessThan(String value) {
            addCriterion("issn <", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnLessThanOrEqualTo(String value) {
            addCriterion("issn <=", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnLike(String value) {
            addCriterion("issn like", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotLike(String value) {
            addCriterion("issn not like", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnIn(List<String> values) {
            addCriterion("issn in", values, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotIn(List<String> values) {
            addCriterion("issn not in", values, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnBetween(String value1, String value2) {
            addCriterion("issn between", value1, value2, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotBetween(String value1, String value2) {
            addCriterion("issn not between", value1, value2, "issn");
            return (Criteria) this;
        }

        public Criteria andEissnIsNull() {
            addCriterion("eissn is null");
            return (Criteria) this;
        }

        public Criteria andEissnIsNotNull() {
            addCriterion("eissn is not null");
            return (Criteria) this;
        }

        public Criteria andEissnEqualTo(String value) {
            addCriterion("eissn =", value, "eissn");
            return (Criteria) this;
        }

        public Criteria andEissnNotEqualTo(String value) {
            addCriterion("eissn <>", value, "eissn");
            return (Criteria) this;
        }

        public Criteria andEissnGreaterThan(String value) {
            addCriterion("eissn >", value, "eissn");
            return (Criteria) this;
        }

        public Criteria andEissnGreaterThanOrEqualTo(String value) {
            addCriterion("eissn >=", value, "eissn");
            return (Criteria) this;
        }

        public Criteria andEissnLessThan(String value) {
            addCriterion("eissn <", value, "eissn");
            return (Criteria) this;
        }

        public Criteria andEissnLessThanOrEqualTo(String value) {
            addCriterion("eissn <=", value, "eissn");
            return (Criteria) this;
        }

        public Criteria andEissnLike(String value) {
            addCriterion("eissn like", value, "eissn");
            return (Criteria) this;
        }

        public Criteria andEissnNotLike(String value) {
            addCriterion("eissn not like", value, "eissn");
            return (Criteria) this;
        }

        public Criteria andEissnIn(List<String> values) {
            addCriterion("eissn in", values, "eissn");
            return (Criteria) this;
        }

        public Criteria andEissnNotIn(List<String> values) {
            addCriterion("eissn not in", values, "eissn");
            return (Criteria) this;
        }

        public Criteria andEissnBetween(String value1, String value2) {
            addCriterion("eissn between", value1, value2, "eissn");
            return (Criteria) this;
        }

        public Criteria andEissnNotBetween(String value1, String value2) {
            addCriterion("eissn not between", value1, value2, "eissn");
            return (Criteria) this;
        }

        public Criteria andJournalAbbIsNull() {
            addCriterion("journal_abb is null");
            return (Criteria) this;
        }

        public Criteria andJournalAbbIsNotNull() {
            addCriterion("journal_abb is not null");
            return (Criteria) this;
        }

        public Criteria andJournalAbbEqualTo(String value) {
            addCriterion("journal_abb =", value, "journalAbb");
            return (Criteria) this;
        }

        public Criteria andJournalAbbNotEqualTo(String value) {
            addCriterion("journal_abb <>", value, "journalAbb");
            return (Criteria) this;
        }

        public Criteria andJournalAbbGreaterThan(String value) {
            addCriterion("journal_abb >", value, "journalAbb");
            return (Criteria) this;
        }

        public Criteria andJournalAbbGreaterThanOrEqualTo(String value) {
            addCriterion("journal_abb >=", value, "journalAbb");
            return (Criteria) this;
        }

        public Criteria andJournalAbbLessThan(String value) {
            addCriterion("journal_abb <", value, "journalAbb");
            return (Criteria) this;
        }

        public Criteria andJournalAbbLessThanOrEqualTo(String value) {
            addCriterion("journal_abb <=", value, "journalAbb");
            return (Criteria) this;
        }

        public Criteria andJournalAbbLike(String value) {
            addCriterion("journal_abb like", value, "journalAbb");
            return (Criteria) this;
        }

        public Criteria andJournalAbbNotLike(String value) {
            addCriterion("journal_abb not like", value, "journalAbb");
            return (Criteria) this;
        }

        public Criteria andJournalAbbIn(List<String> values) {
            addCriterion("journal_abb in", values, "journalAbb");
            return (Criteria) this;
        }

        public Criteria andJournalAbbNotIn(List<String> values) {
            addCriterion("journal_abb not in", values, "journalAbb");
            return (Criteria) this;
        }

        public Criteria andJournalAbbBetween(String value1, String value2) {
            addCriterion("journal_abb between", value1, value2, "journalAbb");
            return (Criteria) this;
        }

        public Criteria andJournalAbbNotBetween(String value1, String value2) {
            addCriterion("journal_abb not between", value1, value2, "journalAbb");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("isbn is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("isbn is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("isbn =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("isbn <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("isbn >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("isbn >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("isbn <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("isbn <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("isbn like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("isbn not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("isbn in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("isbn not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("isbn between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("isbn not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andCssnIsNull() {
            addCriterion("cssn is null");
            return (Criteria) this;
        }

        public Criteria andCssnIsNotNull() {
            addCriterion("cssn is not null");
            return (Criteria) this;
        }

        public Criteria andCssnEqualTo(String value) {
            addCriterion("cssn =", value, "cssn");
            return (Criteria) this;
        }

        public Criteria andCssnNotEqualTo(String value) {
            addCriterion("cssn <>", value, "cssn");
            return (Criteria) this;
        }

        public Criteria andCssnGreaterThan(String value) {
            addCriterion("cssn >", value, "cssn");
            return (Criteria) this;
        }

        public Criteria andCssnGreaterThanOrEqualTo(String value) {
            addCriterion("cssn >=", value, "cssn");
            return (Criteria) this;
        }

        public Criteria andCssnLessThan(String value) {
            addCriterion("cssn <", value, "cssn");
            return (Criteria) this;
        }

        public Criteria andCssnLessThanOrEqualTo(String value) {
            addCriterion("cssn <=", value, "cssn");
            return (Criteria) this;
        }

        public Criteria andCssnLike(String value) {
            addCriterion("cssn like", value, "cssn");
            return (Criteria) this;
        }

        public Criteria andCssnNotLike(String value) {
            addCriterion("cssn not like", value, "cssn");
            return (Criteria) this;
        }

        public Criteria andCssnIn(List<String> values) {
            addCriterion("cssn in", values, "cssn");
            return (Criteria) this;
        }

        public Criteria andCssnNotIn(List<String> values) {
            addCriterion("cssn not in", values, "cssn");
            return (Criteria) this;
        }

        public Criteria andCssnBetween(String value1, String value2) {
            addCriterion("cssn between", value1, value2, "cssn");
            return (Criteria) this;
        }

        public Criteria andCssnNotBetween(String value1, String value2) {
            addCriterion("cssn not between", value1, value2, "cssn");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Date value) {
            addCriterion("last_update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Date value) {
            addCriterion("last_update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Date value) {
            addCriterion("last_update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Date value) {
            addCriterion("last_update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
            addCriterion("last_update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Date> values) {
            addCriterion("last_update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Date> values) {
            addCriterion("last_update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Date value1, Date value2) {
            addCriterion("last_update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
            addCriterion("last_update not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNull() {
            addCriterion("is_open is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNotNull() {
            addCriterion("is_open is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenEqualTo(Integer value) {
            addCriterion("is_open =", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotEqualTo(Integer value) {
            addCriterion("is_open <>", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThan(Integer value) {
            addCriterion("is_open >", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_open >=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThan(Integer value) {
            addCriterion("is_open <", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThanOrEqualTo(Integer value) {
            addCriterion("is_open <=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenIn(List<Integer> values) {
            addCriterion("is_open in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotIn(List<Integer> values) {
            addCriterion("is_open not in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenBetween(Integer value1, Integer value2) {
            addCriterion("is_open between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotBetween(Integer value1, Integer value2) {
            addCriterion("is_open not between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIndicatorIsNull() {
            addCriterion("indicator is null");
            return (Criteria) this;
        }

        public Criteria andIndicatorIsNotNull() {
            addCriterion("indicator is not null");
            return (Criteria) this;
        }

        public Criteria andIndicatorEqualTo(String value) {
            addCriterion("indicator =", value, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorNotEqualTo(String value) {
            addCriterion("indicator <>", value, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorGreaterThan(String value) {
            addCriterion("indicator >", value, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorGreaterThanOrEqualTo(String value) {
            addCriterion("indicator >=", value, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorLessThan(String value) {
            addCriterion("indicator <", value, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorLessThanOrEqualTo(String value) {
            addCriterion("indicator <=", value, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorLike(String value) {
            addCriterion("indicator like", value, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorNotLike(String value) {
            addCriterion("indicator not like", value, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorIn(List<String> values) {
            addCriterion("indicator in", values, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorNotIn(List<String> values) {
            addCriterion("indicator not in", values, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorBetween(String value1, String value2) {
            addCriterion("indicator between", value1, value2, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorNotBetween(String value1, String value2) {
            addCriterion("indicator not between", value1, value2, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorValueIsNull() {
            addCriterion("indicator_value is null");
            return (Criteria) this;
        }

        public Criteria andIndicatorValueIsNotNull() {
            addCriterion("indicator_value is not null");
            return (Criteria) this;
        }

        public Criteria andIndicatorValueEqualTo(String value) {
            addCriterion("indicator_value =", value, "indicatorValue");
            return (Criteria) this;
        }

        public Criteria andIndicatorValueNotEqualTo(String value) {
            addCriterion("indicator_value <>", value, "indicatorValue");
            return (Criteria) this;
        }

        public Criteria andIndicatorValueGreaterThan(String value) {
            addCriterion("indicator_value >", value, "indicatorValue");
            return (Criteria) this;
        }

        public Criteria andIndicatorValueGreaterThanOrEqualTo(String value) {
            addCriterion("indicator_value >=", value, "indicatorValue");
            return (Criteria) this;
        }

        public Criteria andIndicatorValueLessThan(String value) {
            addCriterion("indicator_value <", value, "indicatorValue");
            return (Criteria) this;
        }

        public Criteria andIndicatorValueLessThanOrEqualTo(String value) {
            addCriterion("indicator_value <=", value, "indicatorValue");
            return (Criteria) this;
        }

        public Criteria andIndicatorValueLike(String value) {
            addCriterion("indicator_value like", value, "indicatorValue");
            return (Criteria) this;
        }

        public Criteria andIndicatorValueNotLike(String value) {
            addCriterion("indicator_value not like", value, "indicatorValue");
            return (Criteria) this;
        }

        public Criteria andIndicatorValueIn(List<String> values) {
            addCriterion("indicator_value in", values, "indicatorValue");
            return (Criteria) this;
        }

        public Criteria andIndicatorValueNotIn(List<String> values) {
            addCriterion("indicator_value not in", values, "indicatorValue");
            return (Criteria) this;
        }

        public Criteria andIndicatorValueBetween(String value1, String value2) {
            addCriterion("indicator_value between", value1, value2, "indicatorValue");
            return (Criteria) this;
        }

        public Criteria andIndicatorValueNotBetween(String value1, String value2) {
            addCriterion("indicator_value not between", value1, value2, "indicatorValue");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryTranslatedIsNull() {
            addCriterion("category_translated is null");
            return (Criteria) this;
        }

        public Criteria andCategoryTranslatedIsNotNull() {
            addCriterion("category_translated is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryTranslatedEqualTo(String value) {
            addCriterion("category_translated =", value, "categoryTranslated");
            return (Criteria) this;
        }

        public Criteria andCategoryTranslatedNotEqualTo(String value) {
            addCriterion("category_translated <>", value, "categoryTranslated");
            return (Criteria) this;
        }

        public Criteria andCategoryTranslatedGreaterThan(String value) {
            addCriterion("category_translated >", value, "categoryTranslated");
            return (Criteria) this;
        }

        public Criteria andCategoryTranslatedGreaterThanOrEqualTo(String value) {
            addCriterion("category_translated >=", value, "categoryTranslated");
            return (Criteria) this;
        }

        public Criteria andCategoryTranslatedLessThan(String value) {
            addCriterion("category_translated <", value, "categoryTranslated");
            return (Criteria) this;
        }

        public Criteria andCategoryTranslatedLessThanOrEqualTo(String value) {
            addCriterion("category_translated <=", value, "categoryTranslated");
            return (Criteria) this;
        }

        public Criteria andCategoryTranslatedLike(String value) {
            addCriterion("category_translated like", value, "categoryTranslated");
            return (Criteria) this;
        }

        public Criteria andCategoryTranslatedNotLike(String value) {
            addCriterion("category_translated not like", value, "categoryTranslated");
            return (Criteria) this;
        }

        public Criteria andCategoryTranslatedIn(List<String> values) {
            addCriterion("category_translated in", values, "categoryTranslated");
            return (Criteria) this;
        }

        public Criteria andCategoryTranslatedNotIn(List<String> values) {
            addCriterion("category_translated not in", values, "categoryTranslated");
            return (Criteria) this;
        }

        public Criteria andCategoryTranslatedBetween(String value1, String value2) {
            addCriterion("category_translated between", value1, value2, "categoryTranslated");
            return (Criteria) this;
        }

        public Criteria andCategoryTranslatedNotBetween(String value1, String value2) {
            addCriterion("category_translated not between", value1, value2, "categoryTranslated");
            return (Criteria) this;
        }

        public Criteria andCoreIsNull() {
            addCriterion("core is null");
            return (Criteria) this;
        }

        public Criteria andCoreIsNotNull() {
            addCriterion("core is not null");
            return (Criteria) this;
        }

        public Criteria andCoreEqualTo(Integer value) {
            addCriterion("core =", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreNotEqualTo(Integer value) {
            addCriterion("core <>", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreGreaterThan(Integer value) {
            addCriterion("core >", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("core >=", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreLessThan(Integer value) {
            addCriterion("core <", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreLessThanOrEqualTo(Integer value) {
            addCriterion("core <=", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreIn(List<Integer> values) {
            addCriterion("core in", values, "core");
            return (Criteria) this;
        }

        public Criteria andCoreNotIn(List<Integer> values) {
            addCriterion("core not in", values, "core");
            return (Criteria) this;
        }

        public Criteria andCoreBetween(Integer value1, Integer value2) {
            addCriterion("core between", value1, value2, "core");
            return (Criteria) this;
        }

        public Criteria andCoreNotBetween(Integer value1, Integer value2) {
            addCriterion("core not between", value1, value2, "core");
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