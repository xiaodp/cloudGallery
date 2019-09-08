package com.xiaodp.cloudGallery.dao;

import com.xiaodp.cloudGallery.pojo.Picture;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xiaodp
 * @date 2019/9/3 16:36
 */

@Mapper
public interface PicMapper {

    @Insert("insert into picture(id,pic_name,url,like,comment," +
            "size,create,upload) values(#{id},#{picName},#{url}," +
            "#{like},#{comment},#{size},#{create},#{upload}) ")
    public void insertPic(Picture picture);

//    public void

}
