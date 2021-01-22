package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class CkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CkExample() {
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

        public Criteria andCkbhIsNull() {
            addCriterion("ckbh is null");
            return (Criteria) this;
        }

        public Criteria andCkbhIsNotNull() {
            addCriterion("ckbh is not null");
            return (Criteria) this;
        }

        public Criteria andCkbhEqualTo(String value) {
            addCriterion("ckbh =", value, "ckbh");
            return (Criteria) this;
        }

        public Criteria andCkbhNotEqualTo(String value) {
            addCriterion("ckbh <>", value, "ckbh");
            return (Criteria) this;
        }

        public Criteria andCkbhGreaterThan(String value) {
            addCriterion("ckbh >", value, "ckbh");
            return (Criteria) this;
        }

        public Criteria andCkbhGreaterThanOrEqualTo(String value) {
            addCriterion("ckbh >=", value, "ckbh");
            return (Criteria) this;
        }

        public Criteria andCkbhLessThan(String value) {
            addCriterion("ckbh <", value, "ckbh");
            return (Criteria) this;
        }

        public Criteria andCkbhLessThanOrEqualTo(String value) {
            addCriterion("ckbh <=", value, "ckbh");
            return (Criteria) this;
        }

        public Criteria andCkbhLike(String value) {
            addCriterion("ckbh like", value, "ckbh");
            return (Criteria) this;
        }

        public Criteria andCkbhNotLike(String value) {
            addCriterion("ckbh not like", value, "ckbh");
            return (Criteria) this;
        }

        public Criteria andCkbhIn(List<String> values) {
            addCriterion("ckbh in", values, "ckbh");
            return (Criteria) this;
        }

        public Criteria andCkbhNotIn(List<String> values) {
            addCriterion("ckbh not in", values, "ckbh");
            return (Criteria) this;
        }

        public Criteria andCkbhBetween(String value1, String value2) {
            addCriterion("ckbh between", value1, value2, "ckbh");
            return (Criteria) this;
        }

        public Criteria andCkbhNotBetween(String value1, String value2) {
            addCriterion("ckbh not between", value1, value2, "ckbh");
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

        public Criteria andMcIsNull() {
            addCriterion("mc is null");
            return (Criteria) this;
        }

        public Criteria andMcIsNotNull() {
            addCriterion("mc is not null");
            return (Criteria) this;
        }

        public Criteria andMcEqualTo(String value) {
            addCriterion("mc =", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotEqualTo(String value) {
            addCriterion("mc <>", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThan(String value) {
            addCriterion("mc >", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThanOrEqualTo(String value) {
            addCriterion("mc >=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThan(String value) {
            addCriterion("mc <", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThanOrEqualTo(String value) {
            addCriterion("mc <=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLike(String value) {
            addCriterion("mc like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotLike(String value) {
            addCriterion("mc not like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcIn(List<String> values) {
            addCriterion("mc in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotIn(List<String> values) {
            addCriterion("mc not in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcBetween(String value1, String value2) {
            addCriterion("mc between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotBetween(String value1, String value2) {
            addCriterion("mc not between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andFlIsNull() {
            addCriterion("fl is null");
            return (Criteria) this;
        }

        public Criteria andFlIsNotNull() {
            addCriterion("fl is not null");
            return (Criteria) this;
        }

        public Criteria andFlEqualTo(String value) {
            addCriterion("fl =", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotEqualTo(String value) {
            addCriterion("fl <>", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlGreaterThan(String value) {
            addCriterion("fl >", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlGreaterThanOrEqualTo(String value) {
            addCriterion("fl >=", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlLessThan(String value) {
            addCriterion("fl <", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlLessThanOrEqualTo(String value) {
            addCriterion("fl <=", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlLike(String value) {
            addCriterion("fl like", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotLike(String value) {
            addCriterion("fl not like", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlIn(List<String> values) {
            addCriterion("fl in", values, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotIn(List<String> values) {
            addCriterion("fl not in", values, "fl");
            return (Criteria) this;
        }

        public Criteria andFlBetween(String value1, String value2) {
            addCriterion("fl between", value1, value2, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotBetween(String value1, String value2) {
            addCriterion("fl not between", value1, value2, "fl");
            return (Criteria) this;
        }

        public Criteria andRkjgIsNull() {
            addCriterion("rkjg is null");
            return (Criteria) this;
        }

        public Criteria andRkjgIsNotNull() {
            addCriterion("rkjg is not null");
            return (Criteria) this;
        }

        public Criteria andRkjgEqualTo(Float value) {
            addCriterion("rkjg =", value, "rkjg");
            return (Criteria) this;
        }

        public Criteria andRkjgNotEqualTo(Float value) {
            addCriterion("rkjg <>", value, "rkjg");
            return (Criteria) this;
        }

        public Criteria andRkjgGreaterThan(Float value) {
            addCriterion("rkjg >", value, "rkjg");
            return (Criteria) this;
        }

        public Criteria andRkjgGreaterThanOrEqualTo(Float value) {
            addCriterion("rkjg >=", value, "rkjg");
            return (Criteria) this;
        }

        public Criteria andRkjgLessThan(Float value) {
            addCriterion("rkjg <", value, "rkjg");
            return (Criteria) this;
        }

        public Criteria andRkjgLessThanOrEqualTo(Float value) {
            addCriterion("rkjg <=", value, "rkjg");
            return (Criteria) this;
        }

        public Criteria andRkjgIn(List<Float> values) {
            addCriterion("rkjg in", values, "rkjg");
            return (Criteria) this;
        }

        public Criteria andRkjgNotIn(List<Float> values) {
            addCriterion("rkjg not in", values, "rkjg");
            return (Criteria) this;
        }

        public Criteria andRkjgBetween(Float value1, Float value2) {
            addCriterion("rkjg between", value1, value2, "rkjg");
            return (Criteria) this;
        }

        public Criteria andRkjgNotBetween(Float value1, Float value2) {
            addCriterion("rkjg not between", value1, value2, "rkjg");
            return (Criteria) this;
        }

        public Criteria andXsjgIsNull() {
            addCriterion("xsjg is null");
            return (Criteria) this;
        }

        public Criteria andXsjgIsNotNull() {
            addCriterion("xsjg is not null");
            return (Criteria) this;
        }

        public Criteria andXsjgEqualTo(Float value) {
            addCriterion("xsjg =", value, "xsjg");
            return (Criteria) this;
        }

        public Criteria andXsjgNotEqualTo(Float value) {
            addCriterion("xsjg <>", value, "xsjg");
            return (Criteria) this;
        }

        public Criteria andXsjgGreaterThan(Float value) {
            addCriterion("xsjg >", value, "xsjg");
            return (Criteria) this;
        }

        public Criteria andXsjgGreaterThanOrEqualTo(Float value) {
            addCriterion("xsjg >=", value, "xsjg");
            return (Criteria) this;
        }

        public Criteria andXsjgLessThan(Float value) {
            addCriterion("xsjg <", value, "xsjg");
            return (Criteria) this;
        }

        public Criteria andXsjgLessThanOrEqualTo(Float value) {
            addCriterion("xsjg <=", value, "xsjg");
            return (Criteria) this;
        }

        public Criteria andXsjgIn(List<Float> values) {
            addCriterion("xsjg in", values, "xsjg");
            return (Criteria) this;
        }

        public Criteria andXsjgNotIn(List<Float> values) {
            addCriterion("xsjg not in", values, "xsjg");
            return (Criteria) this;
        }

        public Criteria andXsjgBetween(Float value1, Float value2) {
            addCriterion("xsjg between", value1, value2, "xsjg");
            return (Criteria) this;
        }

        public Criteria andXsjgNotBetween(Float value1, Float value2) {
            addCriterion("xsjg not between", value1, value2, "xsjg");
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

        public Criteria andXszjIsNull() {
            addCriterion("xszj is null");
            return (Criteria) this;
        }

        public Criteria andXszjIsNotNull() {
            addCriterion("xszj is not null");
            return (Criteria) this;
        }

        public Criteria andXszjEqualTo(Float value) {
            addCriterion("xszj =", value, "xszj");
            return (Criteria) this;
        }

        public Criteria andXszjNotEqualTo(Float value) {
            addCriterion("xszj <>", value, "xszj");
            return (Criteria) this;
        }

        public Criteria andXszjGreaterThan(Float value) {
            addCriterion("xszj >", value, "xszj");
            return (Criteria) this;
        }

        public Criteria andXszjGreaterThanOrEqualTo(Float value) {
            addCriterion("xszj >=", value, "xszj");
            return (Criteria) this;
        }

        public Criteria andXszjLessThan(Float value) {
            addCriterion("xszj <", value, "xszj");
            return (Criteria) this;
        }

        public Criteria andXszjLessThanOrEqualTo(Float value) {
            addCriterion("xszj <=", value, "xszj");
            return (Criteria) this;
        }

        public Criteria andXszjIn(List<Float> values) {
            addCriterion("xszj in", values, "xszj");
            return (Criteria) this;
        }

        public Criteria andXszjNotIn(List<Float> values) {
            addCriterion("xszj not in", values, "xszj");
            return (Criteria) this;
        }

        public Criteria andXszjBetween(Float value1, Float value2) {
            addCriterion("xszj between", value1, value2, "xszj");
            return (Criteria) this;
        }

        public Criteria andXszjNotBetween(Float value1, Float value2) {
            addCriterion("xszj not between", value1, value2, "xszj");
            return (Criteria) this;
        }

        public Criteria andLrIsNull() {
            addCriterion("lr is null");
            return (Criteria) this;
        }

        public Criteria andLrIsNotNull() {
            addCriterion("lr is not null");
            return (Criteria) this;
        }

        public Criteria andLrEqualTo(Float value) {
            addCriterion("lr =", value, "lr");
            return (Criteria) this;
        }

        public Criteria andLrNotEqualTo(Float value) {
            addCriterion("lr <>", value, "lr");
            return (Criteria) this;
        }

        public Criteria andLrGreaterThan(Float value) {
            addCriterion("lr >", value, "lr");
            return (Criteria) this;
        }

        public Criteria andLrGreaterThanOrEqualTo(Float value) {
            addCriterion("lr >=", value, "lr");
            return (Criteria) this;
        }

        public Criteria andLrLessThan(Float value) {
            addCriterion("lr <", value, "lr");
            return (Criteria) this;
        }

        public Criteria andLrLessThanOrEqualTo(Float value) {
            addCriterion("lr <=", value, "lr");
            return (Criteria) this;
        }

        public Criteria andLrIn(List<Float> values) {
            addCriterion("lr in", values, "lr");
            return (Criteria) this;
        }

        public Criteria andLrNotIn(List<Float> values) {
            addCriterion("lr not in", values, "lr");
            return (Criteria) this;
        }

        public Criteria andLrBetween(Float value1, Float value2) {
            addCriterion("lr between", value1, value2, "lr");
            return (Criteria) this;
        }

        public Criteria andLrNotBetween(Float value1, Float value2) {
            addCriterion("lr not between", value1, value2, "lr");
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