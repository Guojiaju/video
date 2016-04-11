package com.future.api.user.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.future.api.user.domain.User;
import com.future.api.user.domain.UserCriteria.Criteria;
import com.future.api.user.domain.UserCriteria.Criterion;
import com.future.api.user.domain.UserCriteria;
import java.util.List;
import java.util.Map;

public class UserSqlProvider {

    public String countByExample(UserCriteria example) {
        BEGIN();
        SELECT("count(*)");
        FROM("t_user");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(UserCriteria example) {
        BEGIN();
        DELETE_FROM("t_user");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(User record) {
        BEGIN();
        INSERT_INTO("t_user");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getImgUrl() != null) {
            VALUES("img_url", "#{imgUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMobilePhone() != null) {
            VALUES("mobile_phone", "#{mobilePhone,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getSalt() != null) {
            VALUES("salt", "#{salt,jdbcType=VARCHAR}");
        }
        
        if (record.getEnable() != null) {
            VALUES("enable", "#{enable,jdbcType=CHAR}");
        }
        
        if (record.getToken() != null) {
            VALUES("token", "#{token,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginTime() != null) {
            VALUES("login_time", "#{loginTime,jdbcType=DATE}");
        }
        
        if (record.getCreatedBy() != null) {
            VALUES("created_by", "#{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedDate() != null) {
            VALUES("created_date", "#{createdDate,jdbcType=DATE}");
        }
        
        if (record.getUpdatedBy() != null) {
            VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedDate() != null) {
            VALUES("updated_date", "#{updatedDate,jdbcType=DATE}");
        }
        
        return SQL();
    }

    public String selectByExample(UserCriteria example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("username");
        SELECT("password");
        SELECT("name");
        SELECT("img_url");
        SELECT("mobile_phone");
        SELECT("email");
        SELECT("salt");
        SELECT("enable");
        SELECT("token");
        SELECT("login_time");
        SELECT("created_by");
        SELECT("created_date");
        SELECT("updated_by");
        SELECT("updated_date");
        FROM("t_user");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        User record = (User) parameter.get("record");
        UserCriteria example = (UserCriteria) parameter.get("example");
        
        BEGIN();
        UPDATE("t_user");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{record.password,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getImgUrl() != null) {
            SET("img_url = #{record.imgUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMobilePhone() != null) {
            SET("mobile_phone = #{record.mobilePhone,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            SET("email = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getSalt() != null) {
            SET("salt = #{record.salt,jdbcType=VARCHAR}");
        }
        
        if (record.getEnable() != null) {
            SET("enable = #{record.enable,jdbcType=CHAR}");
        }
        
        if (record.getToken() != null) {
            SET("token = #{record.token,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginTime() != null) {
            SET("login_time = #{record.loginTime,jdbcType=DATE}");
        }
        
        if (record.getCreatedBy() != null) {
            SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedDate() != null) {
            SET("created_date = #{record.createdDate,jdbcType=DATE}");
        }
        
        if (record.getUpdatedBy() != null) {
            SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedDate() != null) {
            SET("updated_date = #{record.updatedDate,jdbcType=DATE}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("t_user");
        
        SET("id = #{record.id,jdbcType=VARCHAR}");
        SET("username = #{record.username,jdbcType=VARCHAR}");
        SET("password = #{record.password,jdbcType=VARCHAR}");
        SET("name = #{record.name,jdbcType=VARCHAR}");
        SET("img_url = #{record.imgUrl,jdbcType=VARCHAR}");
        SET("mobile_phone = #{record.mobilePhone,jdbcType=VARCHAR}");
        SET("email = #{record.email,jdbcType=VARCHAR}");
        SET("salt = #{record.salt,jdbcType=VARCHAR}");
        SET("enable = #{record.enable,jdbcType=CHAR}");
        SET("token = #{record.token,jdbcType=VARCHAR}");
        SET("login_time = #{record.loginTime,jdbcType=DATE}");
        SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        SET("created_date = #{record.createdDate,jdbcType=DATE}");
        SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        SET("updated_date = #{record.updatedDate,jdbcType=DATE}");
        
        UserCriteria example = (UserCriteria) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(User record) {
        BEGIN();
        UPDATE("t_user");
        
        if (record.getUsername() != null) {
            SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getImgUrl() != null) {
            SET("img_url = #{imgUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMobilePhone() != null) {
            SET("mobile_phone = #{mobilePhone,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getSalt() != null) {
            SET("salt = #{salt,jdbcType=VARCHAR}");
        }
        
        if (record.getEnable() != null) {
            SET("enable = #{enable,jdbcType=CHAR}");
        }
        
        if (record.getToken() != null) {
            SET("token = #{token,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginTime() != null) {
            SET("login_time = #{loginTime,jdbcType=DATE}");
        }
        
        if (record.getCreatedBy() != null) {
            SET("created_by = #{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedDate() != null) {
            SET("created_date = #{createdDate,jdbcType=DATE}");
        }
        
        if (record.getUpdatedBy() != null) {
            SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedDate() != null) {
            SET("updated_date = #{updatedDate,jdbcType=DATE}");
        }
        
        WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(UserCriteria example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}