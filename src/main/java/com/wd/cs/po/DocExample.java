package com.wd.cs.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocExample() {
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

        public Criteria andJguidIsNull() {
            addCriterion("jguid is null");
            return (Criteria) this;
        }

        public Criteria andJguidIsNotNull() {
            addCriterion("jguid is not null");
            return (Criteria) this;
        }

        public Criteria andJguidEqualTo(String value) {
            addCriterion("jguid =", value, "jguid");
            return (Criteria) this;
        }

        public Criteria andJguidNotEqualTo(String value) {
            addCriterion("jguid <>", value, "jguid");
            return (Criteria) this;
        }

        public Criteria andJguidGreaterThan(String value) {
            addCriterion("jguid >", value, "jguid");
            return (Criteria) this;
        }

        public Criteria andJguidGreaterThanOrEqualTo(String value) {
            addCriterion("jguid >=", value, "jguid");
            return (Criteria) this;
        }

        public Criteria andJguidLessThan(String value) {
            addCriterion("jguid <", value, "jguid");
            return (Criteria) this;
        }

        public Criteria andJguidLessThanOrEqualTo(String value) {
            addCriterion("jguid <=", value, "jguid");
            return (Criteria) this;
        }

        public Criteria andJguidLike(String value) {
            addCriterion("jguid like", value, "jguid");
            return (Criteria) this;
        }

        public Criteria andJguidNotLike(String value) {
            addCriterion("jguid not like", value, "jguid");
            return (Criteria) this;
        }

        public Criteria andJguidIn(List<String> values) {
            addCriterion("jguid in", values, "jguid");
            return (Criteria) this;
        }

        public Criteria andJguidNotIn(List<String> values) {
            addCriterion("jguid not in", values, "jguid");
            return (Criteria) this;
        }

        public Criteria andJguidBetween(String value1, String value2) {
            addCriterion("jguid between", value1, value2, "jguid");
            return (Criteria) this;
        }

        public Criteria andJguidNotBetween(String value1, String value2) {
            addCriterion("jguid not between", value1, value2, "jguid");
            return (Criteria) this;
        }

        public Criteria andDocTitleIsNull() {
            addCriterion("doc_title is null");
            return (Criteria) this;
        }

        public Criteria andDocTitleIsNotNull() {
            addCriterion("doc_title is not null");
            return (Criteria) this;
        }

        public Criteria andDocTitleEqualTo(String value) {
            addCriterion("doc_title =", value, "docTitle");
            return (Criteria) this;
        }

        public Criteria andDocTitleNotEqualTo(String value) {
            addCriterion("doc_title <>", value, "docTitle");
            return (Criteria) this;
        }

        public Criteria andDocTitleGreaterThan(String value) {
            addCriterion("doc_title >", value, "docTitle");
            return (Criteria) this;
        }

        public Criteria andDocTitleGreaterThanOrEqualTo(String value) {
            addCriterion("doc_title >=", value, "docTitle");
            return (Criteria) this;
        }

        public Criteria andDocTitleLessThan(String value) {
            addCriterion("doc_title <", value, "docTitle");
            return (Criteria) this;
        }

        public Criteria andDocTitleLessThanOrEqualTo(String value) {
            addCriterion("doc_title <=", value, "docTitle");
            return (Criteria) this;
        }

        public Criteria andDocTitleLike(String value) {
            addCriterion("doc_title like", value, "docTitle");
            return (Criteria) this;
        }

        public Criteria andDocTitleNotLike(String value) {
            addCriterion("doc_title not like", value, "docTitle");
            return (Criteria) this;
        }

        public Criteria andDocTitleIn(List<String> values) {
            addCriterion("doc_title in", values, "docTitle");
            return (Criteria) this;
        }

        public Criteria andDocTitleNotIn(List<String> values) {
            addCriterion("doc_title not in", values, "docTitle");
            return (Criteria) this;
        }

        public Criteria andDocTitleBetween(String value1, String value2) {
            addCriterion("doc_title between", value1, value2, "docTitle");
            return (Criteria) this;
        }

        public Criteria andDocTitleNotBetween(String value1, String value2) {
            addCriterion("doc_title not between", value1, value2, "docTitle");
            return (Criteria) this;
        }

        public Criteria andDocTitleTranslatedIsNull() {
            addCriterion("doc_title_translated is null");
            return (Criteria) this;
        }

        public Criteria andDocTitleTranslatedIsNotNull() {
            addCriterion("doc_title_translated is not null");
            return (Criteria) this;
        }

        public Criteria andDocTitleTranslatedEqualTo(String value) {
            addCriterion("doc_title_translated =", value, "docTitleTranslated");
            return (Criteria) this;
        }

        public Criteria andDocTitleTranslatedNotEqualTo(String value) {
            addCriterion("doc_title_translated <>", value, "docTitleTranslated");
            return (Criteria) this;
        }

        public Criteria andDocTitleTranslatedGreaterThan(String value) {
            addCriterion("doc_title_translated >", value, "docTitleTranslated");
            return (Criteria) this;
        }

        public Criteria andDocTitleTranslatedGreaterThanOrEqualTo(String value) {
            addCriterion("doc_title_translated >=", value, "docTitleTranslated");
            return (Criteria) this;
        }

        public Criteria andDocTitleTranslatedLessThan(String value) {
            addCriterion("doc_title_translated <", value, "docTitleTranslated");
            return (Criteria) this;
        }

        public Criteria andDocTitleTranslatedLessThanOrEqualTo(String value) {
            addCriterion("doc_title_translated <=", value, "docTitleTranslated");
            return (Criteria) this;
        }

        public Criteria andDocTitleTranslatedLike(String value) {
            addCriterion("doc_title_translated like", value, "docTitleTranslated");
            return (Criteria) this;
        }

        public Criteria andDocTitleTranslatedNotLike(String value) {
            addCriterion("doc_title_translated not like", value, "docTitleTranslated");
            return (Criteria) this;
        }

        public Criteria andDocTitleTranslatedIn(List<String> values) {
            addCriterion("doc_title_translated in", values, "docTitleTranslated");
            return (Criteria) this;
        }

        public Criteria andDocTitleTranslatedNotIn(List<String> values) {
            addCriterion("doc_title_translated not in", values, "docTitleTranslated");
            return (Criteria) this;
        }

        public Criteria andDocTitleTranslatedBetween(String value1, String value2) {
            addCriterion("doc_title_translated between", value1, value2, "docTitleTranslated");
            return (Criteria) this;
        }

        public Criteria andDocTitleTranslatedNotBetween(String value1, String value2) {
            addCriterion("doc_title_translated not between", value1, value2, "docTitleTranslated");
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

        public Criteria andPtypeIsNull() {
            addCriterion("ptype is null");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNotNull() {
            addCriterion("ptype is not null");
            return (Criteria) this;
        }

        public Criteria andPtypeEqualTo(String value) {
            addCriterion("ptype =", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotEqualTo(String value) {
            addCriterion("ptype <>", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThan(String value) {
            addCriterion("ptype >", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ptype >=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThan(String value) {
            addCriterion("ptype <", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThanOrEqualTo(String value) {
            addCriterion("ptype <=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLike(String value) {
            addCriterion("ptype like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotLike(String value) {
            addCriterion("ptype not like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeIn(List<String> values) {
            addCriterion("ptype in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotIn(List<String> values) {
            addCriterion("ptype not in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeBetween(String value1, String value2) {
            addCriterion("ptype between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotBetween(String value1, String value2) {
            addCriterion("ptype not between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andUtWosIsNull() {
            addCriterion("ut_wos is null");
            return (Criteria) this;
        }

        public Criteria andUtWosIsNotNull() {
            addCriterion("ut_wos is not null");
            return (Criteria) this;
        }

        public Criteria andUtWosEqualTo(String value) {
            addCriterion("ut_wos =", value, "utWos");
            return (Criteria) this;
        }

        public Criteria andUtWosNotEqualTo(String value) {
            addCriterion("ut_wos <>", value, "utWos");
            return (Criteria) this;
        }

        public Criteria andUtWosGreaterThan(String value) {
            addCriterion("ut_wos >", value, "utWos");
            return (Criteria) this;
        }

        public Criteria andUtWosGreaterThanOrEqualTo(String value) {
            addCriterion("ut_wos >=", value, "utWos");
            return (Criteria) this;
        }

        public Criteria andUtWosLessThan(String value) {
            addCriterion("ut_wos <", value, "utWos");
            return (Criteria) this;
        }

        public Criteria andUtWosLessThanOrEqualTo(String value) {
            addCriterion("ut_wos <=", value, "utWos");
            return (Criteria) this;
        }

        public Criteria andUtWosLike(String value) {
            addCriterion("ut_wos like", value, "utWos");
            return (Criteria) this;
        }

        public Criteria andUtWosNotLike(String value) {
            addCriterion("ut_wos not like", value, "utWos");
            return (Criteria) this;
        }

        public Criteria andUtWosIn(List<String> values) {
            addCriterion("ut_wos in", values, "utWos");
            return (Criteria) this;
        }

        public Criteria andUtWosNotIn(List<String> values) {
            addCriterion("ut_wos not in", values, "utWos");
            return (Criteria) this;
        }

        public Criteria andUtWosBetween(String value1, String value2) {
            addCriterion("ut_wos between", value1, value2, "utWos");
            return (Criteria) this;
        }

        public Criteria andUtWosNotBetween(String value1, String value2) {
            addCriterion("ut_wos not between", value1, value2, "utWos");
            return (Criteria) this;
        }

        public Criteria andBookDoiIsNull() {
            addCriterion("book_doi is null");
            return (Criteria) this;
        }

        public Criteria andBookDoiIsNotNull() {
            addCriterion("book_doi is not null");
            return (Criteria) this;
        }

        public Criteria andBookDoiEqualTo(String value) {
            addCriterion("book_doi =", value, "bookDoi");
            return (Criteria) this;
        }

        public Criteria andBookDoiNotEqualTo(String value) {
            addCriterion("book_doi <>", value, "bookDoi");
            return (Criteria) this;
        }

        public Criteria andBookDoiGreaterThan(String value) {
            addCriterion("book_doi >", value, "bookDoi");
            return (Criteria) this;
        }

        public Criteria andBookDoiGreaterThanOrEqualTo(String value) {
            addCriterion("book_doi >=", value, "bookDoi");
            return (Criteria) this;
        }

        public Criteria andBookDoiLessThan(String value) {
            addCriterion("book_doi <", value, "bookDoi");
            return (Criteria) this;
        }

        public Criteria andBookDoiLessThanOrEqualTo(String value) {
            addCriterion("book_doi <=", value, "bookDoi");
            return (Criteria) this;
        }

        public Criteria andBookDoiLike(String value) {
            addCriterion("book_doi like", value, "bookDoi");
            return (Criteria) this;
        }

        public Criteria andBookDoiNotLike(String value) {
            addCriterion("book_doi not like", value, "bookDoi");
            return (Criteria) this;
        }

        public Criteria andBookDoiIn(List<String> values) {
            addCriterion("book_doi in", values, "bookDoi");
            return (Criteria) this;
        }

        public Criteria andBookDoiNotIn(List<String> values) {
            addCriterion("book_doi not in", values, "bookDoi");
            return (Criteria) this;
        }

        public Criteria andBookDoiBetween(String value1, String value2) {
            addCriterion("book_doi between", value1, value2, "bookDoi");
            return (Criteria) this;
        }

        public Criteria andBookDoiNotBetween(String value1, String value2) {
            addCriterion("book_doi not between", value1, value2, "bookDoi");
            return (Criteria) this;
        }

        public Criteria andDoiIsNull() {
            addCriterion("doi is null");
            return (Criteria) this;
        }

        public Criteria andDoiIsNotNull() {
            addCriterion("doi is not null");
            return (Criteria) this;
        }

        public Criteria andDoiEqualTo(String value) {
            addCriterion("doi =", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotEqualTo(String value) {
            addCriterion("doi <>", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiGreaterThan(String value) {
            addCriterion("doi >", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiGreaterThanOrEqualTo(String value) {
            addCriterion("doi >=", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiLessThan(String value) {
            addCriterion("doi <", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiLessThanOrEqualTo(String value) {
            addCriterion("doi <=", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiLike(String value) {
            addCriterion("doi like", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotLike(String value) {
            addCriterion("doi not like", value, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiIn(List<String> values) {
            addCriterion("doi in", values, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotIn(List<String> values) {
            addCriterion("doi not in", values, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiBetween(String value1, String value2) {
            addCriterion("doi between", value1, value2, "doi");
            return (Criteria) this;
        }

        public Criteria andDoiNotBetween(String value1, String value2) {
            addCriterion("doi not between", value1, value2, "doi");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(String value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(String value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(String value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(String value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(String value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLike(String value) {
            addCriterion("volume like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotLike(String value) {
            addCriterion("volume not like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<String> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<String> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(String value1, String value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(String value1, String value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andIssueIsNull() {
            addCriterion("issue is null");
            return (Criteria) this;
        }

        public Criteria andIssueIsNotNull() {
            addCriterion("issue is not null");
            return (Criteria) this;
        }

        public Criteria andIssueEqualTo(String value) {
            addCriterion("issue =", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotEqualTo(String value) {
            addCriterion("issue <>", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThan(String value) {
            addCriterion("issue >", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThanOrEqualTo(String value) {
            addCriterion("issue >=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThan(String value) {
            addCriterion("issue <", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThanOrEqualTo(String value) {
            addCriterion("issue <=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLike(String value) {
            addCriterion("issue like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotLike(String value) {
            addCriterion("issue not like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueIn(List<String> values) {
            addCriterion("issue in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotIn(List<String> values) {
            addCriterion("issue not in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueBetween(String value1, String value2) {
            addCriterion("issue between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotBetween(String value1, String value2) {
            addCriterion("issue not between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andPageRangeIsNull() {
            addCriterion("page_range is null");
            return (Criteria) this;
        }

        public Criteria andPageRangeIsNotNull() {
            addCriterion("page_range is not null");
            return (Criteria) this;
        }

        public Criteria andPageRangeEqualTo(String value) {
            addCriterion("page_range =", value, "pageRange");
            return (Criteria) this;
        }

        public Criteria andPageRangeNotEqualTo(String value) {
            addCriterion("page_range <>", value, "pageRange");
            return (Criteria) this;
        }

        public Criteria andPageRangeGreaterThan(String value) {
            addCriterion("page_range >", value, "pageRange");
            return (Criteria) this;
        }

        public Criteria andPageRangeGreaterThanOrEqualTo(String value) {
            addCriterion("page_range >=", value, "pageRange");
            return (Criteria) this;
        }

        public Criteria andPageRangeLessThan(String value) {
            addCriterion("page_range <", value, "pageRange");
            return (Criteria) this;
        }

        public Criteria andPageRangeLessThanOrEqualTo(String value) {
            addCriterion("page_range <=", value, "pageRange");
            return (Criteria) this;
        }

        public Criteria andPageRangeLike(String value) {
            addCriterion("page_range like", value, "pageRange");
            return (Criteria) this;
        }

        public Criteria andPageRangeNotLike(String value) {
            addCriterion("page_range not like", value, "pageRange");
            return (Criteria) this;
        }

        public Criteria andPageRangeIn(List<String> values) {
            addCriterion("page_range in", values, "pageRange");
            return (Criteria) this;
        }

        public Criteria andPageRangeNotIn(List<String> values) {
            addCriterion("page_range not in", values, "pageRange");
            return (Criteria) this;
        }

        public Criteria andPageRangeBetween(String value1, String value2) {
            addCriterion("page_range between", value1, value2, "pageRange");
            return (Criteria) this;
        }

        public Criteria andPageRangeNotBetween(String value1, String value2) {
            addCriterion("page_range not between", value1, value2, "pageRange");
            return (Criteria) this;
        }

        public Criteria andPageNumIsNull() {
            addCriterion("page_num is null");
            return (Criteria) this;
        }

        public Criteria andPageNumIsNotNull() {
            addCriterion("page_num is not null");
            return (Criteria) this;
        }

        public Criteria andPageNumEqualTo(Integer value) {
            addCriterion("page_num =", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumNotEqualTo(Integer value) {
            addCriterion("page_num <>", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumGreaterThan(Integer value) {
            addCriterion("page_num >", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_num >=", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumLessThan(Integer value) {
            addCriterion("page_num <", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumLessThanOrEqualTo(Integer value) {
            addCriterion("page_num <=", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumIn(List<Integer> values) {
            addCriterion("page_num in", values, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumNotIn(List<Integer> values) {
            addCriterion("page_num not in", values, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumBetween(Integer value1, Integer value2) {
            addCriterion("page_num between", value1, value2, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumNotBetween(Integer value1, Integer value2) {
            addCriterion("page_num not between", value1, value2, "pageNum");
            return (Criteria) this;
        }

        public Criteria andCitesInwosIsNull() {
            addCriterion("cites_inwos is null");
            return (Criteria) this;
        }

        public Criteria andCitesInwosIsNotNull() {
            addCriterion("cites_inwos is not null");
            return (Criteria) this;
        }

        public Criteria andCitesInwosEqualTo(Integer value) {
            addCriterion("cites_inwos =", value, "citesInwos");
            return (Criteria) this;
        }

        public Criteria andCitesInwosNotEqualTo(Integer value) {
            addCriterion("cites_inwos <>", value, "citesInwos");
            return (Criteria) this;
        }

        public Criteria andCitesInwosGreaterThan(Integer value) {
            addCriterion("cites_inwos >", value, "citesInwos");
            return (Criteria) this;
        }

        public Criteria andCitesInwosGreaterThanOrEqualTo(Integer value) {
            addCriterion("cites_inwos >=", value, "citesInwos");
            return (Criteria) this;
        }

        public Criteria andCitesInwosLessThan(Integer value) {
            addCriterion("cites_inwos <", value, "citesInwos");
            return (Criteria) this;
        }

        public Criteria andCitesInwosLessThanOrEqualTo(Integer value) {
            addCriterion("cites_inwos <=", value, "citesInwos");
            return (Criteria) this;
        }

        public Criteria andCitesInwosIn(List<Integer> values) {
            addCriterion("cites_inwos in", values, "citesInwos");
            return (Criteria) this;
        }

        public Criteria andCitesInwosNotIn(List<Integer> values) {
            addCriterion("cites_inwos not in", values, "citesInwos");
            return (Criteria) this;
        }

        public Criteria andCitesInwosBetween(Integer value1, Integer value2) {
            addCriterion("cites_inwos between", value1, value2, "citesInwos");
            return (Criteria) this;
        }

        public Criteria andCitesInwosNotBetween(Integer value1, Integer value2) {
            addCriterion("cites_inwos not between", value1, value2, "citesInwos");
            return (Criteria) this;
        }

        public Criteria andCitesIsNull() {
            addCriterion("cites is null");
            return (Criteria) this;
        }

        public Criteria andCitesIsNotNull() {
            addCriterion("cites is not null");
            return (Criteria) this;
        }

        public Criteria andCitesEqualTo(Integer value) {
            addCriterion("cites =", value, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesNotEqualTo(Integer value) {
            addCriterion("cites <>", value, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesGreaterThan(Integer value) {
            addCriterion("cites >", value, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesGreaterThanOrEqualTo(Integer value) {
            addCriterion("cites >=", value, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesLessThan(Integer value) {
            addCriterion("cites <", value, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesLessThanOrEqualTo(Integer value) {
            addCriterion("cites <=", value, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesIn(List<Integer> values) {
            addCriterion("cites in", values, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesNotIn(List<Integer> values) {
            addCriterion("cites not in", values, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesBetween(Integer value1, Integer value2) {
            addCriterion("cites between", value1, value2, "cites");
            return (Criteria) this;
        }

        public Criteria andCitesNotBetween(Integer value1, Integer value2) {
            addCriterion("cites not between", value1, value2, "cites");
            return (Criteria) this;
        }

        public Criteria andAbstractInfoIsNull() {
            addCriterion("abstract_info is null");
            return (Criteria) this;
        }

        public Criteria andAbstractInfoIsNotNull() {
            addCriterion("abstract_info is not null");
            return (Criteria) this;
        }

        public Criteria andAbstractInfoEqualTo(String value) {
            addCriterion("abstract_info =", value, "abstractInfo");
            return (Criteria) this;
        }

        public Criteria andAbstractInfoNotEqualTo(String value) {
            addCriterion("abstract_info <>", value, "abstractInfo");
            return (Criteria) this;
        }

        public Criteria andAbstractInfoGreaterThan(String value) {
            addCriterion("abstract_info >", value, "abstractInfo");
            return (Criteria) this;
        }

        public Criteria andAbstractInfoGreaterThanOrEqualTo(String value) {
            addCriterion("abstract_info >=", value, "abstractInfo");
            return (Criteria) this;
        }

        public Criteria andAbstractInfoLessThan(String value) {
            addCriterion("abstract_info <", value, "abstractInfo");
            return (Criteria) this;
        }

        public Criteria andAbstractInfoLessThanOrEqualTo(String value) {
            addCriterion("abstract_info <=", value, "abstractInfo");
            return (Criteria) this;
        }

        public Criteria andAbstractInfoLike(String value) {
            addCriterion("abstract_info like", value, "abstractInfo");
            return (Criteria) this;
        }

        public Criteria andAbstractInfoNotLike(String value) {
            addCriterion("abstract_info not like", value, "abstractInfo");
            return (Criteria) this;
        }

        public Criteria andAbstractInfoIn(List<String> values) {
            addCriterion("abstract_info in", values, "abstractInfo");
            return (Criteria) this;
        }

        public Criteria andAbstractInfoNotIn(List<String> values) {
            addCriterion("abstract_info not in", values, "abstractInfo");
            return (Criteria) this;
        }

        public Criteria andAbstractInfoBetween(String value1, String value2) {
            addCriterion("abstract_info between", value1, value2, "abstractInfo");
            return (Criteria) this;
        }

        public Criteria andAbstractInfoNotBetween(String value1, String value2) {
            addCriterion("abstract_info not between", value1, value2, "abstractInfo");
            return (Criteria) this;
        }

        public Criteria andBiyinIdIsNull() {
            addCriterion("biyin_id is null");
            return (Criteria) this;
        }

        public Criteria andBiyinIdIsNotNull() {
            addCriterion("biyin_id is not null");
            return (Criteria) this;
        }

        public Criteria andBiyinIdEqualTo(String value) {
            addCriterion("biyin_id =", value, "biyinId");
            return (Criteria) this;
        }

        public Criteria andBiyinIdNotEqualTo(String value) {
            addCriterion("biyin_id <>", value, "biyinId");
            return (Criteria) this;
        }

        public Criteria andBiyinIdGreaterThan(String value) {
            addCriterion("biyin_id >", value, "biyinId");
            return (Criteria) this;
        }

        public Criteria andBiyinIdGreaterThanOrEqualTo(String value) {
            addCriterion("biyin_id >=", value, "biyinId");
            return (Criteria) this;
        }

        public Criteria andBiyinIdLessThan(String value) {
            addCriterion("biyin_id <", value, "biyinId");
            return (Criteria) this;
        }

        public Criteria andBiyinIdLessThanOrEqualTo(String value) {
            addCriterion("biyin_id <=", value, "biyinId");
            return (Criteria) this;
        }

        public Criteria andBiyinIdLike(String value) {
            addCriterion("biyin_id like", value, "biyinId");
            return (Criteria) this;
        }

        public Criteria andBiyinIdNotLike(String value) {
            addCriterion("biyin_id not like", value, "biyinId");
            return (Criteria) this;
        }

        public Criteria andBiyinIdIn(List<String> values) {
            addCriterion("biyin_id in", values, "biyinId");
            return (Criteria) this;
        }

        public Criteria andBiyinIdNotIn(List<String> values) {
            addCriterion("biyin_id not in", values, "biyinId");
            return (Criteria) this;
        }

        public Criteria andBiyinIdBetween(String value1, String value2) {
            addCriterion("biyin_id between", value1, value2, "biyinId");
            return (Criteria) this;
        }

        public Criteria andBiyinIdNotBetween(String value1, String value2) {
            addCriterion("biyin_id not between", value1, value2, "biyinId");
            return (Criteria) this;
        }

        public Criteria andSpiderIdIsNull() {
            addCriterion("spider_id is null");
            return (Criteria) this;
        }

        public Criteria andSpiderIdIsNotNull() {
            addCriterion("spider_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpiderIdEqualTo(String value) {
            addCriterion("spider_id =", value, "spiderId");
            return (Criteria) this;
        }

        public Criteria andSpiderIdNotEqualTo(String value) {
            addCriterion("spider_id <>", value, "spiderId");
            return (Criteria) this;
        }

        public Criteria andSpiderIdGreaterThan(String value) {
            addCriterion("spider_id >", value, "spiderId");
            return (Criteria) this;
        }

        public Criteria andSpiderIdGreaterThanOrEqualTo(String value) {
            addCriterion("spider_id >=", value, "spiderId");
            return (Criteria) this;
        }

        public Criteria andSpiderIdLessThan(String value) {
            addCriterion("spider_id <", value, "spiderId");
            return (Criteria) this;
        }

        public Criteria andSpiderIdLessThanOrEqualTo(String value) {
            addCriterion("spider_id <=", value, "spiderId");
            return (Criteria) this;
        }

        public Criteria andSpiderIdLike(String value) {
            addCriterion("spider_id like", value, "spiderId");
            return (Criteria) this;
        }

        public Criteria andSpiderIdNotLike(String value) {
            addCriterion("spider_id not like", value, "spiderId");
            return (Criteria) this;
        }

        public Criteria andSpiderIdIn(List<String> values) {
            addCriterion("spider_id in", values, "spiderId");
            return (Criteria) this;
        }

        public Criteria andSpiderIdNotIn(List<String> values) {
            addCriterion("spider_id not in", values, "spiderId");
            return (Criteria) this;
        }

        public Criteria andSpiderIdBetween(String value1, String value2) {
            addCriterion("spider_id between", value1, value2, "spiderId");
            return (Criteria) this;
        }

        public Criteria andSpiderIdNotBetween(String value1, String value2) {
            addCriterion("spider_id not between", value1, value2, "spiderId");
            return (Criteria) this;
        }

        public Criteria andFundIsNull() {
            addCriterion("fund is null");
            return (Criteria) this;
        }

        public Criteria andFundIsNotNull() {
            addCriterion("fund is not null");
            return (Criteria) this;
        }

        public Criteria andFundEqualTo(String value) {
            addCriterion("fund =", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundNotEqualTo(String value) {
            addCriterion("fund <>", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundGreaterThan(String value) {
            addCriterion("fund >", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundGreaterThanOrEqualTo(String value) {
            addCriterion("fund >=", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundLessThan(String value) {
            addCriterion("fund <", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundLessThanOrEqualTo(String value) {
            addCriterion("fund <=", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundLike(String value) {
            addCriterion("fund like", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundNotLike(String value) {
            addCriterion("fund not like", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundIn(List<String> values) {
            addCriterion("fund in", values, "fund");
            return (Criteria) this;
        }

        public Criteria andFundNotIn(List<String> values) {
            addCriterion("fund not in", values, "fund");
            return (Criteria) this;
        }

        public Criteria andFundBetween(String value1, String value2) {
            addCriterion("fund between", value1, value2, "fund");
            return (Criteria) this;
        }

        public Criteria andFundNotBetween(String value1, String value2) {
            addCriterion("fund not between", value1, value2, "fund");
            return (Criteria) this;
        }

        public Criteria andFundTextIsNull() {
            addCriterion("fund_text is null");
            return (Criteria) this;
        }

        public Criteria andFundTextIsNotNull() {
            addCriterion("fund_text is not null");
            return (Criteria) this;
        }

        public Criteria andFundTextEqualTo(String value) {
            addCriterion("fund_text =", value, "fundText");
            return (Criteria) this;
        }

        public Criteria andFundTextNotEqualTo(String value) {
            addCriterion("fund_text <>", value, "fundText");
            return (Criteria) this;
        }

        public Criteria andFundTextGreaterThan(String value) {
            addCriterion("fund_text >", value, "fundText");
            return (Criteria) this;
        }

        public Criteria andFundTextGreaterThanOrEqualTo(String value) {
            addCriterion("fund_text >=", value, "fundText");
            return (Criteria) this;
        }

        public Criteria andFundTextLessThan(String value) {
            addCriterion("fund_text <", value, "fundText");
            return (Criteria) this;
        }

        public Criteria andFundTextLessThanOrEqualTo(String value) {
            addCriterion("fund_text <=", value, "fundText");
            return (Criteria) this;
        }

        public Criteria andFundTextLike(String value) {
            addCriterion("fund_text like", value, "fundText");
            return (Criteria) this;
        }

        public Criteria andFundTextNotLike(String value) {
            addCriterion("fund_text not like", value, "fundText");
            return (Criteria) this;
        }

        public Criteria andFundTextIn(List<String> values) {
            addCriterion("fund_text in", values, "fundText");
            return (Criteria) this;
        }

        public Criteria andFundTextNotIn(List<String> values) {
            addCriterion("fund_text not in", values, "fundText");
            return (Criteria) this;
        }

        public Criteria andFundTextBetween(String value1, String value2) {
            addCriterion("fund_text between", value1, value2, "fundText");
            return (Criteria) this;
        }

        public Criteria andFundTextNotBetween(String value1, String value2) {
            addCriterion("fund_text not between", value1, value2, "fundText");
            return (Criteria) this;
        }

        public Criteria andReferencesNumIsNull() {
            addCriterion("references_num is null");
            return (Criteria) this;
        }

        public Criteria andReferencesNumIsNotNull() {
            addCriterion("references_num is not null");
            return (Criteria) this;
        }

        public Criteria andReferencesNumEqualTo(Integer value) {
            addCriterion("references_num =", value, "referencesNum");
            return (Criteria) this;
        }

        public Criteria andReferencesNumNotEqualTo(Integer value) {
            addCriterion("references_num <>", value, "referencesNum");
            return (Criteria) this;
        }

        public Criteria andReferencesNumGreaterThan(Integer value) {
            addCriterion("references_num >", value, "referencesNum");
            return (Criteria) this;
        }

        public Criteria andReferencesNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("references_num >=", value, "referencesNum");
            return (Criteria) this;
        }

        public Criteria andReferencesNumLessThan(Integer value) {
            addCriterion("references_num <", value, "referencesNum");
            return (Criteria) this;
        }

        public Criteria andReferencesNumLessThanOrEqualTo(Integer value) {
            addCriterion("references_num <=", value, "referencesNum");
            return (Criteria) this;
        }

        public Criteria andReferencesNumIn(List<Integer> values) {
            addCriterion("references_num in", values, "referencesNum");
            return (Criteria) this;
        }

        public Criteria andReferencesNumNotIn(List<Integer> values) {
            addCriterion("references_num not in", values, "referencesNum");
            return (Criteria) this;
        }

        public Criteria andReferencesNumBetween(Integer value1, Integer value2) {
            addCriterion("references_num between", value1, value2, "referencesNum");
            return (Criteria) this;
        }

        public Criteria andReferencesNumNotBetween(Integer value1, Integer value2) {
            addCriterion("references_num not between", value1, value2, "referencesNum");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNull() {
            addCriterion("publish_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("publish_date >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(Date value) {
            addCriterionForJDBCDate("publish_date <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<Date> values) {
            addCriterionForJDBCDate("publish_date in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("publish_date not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publish_date between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publish_date not between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublisherCityIsNull() {
            addCriterion("publisher_city is null");
            return (Criteria) this;
        }

        public Criteria andPublisherCityIsNotNull() {
            addCriterion("publisher_city is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherCityEqualTo(String value) {
            addCriterion("publisher_city =", value, "publisherCity");
            return (Criteria) this;
        }

        public Criteria andPublisherCityNotEqualTo(String value) {
            addCriterion("publisher_city <>", value, "publisherCity");
            return (Criteria) this;
        }

        public Criteria andPublisherCityGreaterThan(String value) {
            addCriterion("publisher_city >", value, "publisherCity");
            return (Criteria) this;
        }

        public Criteria andPublisherCityGreaterThanOrEqualTo(String value) {
            addCriterion("publisher_city >=", value, "publisherCity");
            return (Criteria) this;
        }

        public Criteria andPublisherCityLessThan(String value) {
            addCriterion("publisher_city <", value, "publisherCity");
            return (Criteria) this;
        }

        public Criteria andPublisherCityLessThanOrEqualTo(String value) {
            addCriterion("publisher_city <=", value, "publisherCity");
            return (Criteria) this;
        }

        public Criteria andPublisherCityLike(String value) {
            addCriterion("publisher_city like", value, "publisherCity");
            return (Criteria) this;
        }

        public Criteria andPublisherCityNotLike(String value) {
            addCriterion("publisher_city not like", value, "publisherCity");
            return (Criteria) this;
        }

        public Criteria andPublisherCityIn(List<String> values) {
            addCriterion("publisher_city in", values, "publisherCity");
            return (Criteria) this;
        }

        public Criteria andPublisherCityNotIn(List<String> values) {
            addCriterion("publisher_city not in", values, "publisherCity");
            return (Criteria) this;
        }

        public Criteria andPublisherCityBetween(String value1, String value2) {
            addCriterion("publisher_city between", value1, value2, "publisherCity");
            return (Criteria) this;
        }

        public Criteria andPublisherCityNotBetween(String value1, String value2) {
            addCriterion("publisher_city not between", value1, value2, "publisherCity");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressIsNull() {
            addCriterion("publisher_address is null");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressIsNotNull() {
            addCriterion("publisher_address is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressEqualTo(String value) {
            addCriterion("publisher_address =", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressNotEqualTo(String value) {
            addCriterion("publisher_address <>", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressGreaterThan(String value) {
            addCriterion("publisher_address >", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressGreaterThanOrEqualTo(String value) {
            addCriterion("publisher_address >=", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressLessThan(String value) {
            addCriterion("publisher_address <", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressLessThanOrEqualTo(String value) {
            addCriterion("publisher_address <=", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressLike(String value) {
            addCriterion("publisher_address like", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressNotLike(String value) {
            addCriterion("publisher_address not like", value, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressIn(List<String> values) {
            addCriterion("publisher_address in", values, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressNotIn(List<String> values) {
            addCriterion("publisher_address not in", values, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressBetween(String value1, String value2) {
            addCriterion("publisher_address between", value1, value2, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andPublisherAddressNotBetween(String value1, String value2) {
            addCriterion("publisher_address not between", value1, value2, "publisherAddress");
            return (Criteria) this;
        }

        public Criteria andIssnueSpeIsNull() {
            addCriterion("issnue_spe is null");
            return (Criteria) this;
        }

        public Criteria andIssnueSpeIsNotNull() {
            addCriterion("issnue_spe is not null");
            return (Criteria) this;
        }

        public Criteria andIssnueSpeEqualTo(String value) {
            addCriterion("issnue_spe =", value, "issnueSpe");
            return (Criteria) this;
        }

        public Criteria andIssnueSpeNotEqualTo(String value) {
            addCriterion("issnue_spe <>", value, "issnueSpe");
            return (Criteria) this;
        }

        public Criteria andIssnueSpeGreaterThan(String value) {
            addCriterion("issnue_spe >", value, "issnueSpe");
            return (Criteria) this;
        }

        public Criteria andIssnueSpeGreaterThanOrEqualTo(String value) {
            addCriterion("issnue_spe >=", value, "issnueSpe");
            return (Criteria) this;
        }

        public Criteria andIssnueSpeLessThan(String value) {
            addCriterion("issnue_spe <", value, "issnueSpe");
            return (Criteria) this;
        }

        public Criteria andIssnueSpeLessThanOrEqualTo(String value) {
            addCriterion("issnue_spe <=", value, "issnueSpe");
            return (Criteria) this;
        }

        public Criteria andIssnueSpeLike(String value) {
            addCriterion("issnue_spe like", value, "issnueSpe");
            return (Criteria) this;
        }

        public Criteria andIssnueSpeNotLike(String value) {
            addCriterion("issnue_spe not like", value, "issnueSpe");
            return (Criteria) this;
        }

        public Criteria andIssnueSpeIn(List<String> values) {
            addCriterion("issnue_spe in", values, "issnueSpe");
            return (Criteria) this;
        }

        public Criteria andIssnueSpeNotIn(List<String> values) {
            addCriterion("issnue_spe not in", values, "issnueSpe");
            return (Criteria) this;
        }

        public Criteria andIssnueSpeBetween(String value1, String value2) {
            addCriterion("issnue_spe between", value1, value2, "issnueSpe");
            return (Criteria) this;
        }

        public Criteria andIssnueSpeNotBetween(String value1, String value2) {
            addCriterion("issnue_spe not between", value1, value2, "issnueSpe");
            return (Criteria) this;
        }

        public Criteria andSeriesTitleIsNull() {
            addCriterion("series_title is null");
            return (Criteria) this;
        }

        public Criteria andSeriesTitleIsNotNull() {
            addCriterion("series_title is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesTitleEqualTo(String value) {
            addCriterion("series_title =", value, "seriesTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesTitleNotEqualTo(String value) {
            addCriterion("series_title <>", value, "seriesTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesTitleGreaterThan(String value) {
            addCriterion("series_title >", value, "seriesTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesTitleGreaterThanOrEqualTo(String value) {
            addCriterion("series_title >=", value, "seriesTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesTitleLessThan(String value) {
            addCriterion("series_title <", value, "seriesTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesTitleLessThanOrEqualTo(String value) {
            addCriterion("series_title <=", value, "seriesTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesTitleLike(String value) {
            addCriterion("series_title like", value, "seriesTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesTitleNotLike(String value) {
            addCriterion("series_title not like", value, "seriesTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesTitleIn(List<String> values) {
            addCriterion("series_title in", values, "seriesTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesTitleNotIn(List<String> values) {
            addCriterion("series_title not in", values, "seriesTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesTitleBetween(String value1, String value2) {
            addCriterion("series_title between", value1, value2, "seriesTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesTitleNotBetween(String value1, String value2) {
            addCriterion("series_title not between", value1, value2, "seriesTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesSubTitleIsNull() {
            addCriterion("series_sub_title is null");
            return (Criteria) this;
        }

        public Criteria andSeriesSubTitleIsNotNull() {
            addCriterion("series_sub_title is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesSubTitleEqualTo(String value) {
            addCriterion("series_sub_title =", value, "seriesSubTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesSubTitleNotEqualTo(String value) {
            addCriterion("series_sub_title <>", value, "seriesSubTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesSubTitleGreaterThan(String value) {
            addCriterion("series_sub_title >", value, "seriesSubTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesSubTitleGreaterThanOrEqualTo(String value) {
            addCriterion("series_sub_title >=", value, "seriesSubTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesSubTitleLessThan(String value) {
            addCriterion("series_sub_title <", value, "seriesSubTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesSubTitleLessThanOrEqualTo(String value) {
            addCriterion("series_sub_title <=", value, "seriesSubTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesSubTitleLike(String value) {
            addCriterion("series_sub_title like", value, "seriesSubTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesSubTitleNotLike(String value) {
            addCriterion("series_sub_title not like", value, "seriesSubTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesSubTitleIn(List<String> values) {
            addCriterion("series_sub_title in", values, "seriesSubTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesSubTitleNotIn(List<String> values) {
            addCriterion("series_sub_title not in", values, "seriesSubTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesSubTitleBetween(String value1, String value2) {
            addCriterion("series_sub_title between", value1, value2, "seriesSubTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesSubTitleNotBetween(String value1, String value2) {
            addCriterion("series_sub_title not between", value1, value2, "seriesSubTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleIsNull() {
            addCriterion("conference_title is null");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleIsNotNull() {
            addCriterion("conference_title is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleEqualTo(String value) {
            addCriterion("conference_title =", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleNotEqualTo(String value) {
            addCriterion("conference_title <>", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleGreaterThan(String value) {
            addCriterion("conference_title >", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("conference_title >=", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleLessThan(String value) {
            addCriterion("conference_title <", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleLessThanOrEqualTo(String value) {
            addCriterion("conference_title <=", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleLike(String value) {
            addCriterion("conference_title like", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleNotLike(String value) {
            addCriterion("conference_title not like", value, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleIn(List<String> values) {
            addCriterion("conference_title in", values, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleNotIn(List<String> values) {
            addCriterion("conference_title not in", values, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleBetween(String value1, String value2) {
            addCriterion("conference_title between", value1, value2, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceTitleNotBetween(String value1, String value2) {
            addCriterion("conference_title not between", value1, value2, "conferenceTitle");
            return (Criteria) this;
        }

        public Criteria andConferenceAbIsNull() {
            addCriterion("conference_ab is null");
            return (Criteria) this;
        }

        public Criteria andConferenceAbIsNotNull() {
            addCriterion("conference_ab is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceAbEqualTo(String value) {
            addCriterion("conference_ab =", value, "conferenceAb");
            return (Criteria) this;
        }

        public Criteria andConferenceAbNotEqualTo(String value) {
            addCriterion("conference_ab <>", value, "conferenceAb");
            return (Criteria) this;
        }

        public Criteria andConferenceAbGreaterThan(String value) {
            addCriterion("conference_ab >", value, "conferenceAb");
            return (Criteria) this;
        }

        public Criteria andConferenceAbGreaterThanOrEqualTo(String value) {
            addCriterion("conference_ab >=", value, "conferenceAb");
            return (Criteria) this;
        }

        public Criteria andConferenceAbLessThan(String value) {
            addCriterion("conference_ab <", value, "conferenceAb");
            return (Criteria) this;
        }

        public Criteria andConferenceAbLessThanOrEqualTo(String value) {
            addCriterion("conference_ab <=", value, "conferenceAb");
            return (Criteria) this;
        }

        public Criteria andConferenceAbLike(String value) {
            addCriterion("conference_ab like", value, "conferenceAb");
            return (Criteria) this;
        }

        public Criteria andConferenceAbNotLike(String value) {
            addCriterion("conference_ab not like", value, "conferenceAb");
            return (Criteria) this;
        }

        public Criteria andConferenceAbIn(List<String> values) {
            addCriterion("conference_ab in", values, "conferenceAb");
            return (Criteria) this;
        }

        public Criteria andConferenceAbNotIn(List<String> values) {
            addCriterion("conference_ab not in", values, "conferenceAb");
            return (Criteria) this;
        }

        public Criteria andConferenceAbBetween(String value1, String value2) {
            addCriterion("conference_ab between", value1, value2, "conferenceAb");
            return (Criteria) this;
        }

        public Criteria andConferenceAbNotBetween(String value1, String value2) {
            addCriterion("conference_ab not between", value1, value2, "conferenceAb");
            return (Criteria) this;
        }

        public Criteria andConferenceAddrIsNull() {
            addCriterion("conference_addr is null");
            return (Criteria) this;
        }

        public Criteria andConferenceAddrIsNotNull() {
            addCriterion("conference_addr is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceAddrEqualTo(String value) {
            addCriterion("conference_addr =", value, "conferenceAddr");
            return (Criteria) this;
        }

        public Criteria andConferenceAddrNotEqualTo(String value) {
            addCriterion("conference_addr <>", value, "conferenceAddr");
            return (Criteria) this;
        }

        public Criteria andConferenceAddrGreaterThan(String value) {
            addCriterion("conference_addr >", value, "conferenceAddr");
            return (Criteria) this;
        }

        public Criteria andConferenceAddrGreaterThanOrEqualTo(String value) {
            addCriterion("conference_addr >=", value, "conferenceAddr");
            return (Criteria) this;
        }

        public Criteria andConferenceAddrLessThan(String value) {
            addCriterion("conference_addr <", value, "conferenceAddr");
            return (Criteria) this;
        }

        public Criteria andConferenceAddrLessThanOrEqualTo(String value) {
            addCriterion("conference_addr <=", value, "conferenceAddr");
            return (Criteria) this;
        }

        public Criteria andConferenceAddrLike(String value) {
            addCriterion("conference_addr like", value, "conferenceAddr");
            return (Criteria) this;
        }

        public Criteria andConferenceAddrNotLike(String value) {
            addCriterion("conference_addr not like", value, "conferenceAddr");
            return (Criteria) this;
        }

        public Criteria andConferenceAddrIn(List<String> values) {
            addCriterion("conference_addr in", values, "conferenceAddr");
            return (Criteria) this;
        }

        public Criteria andConferenceAddrNotIn(List<String> values) {
            addCriterion("conference_addr not in", values, "conferenceAddr");
            return (Criteria) this;
        }

        public Criteria andConferenceAddrBetween(String value1, String value2) {
            addCriterion("conference_addr between", value1, value2, "conferenceAddr");
            return (Criteria) this;
        }

        public Criteria andConferenceAddrNotBetween(String value1, String value2) {
            addCriterion("conference_addr not between", value1, value2, "conferenceAddr");
            return (Criteria) this;
        }

        public Criteria andConferenceDateIsNull() {
            addCriterion("conference_date is null");
            return (Criteria) this;
        }

        public Criteria andConferenceDateIsNotNull() {
            addCriterion("conference_date is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceDateEqualTo(Date value) {
            addCriterionForJDBCDate("conference_date =", value, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("conference_date <>", value, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateGreaterThan(Date value) {
            addCriterionForJDBCDate("conference_date >", value, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("conference_date >=", value, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateLessThan(Date value) {
            addCriterionForJDBCDate("conference_date <", value, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("conference_date <=", value, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateIn(List<Date> values) {
            addCriterionForJDBCDate("conference_date in", values, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("conference_date not in", values, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("conference_date between", value1, value2, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("conference_date not between", value1, value2, "conferenceDate");
            return (Criteria) this;
        }

        public Criteria andConferenceSupportIsNull() {
            addCriterion("conference_support is null");
            return (Criteria) this;
        }

        public Criteria andConferenceSupportIsNotNull() {
            addCriterion("conference_support is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceSupportEqualTo(String value) {
            addCriterion("conference_support =", value, "conferenceSupport");
            return (Criteria) this;
        }

        public Criteria andConferenceSupportNotEqualTo(String value) {
            addCriterion("conference_support <>", value, "conferenceSupport");
            return (Criteria) this;
        }

        public Criteria andConferenceSupportGreaterThan(String value) {
            addCriterion("conference_support >", value, "conferenceSupport");
            return (Criteria) this;
        }

        public Criteria andConferenceSupportGreaterThanOrEqualTo(String value) {
            addCriterion("conference_support >=", value, "conferenceSupport");
            return (Criteria) this;
        }

        public Criteria andConferenceSupportLessThan(String value) {
            addCriterion("conference_support <", value, "conferenceSupport");
            return (Criteria) this;
        }

        public Criteria andConferenceSupportLessThanOrEqualTo(String value) {
            addCriterion("conference_support <=", value, "conferenceSupport");
            return (Criteria) this;
        }

        public Criteria andConferenceSupportLike(String value) {
            addCriterion("conference_support like", value, "conferenceSupport");
            return (Criteria) this;
        }

        public Criteria andConferenceSupportNotLike(String value) {
            addCriterion("conference_support not like", value, "conferenceSupport");
            return (Criteria) this;
        }

        public Criteria andConferenceSupportIn(List<String> values) {
            addCriterion("conference_support in", values, "conferenceSupport");
            return (Criteria) this;
        }

        public Criteria andConferenceSupportNotIn(List<String> values) {
            addCriterion("conference_support not in", values, "conferenceSupport");
            return (Criteria) this;
        }

        public Criteria andConferenceSupportBetween(String value1, String value2) {
            addCriterion("conference_support between", value1, value2, "conferenceSupport");
            return (Criteria) this;
        }

        public Criteria andConferenceSupportNotBetween(String value1, String value2) {
            addCriterion("conference_support not between", value1, value2, "conferenceSupport");
            return (Criteria) this;
        }

        public Criteria andConferenceSponsorIsNull() {
            addCriterion("conference_sponsor is null");
            return (Criteria) this;
        }

        public Criteria andConferenceSponsorIsNotNull() {
            addCriterion("conference_sponsor is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceSponsorEqualTo(String value) {
            addCriterion("conference_sponsor =", value, "conferenceSponsor");
            return (Criteria) this;
        }

        public Criteria andConferenceSponsorNotEqualTo(String value) {
            addCriterion("conference_sponsor <>", value, "conferenceSponsor");
            return (Criteria) this;
        }

        public Criteria andConferenceSponsorGreaterThan(String value) {
            addCriterion("conference_sponsor >", value, "conferenceSponsor");
            return (Criteria) this;
        }

        public Criteria andConferenceSponsorGreaterThanOrEqualTo(String value) {
            addCriterion("conference_sponsor >=", value, "conferenceSponsor");
            return (Criteria) this;
        }

        public Criteria andConferenceSponsorLessThan(String value) {
            addCriterion("conference_sponsor <", value, "conferenceSponsor");
            return (Criteria) this;
        }

        public Criteria andConferenceSponsorLessThanOrEqualTo(String value) {
            addCriterion("conference_sponsor <=", value, "conferenceSponsor");
            return (Criteria) this;
        }

        public Criteria andConferenceSponsorLike(String value) {
            addCriterion("conference_sponsor like", value, "conferenceSponsor");
            return (Criteria) this;
        }

        public Criteria andConferenceSponsorNotLike(String value) {
            addCriterion("conference_sponsor not like", value, "conferenceSponsor");
            return (Criteria) this;
        }

        public Criteria andConferenceSponsorIn(List<String> values) {
            addCriterion("conference_sponsor in", values, "conferenceSponsor");
            return (Criteria) this;
        }

        public Criteria andConferenceSponsorNotIn(List<String> values) {
            addCriterion("conference_sponsor not in", values, "conferenceSponsor");
            return (Criteria) this;
        }

        public Criteria andConferenceSponsorBetween(String value1, String value2) {
            addCriterion("conference_sponsor between", value1, value2, "conferenceSponsor");
            return (Criteria) this;
        }

        public Criteria andConferenceSponsorNotBetween(String value1, String value2) {
            addCriterion("conference_sponsor not between", value1, value2, "conferenceSponsor");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRaiIsNull() {
            addCriterion("rai is null");
            return (Criteria) this;
        }

        public Criteria andRaiIsNotNull() {
            addCriterion("rai is not null");
            return (Criteria) this;
        }

        public Criteria andRaiEqualTo(String value) {
            addCriterion("rai =", value, "rai");
            return (Criteria) this;
        }

        public Criteria andRaiNotEqualTo(String value) {
            addCriterion("rai <>", value, "rai");
            return (Criteria) this;
        }

        public Criteria andRaiGreaterThan(String value) {
            addCriterion("rai >", value, "rai");
            return (Criteria) this;
        }

        public Criteria andRaiGreaterThanOrEqualTo(String value) {
            addCriterion("rai >=", value, "rai");
            return (Criteria) this;
        }

        public Criteria andRaiLessThan(String value) {
            addCriterion("rai <", value, "rai");
            return (Criteria) this;
        }

        public Criteria andRaiLessThanOrEqualTo(String value) {
            addCriterion("rai <=", value, "rai");
            return (Criteria) this;
        }

        public Criteria andRaiLike(String value) {
            addCriterion("rai like", value, "rai");
            return (Criteria) this;
        }

        public Criteria andRaiNotLike(String value) {
            addCriterion("rai not like", value, "rai");
            return (Criteria) this;
        }

        public Criteria andRaiIn(List<String> values) {
            addCriterion("rai in", values, "rai");
            return (Criteria) this;
        }

        public Criteria andRaiNotIn(List<String> values) {
            addCriterion("rai not in", values, "rai");
            return (Criteria) this;
        }

        public Criteria andRaiBetween(String value1, String value2) {
            addCriterion("rai between", value1, value2, "rai");
            return (Criteria) this;
        }

        public Criteria andRaiNotBetween(String value1, String value2) {
            addCriterion("rai not between", value1, value2, "rai");
            return (Criteria) this;
        }

        public Criteria andOaiIsNull() {
            addCriterion("oai is null");
            return (Criteria) this;
        }

        public Criteria andOaiIsNotNull() {
            addCriterion("oai is not null");
            return (Criteria) this;
        }

        public Criteria andOaiEqualTo(String value) {
            addCriterion("oai =", value, "oai");
            return (Criteria) this;
        }

        public Criteria andOaiNotEqualTo(String value) {
            addCriterion("oai <>", value, "oai");
            return (Criteria) this;
        }

        public Criteria andOaiGreaterThan(String value) {
            addCriterion("oai >", value, "oai");
            return (Criteria) this;
        }

        public Criteria andOaiGreaterThanOrEqualTo(String value) {
            addCriterion("oai >=", value, "oai");
            return (Criteria) this;
        }

        public Criteria andOaiLessThan(String value) {
            addCriterion("oai <", value, "oai");
            return (Criteria) this;
        }

        public Criteria andOaiLessThanOrEqualTo(String value) {
            addCriterion("oai <=", value, "oai");
            return (Criteria) this;
        }

        public Criteria andOaiLike(String value) {
            addCriterion("oai like", value, "oai");
            return (Criteria) this;
        }

        public Criteria andOaiNotLike(String value) {
            addCriterion("oai not like", value, "oai");
            return (Criteria) this;
        }

        public Criteria andOaiIn(List<String> values) {
            addCriterion("oai in", values, "oai");
            return (Criteria) this;
        }

        public Criteria andOaiNotIn(List<String> values) {
            addCriterion("oai not in", values, "oai");
            return (Criteria) this;
        }

        public Criteria andOaiBetween(String value1, String value2) {
            addCriterion("oai between", value1, value2, "oai");
            return (Criteria) this;
        }

        public Criteria andOaiNotBetween(String value1, String value2) {
            addCriterion("oai not between", value1, value2, "oai");
            return (Criteria) this;
        }

        public Criteria andIsoAbbIsNull() {
            addCriterion("iso_abb is null");
            return (Criteria) this;
        }

        public Criteria andIsoAbbIsNotNull() {
            addCriterion("iso_abb is not null");
            return (Criteria) this;
        }

        public Criteria andIsoAbbEqualTo(String value) {
            addCriterion("iso_abb =", value, "isoAbb");
            return (Criteria) this;
        }

        public Criteria andIsoAbbNotEqualTo(String value) {
            addCriterion("iso_abb <>", value, "isoAbb");
            return (Criteria) this;
        }

        public Criteria andIsoAbbGreaterThan(String value) {
            addCriterion("iso_abb >", value, "isoAbb");
            return (Criteria) this;
        }

        public Criteria andIsoAbbGreaterThanOrEqualTo(String value) {
            addCriterion("iso_abb >=", value, "isoAbb");
            return (Criteria) this;
        }

        public Criteria andIsoAbbLessThan(String value) {
            addCriterion("iso_abb <", value, "isoAbb");
            return (Criteria) this;
        }

        public Criteria andIsoAbbLessThanOrEqualTo(String value) {
            addCriterion("iso_abb <=", value, "isoAbb");
            return (Criteria) this;
        }

        public Criteria andIsoAbbLike(String value) {
            addCriterion("iso_abb like", value, "isoAbb");
            return (Criteria) this;
        }

        public Criteria andIsoAbbNotLike(String value) {
            addCriterion("iso_abb not like", value, "isoAbb");
            return (Criteria) this;
        }

        public Criteria andIsoAbbIn(List<String> values) {
            addCriterion("iso_abb in", values, "isoAbb");
            return (Criteria) this;
        }

        public Criteria andIsoAbbNotIn(List<String> values) {
            addCriterion("iso_abb not in", values, "isoAbb");
            return (Criteria) this;
        }

        public Criteria andIsoAbbBetween(String value1, String value2) {
            addCriterion("iso_abb between", value1, value2, "isoAbb");
            return (Criteria) this;
        }

        public Criteria andIsoAbbNotBetween(String value1, String value2) {
            addCriterion("iso_abb not between", value1, value2, "isoAbb");
            return (Criteria) this;
        }

        public Criteria andPNomalIsNull() {
            addCriterion("p_nomal is null");
            return (Criteria) this;
        }

        public Criteria andPNomalIsNotNull() {
            addCriterion("p_nomal is not null");
            return (Criteria) this;
        }

        public Criteria andPNomalEqualTo(String value) {
            addCriterion("p_nomal =", value, "pNomal");
            return (Criteria) this;
        }

        public Criteria andPNomalNotEqualTo(String value) {
            addCriterion("p_nomal <>", value, "pNomal");
            return (Criteria) this;
        }

        public Criteria andPNomalGreaterThan(String value) {
            addCriterion("p_nomal >", value, "pNomal");
            return (Criteria) this;
        }

        public Criteria andPNomalGreaterThanOrEqualTo(String value) {
            addCriterion("p_nomal >=", value, "pNomal");
            return (Criteria) this;
        }

        public Criteria andPNomalLessThan(String value) {
            addCriterion("p_nomal <", value, "pNomal");
            return (Criteria) this;
        }

        public Criteria andPNomalLessThanOrEqualTo(String value) {
            addCriterion("p_nomal <=", value, "pNomal");
            return (Criteria) this;
        }

        public Criteria andPNomalLike(String value) {
            addCriterion("p_nomal like", value, "pNomal");
            return (Criteria) this;
        }

        public Criteria andPNomalNotLike(String value) {
            addCriterion("p_nomal not like", value, "pNomal");
            return (Criteria) this;
        }

        public Criteria andPNomalIn(List<String> values) {
            addCriterion("p_nomal in", values, "pNomal");
            return (Criteria) this;
        }

        public Criteria andPNomalNotIn(List<String> values) {
            addCriterion("p_nomal not in", values, "pNomal");
            return (Criteria) this;
        }

        public Criteria andPNomalBetween(String value1, String value2) {
            addCriterion("p_nomal between", value1, value2, "pNomal");
            return (Criteria) this;
        }

        public Criteria andPNomalNotBetween(String value1, String value2) {
            addCriterion("p_nomal not between", value1, value2, "pNomal");
            return (Criteria) this;
        }

        public Criteria andSuJournalIsNull() {
            addCriterion("su_journal is null");
            return (Criteria) this;
        }

        public Criteria andSuJournalIsNotNull() {
            addCriterion("su_journal is not null");
            return (Criteria) this;
        }

        public Criteria andSuJournalEqualTo(String value) {
            addCriterion("su_journal =", value, "suJournal");
            return (Criteria) this;
        }

        public Criteria andSuJournalNotEqualTo(String value) {
            addCriterion("su_journal <>", value, "suJournal");
            return (Criteria) this;
        }

        public Criteria andSuJournalGreaterThan(String value) {
            addCriterion("su_journal >", value, "suJournal");
            return (Criteria) this;
        }

        public Criteria andSuJournalGreaterThanOrEqualTo(String value) {
            addCriterion("su_journal >=", value, "suJournal");
            return (Criteria) this;
        }

        public Criteria andSuJournalLessThan(String value) {
            addCriterion("su_journal <", value, "suJournal");
            return (Criteria) this;
        }

        public Criteria andSuJournalLessThanOrEqualTo(String value) {
            addCriterion("su_journal <=", value, "suJournal");
            return (Criteria) this;
        }

        public Criteria andSuJournalLike(String value) {
            addCriterion("su_journal like", value, "suJournal");
            return (Criteria) this;
        }

        public Criteria andSuJournalNotLike(String value) {
            addCriterion("su_journal not like", value, "suJournal");
            return (Criteria) this;
        }

        public Criteria andSuJournalIn(List<String> values) {
            addCriterion("su_journal in", values, "suJournal");
            return (Criteria) this;
        }

        public Criteria andSuJournalNotIn(List<String> values) {
            addCriterion("su_journal not in", values, "suJournal");
            return (Criteria) this;
        }

        public Criteria andSuJournalBetween(String value1, String value2) {
            addCriterion("su_journal between", value1, value2, "suJournal");
            return (Criteria) this;
        }

        public Criteria andSuJournalNotBetween(String value1, String value2) {
            addCriterion("su_journal not between", value1, value2, "suJournal");
            return (Criteria) this;
        }

        public Criteria andDocNumIsNull() {
            addCriterion("doc_num is null");
            return (Criteria) this;
        }

        public Criteria andDocNumIsNotNull() {
            addCriterion("doc_num is not null");
            return (Criteria) this;
        }

        public Criteria andDocNumEqualTo(String value) {
            addCriterion("doc_num =", value, "docNum");
            return (Criteria) this;
        }

        public Criteria andDocNumNotEqualTo(String value) {
            addCriterion("doc_num <>", value, "docNum");
            return (Criteria) this;
        }

        public Criteria andDocNumGreaterThan(String value) {
            addCriterion("doc_num >", value, "docNum");
            return (Criteria) this;
        }

        public Criteria andDocNumGreaterThanOrEqualTo(String value) {
            addCriterion("doc_num >=", value, "docNum");
            return (Criteria) this;
        }

        public Criteria andDocNumLessThan(String value) {
            addCriterion("doc_num <", value, "docNum");
            return (Criteria) this;
        }

        public Criteria andDocNumLessThanOrEqualTo(String value) {
            addCriterion("doc_num <=", value, "docNum");
            return (Criteria) this;
        }

        public Criteria andDocNumLike(String value) {
            addCriterion("doc_num like", value, "docNum");
            return (Criteria) this;
        }

        public Criteria andDocNumNotLike(String value) {
            addCriterion("doc_num not like", value, "docNum");
            return (Criteria) this;
        }

        public Criteria andDocNumIn(List<String> values) {
            addCriterion("doc_num in", values, "docNum");
            return (Criteria) this;
        }

        public Criteria andDocNumNotIn(List<String> values) {
            addCriterion("doc_num not in", values, "docNum");
            return (Criteria) this;
        }

        public Criteria andDocNumBetween(String value1, String value2) {
            addCriterion("doc_num between", value1, value2, "docNum");
            return (Criteria) this;
        }

        public Criteria andDocNumNotBetween(String value1, String value2) {
            addCriterion("doc_num not between", value1, value2, "docNum");
            return (Criteria) this;
        }

        public Criteria andChapterNumIsNull() {
            addCriterion("chapter_num is null");
            return (Criteria) this;
        }

        public Criteria andChapterNumIsNotNull() {
            addCriterion("chapter_num is not null");
            return (Criteria) this;
        }

        public Criteria andChapterNumEqualTo(String value) {
            addCriterion("chapter_num =", value, "chapterNum");
            return (Criteria) this;
        }

        public Criteria andChapterNumNotEqualTo(String value) {
            addCriterion("chapter_num <>", value, "chapterNum");
            return (Criteria) this;
        }

        public Criteria andChapterNumGreaterThan(String value) {
            addCriterion("chapter_num >", value, "chapterNum");
            return (Criteria) this;
        }

        public Criteria andChapterNumGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_num >=", value, "chapterNum");
            return (Criteria) this;
        }

        public Criteria andChapterNumLessThan(String value) {
            addCriterion("chapter_num <", value, "chapterNum");
            return (Criteria) this;
        }

        public Criteria andChapterNumLessThanOrEqualTo(String value) {
            addCriterion("chapter_num <=", value, "chapterNum");
            return (Criteria) this;
        }

        public Criteria andChapterNumLike(String value) {
            addCriterion("chapter_num like", value, "chapterNum");
            return (Criteria) this;
        }

        public Criteria andChapterNumNotLike(String value) {
            addCriterion("chapter_num not like", value, "chapterNum");
            return (Criteria) this;
        }

        public Criteria andChapterNumIn(List<String> values) {
            addCriterion("chapter_num in", values, "chapterNum");
            return (Criteria) this;
        }

        public Criteria andChapterNumNotIn(List<String> values) {
            addCriterion("chapter_num not in", values, "chapterNum");
            return (Criteria) this;
        }

        public Criteria andChapterNumBetween(String value1, String value2) {
            addCriterion("chapter_num between", value1, value2, "chapterNum");
            return (Criteria) this;
        }

        public Criteria andChapterNumNotBetween(String value1, String value2) {
            addCriterion("chapter_num not between", value1, value2, "chapterNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumIsNull() {
            addCriterion("delivery_num is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumIsNotNull() {
            addCriterion("delivery_num is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumEqualTo(String value) {
            addCriterion("delivery_num =", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumNotEqualTo(String value) {
            addCriterion("delivery_num <>", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumGreaterThan(String value) {
            addCriterion("delivery_num >", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_num >=", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumLessThan(String value) {
            addCriterion("delivery_num <", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumLessThanOrEqualTo(String value) {
            addCriterion("delivery_num <=", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumLike(String value) {
            addCriterion("delivery_num like", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumNotLike(String value) {
            addCriterion("delivery_num not like", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumIn(List<String> values) {
            addCriterion("delivery_num in", values, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumNotIn(List<String> values) {
            addCriterion("delivery_num not in", values, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumBetween(String value1, String value2) {
            addCriterion("delivery_num between", value1, value2, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumNotBetween(String value1, String value2) {
            addCriterion("delivery_num not between", value1, value2, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andPmidIsNull() {
            addCriterion("pmid is null");
            return (Criteria) this;
        }

        public Criteria andPmidIsNotNull() {
            addCriterion("pmid is not null");
            return (Criteria) this;
        }

        public Criteria andPmidEqualTo(String value) {
            addCriterion("pmid =", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotEqualTo(String value) {
            addCriterion("pmid <>", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidGreaterThan(String value) {
            addCriterion("pmid >", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidGreaterThanOrEqualTo(String value) {
            addCriterion("pmid >=", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLessThan(String value) {
            addCriterion("pmid <", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLessThanOrEqualTo(String value) {
            addCriterion("pmid <=", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLike(String value) {
            addCriterion("pmid like", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotLike(String value) {
            addCriterion("pmid not like", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidIn(List<String> values) {
            addCriterion("pmid in", values, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotIn(List<String> values) {
            addCriterion("pmid not in", values, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidBetween(String value1, String value2) {
            addCriterion("pmid between", value1, value2, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotBetween(String value1, String value2) {
            addCriterion("pmid not between", value1, value2, "pmid");
            return (Criteria) this;
        }

        public Criteria andHalfCitesIsNull() {
            addCriterion("half_cites is null");
            return (Criteria) this;
        }

        public Criteria andHalfCitesIsNotNull() {
            addCriterion("half_cites is not null");
            return (Criteria) this;
        }

        public Criteria andHalfCitesEqualTo(String value) {
            addCriterion("half_cites =", value, "halfCites");
            return (Criteria) this;
        }

        public Criteria andHalfCitesNotEqualTo(String value) {
            addCriterion("half_cites <>", value, "halfCites");
            return (Criteria) this;
        }

        public Criteria andHalfCitesGreaterThan(String value) {
            addCriterion("half_cites >", value, "halfCites");
            return (Criteria) this;
        }

        public Criteria andHalfCitesGreaterThanOrEqualTo(String value) {
            addCriterion("half_cites >=", value, "halfCites");
            return (Criteria) this;
        }

        public Criteria andHalfCitesLessThan(String value) {
            addCriterion("half_cites <", value, "halfCites");
            return (Criteria) this;
        }

        public Criteria andHalfCitesLessThanOrEqualTo(String value) {
            addCriterion("half_cites <=", value, "halfCites");
            return (Criteria) this;
        }

        public Criteria andHalfCitesLike(String value) {
            addCriterion("half_cites like", value, "halfCites");
            return (Criteria) this;
        }

        public Criteria andHalfCitesNotLike(String value) {
            addCriterion("half_cites not like", value, "halfCites");
            return (Criteria) this;
        }

        public Criteria andHalfCitesIn(List<String> values) {
            addCriterion("half_cites in", values, "halfCites");
            return (Criteria) this;
        }

        public Criteria andHalfCitesNotIn(List<String> values) {
            addCriterion("half_cites not in", values, "halfCites");
            return (Criteria) this;
        }

        public Criteria andHalfCitesBetween(String value1, String value2) {
            addCriterion("half_cites between", value1, value2, "halfCites");
            return (Criteria) this;
        }

        public Criteria andHalfCitesNotBetween(String value1, String value2) {
            addCriterion("half_cites not between", value1, value2, "halfCites");
            return (Criteria) this;
        }

        public Criteria andUseNumIsNull() {
            addCriterion("use_num is null");
            return (Criteria) this;
        }

        public Criteria andUseNumIsNotNull() {
            addCriterion("use_num is not null");
            return (Criteria) this;
        }

        public Criteria andUseNumEqualTo(Integer value) {
            addCriterion("use_num =", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumNotEqualTo(Integer value) {
            addCriterion("use_num <>", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumGreaterThan(Integer value) {
            addCriterion("use_num >", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_num >=", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumLessThan(Integer value) {
            addCriterion("use_num <", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumLessThanOrEqualTo(Integer value) {
            addCriterion("use_num <=", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumIn(List<Integer> values) {
            addCriterion("use_num in", values, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumNotIn(List<Integer> values) {
            addCriterion("use_num not in", values, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumBetween(Integer value1, Integer value2) {
            addCriterion("use_num between", value1, value2, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("use_num not between", value1, value2, "useNum");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andValidataIsNull() {
            addCriterion("validata is null");
            return (Criteria) this;
        }

        public Criteria andValidataIsNotNull() {
            addCriterion("validata is not null");
            return (Criteria) this;
        }

        public Criteria andValidataEqualTo(Integer value) {
            addCriterion("validata =", value, "validata");
            return (Criteria) this;
        }

        public Criteria andValidataNotEqualTo(Integer value) {
            addCriterion("validata <>", value, "validata");
            return (Criteria) this;
        }

        public Criteria andValidataGreaterThan(Integer value) {
            addCriterion("validata >", value, "validata");
            return (Criteria) this;
        }

        public Criteria andValidataGreaterThanOrEqualTo(Integer value) {
            addCriterion("validata >=", value, "validata");
            return (Criteria) this;
        }

        public Criteria andValidataLessThan(Integer value) {
            addCriterion("validata <", value, "validata");
            return (Criteria) this;
        }

        public Criteria andValidataLessThanOrEqualTo(Integer value) {
            addCriterion("validata <=", value, "validata");
            return (Criteria) this;
        }

        public Criteria andValidataIn(List<Integer> values) {
            addCriterion("validata in", values, "validata");
            return (Criteria) this;
        }

        public Criteria andValidataNotIn(List<Integer> values) {
            addCriterion("validata not in", values, "validata");
            return (Criteria) this;
        }

        public Criteria andValidataBetween(Integer value1, Integer value2) {
            addCriterion("validata between", value1, value2, "validata");
            return (Criteria) this;
        }

        public Criteria andValidataNotBetween(Integer value1, Integer value2) {
            addCriterion("validata not between", value1, value2, "validata");
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