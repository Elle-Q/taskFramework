package com.qxy.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskInfoExample() {
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

        public Criteria andTaskNameIsNull() {
            addCriterion("TASK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("TASK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("TASK_NAME =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("TASK_NAME <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("TASK_NAME >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NAME >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("TASK_NAME <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_NAME <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("TASK_NAME like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("TASK_NAME not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("TASK_NAME in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("TASK_NAME not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("TASK_NAME between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("TASK_NAME not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNull() {
            addCriterion("INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(String value) {
            addCriterion("INFO_ID =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(String value) {
            addCriterion("INFO_ID <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(String value) {
            addCriterion("INFO_ID >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_ID >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(String value) {
            addCriterion("INFO_ID <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(String value) {
            addCriterion("INFO_ID <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLike(String value) {
            addCriterion("INFO_ID like", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotLike(String value) {
            addCriterion("INFO_ID not like", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<String> values) {
            addCriterion("INFO_ID in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<String> values) {
            addCriterion("INFO_ID not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(String value1, String value2) {
            addCriterion("INFO_ID between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(String value1, String value2) {
            addCriterion("INFO_ID not between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("SITE is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("SITE is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("SITE =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("SITE <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("SITE >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("SITE >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("SITE <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("SITE <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("SITE like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("SITE not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("SITE in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("SITE not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("SITE between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("SITE not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andStageIsNull() {
            addCriterion("STAGE is null");
            return (Criteria) this;
        }

        public Criteria andStageIsNotNull() {
            addCriterion("STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andStageEqualTo(String value) {
            addCriterion("STAGE =", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotEqualTo(String value) {
            addCriterion("STAGE <>", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThan(String value) {
            addCriterion("STAGE >", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE >=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThan(String value) {
            addCriterion("STAGE <", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThanOrEqualTo(String value) {
            addCriterion("STAGE <=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLike(String value) {
            addCriterion("STAGE like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotLike(String value) {
            addCriterion("STAGE not like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageIn(List<String> values) {
            addCriterion("STAGE in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotIn(List<String> values) {
            addCriterion("STAGE not in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageBetween(String value1, String value2) {
            addCriterion("STAGE between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotBetween(String value1, String value2) {
            addCriterion("STAGE not between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andBanchIsNull() {
            addCriterion("BANCH is null");
            return (Criteria) this;
        }

        public Criteria andBanchIsNotNull() {
            addCriterion("BANCH is not null");
            return (Criteria) this;
        }

        public Criteria andBanchEqualTo(Long value) {
            addCriterion("BANCH =", value, "banch");
            return (Criteria) this;
        }

        public Criteria andBanchNotEqualTo(Long value) {
            addCriterion("BANCH <>", value, "banch");
            return (Criteria) this;
        }

        public Criteria andBanchGreaterThan(Long value) {
            addCriterion("BANCH >", value, "banch");
            return (Criteria) this;
        }

        public Criteria andBanchGreaterThanOrEqualTo(Long value) {
            addCriterion("BANCH >=", value, "banch");
            return (Criteria) this;
        }

        public Criteria andBanchLessThan(Long value) {
            addCriterion("BANCH <", value, "banch");
            return (Criteria) this;
        }

        public Criteria andBanchLessThanOrEqualTo(Long value) {
            addCriterion("BANCH <=", value, "banch");
            return (Criteria) this;
        }

        public Criteria andBanchIn(List<Long> values) {
            addCriterion("BANCH in", values, "banch");
            return (Criteria) this;
        }

        public Criteria andBanchNotIn(List<Long> values) {
            addCriterion("BANCH not in", values, "banch");
            return (Criteria) this;
        }

        public Criteria andBanchBetween(Long value1, Long value2) {
            addCriterion("BANCH between", value1, value2, "banch");
            return (Criteria) this;
        }

        public Criteria andBanchNotBetween(Long value1, Long value2) {
            addCriterion("BANCH not between", value1, value2, "banch");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("START_DATE like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("START_DATE not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(String value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(String value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(String value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(String value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(String value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLike(String value) {
            addCriterion("END_DATE like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotLike(String value) {
            addCriterion("END_DATE not like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<String> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<String> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(String value1, String value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(String value1, String value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andSuccNumIsNull() {
            addCriterion("SUCC_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSuccNumIsNotNull() {
            addCriterion("SUCC_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSuccNumEqualTo(Long value) {
            addCriterion("SUCC_NUM =", value, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumNotEqualTo(Long value) {
            addCriterion("SUCC_NUM <>", value, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumGreaterThan(Long value) {
            addCriterion("SUCC_NUM >", value, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumGreaterThanOrEqualTo(Long value) {
            addCriterion("SUCC_NUM >=", value, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumLessThan(Long value) {
            addCriterion("SUCC_NUM <", value, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumLessThanOrEqualTo(Long value) {
            addCriterion("SUCC_NUM <=", value, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumIn(List<Long> values) {
            addCriterion("SUCC_NUM in", values, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumNotIn(List<Long> values) {
            addCriterion("SUCC_NUM not in", values, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumBetween(Long value1, Long value2) {
            addCriterion("SUCC_NUM between", value1, value2, "succNum");
            return (Criteria) this;
        }

        public Criteria andSuccNumNotBetween(Long value1, Long value2) {
            addCriterion("SUCC_NUM not between", value1, value2, "succNum");
            return (Criteria) this;
        }

        public Criteria andErroNumIsNull() {
            addCriterion("ERRO_NUM is null");
            return (Criteria) this;
        }

        public Criteria andErroNumIsNotNull() {
            addCriterion("ERRO_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andErroNumEqualTo(Long value) {
            addCriterion("ERRO_NUM =", value, "erroNum");
            return (Criteria) this;
        }

        public Criteria andErroNumNotEqualTo(Long value) {
            addCriterion("ERRO_NUM <>", value, "erroNum");
            return (Criteria) this;
        }

        public Criteria andErroNumGreaterThan(Long value) {
            addCriterion("ERRO_NUM >", value, "erroNum");
            return (Criteria) this;
        }

        public Criteria andErroNumGreaterThanOrEqualTo(Long value) {
            addCriterion("ERRO_NUM >=", value, "erroNum");
            return (Criteria) this;
        }

        public Criteria andErroNumLessThan(Long value) {
            addCriterion("ERRO_NUM <", value, "erroNum");
            return (Criteria) this;
        }

        public Criteria andErroNumLessThanOrEqualTo(Long value) {
            addCriterion("ERRO_NUM <=", value, "erroNum");
            return (Criteria) this;
        }

        public Criteria andErroNumIn(List<Long> values) {
            addCriterion("ERRO_NUM in", values, "erroNum");
            return (Criteria) this;
        }

        public Criteria andErroNumNotIn(List<Long> values) {
            addCriterion("ERRO_NUM not in", values, "erroNum");
            return (Criteria) this;
        }

        public Criteria andErroNumBetween(Long value1, Long value2) {
            addCriterion("ERRO_NUM between", value1, value2, "erroNum");
            return (Criteria) this;
        }

        public Criteria andErroNumNotBetween(Long value1, Long value2) {
            addCriterion("ERRO_NUM not between", value1, value2, "erroNum");
            return (Criteria) this;
        }

        public Criteria andInfoAIsNull() {
            addCriterion("INFO_A is null");
            return (Criteria) this;
        }

        public Criteria andInfoAIsNotNull() {
            addCriterion("INFO_A is not null");
            return (Criteria) this;
        }

        public Criteria andInfoAEqualTo(String value) {
            addCriterion("INFO_A =", value, "infoA");
            return (Criteria) this;
        }

        public Criteria andInfoANotEqualTo(String value) {
            addCriterion("INFO_A <>", value, "infoA");
            return (Criteria) this;
        }

        public Criteria andInfoAGreaterThan(String value) {
            addCriterion("INFO_A >", value, "infoA");
            return (Criteria) this;
        }

        public Criteria andInfoAGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_A >=", value, "infoA");
            return (Criteria) this;
        }

        public Criteria andInfoALessThan(String value) {
            addCriterion("INFO_A <", value, "infoA");
            return (Criteria) this;
        }

        public Criteria andInfoALessThanOrEqualTo(String value) {
            addCriterion("INFO_A <=", value, "infoA");
            return (Criteria) this;
        }

        public Criteria andInfoALike(String value) {
            addCriterion("INFO_A like", value, "infoA");
            return (Criteria) this;
        }

        public Criteria andInfoANotLike(String value) {
            addCriterion("INFO_A not like", value, "infoA");
            return (Criteria) this;
        }

        public Criteria andInfoAIn(List<String> values) {
            addCriterion("INFO_A in", values, "infoA");
            return (Criteria) this;
        }

        public Criteria andInfoANotIn(List<String> values) {
            addCriterion("INFO_A not in", values, "infoA");
            return (Criteria) this;
        }

        public Criteria andInfoABetween(String value1, String value2) {
            addCriterion("INFO_A between", value1, value2, "infoA");
            return (Criteria) this;
        }

        public Criteria andInfoANotBetween(String value1, String value2) {
            addCriterion("INFO_A not between", value1, value2, "infoA");
            return (Criteria) this;
        }

        public Criteria andInfoBIsNull() {
            addCriterion("INFO_B is null");
            return (Criteria) this;
        }

        public Criteria andInfoBIsNotNull() {
            addCriterion("INFO_B is not null");
            return (Criteria) this;
        }

        public Criteria andInfoBEqualTo(String value) {
            addCriterion("INFO_B =", value, "infoB");
            return (Criteria) this;
        }

        public Criteria andInfoBNotEqualTo(String value) {
            addCriterion("INFO_B <>", value, "infoB");
            return (Criteria) this;
        }

        public Criteria andInfoBGreaterThan(String value) {
            addCriterion("INFO_B >", value, "infoB");
            return (Criteria) this;
        }

        public Criteria andInfoBGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_B >=", value, "infoB");
            return (Criteria) this;
        }

        public Criteria andInfoBLessThan(String value) {
            addCriterion("INFO_B <", value, "infoB");
            return (Criteria) this;
        }

        public Criteria andInfoBLessThanOrEqualTo(String value) {
            addCriterion("INFO_B <=", value, "infoB");
            return (Criteria) this;
        }

        public Criteria andInfoBLike(String value) {
            addCriterion("INFO_B like", value, "infoB");
            return (Criteria) this;
        }

        public Criteria andInfoBNotLike(String value) {
            addCriterion("INFO_B not like", value, "infoB");
            return (Criteria) this;
        }

        public Criteria andInfoBIn(List<String> values) {
            addCriterion("INFO_B in", values, "infoB");
            return (Criteria) this;
        }

        public Criteria andInfoBNotIn(List<String> values) {
            addCriterion("INFO_B not in", values, "infoB");
            return (Criteria) this;
        }

        public Criteria andInfoBBetween(String value1, String value2) {
            addCriterion("INFO_B between", value1, value2, "infoB");
            return (Criteria) this;
        }

        public Criteria andInfoBNotBetween(String value1, String value2) {
            addCriterion("INFO_B not between", value1, value2, "infoB");
            return (Criteria) this;
        }

        public Criteria andInfoCIsNull() {
            addCriterion("INFO_C is null");
            return (Criteria) this;
        }

        public Criteria andInfoCIsNotNull() {
            addCriterion("INFO_C is not null");
            return (Criteria) this;
        }

        public Criteria andInfoCEqualTo(String value) {
            addCriterion("INFO_C =", value, "infoC");
            return (Criteria) this;
        }

        public Criteria andInfoCNotEqualTo(String value) {
            addCriterion("INFO_C <>", value, "infoC");
            return (Criteria) this;
        }

        public Criteria andInfoCGreaterThan(String value) {
            addCriterion("INFO_C >", value, "infoC");
            return (Criteria) this;
        }

        public Criteria andInfoCGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_C >=", value, "infoC");
            return (Criteria) this;
        }

        public Criteria andInfoCLessThan(String value) {
            addCriterion("INFO_C <", value, "infoC");
            return (Criteria) this;
        }

        public Criteria andInfoCLessThanOrEqualTo(String value) {
            addCriterion("INFO_C <=", value, "infoC");
            return (Criteria) this;
        }

        public Criteria andInfoCLike(String value) {
            addCriterion("INFO_C like", value, "infoC");
            return (Criteria) this;
        }

        public Criteria andInfoCNotLike(String value) {
            addCriterion("INFO_C not like", value, "infoC");
            return (Criteria) this;
        }

        public Criteria andInfoCIn(List<String> values) {
            addCriterion("INFO_C in", values, "infoC");
            return (Criteria) this;
        }

        public Criteria andInfoCNotIn(List<String> values) {
            addCriterion("INFO_C not in", values, "infoC");
            return (Criteria) this;
        }

        public Criteria andInfoCBetween(String value1, String value2) {
            addCriterion("INFO_C between", value1, value2, "infoC");
            return (Criteria) this;
        }

        public Criteria andInfoCNotBetween(String value1, String value2) {
            addCriterion("INFO_C not between", value1, value2, "infoC");
            return (Criteria) this;
        }

        public Criteria andInfoDIsNull() {
            addCriterion("INFO_D is null");
            return (Criteria) this;
        }

        public Criteria andInfoDIsNotNull() {
            addCriterion("INFO_D is not null");
            return (Criteria) this;
        }

        public Criteria andInfoDEqualTo(String value) {
            addCriterion("INFO_D =", value, "infoD");
            return (Criteria) this;
        }

        public Criteria andInfoDNotEqualTo(String value) {
            addCriterion("INFO_D <>", value, "infoD");
            return (Criteria) this;
        }

        public Criteria andInfoDGreaterThan(String value) {
            addCriterion("INFO_D >", value, "infoD");
            return (Criteria) this;
        }

        public Criteria andInfoDGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_D >=", value, "infoD");
            return (Criteria) this;
        }

        public Criteria andInfoDLessThan(String value) {
            addCriterion("INFO_D <", value, "infoD");
            return (Criteria) this;
        }

        public Criteria andInfoDLessThanOrEqualTo(String value) {
            addCriterion("INFO_D <=", value, "infoD");
            return (Criteria) this;
        }

        public Criteria andInfoDLike(String value) {
            addCriterion("INFO_D like", value, "infoD");
            return (Criteria) this;
        }

        public Criteria andInfoDNotLike(String value) {
            addCriterion("INFO_D not like", value, "infoD");
            return (Criteria) this;
        }

        public Criteria andInfoDIn(List<String> values) {
            addCriterion("INFO_D in", values, "infoD");
            return (Criteria) this;
        }

        public Criteria andInfoDNotIn(List<String> values) {
            addCriterion("INFO_D not in", values, "infoD");
            return (Criteria) this;
        }

        public Criteria andInfoDBetween(String value1, String value2) {
            addCriterion("INFO_D between", value1, value2, "infoD");
            return (Criteria) this;
        }

        public Criteria andInfoDNotBetween(String value1, String value2) {
            addCriterion("INFO_D not between", value1, value2, "infoD");
            return (Criteria) this;
        }

        public Criteria andInfoEIsNull() {
            addCriterion("INFO_E is null");
            return (Criteria) this;
        }

        public Criteria andInfoEIsNotNull() {
            addCriterion("INFO_E is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEEqualTo(String value) {
            addCriterion("INFO_E =", value, "infoE");
            return (Criteria) this;
        }

        public Criteria andInfoENotEqualTo(String value) {
            addCriterion("INFO_E <>", value, "infoE");
            return (Criteria) this;
        }

        public Criteria andInfoEGreaterThan(String value) {
            addCriterion("INFO_E >", value, "infoE");
            return (Criteria) this;
        }

        public Criteria andInfoEGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_E >=", value, "infoE");
            return (Criteria) this;
        }

        public Criteria andInfoELessThan(String value) {
            addCriterion("INFO_E <", value, "infoE");
            return (Criteria) this;
        }

        public Criteria andInfoELessThanOrEqualTo(String value) {
            addCriterion("INFO_E <=", value, "infoE");
            return (Criteria) this;
        }

        public Criteria andInfoELike(String value) {
            addCriterion("INFO_E like", value, "infoE");
            return (Criteria) this;
        }

        public Criteria andInfoENotLike(String value) {
            addCriterion("INFO_E not like", value, "infoE");
            return (Criteria) this;
        }

        public Criteria andInfoEIn(List<String> values) {
            addCriterion("INFO_E in", values, "infoE");
            return (Criteria) this;
        }

        public Criteria andInfoENotIn(List<String> values) {
            addCriterion("INFO_E not in", values, "infoE");
            return (Criteria) this;
        }

        public Criteria andInfoEBetween(String value1, String value2) {
            addCriterion("INFO_E between", value1, value2, "infoE");
            return (Criteria) this;
        }

        public Criteria andInfoENotBetween(String value1, String value2) {
            addCriterion("INFO_E not between", value1, value2, "infoE");
            return (Criteria) this;
        }

        public Criteria andInfoInt1IsNull() {
            addCriterion("INFO_INT_1 is null");
            return (Criteria) this;
        }

        public Criteria andInfoInt1IsNotNull() {
            addCriterion("INFO_INT_1 is not null");
            return (Criteria) this;
        }

        public Criteria andInfoInt1EqualTo(Long value) {
            addCriterion("INFO_INT_1 =", value, "infoInt1");
            return (Criteria) this;
        }

        public Criteria andInfoInt1NotEqualTo(Long value) {
            addCriterion("INFO_INT_1 <>", value, "infoInt1");
            return (Criteria) this;
        }

        public Criteria andInfoInt1GreaterThan(Long value) {
            addCriterion("INFO_INT_1 >", value, "infoInt1");
            return (Criteria) this;
        }

        public Criteria andInfoInt1GreaterThanOrEqualTo(Long value) {
            addCriterion("INFO_INT_1 >=", value, "infoInt1");
            return (Criteria) this;
        }

        public Criteria andInfoInt1LessThan(Long value) {
            addCriterion("INFO_INT_1 <", value, "infoInt1");
            return (Criteria) this;
        }

        public Criteria andInfoInt1LessThanOrEqualTo(Long value) {
            addCriterion("INFO_INT_1 <=", value, "infoInt1");
            return (Criteria) this;
        }

        public Criteria andInfoInt1In(List<Long> values) {
            addCriterion("INFO_INT_1 in", values, "infoInt1");
            return (Criteria) this;
        }

        public Criteria andInfoInt1NotIn(List<Long> values) {
            addCriterion("INFO_INT_1 not in", values, "infoInt1");
            return (Criteria) this;
        }

        public Criteria andInfoInt1Between(Long value1, Long value2) {
            addCriterion("INFO_INT_1 between", value1, value2, "infoInt1");
            return (Criteria) this;
        }

        public Criteria andInfoInt1NotBetween(Long value1, Long value2) {
            addCriterion("INFO_INT_1 not between", value1, value2, "infoInt1");
            return (Criteria) this;
        }

        public Criteria andInfoInt2IsNull() {
            addCriterion("INFO_INT_2 is null");
            return (Criteria) this;
        }

        public Criteria andInfoInt2IsNotNull() {
            addCriterion("INFO_INT_2 is not null");
            return (Criteria) this;
        }

        public Criteria andInfoInt2EqualTo(Long value) {
            addCriterion("INFO_INT_2 =", value, "infoInt2");
            return (Criteria) this;
        }

        public Criteria andInfoInt2NotEqualTo(Long value) {
            addCriterion("INFO_INT_2 <>", value, "infoInt2");
            return (Criteria) this;
        }

        public Criteria andInfoInt2GreaterThan(Long value) {
            addCriterion("INFO_INT_2 >", value, "infoInt2");
            return (Criteria) this;
        }

        public Criteria andInfoInt2GreaterThanOrEqualTo(Long value) {
            addCriterion("INFO_INT_2 >=", value, "infoInt2");
            return (Criteria) this;
        }

        public Criteria andInfoInt2LessThan(Long value) {
            addCriterion("INFO_INT_2 <", value, "infoInt2");
            return (Criteria) this;
        }

        public Criteria andInfoInt2LessThanOrEqualTo(Long value) {
            addCriterion("INFO_INT_2 <=", value, "infoInt2");
            return (Criteria) this;
        }

        public Criteria andInfoInt2In(List<Long> values) {
            addCriterion("INFO_INT_2 in", values, "infoInt2");
            return (Criteria) this;
        }

        public Criteria andInfoInt2NotIn(List<Long> values) {
            addCriterion("INFO_INT_2 not in", values, "infoInt2");
            return (Criteria) this;
        }

        public Criteria andInfoInt2Between(Long value1, Long value2) {
            addCriterion("INFO_INT_2 between", value1, value2, "infoInt2");
            return (Criteria) this;
        }

        public Criteria andInfoInt2NotBetween(Long value1, Long value2) {
            addCriterion("INFO_INT_2 not between", value1, value2, "infoInt2");
            return (Criteria) this;
        }

        public Criteria andLogInfoIsNull() {
            addCriterion("LOG_INFO is null");
            return (Criteria) this;
        }

        public Criteria andLogInfoIsNotNull() {
            addCriterion("LOG_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andLogInfoEqualTo(String value) {
            addCriterion("LOG_INFO =", value, "logInfo");
            return (Criteria) this;
        }

        public Criteria andLogInfoNotEqualTo(String value) {
            addCriterion("LOG_INFO <>", value, "logInfo");
            return (Criteria) this;
        }

        public Criteria andLogInfoGreaterThan(String value) {
            addCriterion("LOG_INFO >", value, "logInfo");
            return (Criteria) this;
        }

        public Criteria andLogInfoGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_INFO >=", value, "logInfo");
            return (Criteria) this;
        }

        public Criteria andLogInfoLessThan(String value) {
            addCriterion("LOG_INFO <", value, "logInfo");
            return (Criteria) this;
        }

        public Criteria andLogInfoLessThanOrEqualTo(String value) {
            addCriterion("LOG_INFO <=", value, "logInfo");
            return (Criteria) this;
        }

        public Criteria andLogInfoLike(String value) {
            addCriterion("LOG_INFO like", value, "logInfo");
            return (Criteria) this;
        }

        public Criteria andLogInfoNotLike(String value) {
            addCriterion("LOG_INFO not like", value, "logInfo");
            return (Criteria) this;
        }

        public Criteria andLogInfoIn(List<String> values) {
            addCriterion("LOG_INFO in", values, "logInfo");
            return (Criteria) this;
        }

        public Criteria andLogInfoNotIn(List<String> values) {
            addCriterion("LOG_INFO not in", values, "logInfo");
            return (Criteria) this;
        }

        public Criteria andLogInfoBetween(String value1, String value2) {
            addCriterion("LOG_INFO between", value1, value2, "logInfo");
            return (Criteria) this;
        }

        public Criteria andLogInfoNotBetween(String value1, String value2) {
            addCriterion("LOG_INFO not between", value1, value2, "logInfo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeIsNull() {
            addCriterion("EXEC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExecTimeIsNotNull() {
            addCriterion("EXEC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExecTimeEqualTo(Date value) {
            addCriterion("EXEC_TIME =", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotEqualTo(Date value) {
            addCriterion("EXEC_TIME <>", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeGreaterThan(Date value) {
            addCriterion("EXEC_TIME >", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXEC_TIME >=", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeLessThan(Date value) {
            addCriterion("EXEC_TIME <", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeLessThanOrEqualTo(Date value) {
            addCriterion("EXEC_TIME <=", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeIn(List<Date> values) {
            addCriterion("EXEC_TIME in", values, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotIn(List<Date> values) {
            addCriterion("EXEC_TIME not in", values, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeBetween(Date value1, Date value2) {
            addCriterion("EXEC_TIME between", value1, value2, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotBetween(Date value1, Date value2) {
            addCriterion("EXEC_TIME not between", value1, value2, "execTime");
            return (Criteria) this;
        }

        public Criteria andInfoFIsNull() {
            addCriterion("INFO_F is null");
            return (Criteria) this;
        }

        public Criteria andInfoFIsNotNull() {
            addCriterion("INFO_F is not null");
            return (Criteria) this;
        }

        public Criteria andInfoFEqualTo(String value) {
            addCriterion("INFO_F =", value, "infoF");
            return (Criteria) this;
        }

        public Criteria andInfoFNotEqualTo(String value) {
            addCriterion("INFO_F <>", value, "infoF");
            return (Criteria) this;
        }

        public Criteria andInfoFGreaterThan(String value) {
            addCriterion("INFO_F >", value, "infoF");
            return (Criteria) this;
        }

        public Criteria andInfoFGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_F >=", value, "infoF");
            return (Criteria) this;
        }

        public Criteria andInfoFLessThan(String value) {
            addCriterion("INFO_F <", value, "infoF");
            return (Criteria) this;
        }

        public Criteria andInfoFLessThanOrEqualTo(String value) {
            addCriterion("INFO_F <=", value, "infoF");
            return (Criteria) this;
        }

        public Criteria andInfoFLike(String value) {
            addCriterion("INFO_F like", value, "infoF");
            return (Criteria) this;
        }

        public Criteria andInfoFNotLike(String value) {
            addCriterion("INFO_F not like", value, "infoF");
            return (Criteria) this;
        }

        public Criteria andInfoFIn(List<String> values) {
            addCriterion("INFO_F in", values, "infoF");
            return (Criteria) this;
        }

        public Criteria andInfoFNotIn(List<String> values) {
            addCriterion("INFO_F not in", values, "infoF");
            return (Criteria) this;
        }

        public Criteria andInfoFBetween(String value1, String value2) {
            addCriterion("INFO_F between", value1, value2, "infoF");
            return (Criteria) this;
        }

        public Criteria andInfoFNotBetween(String value1, String value2) {
            addCriterion("INFO_F not between", value1, value2, "infoF");
            return (Criteria) this;
        }

        public Criteria andInfoGIsNull() {
            addCriterion("INFO_G is null");
            return (Criteria) this;
        }

        public Criteria andInfoGIsNotNull() {
            addCriterion("INFO_G is not null");
            return (Criteria) this;
        }

        public Criteria andInfoGEqualTo(String value) {
            addCriterion("INFO_G =", value, "infoG");
            return (Criteria) this;
        }

        public Criteria andInfoGNotEqualTo(String value) {
            addCriterion("INFO_G <>", value, "infoG");
            return (Criteria) this;
        }

        public Criteria andInfoGGreaterThan(String value) {
            addCriterion("INFO_G >", value, "infoG");
            return (Criteria) this;
        }

        public Criteria andInfoGGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_G >=", value, "infoG");
            return (Criteria) this;
        }

        public Criteria andInfoGLessThan(String value) {
            addCriterion("INFO_G <", value, "infoG");
            return (Criteria) this;
        }

        public Criteria andInfoGLessThanOrEqualTo(String value) {
            addCriterion("INFO_G <=", value, "infoG");
            return (Criteria) this;
        }

        public Criteria andInfoGLike(String value) {
            addCriterion("INFO_G like", value, "infoG");
            return (Criteria) this;
        }

        public Criteria andInfoGNotLike(String value) {
            addCriterion("INFO_G not like", value, "infoG");
            return (Criteria) this;
        }

        public Criteria andInfoGIn(List<String> values) {
            addCriterion("INFO_G in", values, "infoG");
            return (Criteria) this;
        }

        public Criteria andInfoGNotIn(List<String> values) {
            addCriterion("INFO_G not in", values, "infoG");
            return (Criteria) this;
        }

        public Criteria andInfoGBetween(String value1, String value2) {
            addCriterion("INFO_G between", value1, value2, "infoG");
            return (Criteria) this;
        }

        public Criteria andInfoGNotBetween(String value1, String value2) {
            addCriterion("INFO_G not between", value1, value2, "infoG");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andAppSymbolIsNull() {
            addCriterion("APP_SYMBOL is null");
            return (Criteria) this;
        }

        public Criteria andAppSymbolIsNotNull() {
            addCriterion("APP_SYMBOL is not null");
            return (Criteria) this;
        }

        public Criteria andAppSymbolEqualTo(String value) {
            addCriterion("APP_SYMBOL =", value, "appSymbol");
            return (Criteria) this;
        }

        public Criteria andAppSymbolNotEqualTo(String value) {
            addCriterion("APP_SYMBOL <>", value, "appSymbol");
            return (Criteria) this;
        }

        public Criteria andAppSymbolGreaterThan(String value) {
            addCriterion("APP_SYMBOL >", value, "appSymbol");
            return (Criteria) this;
        }

        public Criteria andAppSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("APP_SYMBOL >=", value, "appSymbol");
            return (Criteria) this;
        }

        public Criteria andAppSymbolLessThan(String value) {
            addCriterion("APP_SYMBOL <", value, "appSymbol");
            return (Criteria) this;
        }

        public Criteria andAppSymbolLessThanOrEqualTo(String value) {
            addCriterion("APP_SYMBOL <=", value, "appSymbol");
            return (Criteria) this;
        }

        public Criteria andAppSymbolLike(String value) {
            addCriterion("APP_SYMBOL like", value, "appSymbol");
            return (Criteria) this;
        }

        public Criteria andAppSymbolNotLike(String value) {
            addCriterion("APP_SYMBOL not like", value, "appSymbol");
            return (Criteria) this;
        }

        public Criteria andAppSymbolIn(List<String> values) {
            addCriterion("APP_SYMBOL in", values, "appSymbol");
            return (Criteria) this;
        }

        public Criteria andAppSymbolNotIn(List<String> values) {
            addCriterion("APP_SYMBOL not in", values, "appSymbol");
            return (Criteria) this;
        }

        public Criteria andAppSymbolBetween(String value1, String value2) {
            addCriterion("APP_SYMBOL between", value1, value2, "appSymbol");
            return (Criteria) this;
        }

        public Criteria andAppSymbolNotBetween(String value1, String value2) {
            addCriterion("APP_SYMBOL not between", value1, value2, "appSymbol");
            return (Criteria) this;
        }

        public Criteria andFileCntIsNull() {
            addCriterion("FILE_CNT is null");
            return (Criteria) this;
        }

        public Criteria andFileCntIsNotNull() {
            addCriterion("FILE_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andFileCntEqualTo(Integer value) {
            addCriterion("FILE_CNT =", value, "fileCnt");
            return (Criteria) this;
        }

        public Criteria andFileCntNotEqualTo(Integer value) {
            addCriterion("FILE_CNT <>", value, "fileCnt");
            return (Criteria) this;
        }

        public Criteria andFileCntGreaterThan(Integer value) {
            addCriterion("FILE_CNT >", value, "fileCnt");
            return (Criteria) this;
        }

        public Criteria andFileCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("FILE_CNT >=", value, "fileCnt");
            return (Criteria) this;
        }

        public Criteria andFileCntLessThan(Integer value) {
            addCriterion("FILE_CNT <", value, "fileCnt");
            return (Criteria) this;
        }

        public Criteria andFileCntLessThanOrEqualTo(Integer value) {
            addCriterion("FILE_CNT <=", value, "fileCnt");
            return (Criteria) this;
        }

        public Criteria andFileCntIn(List<Integer> values) {
            addCriterion("FILE_CNT in", values, "fileCnt");
            return (Criteria) this;
        }

        public Criteria andFileCntNotIn(List<Integer> values) {
            addCriterion("FILE_CNT not in", values, "fileCnt");
            return (Criteria) this;
        }

        public Criteria andFileCntBetween(Integer value1, Integer value2) {
            addCriterion("FILE_CNT between", value1, value2, "fileCnt");
            return (Criteria) this;
        }

        public Criteria andFileCntNotBetween(Integer value1, Integer value2) {
            addCriterion("FILE_CNT not between", value1, value2, "fileCnt");
            return (Criteria) this;
        }

        public Criteria andDirCntIsNull() {
            addCriterion("DIR_CNT is null");
            return (Criteria) this;
        }

        public Criteria andDirCntIsNotNull() {
            addCriterion("DIR_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andDirCntEqualTo(Integer value) {
            addCriterion("DIR_CNT =", value, "dirCnt");
            return (Criteria) this;
        }

        public Criteria andDirCntNotEqualTo(Integer value) {
            addCriterion("DIR_CNT <>", value, "dirCnt");
            return (Criteria) this;
        }

        public Criteria andDirCntGreaterThan(Integer value) {
            addCriterion("DIR_CNT >", value, "dirCnt");
            return (Criteria) this;
        }

        public Criteria andDirCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("DIR_CNT >=", value, "dirCnt");
            return (Criteria) this;
        }

        public Criteria andDirCntLessThan(Integer value) {
            addCriterion("DIR_CNT <", value, "dirCnt");
            return (Criteria) this;
        }

        public Criteria andDirCntLessThanOrEqualTo(Integer value) {
            addCriterion("DIR_CNT <=", value, "dirCnt");
            return (Criteria) this;
        }

        public Criteria andDirCntIn(List<Integer> values) {
            addCriterion("DIR_CNT in", values, "dirCnt");
            return (Criteria) this;
        }

        public Criteria andDirCntNotIn(List<Integer> values) {
            addCriterion("DIR_CNT not in", values, "dirCnt");
            return (Criteria) this;
        }

        public Criteria andDirCntBetween(Integer value1, Integer value2) {
            addCriterion("DIR_CNT between", value1, value2, "dirCnt");
            return (Criteria) this;
        }

        public Criteria andDirCntNotBetween(Integer value1, Integer value2) {
            addCriterion("DIR_CNT not between", value1, value2, "dirCnt");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("FILE_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("FILE_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(Long value) {
            addCriterion("FILE_SIZE =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(Long value) {
            addCriterion("FILE_SIZE <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(Long value) {
            addCriterion("FILE_SIZE >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("FILE_SIZE >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(Long value) {
            addCriterion("FILE_SIZE <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Long value) {
            addCriterion("FILE_SIZE <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<Long> values) {
            addCriterion("FILE_SIZE in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<Long> values) {
            addCriterion("FILE_SIZE not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(Long value1, Long value2) {
            addCriterion("FILE_SIZE between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(Long value1, Long value2) {
            addCriterion("FILE_SIZE not between", value1, value2, "fileSize");
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