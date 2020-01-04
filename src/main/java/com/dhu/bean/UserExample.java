package com.dhu.bean;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("Username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("Username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("Username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("Username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("Username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("Username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("Username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("Username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("Username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("Username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("Username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("Username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("Username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("Username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("Userpassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("Userpassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("Userpassword =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("Userpassword <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("Userpassword >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Userpassword >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("Userpassword <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("Userpassword <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("Userpassword like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("Userpassword not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("Userpassword in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("Userpassword not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("Userpassword between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("Userpassword not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUsergenderIsNull() {
            addCriterion("Usergender is null");
            return (Criteria) this;
        }

        public Criteria andUsergenderIsNotNull() {
            addCriterion("Usergender is not null");
            return (Criteria) this;
        }

        public Criteria andUsergenderEqualTo(String value) {
            addCriterion("Usergender =", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotEqualTo(String value) {
            addCriterion("Usergender <>", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderGreaterThan(String value) {
            addCriterion("Usergender >", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderGreaterThanOrEqualTo(String value) {
            addCriterion("Usergender >=", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderLessThan(String value) {
            addCriterion("Usergender <", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderLessThanOrEqualTo(String value) {
            addCriterion("Usergender <=", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderLike(String value) {
            addCriterion("Usergender like", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotLike(String value) {
            addCriterion("Usergender not like", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderIn(List<String> values) {
            addCriterion("Usergender in", values, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotIn(List<String> values) {
            addCriterion("Usergender not in", values, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderBetween(String value1, String value2) {
            addCriterion("Usergender between", value1, value2, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotBetween(String value1, String value2) {
            addCriterion("Usergender not between", value1, value2, "usergender");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("Userphone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("Userphone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("Userphone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("Userphone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("Userphone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("Userphone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("Userphone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("Userphone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("Userphone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("Userphone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("Userphone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("Userphone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("Userphone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("Userphone not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserstatusIsNull() {
            addCriterion("Userstatus is null");
            return (Criteria) this;
        }

        public Criteria andUserstatusIsNotNull() {
            addCriterion("Userstatus is not null");
            return (Criteria) this;
        }

        public Criteria andUserstatusEqualTo(String value) {
            addCriterion("Userstatus =", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotEqualTo(String value) {
            addCriterion("Userstatus <>", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusGreaterThan(String value) {
            addCriterion("Userstatus >", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusGreaterThanOrEqualTo(String value) {
            addCriterion("Userstatus >=", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusLessThan(String value) {
            addCriterion("Userstatus <", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusLessThanOrEqualTo(String value) {
            addCriterion("Userstatus <=", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusLike(String value) {
            addCriterion("Userstatus like", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotLike(String value) {
            addCriterion("Userstatus not like", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusIn(List<String> values) {
            addCriterion("Userstatus in", values, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotIn(List<String> values) {
            addCriterion("Userstatus not in", values, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusBetween(String value1, String value2) {
            addCriterion("Userstatus between", value1, value2, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotBetween(String value1, String value2) {
            addCriterion("Userstatus not between", value1, value2, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserimageIsNull() {
            addCriterion("Userimage is null");
            return (Criteria) this;
        }

        public Criteria andUserimageIsNotNull() {
            addCriterion("Userimage is not null");
            return (Criteria) this;
        }

        public Criteria andUserimageEqualTo(String value) {
            addCriterion("Userimage =", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageNotEqualTo(String value) {
            addCriterion("Userimage <>", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageGreaterThan(String value) {
            addCriterion("Userimage >", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageGreaterThanOrEqualTo(String value) {
            addCriterion("Userimage >=", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageLessThan(String value) {
            addCriterion("Userimage <", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageLessThanOrEqualTo(String value) {
            addCriterion("Userimage <=", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageLike(String value) {
            addCriterion("Userimage like", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageNotLike(String value) {
            addCriterion("Userimage not like", value, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageIn(List<String> values) {
            addCriterion("Userimage in", values, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageNotIn(List<String> values) {
            addCriterion("Userimage not in", values, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageBetween(String value1, String value2) {
            addCriterion("Userimage between", value1, value2, "userimage");
            return (Criteria) this;
        }

        public Criteria andUserimageNotBetween(String value1, String value2) {
            addCriterion("Userimage not between", value1, value2, "userimage");
            return (Criteria) this;
        }

        public Criteria andUsermajorIsNull() {
            addCriterion("Usermajor is null");
            return (Criteria) this;
        }

        public Criteria andUsermajorIsNotNull() {
            addCriterion("Usermajor is not null");
            return (Criteria) this;
        }

        public Criteria andUsermajorEqualTo(String value) {
            addCriterion("Usermajor =", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorNotEqualTo(String value) {
            addCriterion("Usermajor <>", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorGreaterThan(String value) {
            addCriterion("Usermajor >", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorGreaterThanOrEqualTo(String value) {
            addCriterion("Usermajor >=", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorLessThan(String value) {
            addCriterion("Usermajor <", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorLessThanOrEqualTo(String value) {
            addCriterion("Usermajor <=", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorLike(String value) {
            addCriterion("Usermajor like", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorNotLike(String value) {
            addCriterion("Usermajor not like", value, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorIn(List<String> values) {
            addCriterion("Usermajor in", values, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorNotIn(List<String> values) {
            addCriterion("Usermajor not in", values, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorBetween(String value1, String value2) {
            addCriterion("Usermajor between", value1, value2, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUsermajorNotBetween(String value1, String value2) {
            addCriterion("Usermajor not between", value1, value2, "usermajor");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNull() {
            addCriterion("Useremail is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("Useremail is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("Useremail =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("Useremail <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("Useremail >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("Useremail >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("Useremail <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("Useremail <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("Useremail like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("Useremail not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("Useremail in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("Useremail not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("Useremail between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("Useremail not between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUsertokenIsNull() {
            addCriterion("Usertoken is null");
            return (Criteria) this;
        }

        public Criteria andUsertokenIsNotNull() {
            addCriterion("Usertoken is not null");
            return (Criteria) this;
        }

        public Criteria andUsertokenEqualTo(String value) {
            addCriterion("Usertoken =", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenNotEqualTo(String value) {
            addCriterion("Usertoken <>", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenGreaterThan(String value) {
            addCriterion("Usertoken >", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenGreaterThanOrEqualTo(String value) {
            addCriterion("Usertoken >=", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenLessThan(String value) {
            addCriterion("Usertoken <", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenLessThanOrEqualTo(String value) {
            addCriterion("Usertoken <=", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenLike(String value) {
            addCriterion("Usertoken like", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenNotLike(String value) {
            addCriterion("Usertoken not like", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenIn(List<String> values) {
            addCriterion("Usertoken in", values, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenNotIn(List<String> values) {
            addCriterion("Usertoken not in", values, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenBetween(String value1, String value2) {
            addCriterion("Usertoken between", value1, value2, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenNotBetween(String value1, String value2) {
            addCriterion("Usertoken not between", value1, value2, "usertoken");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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