package com.dhu.bean;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBookidIsNull() {
            addCriterion("BookId is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("BookId is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(String value) {
            addCriterion("BookId =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(String value) {
            addCriterion("BookId <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(String value) {
            addCriterion("BookId >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(String value) {
            addCriterion("BookId >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(String value) {
            addCriterion("BookId <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(String value) {
            addCriterion("BookId <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLike(String value) {
            addCriterion("BookId like", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotLike(String value) {
            addCriterion("BookId not like", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<String> values) {
            addCriterion("BookId in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<String> values) {
            addCriterion("BookId not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(String value1, String value2) {
            addCriterion("BookId between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(String value1, String value2) {
            addCriterion("BookId not between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNull() {
            addCriterion("Bookname is null");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNotNull() {
            addCriterion("Bookname is not null");
            return (Criteria) this;
        }

        public Criteria andBooknameEqualTo(String value) {
            addCriterion("Bookname =", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotEqualTo(String value) {
            addCriterion("Bookname <>", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThan(String value) {
            addCriterion("Bookname >", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThanOrEqualTo(String value) {
            addCriterion("Bookname >=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThan(String value) {
            addCriterion("Bookname <", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThanOrEqualTo(String value) {
            addCriterion("Bookname <=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLike(String value) {
            addCriterion("Bookname like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotLike(String value) {
            addCriterion("Bookname not like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameIn(List<String> values) {
            addCriterion("Bookname in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotIn(List<String> values) {
            addCriterion("Bookname not in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameBetween(String value1, String value2) {
            addCriterion("Bookname between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotBetween(String value1, String value2) {
            addCriterion("Bookname not between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBookpriceIsNull() {
            addCriterion("Bookprice is null");
            return (Criteria) this;
        }

        public Criteria andBookpriceIsNotNull() {
            addCriterion("Bookprice is not null");
            return (Criteria) this;
        }

        public Criteria andBookpriceEqualTo(Double value) {
            addCriterion("Bookprice =", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotEqualTo(Double value) {
            addCriterion("Bookprice <>", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceGreaterThan(Double value) {
            addCriterion("Bookprice >", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Bookprice >=", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceLessThan(Double value) {
            addCriterion("Bookprice <", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceLessThanOrEqualTo(Double value) {
            addCriterion("Bookprice <=", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceIn(List<Double> values) {
            addCriterion("Bookprice in", values, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotIn(List<Double> values) {
            addCriterion("Bookprice not in", values, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceBetween(Double value1, Double value2) {
            addCriterion("Bookprice between", value1, value2, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotBetween(Double value1, Double value2) {
            addCriterion("Bookprice not between", value1, value2, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookimageIsNull() {
            addCriterion("Bookimage is null");
            return (Criteria) this;
        }

        public Criteria andBookimageIsNotNull() {
            addCriterion("Bookimage is not null");
            return (Criteria) this;
        }

        public Criteria andBookimageEqualTo(String value) {
            addCriterion("Bookimage =", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageNotEqualTo(String value) {
            addCriterion("Bookimage <>", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageGreaterThan(String value) {
            addCriterion("Bookimage >", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageGreaterThanOrEqualTo(String value) {
            addCriterion("Bookimage >=", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageLessThan(String value) {
            addCriterion("Bookimage <", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageLessThanOrEqualTo(String value) {
            addCriterion("Bookimage <=", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageLike(String value) {
            addCriterion("Bookimage like", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageNotLike(String value) {
            addCriterion("Bookimage not like", value, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageIn(List<String> values) {
            addCriterion("Bookimage in", values, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageNotIn(List<String> values) {
            addCriterion("Bookimage not in", values, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageBetween(String value1, String value2) {
            addCriterion("Bookimage between", value1, value2, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookimageNotBetween(String value1, String value2) {
            addCriterion("Bookimage not between", value1, value2, "bookimage");
            return (Criteria) this;
        }

        public Criteria andBookstockIsNull() {
            addCriterion("Bookstock is null");
            return (Criteria) this;
        }

        public Criteria andBookstockIsNotNull() {
            addCriterion("Bookstock is not null");
            return (Criteria) this;
        }

        public Criteria andBookstockEqualTo(String value) {
            addCriterion("Bookstock =", value, "bookstock");
            return (Criteria) this;
        }

        public Criteria andBookstockNotEqualTo(String value) {
            addCriterion("Bookstock <>", value, "bookstock");
            return (Criteria) this;
        }

        public Criteria andBookstockGreaterThan(String value) {
            addCriterion("Bookstock >", value, "bookstock");
            return (Criteria) this;
        }

        public Criteria andBookstockGreaterThanOrEqualTo(String value) {
            addCriterion("Bookstock >=", value, "bookstock");
            return (Criteria) this;
        }

        public Criteria andBookstockLessThan(String value) {
            addCriterion("Bookstock <", value, "bookstock");
            return (Criteria) this;
        }

        public Criteria andBookstockLessThanOrEqualTo(String value) {
            addCriterion("Bookstock <=", value, "bookstock");
            return (Criteria) this;
        }

        public Criteria andBookstockLike(String value) {
            addCriterion("Bookstock like", value, "bookstock");
            return (Criteria) this;
        }

        public Criteria andBookstockNotLike(String value) {
            addCriterion("Bookstock not like", value, "bookstock");
            return (Criteria) this;
        }

        public Criteria andBookstockIn(List<String> values) {
            addCriterion("Bookstock in", values, "bookstock");
            return (Criteria) this;
        }

        public Criteria andBookstockNotIn(List<String> values) {
            addCriterion("Bookstock not in", values, "bookstock");
            return (Criteria) this;
        }

        public Criteria andBookstockBetween(String value1, String value2) {
            addCriterion("Bookstock between", value1, value2, "bookstock");
            return (Criteria) this;
        }

        public Criteria andBookstockNotBetween(String value1, String value2) {
            addCriterion("Bookstock not between", value1, value2, "bookstock");
            return (Criteria) this;
        }

        public Criteria andBookfromIsNull() {
            addCriterion("Bookfrom is null");
            return (Criteria) this;
        }

        public Criteria andBookfromIsNotNull() {
            addCriterion("Bookfrom is not null");
            return (Criteria) this;
        }

        public Criteria andBookfromEqualTo(String value) {
            addCriterion("Bookfrom =", value, "bookfrom");
            return (Criteria) this;
        }

        public Criteria andBookfromNotEqualTo(String value) {
            addCriterion("Bookfrom <>", value, "bookfrom");
            return (Criteria) this;
        }

        public Criteria andBookfromGreaterThan(String value) {
            addCriterion("Bookfrom >", value, "bookfrom");
            return (Criteria) this;
        }

        public Criteria andBookfromGreaterThanOrEqualTo(String value) {
            addCriterion("Bookfrom >=", value, "bookfrom");
            return (Criteria) this;
        }

        public Criteria andBookfromLessThan(String value) {
            addCriterion("Bookfrom <", value, "bookfrom");
            return (Criteria) this;
        }

        public Criteria andBookfromLessThanOrEqualTo(String value) {
            addCriterion("Bookfrom <=", value, "bookfrom");
            return (Criteria) this;
        }

        public Criteria andBookfromLike(String value) {
            addCriterion("Bookfrom like", value, "bookfrom");
            return (Criteria) this;
        }

        public Criteria andBookfromNotLike(String value) {
            addCriterion("Bookfrom not like", value, "bookfrom");
            return (Criteria) this;
        }

        public Criteria andBookfromIn(List<String> values) {
            addCriterion("Bookfrom in", values, "bookfrom");
            return (Criteria) this;
        }

        public Criteria andBookfromNotIn(List<String> values) {
            addCriterion("Bookfrom not in", values, "bookfrom");
            return (Criteria) this;
        }

        public Criteria andBookfromBetween(String value1, String value2) {
            addCriterion("Bookfrom between", value1, value2, "bookfrom");
            return (Criteria) this;
        }

        public Criteria andBookfromNotBetween(String value1, String value2) {
            addCriterion("Bookfrom not between", value1, value2, "bookfrom");
            return (Criteria) this;
        }

        public Criteria andBookintroductionIsNull() {
            addCriterion("Bookintroduction is null");
            return (Criteria) this;
        }

        public Criteria andBookintroductionIsNotNull() {
            addCriterion("Bookintroduction is not null");
            return (Criteria) this;
        }

        public Criteria andBookintroductionEqualTo(String value) {
            addCriterion("Bookintroduction =", value, "bookintroduction");
            return (Criteria) this;
        }

        public Criteria andBookintroductionNotEqualTo(String value) {
            addCriterion("Bookintroduction <>", value, "bookintroduction");
            return (Criteria) this;
        }

        public Criteria andBookintroductionGreaterThan(String value) {
            addCriterion("Bookintroduction >", value, "bookintroduction");
            return (Criteria) this;
        }

        public Criteria andBookintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("Bookintroduction >=", value, "bookintroduction");
            return (Criteria) this;
        }

        public Criteria andBookintroductionLessThan(String value) {
            addCriterion("Bookintroduction <", value, "bookintroduction");
            return (Criteria) this;
        }

        public Criteria andBookintroductionLessThanOrEqualTo(String value) {
            addCriterion("Bookintroduction <=", value, "bookintroduction");
            return (Criteria) this;
        }

        public Criteria andBookintroductionLike(String value) {
            addCriterion("Bookintroduction like", value, "bookintroduction");
            return (Criteria) this;
        }

        public Criteria andBookintroductionNotLike(String value) {
            addCriterion("Bookintroduction not like", value, "bookintroduction");
            return (Criteria) this;
        }

        public Criteria andBookintroductionIn(List<String> values) {
            addCriterion("Bookintroduction in", values, "bookintroduction");
            return (Criteria) this;
        }

        public Criteria andBookintroductionNotIn(List<String> values) {
            addCriterion("Bookintroduction not in", values, "bookintroduction");
            return (Criteria) this;
        }

        public Criteria andBookintroductionBetween(String value1, String value2) {
            addCriterion("Bookintroduction between", value1, value2, "bookintroduction");
            return (Criteria) this;
        }

        public Criteria andBookintroductionNotBetween(String value1, String value2) {
            addCriterion("Bookintroduction not between", value1, value2, "bookintroduction");
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