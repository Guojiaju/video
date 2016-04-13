package com.future.api.resources.dao;

import com.future.api.resources.domain.Resources;
import com.future.api.resources.domain.ResourcesCriteria;
import java.util.List;

import com.future.commons.dao.BaseDao;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface ResourcesMapper extends BaseDao<Resources,ResourcesCriteria,String> {
    @SelectProvider(type=ResourcesSqlProvider.class, method="countByExample")
    int countByExample(ResourcesCriteria example);

    @DeleteProvider(type=ResourcesSqlProvider.class, method="deleteByExample")
    int deleteByExample(ResourcesCriteria example);

    @Delete({
        "delete from t_resources",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into t_resources (id, resource_name, ",
        "enable, created_by, ",
        "created_date, updated_by, ",
        "updated_date)",
        "values (#{id,jdbcType=VARCHAR}, #{resourceName,jdbcType=VARCHAR}, ",
        "#{enable,jdbcType=CHAR}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{createdDate,jdbcType=DATE}, #{updatedBy,jdbcType=VARCHAR}, ",
        "#{updatedDate,jdbcType=DATE})"
    })
    int insert(Resources record);

    @InsertProvider(type=ResourcesSqlProvider.class, method="insertSelective")
    int insertSelective(Resources record);

    @SelectProvider(type=ResourcesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="resource_name", property="resourceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="enable", property="enable", jdbcType=JdbcType.CHAR),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_date", property="updatedDate", jdbcType=JdbcType.DATE)
    })
    List<Resources> selectByExampleWithRowbounds(ResourcesCriteria example, RowBounds rowBounds);

    @SelectProvider(type=ResourcesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="resource_name", property="resourceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="enable", property="enable", jdbcType=JdbcType.CHAR),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_date", property="updatedDate", jdbcType=JdbcType.DATE)
    })
    List<Resources> selectByExample(ResourcesCriteria example);

    @Select({
        "select",
        "id, resource_name, enable, created_by, created_date, updated_by, updated_date",
        "from t_resources",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="resource_name", property="resourceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="enable", property="enable", jdbcType=JdbcType.CHAR),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_date", property="updatedDate", jdbcType=JdbcType.DATE)
    })
    Resources selectByPrimaryKey(String id);

    @UpdateProvider(type=ResourcesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Resources record, @Param("example") ResourcesCriteria example);

    @UpdateProvider(type=ResourcesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Resources record, @Param("example") ResourcesCriteria example);

    @UpdateProvider(type=ResourcesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Resources record);

    @Update({
        "update t_resources",
        "set resource_name = #{resourceName,jdbcType=VARCHAR},",
          "enable = #{enable,jdbcType=CHAR},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "created_date = #{createdDate,jdbcType=DATE},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_date = #{updatedDate,jdbcType=DATE}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Resources record);
}