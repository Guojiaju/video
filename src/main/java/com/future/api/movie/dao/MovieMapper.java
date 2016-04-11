package com.future.api.movie.dao;

import com.future.api.movie.domain.Movie;
import com.future.api.movie.domain.MovieCriteria;
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

public interface MovieMapper extends BaseDao<Movie,MovieCriteria,String> {
    @SelectProvider(type=MovieSqlProvider.class, method="countByExample")
    int countByExample(MovieCriteria example);

    @DeleteProvider(type=MovieSqlProvider.class, method="deleteByExample")
    int deleteByExample(MovieCriteria example);

    @Delete({
        "delete from t_movie",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into t_movie (id, img_id, ",
        "name, type, director, ",
        "score, short_message, ",
        "staror, owner_id, ",
        "created_by, created_date, ",
        "updated_by, updated_date)",
        "values (#{id,jdbcType=VARCHAR}, #{imgId,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{type,jdbcType=VARCHAR}, #{director,jdbcType=VARCHAR}, ",
        "#{score,jdbcType=VARCHAR}, #{shortMessage,jdbcType=VARCHAR}, ",
        "#{staror,jdbcType=VARCHAR}, #{ownerId,jdbcType=VARCHAR}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{createdDate,jdbcType=DATE}, ",
        "#{updatedBy,jdbcType=VARCHAR}, #{updatedDate,jdbcType=DATE})"
    })
    int insert(Movie record);

    @InsertProvider(type=MovieSqlProvider.class, method="insertSelective")
    int insertSelective(Movie record);

    @SelectProvider(type=MovieSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="img_id", property="imgId", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="director", property="director", jdbcType=JdbcType.VARCHAR),
        @Result(column="score", property="score", jdbcType=JdbcType.VARCHAR),
        @Result(column="short_message", property="shortMessage", jdbcType=JdbcType.VARCHAR),
        @Result(column="staror", property="staror", jdbcType=JdbcType.VARCHAR),
        @Result(column="owner_id", property="ownerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_date", property="updatedDate", jdbcType=JdbcType.DATE)
    })
    List<Movie> selectByExampleWithRowbounds(MovieCriteria example, RowBounds rowBounds);

    @SelectProvider(type=MovieSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="img_id", property="imgId", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="director", property="director", jdbcType=JdbcType.VARCHAR),
        @Result(column="score", property="score", jdbcType=JdbcType.VARCHAR),
        @Result(column="short_message", property="shortMessage", jdbcType=JdbcType.VARCHAR),
        @Result(column="staror", property="staror", jdbcType=JdbcType.VARCHAR),
        @Result(column="owner_id", property="ownerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_date", property="updatedDate", jdbcType=JdbcType.DATE)
    })
    List<Movie> selectByExample(MovieCriteria example);

    @Select({
        "select",
        "id, img_id, name, type, director, score, short_message, staror, owner_id, created_by, ",
        "created_date, updated_by, updated_date",
        "from t_movie",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="img_id", property="imgId", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="director", property="director", jdbcType=JdbcType.VARCHAR),
        @Result(column="score", property="score", jdbcType=JdbcType.VARCHAR),
        @Result(column="short_message", property="shortMessage", jdbcType=JdbcType.VARCHAR),
        @Result(column="staror", property="staror", jdbcType=JdbcType.VARCHAR),
        @Result(column="owner_id", property="ownerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_date", property="updatedDate", jdbcType=JdbcType.DATE)
    })
    Movie selectByPrimaryKey(String id);

    @UpdateProvider(type=MovieSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Movie record, @Param("example") MovieCriteria example);

    @UpdateProvider(type=MovieSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Movie record, @Param("example") MovieCriteria example);

    @UpdateProvider(type=MovieSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Movie record);

    @Update({
        "update t_movie",
        "set img_id = #{imgId,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "director = #{director,jdbcType=VARCHAR},",
          "score = #{score,jdbcType=VARCHAR},",
          "short_message = #{shortMessage,jdbcType=VARCHAR},",
          "staror = #{staror,jdbcType=VARCHAR},",
          "owner_id = #{ownerId,jdbcType=VARCHAR},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "created_date = #{createdDate,jdbcType=DATE},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_date = #{updatedDate,jdbcType=DATE}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Movie record);
}