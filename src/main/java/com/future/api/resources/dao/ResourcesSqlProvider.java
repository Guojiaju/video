package com.future.api.resources.dao;

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

import com.future.api.resources.domain.Resources;
import com.future.api.resources.domain.ResourcesCriteria.Criteria;
import com.future.api.resources.domain.ResourcesCriteria.Criterion;
import com.future.api.resources.domain.ResourcesCriteria;
import java.util.List;
import java.util.Map;

public class ResourcesSqlProvider {

    public String countByExample(ResourcesCriteria example) {
        BEGIN();
        SELECT("count(*)");
        FROM("t_resources");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(ResourcesCriteria example) {
        BEGIN();
        DELETE_FROM("t_resources");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Resources record) {
        BEGIN();
        INSERT_INTO("t_resources");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getResourceName() != null) {
            VALUES("resource_name", "#{resourceName,jdbcType=VARCHAR}");
        }
        
        if (record.getEnable() != null) {
            VALUES("enable", "#{enable,jdbcType=CHAR}");
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

    public String selectByExample(ResourcesCriteria example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("resource_name");
        SELECT("enable");
        SELECT("created_by");
        SELECT("created_date");
        SELECT("updated_by");
        SELECT("updated_date");
        FROM("t_resources");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Resources record = (Resources) parameter.get("record");
        ResourcesCriteria example = (ResourcesCriteria) parameter.get("example");
        
        BEGIN();
        UPDATE("t_resources");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getResourceName() != null) {
            SET("resource_name = #{record.resourceName,jdbcType=VARCHAR}");
        }
        
        if (record.getEnable() != null) {
            SET("enable = #{record.enable,jdbcType=CHAR}");
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
        UPDATE("t_resources");
        
        SET("id = #{record.id,jdbcType=VARCHAR}");
        SET("resource_name = #{record.resourceName,jdbcType=VARCHAR}");
        SET("enable = #{record.enable,jdbcType=CHAR}");
        SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        SET("created_date = #{record.createdDate,jdbcType=DATE}");
        SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        SET("updated_date = #{record.updatedDate,jdbcType=DATE}");
        
        ResourcesCriteria example = (ResourcesCriteria) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Resources record) {
        BEGIN();
        UPDATE("t_resources");
        
        if (record.getResourceName() != null) {
            SET("resource_name = #{resourceName,jdbcType=VARCHAR}");
        }
        
        if (record.getEnable() != null) {
            SET("enable = #{enable,jdbcType=CHAR}");
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

    protected void applyWhere(ResourcesCriteria example, boolean includeExamplePhrase) {
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