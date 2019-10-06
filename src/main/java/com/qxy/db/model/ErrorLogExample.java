package com.qxy.db.model;

import java.util.ArrayList;
import java.util.List;

public class ErrorLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErrorLogExample() {
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

        public Criteria andInfoIdIsNull() {
            addCriterion("info_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(String value) {
            addCriterion("info_id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(String value) {
            addCriterion("info_id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(String value) {
            addCriterion("info_id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("info_id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(String value) {
            addCriterion("info_id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(String value) {
            addCriterion("info_id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLike(String value) {
            addCriterion("info_id like", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotLike(String value) {
            addCriterion("info_id not like", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<String> values) {
            addCriterion("info_id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<String> values) {
            addCriterion("info_id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(String value1, String value2) {
            addCriterion("info_id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(String value1, String value2) {
            addCriterion("info_id not between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andCurDateIsNull() {
            addCriterion("cur_date is null");
            return (Criteria) this;
        }

        public Criteria andCurDateIsNotNull() {
            addCriterion("cur_date is not null");
            return (Criteria) this;
        }

        public Criteria andCurDateEqualTo(String value) {
            addCriterion("cur_date =", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateNotEqualTo(String value) {
            addCriterion("cur_date <>", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateGreaterThan(String value) {
            addCriterion("cur_date >", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateGreaterThanOrEqualTo(String value) {
            addCriterion("cur_date >=", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateLessThan(String value) {
            addCriterion("cur_date <", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateLessThanOrEqualTo(String value) {
            addCriterion("cur_date <=", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateLike(String value) {
            addCriterion("cur_date like", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateNotLike(String value) {
            addCriterion("cur_date not like", value, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateIn(List<String> values) {
            addCriterion("cur_date in", values, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateNotIn(List<String> values) {
            addCriterion("cur_date not in", values, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateBetween(String value1, String value2) {
            addCriterion("cur_date between", value1, value2, "curDate");
            return (Criteria) this;
        }

        public Criteria andCurDateNotBetween(String value1, String value2) {
            addCriterion("cur_date not between", value1, value2, "curDate");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andLogDevIsNull() {
            addCriterion("log_dev is null");
            return (Criteria) this;
        }

        public Criteria andLogDevIsNotNull() {
            addCriterion("log_dev is not null");
            return (Criteria) this;
        }

        public Criteria andLogDevEqualTo(String value) {
            addCriterion("log_dev =", value, "logDev");
            return (Criteria) this;
        }

        public Criteria andLogDevNotEqualTo(String value) {
            addCriterion("log_dev <>", value, "logDev");
            return (Criteria) this;
        }

        public Criteria andLogDevGreaterThan(String value) {
            addCriterion("log_dev >", value, "logDev");
            return (Criteria) this;
        }

        public Criteria andLogDevGreaterThanOrEqualTo(String value) {
            addCriterion("log_dev >=", value, "logDev");
            return (Criteria) this;
        }

        public Criteria andLogDevLessThan(String value) {
            addCriterion("log_dev <", value, "logDev");
            return (Criteria) this;
        }

        public Criteria andLogDevLessThanOrEqualTo(String value) {
            addCriterion("log_dev <=", value, "logDev");
            return (Criteria) this;
        }

        public Criteria andLogDevLike(String value) {
            addCriterion("log_dev like", value, "logDev");
            return (Criteria) this;
        }

        public Criteria andLogDevNotLike(String value) {
            addCriterion("log_dev not like", value, "logDev");
            return (Criteria) this;
        }

        public Criteria andLogDevIn(List<String> values) {
            addCriterion("log_dev in", values, "logDev");
            return (Criteria) this;
        }

        public Criteria andLogDevNotIn(List<String> values) {
            addCriterion("log_dev not in", values, "logDev");
            return (Criteria) this;
        }

        public Criteria andLogDevBetween(String value1, String value2) {
            addCriterion("log_dev between", value1, value2, "logDev");
            return (Criteria) this;
        }

        public Criteria andLogDevNotBetween(String value1, String value2) {
            addCriterion("log_dev not between", value1, value2, "logDev");
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