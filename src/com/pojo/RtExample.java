package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class RtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RtExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRkbhIsNull() {
            addCriterion("rkbh is null");
            return (Criteria) this;
        }

        public Criteria andRkbhIsNotNull() {
            addCriterion("rkbh is not null");
            return (Criteria) this;
        }

        public Criteria andRkbhEqualTo(String value) {
            addCriterion("rkbh =", value, "rkbh");
            return (Criteria) this;
        }

        public Criteria andRkbhNotEqualTo(String value) {
            addCriterion("rkbh <>", value, "rkbh");
            return (Criteria) this;
        }

        public Criteria andRkbhGreaterThan(String value) {
            addCriterion("rkbh >", value, "rkbh");
            return (Criteria) this;
        }

        public Criteria andRkbhGreaterThanOrEqualTo(String value) {
            addCriterion("rkbh >=", value, "rkbh");
            return (Criteria) this;
        }

        public Criteria andRkbhLessThan(String value) {
            addCriterion("rkbh <", value, "rkbh");
            return (Criteria) this;
        }

        public Criteria andRkbhLessThanOrEqualTo(String value) {
            addCriterion("rkbh <=", value, "rkbh");
            return (Criteria) this;
        }

        public Criteria andRkbhLike(String value) {
            addCriterion("rkbh like", value, "rkbh");
            return (Criteria) this;
        }

        public Criteria andRkbhNotLike(String value) {
            addCriterion("rkbh not like", value, "rkbh");
            return (Criteria) this;
        }

        public Criteria andRkbhIn(List<String> values) {
            addCriterion("rkbh in", values, "rkbh");
            return (Criteria) this;
        }

        public Criteria andRkbhNotIn(List<String> values) {
            addCriterion("rkbh not in", values, "rkbh");
            return (Criteria) this;
        }

        public Criteria andRkbhBetween(String value1, String value2) {
            addCriterion("rkbh between", value1, value2, "rkbh");
            return (Criteria) this;
        }

        public Criteria andRkbhNotBetween(String value1, String value2) {
            addCriterion("rkbh not between", value1, value2, "rkbh");
            return (Criteria) this;
        }

        public Criteria andSlIsNull() {
            addCriterion("sl is null");
            return (Criteria) this;
        }

        public Criteria andSlIsNotNull() {
            addCriterion("sl is not null");
            return (Criteria) this;
        }

        public Criteria andSlEqualTo(Integer value) {
            addCriterion("sl =", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotEqualTo(Integer value) {
            addCriterion("sl <>", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThan(Integer value) {
            addCriterion("sl >", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThanOrEqualTo(Integer value) {
            addCriterion("sl >=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThan(Integer value) {
            addCriterion("sl <", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThanOrEqualTo(Integer value) {
            addCriterion("sl <=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlIn(List<Integer> values) {
            addCriterion("sl in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotIn(List<Integer> values) {
            addCriterion("sl not in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlBetween(Integer value1, Integer value2) {
            addCriterion("sl between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotBetween(Integer value1, Integer value2) {
            addCriterion("sl not between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andYyIsNull() {
            addCriterion("yy is null");
            return (Criteria) this;
        }

        public Criteria andYyIsNotNull() {
            addCriterion("yy is not null");
            return (Criteria) this;
        }

        public Criteria andYyEqualTo(String value) {
            addCriterion("yy =", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyNotEqualTo(String value) {
            addCriterion("yy <>", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyGreaterThan(String value) {
            addCriterion("yy >", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyGreaterThanOrEqualTo(String value) {
            addCriterion("yy >=", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyLessThan(String value) {
            addCriterion("yy <", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyLessThanOrEqualTo(String value) {
            addCriterion("yy <=", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyLike(String value) {
            addCriterion("yy like", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyNotLike(String value) {
            addCriterion("yy not like", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyIn(List<String> values) {
            addCriterion("yy in", values, "yy");
            return (Criteria) this;
        }

        public Criteria andYyNotIn(List<String> values) {
            addCriterion("yy not in", values, "yy");
            return (Criteria) this;
        }

        public Criteria andYyBetween(String value1, String value2) {
            addCriterion("yy between", value1, value2, "yy");
            return (Criteria) this;
        }

        public Criteria andYyNotBetween(String value1, String value2) {
            addCriterion("yy not between", value1, value2, "yy");
            return (Criteria) this;
        }

        public Criteria andSjIsNull() {
            addCriterion("sj is null");
            return (Criteria) this;
        }

        public Criteria andSjIsNotNull() {
            addCriterion("sj is not null");
            return (Criteria) this;
        }

        public Criteria andSjEqualTo(String value) {
            addCriterion("sj =", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotEqualTo(String value) {
            addCriterion("sj <>", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThan(String value) {
            addCriterion("sj >", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThanOrEqualTo(String value) {
            addCriterion("sj >=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThan(String value) {
            addCriterion("sj <", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThanOrEqualTo(String value) {
            addCriterion("sj <=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLike(String value) {
            addCriterion("sj like", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotLike(String value) {
            addCriterion("sj not like", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjIn(List<String> values) {
            addCriterion("sj in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotIn(List<String> values) {
            addCriterion("sj not in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjBetween(String value1, String value2) {
            addCriterion("sj between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotBetween(String value1, String value2) {
            addCriterion("sj not between", value1, value2, "sj");
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