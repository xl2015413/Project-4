package com.qphone.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("O_ID is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("O_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(BigDecimal value) {
            addCriterion("O_ID =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(BigDecimal value) {
            addCriterion("O_ID <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(BigDecimal value) {
            addCriterion("O_ID >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("O_ID >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(BigDecimal value) {
            addCriterion("O_ID <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("O_ID <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<BigDecimal> values) {
            addCriterion("O_ID in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<BigDecimal> values) {
            addCriterion("O_ID not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("O_ID between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("O_ID not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("U_ID is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(BigDecimal value) {
            addCriterion("U_ID =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(BigDecimal value) {
            addCriterion("U_ID <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(BigDecimal value) {
            addCriterion("U_ID >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("U_ID >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(BigDecimal value) {
            addCriterion("U_ID <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("U_ID <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<BigDecimal> values) {
            addCriterion("U_ID in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<BigDecimal> values) {
            addCriterion("U_ID not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("U_ID between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("U_ID not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(BigDecimal value) {
            addCriterion("ORDERID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(BigDecimal value) {
            addCriterion("ORDERID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(BigDecimal value) {
            addCriterion("ORDERID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(BigDecimal value) {
            addCriterion("ORDERID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<BigDecimal> values) {
            addCriterion("ORDERID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<BigDecimal> values) {
            addCriterion("ORDERID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andAllpriceIsNull() {
            addCriterion("ALLPRICE is null");
            return (Criteria) this;
        }

        public Criteria andAllpriceIsNotNull() {
            addCriterion("ALLPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andAllpriceEqualTo(BigDecimal value) {
            addCriterion("ALLPRICE =", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceNotEqualTo(BigDecimal value) {
            addCriterion("ALLPRICE <>", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceGreaterThan(BigDecimal value) {
            addCriterion("ALLPRICE >", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ALLPRICE >=", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceLessThan(BigDecimal value) {
            addCriterion("ALLPRICE <", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ALLPRICE <=", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceIn(List<BigDecimal> values) {
            addCriterion("ALLPRICE in", values, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceNotIn(List<BigDecimal> values) {
            addCriterion("ALLPRICE not in", values, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALLPRICE between", value1, value2, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALLPRICE not between", value1, value2, "allprice");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
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