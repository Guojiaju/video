package com.future.api.image.dao;

import com.future.api.image.domain.Image;
import com.future.api.image.domain.ImageCriteria;
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

public interface ImageMapper extends BaseDao<Image ,ImageCriteria,String>{
    @SelectProvider(type=ImageSqlProvider.class, method="countByExample")
    int countByExample(ImageCriteria example);

    @DeleteProvider(type=ImageSqlProvider.class, method="deleteByExample")
    int deleteByExample(ImageCriteria example);

    @Delete({
        "delete from t_image",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into t_image (id, type, ",
        "image_name, local_path, ",
        "url, created_by, ",
        "created_date, updated_by, ",
        "updated_date)",
        "values (#{id,jdbcType=VARCHAR}, #{type,jdbcType=VARCHAR}, ",
        "#{imageName,jdbcType=VARCHAR}, #{localPath,jdbcType=VARCHAR}, ",
        "#{url,jdbcType=VARCHAR}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{createdDate,jdbcType=DATE}, #{updatedBy,jdbcType=VARCHAR}, ",
        "#{updatedDate,jdbcType=DATE})"
    })
    int insert(Image record);

    @InsertProvider(type=ImageSqlProvider.class, method="insertSelective")
    int insertSelective(Image record);

    @SelectProvider(type=ImageSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_name", property="imageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="local_path", property="localPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_date", property="updatedDate", jdbcType=JdbcType.DATE)
    })
    List<Image> selectByExampleWithRowbounds(ImageCriteria example, RowBounds rowBounds);

    @SelectProvider(type=ImageSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_name", property="imageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="local_path", property="localPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_date", property="updatedDate", jdbcType=JdbcType.DATE)
    })
    List<Image> selectByExample(ImageCriteria example);

    @Select({
        "select",
        "id, type, image_name, local_path, url, created_by, created_date, updated_by, ",
        "updated_date",
        "from t_image",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_name", property="imageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="local_path", property="localPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_date", property="createdDate", jdbcType=JdbcType.DATE),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_date", property="updatedDate", jdbcType=JdbcType.DATE)
    })
    Image selectByPrimaryKey(String id);

    @UpdateProvider(type=ImageSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Image record, @Param("example") ImageCriteria example);

    @UpdateProvider(type=ImageSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Image record, @Param("example") ImageCriteria example);

    @UpdateProvider(type=ImageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Image record);

    @Update({
        "update t_image",
        "set type = #{type,jdbcType=VARCHAR},",
          "image_name = #{imageName,jdbcType=VARCHAR},",
          "local_path = #{localPath,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "created_date = #{createdDate,jdbcType=DATE},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_date = #{updatedDate,jdbcType=DATE}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Image record);
}