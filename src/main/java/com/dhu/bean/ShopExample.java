package com.dhu.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andShopidIsNull() {
            addCriterion("ShopId is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("ShopId is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(String value) {
            addCriterion("ShopId =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(String value) {
            addCriterion("ShopId <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(String value) {
            addCriterion("ShopId >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(String value) {
            addCriterion("ShopId >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(String value) {
            addCriterion("ShopId <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(String value) {
            addCriterion("ShopId <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLike(String value) {
            addCriterion("ShopId like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotLike(String value) {
            addCriterion("ShopId not like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<String> values) {
            addCriterion("ShopId in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<String> values) {
            addCriterion("ShopId not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(String value1, String value2) {
            addCriterion("ShopId between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(String value1, String value2) {
            addCriterion("ShopId not between", value1, value2, "shopid");
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

        public Criteria andBookpriceEqualTo(BigDecimal value) {
            addCriterion("Bookprice =", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotEqualTo(BigDecimal value) {
            addCriterion("Bookprice <>", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceGreaterThan(BigDecimal value) {
            addCriterion("Bookprice >", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Bookprice >=", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceLessThan(BigDecimal value) {
            addCriterion("Bookprice <", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Bookprice <=", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceIn(List<BigDecimal> values) {
            addCriterion("Bookprice in", values, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotIn(List<BigDecimal> values) {
            addCriterion("Bookprice not in", values, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Bookprice between", value1, value2, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Bookprice not between", value1, value2, "bookprice");
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

        public Criteria andShopstatusIsNull() {
            addCriterion("Shopstatus is null");
            return (Criteria) this;
        }

        public Criteria andShopstatusIsNotNull() {
            addCriterion("Shopstatus is not null");
            return (Criteria) this;
        }

        public Criteria andShopstatusEqualTo(String value) {
            addCriterion("Shopstatus =", value, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusNotEqualTo(String value) {
            addCriterion("Shopstatus <>", value, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusGreaterThan(String value) {
            addCriterion("Shopstatus >", value, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusGreaterThanOrEqualTo(String value) {
            addCriterion("Shopstatus >=", value, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusLessThan(String value) {
            addCriterion("Shopstatus <", value, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusLessThanOrEqualTo(String value) {
            addCriterion("Shopstatus <=", value, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusLike(String value) {
            addCriterion("Shopstatus like", value, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusNotLike(String value) {
            addCriterion("Shopstatus not like", value, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusIn(List<String> values) {
            addCriterion("Shopstatus in", values, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusNotIn(List<String> values) {
            addCriterion("Shopstatus not in", values, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusBetween(String value1, String value2) {
            addCriterion("Shopstatus between", value1, value2, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopstatusNotBetween(String value1, String value2) {
            addCriterion("Shopstatus not between", value1, value2, "shopstatus");
            return (Criteria) this;
        }

        public Criteria andShopimageIsNull() {
            addCriterion("Shopimage is null");
            return (Criteria) this;
        }

        public Criteria andShopimageIsNotNull() {
            addCriterion("Shopimage is not null");
            return (Criteria) this;
        }

        public Criteria andShopimageEqualTo(String value) {
            addCriterion("Shopimage =", value, "shopimage");
            return (Criteria) this;
        }

        public Criteria andShopimageNotEqualTo(String value) {
            addCriterion("Shopimage <>", value, "shopimage");
            return (Criteria) this;
        }

        public Criteria andShopimageGreaterThan(String value) {
            addCriterion("Shopimage >", value, "shopimage");
            return (Criteria) this;
        }

        public Criteria andShopimageGreaterThanOrEqualTo(String value) {
            addCriterion("Shopimage >=", value, "shopimage");
            return (Criteria) this;
        }

        public Criteria andShopimageLessThan(String value) {
            addCriterion("Shopimage <", value, "shopimage");
            return (Criteria) this;
        }

        public Criteria andShopimageLessThanOrEqualTo(String value) {
            addCriterion("Shopimage <=", value, "shopimage");
            return (Criteria) this;
        }

        public Criteria andShopimageLike(String value) {
            addCriterion("Shopimage like", value, "shopimage");
            return (Criteria) this;
        }

        public Criteria andShopimageNotLike(String value) {
            addCriterion("Shopimage not like", value, "shopimage");
            return (Criteria) this;
        }

        public Criteria andShopimageIn(List<String> values) {
            addCriterion("Shopimage in", values, "shopimage");
            return (Criteria) this;
        }

        public Criteria andShopimageNotIn(List<String> values) {
            addCriterion("Shopimage not in", values, "shopimage");
            return (Criteria) this;
        }

        public Criteria andShopimageBetween(String value1, String value2) {
            addCriterion("Shopimage between", value1, value2, "shopimage");
            return (Criteria) this;
        }

        public Criteria andShopimageNotBetween(String value1, String value2) {
            addCriterion("Shopimage not between", value1, value2, "shopimage");
            return (Criteria) this;
        }

        public Criteria andUseidIsNull() {
            addCriterion("UseId is null");
            return (Criteria) this;
        }

        public Criteria andUseidIsNotNull() {
            addCriterion("UseId is not null");
            return (Criteria) this;
        }

        public Criteria andUseidEqualTo(String value) {
            addCriterion("UseId =", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidNotEqualTo(String value) {
            addCriterion("UseId <>", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidGreaterThan(String value) {
            addCriterion("UseId >", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidGreaterThanOrEqualTo(String value) {
            addCriterion("UseId >=", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidLessThan(String value) {
            addCriterion("UseId <", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidLessThanOrEqualTo(String value) {
            addCriterion("UseId <=", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidLike(String value) {
            addCriterion("UseId like", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidNotLike(String value) {
            addCriterion("UseId not like", value, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidIn(List<String> values) {
            addCriterion("UseId in", values, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidNotIn(List<String> values) {
            addCriterion("UseId not in", values, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidBetween(String value1, String value2) {
            addCriterion("UseId between", value1, value2, "useid");
            return (Criteria) this;
        }

        public Criteria andUseidNotBetween(String value1, String value2) {
            addCriterion("UseId not between", value1, value2, "useid");
            return (Criteria) this;
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

        public Criteria andPaystatusIsNull() {
            addCriterion("paystatus is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNotNull() {
            addCriterion("paystatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusEqualTo(String value) {
            addCriterion("paystatus =", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotEqualTo(String value) {
            addCriterion("paystatus <>", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThan(String value) {
            addCriterion("paystatus >", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThanOrEqualTo(String value) {
            addCriterion("paystatus >=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThan(String value) {
            addCriterion("paystatus <", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThanOrEqualTo(String value) {
            addCriterion("paystatus <=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLike(String value) {
            addCriterion("paystatus like", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotLike(String value) {
            addCriterion("paystatus not like", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIn(List<String> values) {
            addCriterion("paystatus in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotIn(List<String> values) {
            addCriterion("paystatus not in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusBetween(String value1, String value2) {
            addCriterion("paystatus between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotBetween(String value1, String value2) {
            addCriterion("paystatus not between", value1, value2, "paystatus");
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