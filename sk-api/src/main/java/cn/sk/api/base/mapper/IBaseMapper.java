package cn.sk.api.base.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 基本Mapper
 * @param <T>   实体扩展类
 */
public interface IBaseMapper <T,V> extends BaseMapper<T> {
//    int deleteByPrimaryKey(T record);

//    int insert(T record);

//    int insertSelective(T record);

//    T selectByPrimaryKey(T record);
//
//    int updateByPrimaryKeySelective(T record);
//
//    int updateByPrimaryKey(T record);

    List<T> selectListByQueryVo(V entityQueryVo);
    long selectCountByQueryVo(V entityQueryVo);

    //软删除,recourd_status设置为00删除状态
    int deleteInIds(@Param("pks") String[] pks, @Param("recordStatus") String recordStatus);

    //硬删除
    int realDeleteInIds(@Param("pks") String[] pks);
}
