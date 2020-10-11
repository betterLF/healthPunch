package health.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class studentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public studentExample() {
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

        public Criteria andUploaddateIsNull() {
            addCriterion("uploadDate is null");
            return (Criteria) this;
        }

        public Criteria andUploaddateIsNotNull() {
            addCriterion("uploadDate is not null");
            return (Criteria) this;
        }

        public Criteria andUploaddateEqualTo(Date value) {
            addCriterionForJDBCDate("uploadDate =", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("uploadDate <>", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateGreaterThan(Date value) {
            addCriterionForJDBCDate("uploadDate >", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("uploadDate >=", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateLessThan(Date value) {
            addCriterionForJDBCDate("uploadDate <", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("uploadDate <=", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateIn(List<Date> values) {
            addCriterionForJDBCDate("uploadDate in", values, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("uploadDate not in", values, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("uploadDate between", value1, value2, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("uploadDate not between", value1, value2, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNull() {
            addCriterion("studentName is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("studentName is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("studentName =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("studentName <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("studentName >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("studentName >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("studentName <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("studentName <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("studentName like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("studentName not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("studentName in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("studentName not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("studentName between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("studentName not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("classId is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classId is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(String value) {
            addCriterion("classId =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(String value) {
            addCriterion("classId <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(String value) {
            addCriterion("classId >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(String value) {
            addCriterion("classId >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(String value) {
            addCriterion("classId <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(String value) {
            addCriterion("classId <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLike(String value) {
            addCriterion("classId like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotLike(String value) {
            addCriterion("classId not like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<String> values) {
            addCriterion("classId in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<String> values) {
            addCriterion("classId not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(String value1, String value2) {
            addCriterion("classId between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(String value1, String value2) {
            addCriterion("classId not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("temperature like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("temperature not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andFeverIsNull() {
            addCriterion("fever is null");
            return (Criteria) this;
        }

        public Criteria andFeverIsNotNull() {
            addCriterion("fever is not null");
            return (Criteria) this;
        }

        public Criteria andFeverEqualTo(Boolean value) {
            addCriterion("fever =", value, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverNotEqualTo(Boolean value) {
            addCriterion("fever <>", value, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverGreaterThan(Boolean value) {
            addCriterion("fever >", value, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fever >=", value, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverLessThan(Boolean value) {
            addCriterion("fever <", value, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverLessThanOrEqualTo(Boolean value) {
            addCriterion("fever <=", value, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverIn(List<Boolean> values) {
            addCriterion("fever in", values, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverNotIn(List<Boolean> values) {
            addCriterion("fever not in", values, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverBetween(Boolean value1, Boolean value2) {
            addCriterion("fever between", value1, value2, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fever not between", value1, value2, "fever");
            return (Criteria) this;
        }

        public Criteria andFeverdetailIsNull() {
            addCriterion("feverDetail is null");
            return (Criteria) this;
        }

        public Criteria andFeverdetailIsNotNull() {
            addCriterion("feverDetail is not null");
            return (Criteria) this;
        }

        public Criteria andFeverdetailEqualTo(String value) {
            addCriterion("feverDetail =", value, "feverdetail");
            return (Criteria) this;
        }

        public Criteria andFeverdetailNotEqualTo(String value) {
            addCriterion("feverDetail <>", value, "feverdetail");
            return (Criteria) this;
        }

        public Criteria andFeverdetailGreaterThan(String value) {
            addCriterion("feverDetail >", value, "feverdetail");
            return (Criteria) this;
        }

        public Criteria andFeverdetailGreaterThanOrEqualTo(String value) {
            addCriterion("feverDetail >=", value, "feverdetail");
            return (Criteria) this;
        }

        public Criteria andFeverdetailLessThan(String value) {
            addCriterion("feverDetail <", value, "feverdetail");
            return (Criteria) this;
        }

        public Criteria andFeverdetailLessThanOrEqualTo(String value) {
            addCriterion("feverDetail <=", value, "feverdetail");
            return (Criteria) this;
        }

        public Criteria andFeverdetailLike(String value) {
            addCriterion("feverDetail like", value, "feverdetail");
            return (Criteria) this;
        }

        public Criteria andFeverdetailNotLike(String value) {
            addCriterion("feverDetail not like", value, "feverdetail");
            return (Criteria) this;
        }

        public Criteria andFeverdetailIn(List<String> values) {
            addCriterion("feverDetail in", values, "feverdetail");
            return (Criteria) this;
        }

        public Criteria andFeverdetailNotIn(List<String> values) {
            addCriterion("feverDetail not in", values, "feverdetail");
            return (Criteria) this;
        }

        public Criteria andFeverdetailBetween(String value1, String value2) {
            addCriterion("feverDetail between", value1, value2, "feverdetail");
            return (Criteria) this;
        }

        public Criteria andFeverdetailNotBetween(String value1, String value2) {
            addCriterion("feverDetail not between", value1, value2, "feverdetail");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(Boolean value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(Boolean value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(Boolean value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(Boolean value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(Boolean value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(Boolean value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<Boolean> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<Boolean> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(Boolean value1, Boolean value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(Boolean value1, Boolean value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactdetailIsNull() {
            addCriterion("contactDetail is null");
            return (Criteria) this;
        }

        public Criteria andContactdetailIsNotNull() {
            addCriterion("contactDetail is not null");
            return (Criteria) this;
        }

        public Criteria andContactdetailEqualTo(String value) {
            addCriterion("contactDetail =", value, "contactdetail");
            return (Criteria) this;
        }

        public Criteria andContactdetailNotEqualTo(String value) {
            addCriterion("contactDetail <>", value, "contactdetail");
            return (Criteria) this;
        }

        public Criteria andContactdetailGreaterThan(String value) {
            addCriterion("contactDetail >", value, "contactdetail");
            return (Criteria) this;
        }

        public Criteria andContactdetailGreaterThanOrEqualTo(String value) {
            addCriterion("contactDetail >=", value, "contactdetail");
            return (Criteria) this;
        }

        public Criteria andContactdetailLessThan(String value) {
            addCriterion("contactDetail <", value, "contactdetail");
            return (Criteria) this;
        }

        public Criteria andContactdetailLessThanOrEqualTo(String value) {
            addCriterion("contactDetail <=", value, "contactdetail");
            return (Criteria) this;
        }

        public Criteria andContactdetailLike(String value) {
            addCriterion("contactDetail like", value, "contactdetail");
            return (Criteria) this;
        }

        public Criteria andContactdetailNotLike(String value) {
            addCriterion("contactDetail not like", value, "contactdetail");
            return (Criteria) this;
        }

        public Criteria andContactdetailIn(List<String> values) {
            addCriterion("contactDetail in", values, "contactdetail");
            return (Criteria) this;
        }

        public Criteria andContactdetailNotIn(List<String> values) {
            addCriterion("contactDetail not in", values, "contactdetail");
            return (Criteria) this;
        }

        public Criteria andContactdetailBetween(String value1, String value2) {
            addCriterion("contactDetail between", value1, value2, "contactdetail");
            return (Criteria) this;
        }

        public Criteria andContactdetailNotBetween(String value1, String value2) {
            addCriterion("contactDetail not between", value1, value2, "contactdetail");
            return (Criteria) this;
        }

        public Criteria andConditionIsNull() {
            addCriterion("condition is null");
            return (Criteria) this;
        }

        public Criteria andConditionIsNotNull() {
            addCriterion("condition is not null");
            return (Criteria) this;
        }

        public Criteria andConditionEqualTo(Boolean value) {
            addCriterion("condition =", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotEqualTo(Boolean value) {
            addCriterion("condition <>", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionGreaterThan(Boolean value) {
            addCriterion("condition >", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("condition >=", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLessThan(Boolean value) {
            addCriterion("condition <", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLessThanOrEqualTo(Boolean value) {
            addCriterion("condition <=", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionIn(List<Boolean> values) {
            addCriterion("condition in", values, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotIn(List<Boolean> values) {
            addCriterion("condition not in", values, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionBetween(Boolean value1, Boolean value2) {
            addCriterion("condition between", value1, value2, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("condition not between", value1, value2, "condition");
            return (Criteria) this;
        }

        public Criteria andConditiondetailIsNull() {
            addCriterion("conditionDetail is null");
            return (Criteria) this;
        }

        public Criteria andConditiondetailIsNotNull() {
            addCriterion("conditionDetail is not null");
            return (Criteria) this;
        }

        public Criteria andConditiondetailEqualTo(String value) {
            addCriterion("conditionDetail =", value, "conditiondetail");
            return (Criteria) this;
        }

        public Criteria andConditiondetailNotEqualTo(String value) {
            addCriterion("conditionDetail <>", value, "conditiondetail");
            return (Criteria) this;
        }

        public Criteria andConditiondetailGreaterThan(String value) {
            addCriterion("conditionDetail >", value, "conditiondetail");
            return (Criteria) this;
        }

        public Criteria andConditiondetailGreaterThanOrEqualTo(String value) {
            addCriterion("conditionDetail >=", value, "conditiondetail");
            return (Criteria) this;
        }

        public Criteria andConditiondetailLessThan(String value) {
            addCriterion("conditionDetail <", value, "conditiondetail");
            return (Criteria) this;
        }

        public Criteria andConditiondetailLessThanOrEqualTo(String value) {
            addCriterion("conditionDetail <=", value, "conditiondetail");
            return (Criteria) this;
        }

        public Criteria andConditiondetailLike(String value) {
            addCriterion("conditionDetail like", value, "conditiondetail");
            return (Criteria) this;
        }

        public Criteria andConditiondetailNotLike(String value) {
            addCriterion("conditionDetail not like", value, "conditiondetail");
            return (Criteria) this;
        }

        public Criteria andConditiondetailIn(List<String> values) {
            addCriterion("conditionDetail in", values, "conditiondetail");
            return (Criteria) this;
        }

        public Criteria andConditiondetailNotIn(List<String> values) {
            addCriterion("conditionDetail not in", values, "conditiondetail");
            return (Criteria) this;
        }

        public Criteria andConditiondetailBetween(String value1, String value2) {
            addCriterion("conditionDetail between", value1, value2, "conditiondetail");
            return (Criteria) this;
        }

        public Criteria andConditiondetailNotBetween(String value1, String value2) {
            addCriterion("conditionDetail not between", value1, value2, "conditiondetail");
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