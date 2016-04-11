package com.future.api.user.dao;

import com.future.api.user.domain.User;
import com.future.api.user.domain.UserCriteria;
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

public interface UserMapper extends BaseDao<User ,UserCriteria,String> {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    int countByExample(UserCriteria example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserCriteria example);

    @Delete({
        "delete from t_user",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into t_user (id, username, ",
        "password, name, ",
        "img_url, mobile_phone, ",
        "email, salt, enable, ",
        "token, login_time, created_by, ",
        "created_date, updated_by, ",
        "updated_date)",
        "values (#{id,jdbcType=VARCHAR}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{imgUrl,jdbcType=VARCHAR}, #{mobilePhone,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{salt,jdbcType=VARCHAR}, #{enable,jdbcType=CHAR}, ",
        "#{token,jdbcType=VARCHAR}, #{loginTime,jdbcType=DATE}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{createdDate,jdbcType=DATE}, #{updatedBy,jdbcType=VARCHAR}, ",
        "#{updatedDate,jdbcType=DATE})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="img_url", property="imgUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile_phone", property="mobilePhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="salt", property="salt", jdbcType=JdbcType.VARCHAR),
        @Result(column="enable", property="enable", jdbcType=JdbcType.CHAR),
        @Result(column="token", property="token", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_time", property="loginTime", jdbcType=JdbcType.DATE),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_date", property="updatedDate", jdbcType=JdbcType.DATE)
    })
    List<User> selectByExampleWithRowbounds(UserCriteria example, RowBounds rowBounds);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="img_url", property="imgUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile_phone", property="mobilePhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="salt", property="salt", jdbcType=JdbcType.VARCHAR),
        @Result(column="enable", property="enable", jdbcType=JdbcType.CHAR),
        @Result(column="token", property="token", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_time", property="loginTime", jdbcType=JdbcType.DATE),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_date", property="updatedDate", jdbcType=JdbcType.DATE)
    })
    List<User> selectByExample(UserCriteria example);

    @Select({
        "select",
        "id, username, password, name, img_url, mobile_phone, email, salt, enable, token, ",
        "login_time, created_by, created_date, updated_by, updated_date",
        "from t_user",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="img_url", property="imgUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile_phone", property="mobilePhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="salt", property="salt", jdbcType=JdbcType.VARCHAR),
        @Result(column="enable", property="enable", jdbcType=JdbcType.CHAR),
        @Result(column="token", property="token", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_time", property="loginTime", jdbcType=JdbcType.DATE),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_date", property="updatedDate", jdbcType=JdbcType.DATE)
    })
    User selectByPrimaryKey(String id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserCriteria example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserCriteria example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update t_user",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "img_url = #{imgUrl,jdbcType=VARCHAR},",
          "mobile_phone = #{mobilePhone,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "salt = #{salt,jdbcType=VARCHAR},",
          "enable = #{enable,jdbcType=CHAR},",
          "token = #{token,jdbcType=VARCHAR},",
          "login_time = #{loginTime,jdbcType=DATE},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "created_date = #{createdDate,jdbcType=DATE},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_date = #{updatedDate,jdbcType=DATE}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(User record);
}