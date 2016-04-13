package com.future.api.role.dao;

import com.future.api.role.domain.RoleResources;
import com.future.api.role.domain.RoleResourcesCriteria;
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

public interface RoleResourcesMapper extends BaseDao<RoleResources,RoleResourcesCriteria,String>{
    @SelectProvider(type=RoleResourcesSqlProvider.class, method="countByExample")
    int countByExample(RoleResourcesCriteria example);

    @DeleteProvider(type=RoleResourcesSqlProvider.class, method="deleteByExample")
    int deleteByExample(RoleResourcesCriteria example);

    @Delete({
        "delete from t_role_resources",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into t_role_resources (id, role_id, ",
        "resource_id, created_by, ",
        "created_date, updated_by, ",
        "updated_date)",
        "values (#{id,jdbcType=VARCHAR}, #{roleId,jdbcType=VARCHAR}, ",
        "#{resourceId,jdbcType=VARCHAR}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{createdDate,jdbcType=DATE}, #{updatedBy,jdbcType=VARCHAR}, ",
        "#{updatedDate,jdbcType=DATE})"
    })
    int insert(RoleResources record);

    @InsertProvider(type=RoleResourcesSqlProvider.class, method="insertSelective")
    int insertSelective(RoleResources record);

    @SelectProvider(type=RoleResourcesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.VARCHAR),
        @Result(column="resource_id", property="resourceId", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_date", property="updatedDate", jdbcType=JdbcType.DATE)
    })
    List<RoleResources> selectByExampleWithRowbounds(RoleResourcesCriteria example, RowBounds rowBounds);

    @SelectProvider(type=RoleResourcesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.VARCHAR),
        @Result(column="resource_id", property="resourceId", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_date", property="updatedDate", jdbcType=JdbcType.DATE)
    })
    List<RoleResources> selectByExample(RoleResourcesCriteria example);

    @Select({
        "select",
        "id, role_id, resource_id, created_by, created_date, updated_by, updated_date",
        "from t_role_resources",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.VARCHAR),
        @Result(column="resource_id", property="resourceId", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_date", property="updatedDate", jdbcType=JdbcType.DATE)
    })
    RoleResources selectByPrimaryKey(String id);

    @UpdateProvider(type=RoleResourcesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") RoleResources record, @Param("example") RoleResourcesCriteria example);

    @UpdateProvider(type=RoleResourcesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") RoleResources record, @Param("example") RoleResourcesCriteria example);

    @UpdateProvider(type=RoleResourcesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(RoleResources record);

    @Update({
        "update t_role_resources",
        "set role_id = #{roleId,jdbcType=VARCHAR},",
          "resource_id = #{resourceId,jdbcType=VARCHAR},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "created_date = #{createdDate,jdbcType=DATE},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_date = #{updatedDate,jdbcType=DATE}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(RoleResources record);
}