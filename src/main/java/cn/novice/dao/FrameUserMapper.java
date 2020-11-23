package cn.novice.dao;

import cn.novice.entity.FrameUser;

public interface FrameUserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(FrameUser record);

    int insertSelective(FrameUser record);

    FrameUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(FrameUser record);

    int updateByPrimaryKey(FrameUser record);
}